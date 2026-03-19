package com.calypso.assembly;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ToolPartDefinition {
    private final Identifier id;
    private final LocalizedName name;
    private final Identifier iconTexture;
    private final Set<String> allowedSlots;
    private final Set<String> traits;
    private final List<ToolStatModifier> modifiers;
    private final List<AssemblyRule> rules;
    private final List<AssemblyMechanic> mechanics;
    private final Item.Settings itemSettings;

    private ToolPartDefinition(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.iconTexture = builder.iconTexture;
        this.allowedSlots = Set.copyOf(builder.allowedSlots);
        this.traits = Set.copyOf(builder.traits);
        this.modifiers = List.copyOf(builder.modifiers);
        this.rules = List.copyOf(builder.rules);
        this.mechanics = List.copyOf(builder.mechanics);
        this.itemSettings = builder.itemSettings;
    }

    public Identifier id() {
        return id;
    }

    public LocalizedName name() {
        return name;
    }

    public Identifier iconTexture() {
        return iconTexture;
    }

    public Set<String> allowedSlots() {
        return allowedSlots;
    }

    public Set<String> traits() {
        return traits;
    }

    public List<ToolStatModifier> modifiers() {
        return modifiers;
    }

    public List<AssemblyRule> rules() {
        return rules;
    }

    public List<AssemblyMechanic> mechanics() {
        return mechanics;
    }

    public Item.Settings itemSettings() {
        return itemSettings;
    }

    public boolean supportsSlot(String slotId) {
        return allowedSlots.contains(slotId);
    }

    public static Builder builder(Identifier id, LocalizedName name, Identifier iconTexture) {
        return new Builder(id, name, iconTexture);
    }

    public static class Builder {
        private final Identifier id;
        private final LocalizedName name;
        private final Identifier iconTexture;
        private final Set<String> allowedSlots = new LinkedHashSet<>();
        private final Set<String> traits = new LinkedHashSet<>();
        private final List<ToolStatModifier> modifiers = new ArrayList<>();
        private final List<AssemblyRule> rules = new ArrayList<>();
        private final List<AssemblyMechanic> mechanics = new ArrayList<>();
        private Item.Settings itemSettings = new Item.Settings();

        private Builder(Identifier id, LocalizedName name, Identifier iconTexture) {
            this.id = id;
            this.name = name;
            this.iconTexture = iconTexture;
        }

        public Builder allowSlot(String slotId) {
            this.allowedSlots.add(slotId);
            return this;
        }

        public Builder allowSlots(String... slotIds) {
            for (String slotId : slotIds) {
                allowSlot(slotId);
            }
            return this;
        }

        public Builder trait(String trait) {
            this.traits.add(trait);
            return this;
        }

        public Builder modifier(ToolStatModifier modifier) {
            this.modifiers.add(modifier);
            return this;
        }

        public Builder rule(AssemblyRule rule) {
            this.rules.add(rule);
            return this;
        }

        public Builder mechanic(AssemblyMechanic mechanic) {
            this.mechanics.add(mechanic);
            return this;
        }

        public Builder settings(Item.Settings settings) {
            this.itemSettings = settings;
            return this;
        }

        public ToolPartDefinition build() {
            return new ToolPartDefinition(this);
        }
    }
}
