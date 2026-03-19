package com.calypso.assembly;

import net.minecraft.text.Text;

import java.util.List;
import java.util.Map;

public record AssemblyPreview(
        ToolTypeDefinition toolType,
        Map<String, ToolPartDefinition> parts,
        Map<String, Float> stats,
        List<Text> errors,
        List<Text> notes
) {
    public boolean isValid() {
        return errors.isEmpty();
    }

    public float stat(String key) {
        return stats.getOrDefault(key, 0.0f);
    }
}
