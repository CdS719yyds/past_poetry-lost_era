package com.calypso.assembly;

import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

public class AssemblyComputation {
    private final MutableToolStats stats;
    private final List<Text> errors = new ArrayList<>();
    private final List<Text> notes = new ArrayList<>();

    public AssemblyComputation(MutableToolStats stats) {
        this.stats = stats;
    }

    public MutableToolStats stats() {
        return stats;
    }

    public void addModifier(ToolStatModifier modifier) {
        stats.apply(modifier);
    }

    public void error(Text text) {
        errors.add(text);
    }

    public void note(Text text) {
        notes.add(text);
    }

    public List<Text> errors() {
        return List.copyOf(errors);
    }

    public List<Text> notes() {
        return List.copyOf(notes);
    }

    public boolean isValid() {
        return errors.isEmpty();
    }
}
