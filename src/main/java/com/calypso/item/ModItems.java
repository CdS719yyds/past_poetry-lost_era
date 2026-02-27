package com.calypso.item;

import com.calypso.Past_PoetryLost_Era;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WALNUT = registerItem("walnut_forest/walnut", new Item(new Item.Settings()));
    public static final Item DRIED_WALNUT = registerItem("walnut_forest/dried_walnut", new Item(new Item.Settings()));
    public static final Item WALNUT_MEAT = registerItem("walnut_forest/walnut_meat", new Item(new Item.Settings()));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Past_PoetryLost_Era.MOD_ID, id), item);
    }
}
