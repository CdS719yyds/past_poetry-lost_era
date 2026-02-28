package com.calypso.item;

import com.calypso.Past_PoetryLost_Era;
import com.calypso.block.ModBlocks;
import com.calypso.entity.ModBoats;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PRIMEVAL_JUNGLE_SIGN = registerItem("primeval_jungle_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.PRIMEVAL_JUNGLE_SIGN, ModBlocks.PRIMEVAL_JUNGLE_WALL_SIGN));
    public static final Item PRIMEVAL_JUNGLE_HANGING_SIGN = registerItem("primeval_jungle_hanging_sign",
            new HangingSignItem(ModBlocks.PRIMEVAL_JUNGLE_HANGING_SIGN, ModBlocks.PRIMEVAL_JUNGLE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item PRIMEVAL_JUNGLE_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.PRIMEVAL_JUNGLE_BOAT, ModBoats.PRIMEVAL_JUNGLE_BOAT_KEY, false);
    public static final Item PRIMEVAL_JUNGLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.PRIMEVAL_JUNGLE_CHEST_BOAT, ModBoats.PRIMEVAL_JUNGLE_BOAT_KEY, true);



    public static final Item WALNUT = registerItem("walnut", new Item(new Item.Settings()));
    public static final Item DRIED_WALNUT = registerItem("dried_walnut", new Item(new Item.Settings()));
    public static final Item WALNUT_MEAT = registerItem("walnut_meat", new Item(new Item.Settings()));

    public static final Item WALNUT_SIGN = registerItem("walnut_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.WALNUT_SIGN, ModBlocks.WALNUT_WALL_SIGN));
    public static final Item WALNUT_HANGING_SIGN = registerItem("walnut_hanging_sign",
            new HangingSignItem(ModBlocks.WALNUT_HANGING_SIGN, ModBlocks.WALNUT_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item WALNUT_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.WALNUT_BOAT, ModBoats.WALNUT_BOAT_KEY, false);
    public static final Item WALNUT_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.WALNUT_CHEST_BOAT, ModBoats.WALNUT_BOAT_KEY, true);
//注册方法
    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Past_PoetryLost_Era.MOD_ID, id), item);
    }

    public static void registerItems() {

    }
}
