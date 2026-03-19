package com.calypso.assembly;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolPartItem extends Item {
    private final ToolPartDefinition definition;

    public ToolPartItem(ToolPartDefinition definition, Settings settings) {
        super(settings);
        this.definition = definition;
    }

    public ToolPartDefinition definition() {
        return definition;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("assembly.tooltip.part_slots"));
        definition.allowedSlots().forEach(slotId -> tooltip.add(Text.literal(" - " + slotId)));
        definition.modifiers().forEach(modifier -> tooltip.add(Text.literal(" " + modifier.stat() + " " + (modifier.value() > 0 ? "+" : "") + modifier.value())));
    }
}
