package com.calypso.assembly;

import com.calypso.Past_PoetryLost_Era;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ToolAssemblyRegistry {
    private static final List<ModularToolItem> TOOL_ITEMS = new ArrayList<>();
    private static final List<ToolPartItem> PART_ITEMS = new ArrayList<>();
    private static final Map<Identifier, ToolPartDefinition> PARTS_BY_ID = new LinkedHashMap<>();

    private ToolAssemblyRegistry() {
    }

    public static ModularToolItem registerTool(ToolTypeDefinition definition) {
        ModularToolItem item = Registry.register(Registries.ITEM, definition.id(), new ModularToolItem(definition, definition.itemSettings()));
        TOOL_ITEMS.add(item);
        Past_PoetryLost_Era.LOGGER.info("Registered modular tool {}", definition.id());
        return item;
    }

    public static ToolPartItem registerPart(ToolPartDefinition definition) {
        ToolPartItem item = Registry.register(Registries.ITEM, definition.id(), new ToolPartItem(definition, definition.itemSettings()));
        PART_ITEMS.add(item);
        PARTS_BY_ID.put(definition.id(), definition);
        Past_PoetryLost_Era.LOGGER.info("Registered tool part {}", definition.id());
        return item;
    }

    public static List<ModularToolItem> toolItems() {
        return Collections.unmodifiableList(TOOL_ITEMS);
    }

    public static List<ToolPartItem> partItems() {
        return Collections.unmodifiableList(PART_ITEMS);
    }

    public static List<Item> allAssemblyItems(Item toolkitItem) {
        List<Item> items = new ArrayList<>();
        items.add(toolkitItem);
        items.addAll(TOOL_ITEMS);
        items.addAll(PART_ITEMS);
        return items;
    }

    public static ToolPartDefinition getPartDefinition(String id) {
        return PARTS_BY_ID.get(new Identifier(id));
    }
}
