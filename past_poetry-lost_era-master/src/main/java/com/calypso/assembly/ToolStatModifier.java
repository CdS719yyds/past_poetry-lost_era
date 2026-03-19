package com.calypso.assembly;

public record ToolStatModifier(String stat, float value, StatModifierOperation operation) {
    public static ToolStatModifier add(String stat, float value) {
        return new ToolStatModifier(stat, value, StatModifierOperation.ADD);
    }

    public static ToolStatModifier multiplyBase(String stat, float value) {
        return new ToolStatModifier(stat, value, StatModifierOperation.MULTIPLY_BASE);
    }

    public static ToolStatModifier multiplyTotal(String stat, float value) {
        return new ToolStatModifier(stat, value, StatModifierOperation.MULTIPLY_TOTAL);
    }
}
