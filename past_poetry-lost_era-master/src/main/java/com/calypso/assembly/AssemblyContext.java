package com.calypso.assembly;

import net.minecraft.item.ItemStack;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class AssemblyContext {
    private final ToolTypeDefinition toolType;
    private final Map<String, ToolPartDefinition> partsBySlot;
    private final ItemStack stack;

    public AssemblyContext(ToolTypeDefinition toolType, Map<String, ToolPartDefinition> partsBySlot, ItemStack stack) {
        this.toolType = toolType;
        this.partsBySlot = Map.copyOf(new LinkedHashMap<>(partsBySlot));
        this.stack = stack;
    }

    public ToolTypeDefinition toolType() {
        return toolType;
    }

    public Map<String, ToolPartDefinition> partsBySlot() {
        return partsBySlot;
    }

    public ItemStack stack() {
        return stack;
    }

    public boolean hasPart(String slotId) {
        return partsBySlot.containsKey(slotId);
    }

    public ToolPartDefinition part(String slotId) {
        return partsBySlot.get(slotId);
    }

    public boolean hasTrait(String trait) {
        return partsBySlot.values().stream().anyMatch(part -> part.traits().contains(trait));
    }

    public boolean slotHasTrait(String slotId, String trait) {
        ToolPartDefinition part = part(slotId);
        return part != null && part.traits().contains(trait);
    }

    public boolean hasPartId(String partPath) {
        return partsBySlot.values().stream().anyMatch(part -> part.id().getPath().equals(partPath));
    }

    public Collection<ToolPartDefinition> parts() {
        return partsBySlot.values();
    }
}
