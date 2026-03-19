package com.calypso.assembly;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class AssemblyScreen extends HandledScreen<AssemblyScreenHandler> {
    public AssemblyScreen(AssemblyScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundWidth = 248;
        this.backgroundHeight = 202;
        this.playerInventoryTitleY = this.backgroundHeight - 93;
    }

    @Override
    protected void init() {
        super.init();
        this.titleX = 16;
        this.titleY = 12;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        int x = this.x;
        int y = this.y;

        context.fillGradient(x, y, x + backgroundWidth, y + backgroundHeight, 0xEE1A1F26, 0xEE0E1217);
        context.fill(x + 8, y + 24, x + 154, y + 106, 0x883A4653);
        context.fill(x + 160, y + 24, x + 240, y + 106, 0x88464E2E);
        context.fill(x + 8, y + 112, x + 240, y + 194, 0x66303946);

        context.drawBorder(x + 8, y + 24, 146, 82, 0xFF67758A);
        context.drawBorder(x + 160, y + 24, 80, 82, 0xFF8A8C5F);
        context.drawBorder(x + 8, y + 112, 232, 82, 0xFF556270);

        context.drawText(textRenderer, title, x + titleX, y + titleY, 0xF3F2E9, false);
        context.drawText(textRenderer, Text.translatable("screen.past_poetry-lost_era.assembly_hint"), x + 16, y + 94, 0xAFC7D7, false);
        context.drawText(textRenderer, playerInventoryTitle, x + 16, y + playerInventoryTitleY, 0xD5D9E0, false);

        drawSlotLabels(context, x, y);
        drawPreviewPanel(context, x, y);
    }

    private void drawSlotLabels(DrawContext context, int x, int y) {
        context.drawText(textRenderer, Text.translatable("screen.past_poetry-lost_era.tool_base"), x + 16, y + 30, 0xD5D9E0, false);
        context.drawText(textRenderer, Text.translatable("screen.past_poetry-lost_era.result"), x + 185, y + 30, 0xEDE6B1, false);

        for (int i = 0; i < AssemblyScreenHandler.PART_SLOT_COUNT; i++) {
            AssemblySlotDefinition slot = handler.getSlotDefinition(i);
            int slotX = x + handler.slots.get(AssemblyScreenHandler.PART_SLOT_START + i).x - 3;
            int slotY = y + handler.slots.get(AssemblyScreenHandler.PART_SLOT_START + i).y - 10;
            if (slot == null) {
                context.fill(slotX, slotY + 8, slotX + 22, slotY + 30, 0x55262B35);
                continue;
            }

            context.drawText(textRenderer, Text.translatable(slot.translationKey()), slotX - 10, slotY, 0xD4E0EC, false);
        }
    }

    private void drawPreviewPanel(DrawContext context, int x, int y) {
        AssemblyPreview preview = handler.getPreview();
        int lineY = y + 40;
        if (preview == null) {
            context.drawText(textRenderer, Text.translatable("screen.past_poetry-lost_era.insert_tool").formatted(Formatting.GRAY), x + 168, lineY, 0xB0BAC7, false);
            return;
        }

        if (!handler.inventory().getStack(AssemblyScreenHandler.RESULT_SLOT).isEmpty()) {
            context.drawItem(handler.inventory().getStack(AssemblyScreenHandler.RESULT_SLOT), x + 190, y + 48);
        }

        context.drawText(textRenderer, Text.translatable("assembly.tooltip.stats"), x + 168, lineY, 0xEDE6B1, false);
        lineY += 12;
        context.drawText(textRenderer, Text.literal("Durability: " + Math.round(preview.stat(AssemblyStat.DURABILITY))), x + 168, lineY, 0xD5D9E0, false);
        lineY += 10;
        context.drawText(textRenderer, Text.literal("Mining: " + String.format("%.1f", preview.stat(AssemblyStat.MINING_SPEED))), x + 168, lineY, 0xD5D9E0, false);
        lineY += 10;
        context.drawText(textRenderer, Text.literal("Bonus dmg: " + String.format("%.1f", preview.stat(AssemblyStat.BONUS_DAMAGE))), x + 168, lineY, 0xD5D9E0, false);
        lineY += 14;

        if (preview.isValid()) {
            context.drawText(textRenderer, Text.translatable("screen.past_poetry-lost_era.valid").formatted(Formatting.GREEN), x + 168, lineY, 0x9BE37B, false);
            lineY += 12;
        } else {
            context.drawText(textRenderer, Text.translatable("screen.past_poetry-lost_era.invalid").formatted(Formatting.RED), x + 168, lineY, 0xFF8F8F, false);
            lineY += 12;
            for (int i = 0; i < Math.min(3, preview.errors().size()); i++) {
                context.drawText(textRenderer, preview.errors().get(i), x + 168, lineY, 0xFFB2B2, false);
                lineY += 10;
            }
        }
    }
}
