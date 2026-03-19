package com.calypso.assembly;

import net.minecraft.util.Identifier;

public record AssemblySlotDefinition(String id, LocalizedName name, Identifier iconTexture) {
    public String translationKey() {
        return "assembly_slot." + id;
    }
}
