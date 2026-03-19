package com.calypso.assembly;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

import java.util.ArrayList;
import java.util.List;

public class AssemblyScreenHandler extends ScreenHandler {
    public static final int TOOL_SLOT = 0;
    public static final int PART_SLOT_START = 1;
    public static final int PART_SLOT_COUNT = 6;
    public static final int RESULT_SLOT = 7;

    private static final int[] PART_SLOT_X = new int[]{72, 110, 129, 110, 72, 53};
    private static final int[] PART_SLOT_Y = new int[]{20, 20, 49, 78, 78, 49};

    private boolean updatingResult;
    private final SimpleInventory inventory = new SimpleInventory(8) {
        @Override
        public void markDirty() {
            super.markDirty();
            if (!updatingResult) {
                updateResult();
            }
        }
    };

    public AssemblyScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.ASSEMBLY, syncId);

        addSlot(new Slot(inventory, TOOL_SLOT, 18, 49) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return stack.getItem() instanceof ModularToolItem && !AssemblyData.isAssembled(stack);
            }
        });

        for (int index = 0; index < PART_SLOT_COUNT; index++) {
            final int partIndex = index;
            addSlot(new Slot(inventory, PART_SLOT_START + index, PART_SLOT_X[index], PART_SLOT_Y[index]) {
                @Override
                public boolean canInsert(ItemStack stack) {
                    if (stack.isEmpty() || !(stack.getItem() instanceof ToolPartItem partItem)) {
                        return false;
                    }
                    AssemblySlotDefinition slotDefinition = getSlotDefinition(partIndex);
                    return slotDefinition != null && partItem.definition().supportsSlot(slotDefinition.id());
                }
            });
        }

        addSlot(new Slot(inventory, RESULT_SLOT, 210, 49) {
            @Override
            public boolean canInsert(ItemStack stack) {
                return false;
            }

            @Override
            public boolean canTakeItems(PlayerEntity playerEntity) {
                return hasStack() && getPreview() != null && getPreview().isValid();
            }

            @Override
            public void onTakeItem(PlayerEntity player, ItemStack stack) {
                ItemStack tool = inventory.getStack(TOOL_SLOT);
                if (!tool.isEmpty()) {
                    tool.decrement(1);
                }
                for (int i = 0; i < PART_SLOT_COUNT; i++) {
                    ItemStack part = inventory.getStack(PART_SLOT_START + i);
                    if (!part.isEmpty()) {
                        part.decrement(1);
                    }
                }
                updateResult();
                super.onTakeItem(player, stack);
            }
        });

        addPlayerSlots(playerInventory);
        updateResult();
    }

    private void addPlayerSlots(PlayerInventory playerInventory) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 9; column++) {
                addSlot(new Slot(playerInventory, column + row * 9 + 9, 25 + column * 18, 120 + row * 18));
            }
        }

        for (int column = 0; column < 9; column++) {
            addSlot(new Slot(playerInventory, column, 25 + column * 18, 178));
        }
    }

    public AssemblyPreview getPreview() {
        ItemStack toolStack = inventory.getStack(TOOL_SLOT);
        if (toolStack.isEmpty()) {
            return null;
        }

        List<ItemStack> partStacks = new ArrayList<>();
        for (int i = 0; i < PART_SLOT_COUNT; i++) {
            partStacks.add(inventory.getStack(PART_SLOT_START + i));
        }
        return ToolAssemblyResolver.preview(toolStack, partStacks);
    }

    public AssemblySlotDefinition getSlotDefinition(int index) {
        ItemStack toolStack = inventory.getStack(TOOL_SLOT);
        if (toolStack.getItem() instanceof ModularToolItem toolItem) {
            return toolItem.definition().slotAt(index);
        }
        return null;
    }

    public boolean isSlotActive(int index) {
        return getSlotDefinition(index) != null;
    }

    private void updateResult() {
        ItemStack result = ItemStack.EMPTY;
        AssemblyPreview preview = getPreview();
        if (preview != null && preview.isValid() && !preview.parts().isEmpty()) {
            ItemStack output = inventory.getStack(TOOL_SLOT).copyWithCount(1);
            AssemblyData.setParts(output, preview.parts());
            result = output;
        }
        updatingResult = true;
        inventory.setStack(RESULT_SLOT, result);
        updatingResult = false;
        sendContentUpdates();
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot == null || !slot.hasStack()) {
            return ItemStack.EMPTY;
        }

        ItemStack originalStack = slot.getStack();
        newStack = originalStack.copy();

        if (invSlot == RESULT_SLOT) {
            if (!insertItem(originalStack, inventory.size(), slots.size(), true)) {
                return ItemStack.EMPTY;
            }
            slot.onTakeItem(player, originalStack);
        } else if (invSlot < inventory.size()) {
            if (!insertItem(originalStack, inventory.size(), slots.size(), true)) {
                return ItemStack.EMPTY;
            }
        } else if (originalStack.getItem() instanceof ModularToolItem) {
            if (!insertItem(originalStack, TOOL_SLOT, TOOL_SLOT + 1, false)) {
                return ItemStack.EMPTY;
            }
        } else if (originalStack.getItem() instanceof ToolPartItem) {
            boolean moved = false;
            for (int i = 0; i < PART_SLOT_COUNT; i++) {
                if (insertItem(originalStack, PART_SLOT_START + i, PART_SLOT_START + i + 1, false)) {
                    moved = true;
                    break;
                }
            }
            if (!moved) {
                return ItemStack.EMPTY;
            }
        } else {
            return ItemStack.EMPTY;
        }

        if (originalStack.isEmpty()) {
            slot.setStack(ItemStack.EMPTY);
        } else {
            slot.markDirty();
        }

        return newStack;
    }

    @Override
    public void onClosed(PlayerEntity player) {
        super.onClosed(player);
        if (!player.getWorld().isClient()) {
            for (int i = 0; i < RESULT_SLOT; i++) {
                ItemStack stack = inventory.removeStack(i);
                if (!stack.isEmpty()) {
                    player.getInventory().offerOrDrop(stack);
                }
            }
        }
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }

    public Inventory inventory() {
        return inventory;
    }
}
