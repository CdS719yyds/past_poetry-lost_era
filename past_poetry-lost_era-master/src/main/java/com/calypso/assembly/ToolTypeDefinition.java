package com.calypso.assembly;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ToolTypeDefinition {
    private final Identifier id;
    private final LocalizedName name;
    private final Identifier iconTexture;
    private final List<AssemblySlotDefinition> slots;
    private final Map<String, Float> baseStats;
    private final List<AssemblyRule> rules;
    private final List<AssemblyMechanic> mechanics;
    private final TagKey<Block> effectiveBlocksTag;
    private final Item.Settings itemSettings;

    private ToolTypeDefinition(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.iconTexture = builder.iconTexture;
        this.slots = List.copyOf(builder.slots);
        this.baseStats = Map.copyOf(builder.baseStats);
        this.rules = List.copyOf(builder.rules);
        this.mechanics = List.copyOf(builder.mechanics);
        this.effectiveBlocksTag = builder.effectiveBlocksTag;
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

    public List<AssemblySlotDefinition> slots() {
        return slots;
    }

    public Map<String, Float> baseStats() {
        return baseStats;
    }

    public List<AssemblyRule> rules() {
        return rules;
    }

    public List<AssemblyMechanic> mechanics() {
        return mechanics;
    }

    public TagKey<Block> effectiveBlocksTag() {
        return effectiveBlocksTag;
    }

    public Item.Settings itemSettings() {
        return itemSettings;
    }

    public AssemblySlotDefinition slotAt(int index) {
        if (index < 0 || index >= slots.size()) {
            return null;
        }
        return slots.get(index);
    }

    public static Builder builder(Identifier id, LocalizedName name, Identifier iconTexture) {
        return new Builder(id, name, iconTexture);
    }

    public static class Builder {
        private final Identifier id;
        private final LocalizedName name;
        private final Identifier iconTexture;
        private final List<AssemblySlotDefinition> slots = new ArrayList<>();
        private final Map<String, Float> baseStats = new LinkedHashMap<>();
        private final List<AssemblyRule> rules = new ArrayList<>();
        private final List<AssemblyMechanic> mechanics = new ArrayList<>();
        private TagKey<Block> effectiveBlocksTag;
        private Item.Settings itemSettings = new Item.Settings().maxCount(1);

        private Builder(Identifier id, LocalizedName name, Identifier iconTexture) {
            this.id = id;
            this.name = name;
            this.iconTexture = iconTexture;
        }

        public Builder slot(AssemblySlotDefinition slot) {
            this.slots.add(slot);
            return this;
        }

        public Builder baseStat(String key, float value) {
            this.baseStats.put(key, value);
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

        public Builder effectiveBlocks(TagKey<Block> blockTag) {
            this.effectiveBlocksTag = blockTag;
            return this;
        }

        public Builder settings(Item.Settings settings) {
            this.itemSettings = settings;
            return this;
        }

        public ToolTypeDefinition build() {
            return new ToolTypeDefinition(this);
        }
    }
}
