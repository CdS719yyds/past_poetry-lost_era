package com.calypso.assembly;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ModularToolItem extends Item {
    private final ToolTypeDefinition definition;

    public ModularToolItem(ToolTypeDefinition definition, Settings settings) {
        super(settings.maxCount(1));
        this.definition = definition;
    }

    public ToolTypeDefinition definition() {
        return definition;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview == null || preview.parts().isEmpty()) {
            tooltip.add(Text.translatable("assembly.tooltip.unassembled").formatted(Formatting.GRAY));
            return;
        }

        tooltip.add(Text.translatable("assembly.tooltip.parts").formatted(Formatting.GOLD));
        definition.slots().forEach(slot -> {
            ToolPartDefinition part = preview.parts().get(slot.id());
            if (part != null) {
                tooltip.add(Text.literal(" - " + slot.name().english() + ": " + part.name().english()).formatted(Formatting.GRAY));
            }
        });

        tooltip.add(Text.translatable("assembly.tooltip.stats").formatted(Formatting.AQUA));
        preview.stats().entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(entry -> tooltip.add(Text.literal(" " + entry.getKey() + ": " + String.format("%.1f", entry.getValue())).formatted(Formatting.DARK_AQUA)));

        AssemblyContext assemblyContext = new AssemblyContext(definition, preview.parts(), stack);
        collectMechanics(preview).forEach(mechanic -> mechanic.appendTooltip(assemblyContext, tooltip));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview == null) {
            return false;
        }

        AssemblyContext context = new AssemblyContext(definition, preview.parts(), stack);
        return collectMechanics(preview).stream().anyMatch(mechanic -> mechanic.hasGlint(context));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview == null) {
            return;
        }

        AssemblyContext context = new AssemblyContext(definition, preview.parts(), stack);
        collectMechanics(preview).forEach(mechanic -> mechanic.inventoryTick(context, stack, world, entity, slot, selected));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview == null) {
            return super.use(world, user, hand);
        }

        AssemblyContext context = new AssemblyContext(definition, preview.parts(), stack);
        for (AssemblyMechanic mechanic : collectMechanics(preview)) {
            TypedActionResult<ItemStack> result = mechanic.use(context, world, user, hand);
            if (result.getResult().isAccepted()) {
                damageAssembly(stack, 1);
                return result;
            }
        }

        return super.use(world, user, hand);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview != null) {
            AssemblyContext context = new AssemblyContext(definition, preview.parts(), stack);
            collectMechanics(preview).forEach(mechanic -> mechanic.postHit(context, stack, target, attacker));
            damageAssembly(stack, 1);
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview != null) {
            AssemblyContext context = new AssemblyContext(definition, preview.parts(), stack);
            collectMechanics(preview).forEach(mechanic -> mechanic.postMine(context, stack, world, state, pos, miner));
            damageAssembly(stack, 1);
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview == null) {
            return super.getMiningSpeedMultiplier(stack, state);
        }

        if (definition.effectiveBlocksTag() != null && state.isIn(definition.effectiveBlocksTag())) {
            return Math.max(1.0f, preview.stat(AssemblyStat.MINING_SPEED));
        }

        return 1.0f;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return definition.effectiveBlocksTag() != null && state.isIn(definition.effectiveBlocksTag());
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        return preview != null && preview.stat(AssemblyStat.DURABILITY) > 0;
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview == null) {
            return 13;
        }
        float max = Math.max(1.0f, preview.stat(AssemblyStat.DURABILITY));
        float remaining = Math.max(0, max - AssemblyData.getDamage(stack));
        return Math.round(13.0f * remaining / max);
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        return 0x50C878;
    }

    public void damageAssembly(ItemStack stack, int amount) {
        AssemblyPreview preview = ToolAssemblyResolver.resolve(stack);
        if (preview == null) {
            return;
        }
        int currentDamage = AssemblyData.getDamage(stack) + amount;
        if (currentDamage >= preview.stat(AssemblyStat.DURABILITY)) {
            stack.decrement(1);
            return;
        }
        AssemblyData.setDamage(stack, currentDamage);
    }

    private List<AssemblyMechanic> collectMechanics(AssemblyPreview preview) {
        List<AssemblyMechanic> mechanics = new ArrayList<>();
        mechanics.addAll(definition.mechanics());
        preview.parts().values().forEach(part -> mechanics.addAll(part.mechanics()));
        return mechanics;
    }
}
