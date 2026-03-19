package com.calypso.assembly;

import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ToolAssemblyResolver {
    private ToolAssemblyResolver() {
    }

    public static AssemblyPreview preview(ItemStack toolStack, List<ItemStack> partStacks) {
        if (!(toolStack.getItem() instanceof ModularToolItem toolItem)) {
            return null;
        }

        ToolTypeDefinition toolType = toolItem.definition();
        Map<String, ToolPartDefinition> partsBySlot = new LinkedHashMap<>();
        MutableToolStats stats = new MutableToolStats(toolType.baseStats());
        AssemblyComputation computation = new AssemblyComputation(stats);

        for (int i = 0; i < partStacks.size(); i++) {
            AssemblySlotDefinition slot = toolType.slotAt(i);
            if (slot == null) {
                continue;
            }

            ItemStack partStack = partStacks.get(i);
            if (partStack.isEmpty()) {
                continue;
            }

            if (!(partStack.getItem() instanceof ToolPartItem partItem)) {
                computation.error(Text.translatable("assembly.error.invalid_part"));
                continue;
            }

            ToolPartDefinition partDefinition = partItem.definition();
            if (!partDefinition.supportsSlot(slot.id())) {
                computation.error(Text.translatable("assembly.error.slot_mismatch", partStack.getName(), Text.translatable(slot.translationKey())));
                continue;
            }

            partsBySlot.put(slot.id(), partDefinition);
        }

        AssemblyContext context = new AssemblyContext(toolType, partsBySlot, toolStack);
        partsBySlot.values().forEach(part -> part.modifiers().forEach(computation::addModifier));
        partsBySlot.values().forEach(part -> part.rules().forEach(rule -> rule.apply(context, computation)));
        partsBySlot.values().forEach(part -> part.mechanics().forEach(mechanic -> mechanic.applyComputedStats(context, computation)));
        toolType.rules().forEach(rule -> rule.apply(context, computation));
        toolType.mechanics().forEach(mechanic -> mechanic.applyComputedStats(context, computation));

        return new AssemblyPreview(toolType, Map.copyOf(partsBySlot), stats.snapshot(), computation.errors(), computation.notes());
    }

    public static AssemblyPreview resolve(ItemStack stack) {
        if (!(stack.getItem() instanceof ModularToolItem toolItem)) {
            return null;
        }

        ToolTypeDefinition toolType = toolItem.definition();
        Map<String, ToolPartDefinition> partsBySlot = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : AssemblyData.getParts(stack).entrySet()) {
            ToolPartDefinition definition = ToolAssemblyRegistry.getPartDefinition(entry.getValue());
            if (definition != null) {
                partsBySlot.put(entry.getKey(), definition);
            }
        }

        MutableToolStats stats = new MutableToolStats(toolType.baseStats());
        AssemblyComputation computation = new AssemblyComputation(stats);
        AssemblyContext context = new AssemblyContext(toolType, partsBySlot, stack);
        partsBySlot.values().forEach(part -> part.modifiers().forEach(computation::addModifier));
        partsBySlot.values().forEach(part -> part.rules().forEach(rule -> rule.apply(context, computation)));
        partsBySlot.values().forEach(part -> part.mechanics().forEach(mechanic -> mechanic.applyComputedStats(context, computation)));
        toolType.rules().forEach(rule -> rule.apply(context, computation));
        toolType.mechanics().forEach(mechanic -> mechanic.applyComputedStats(context, computation));
        return new AssemblyPreview(toolType, Map.copyOf(partsBySlot), stats.snapshot(), computation.errors(), computation.notes());
    }
}
