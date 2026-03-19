package com.calypso.assembly;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MutableToolStats {
    private final Map<String, Float> baseValues = new LinkedHashMap<>();
    private final Map<String, Float> values = new LinkedHashMap<>();

    public MutableToolStats(Map<String, Float> initialValues) {
        initialValues.forEach((key, value) -> {
            baseValues.put(key, value);
            values.put(key, value);
        });
    }

    public void apply(ToolStatModifier modifier) {
        float base = baseValues.getOrDefault(modifier.stat(), 0.0f);
        float current = values.getOrDefault(modifier.stat(), base);

        switch (modifier.operation()) {
            case ADD -> current += modifier.value();
            case MULTIPLY_BASE -> current += base * modifier.value();
            case MULTIPLY_TOTAL -> current *= (1.0f + modifier.value());
        }

        baseValues.putIfAbsent(modifier.stat(), base);
        values.put(modifier.stat(), current);
    }

    public float get(String stat) {
        return values.getOrDefault(stat, 0.0f);
    }

    public Map<String, Float> snapshot() {
        return Collections.unmodifiableMap(values);
    }
}
