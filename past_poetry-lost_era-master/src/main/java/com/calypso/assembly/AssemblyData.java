package com.calypso.assembly;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

import java.util.LinkedHashMap;
import java.util.Map;

public final class AssemblyData {
    private static final String ROOT = "ToolAssembly";
    private static final String PARTS = "Parts";
    private static final String DAMAGE = "Damage";

    private AssemblyData() {
    }

    public static boolean isAssembled(ItemStack stack) {
        NbtCompound root = stack.getSubNbt(ROOT);
        return root != null && root.contains(PARTS);
    }

    public static Map<String, String> getParts(ItemStack stack) {
        Map<String, String> result = new LinkedHashMap<>();
        NbtCompound root = stack.getSubNbt(ROOT);
        if (root == null || !root.contains(PARTS)) {
            return result;
        }

        NbtCompound parts = root.getCompound(PARTS);
        for (String key : parts.getKeys()) {
            result.put(key, parts.getString(key));
        }
        return result;
    }

    public static void setParts(ItemStack stack, Map<String, ToolPartDefinition> partsBySlot) {
        NbtCompound root = stack.getOrCreateSubNbt(ROOT);
        NbtCompound parts = new NbtCompound();
        partsBySlot.forEach((slotId, part) -> parts.putString(slotId, part.id().toString()));
        root.put(PARTS, parts);
        root.putInt(DAMAGE, 0);
    }

    public static int getDamage(ItemStack stack) {
        NbtCompound root = stack.getSubNbt(ROOT);
        return root == null ? 0 : root.getInt(DAMAGE);
    }

    public static void setDamage(ItemStack stack, int value) {
        stack.getOrCreateSubNbt(ROOT).putInt(DAMAGE, Math.max(value, 0));
    }
}
