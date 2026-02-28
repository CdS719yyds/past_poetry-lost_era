package com.calypso.entity;

import com.calypso.Past_PoetryLost_Era;
import com.calypso.block.ModBlocks;
import com.calypso.item.ModItems;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier PRIMEVAL_JUNGLE_BOAT = new Identifier(Past_PoetryLost_Era.MOD_ID, "primeval_jungle_boat");
    public static final Identifier PRIMEVAL_JUNGLE_CHEST_BOAT = new Identifier(Past_PoetryLost_Era.MOD_ID, "primeval_jungle_chest_boat");

    public static final Identifier WALNUT_BOAT = new Identifier(Past_PoetryLost_Era.MOD_ID, "walnut_boat");
    public static final Identifier WALNUT_CHEST_BOAT = new Identifier(Past_PoetryLost_Era.MOD_ID, "walnut_chest_boat");

    public static final RegistryKey<TerraformBoatType> PRIMEVAL_JUNGLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PRIMEVAL_JUNGLE_BOAT);
    public static final RegistryKey<TerraformBoatType> WALNUT_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WALNUT_BOAT);

    public static void registerBoats() {
        TerraformBoatType PRIMEVAL_JUNGLE_BOAT_TYPE = new TerraformBoatType.Builder()
                .item(ModItems.PRIMEVAL_JUNGLE_BOAT)
                .chestItem(ModItems.PRIMEVAL_JUNGLE_CHEST_BOAT)
                .planks(ModBlocks.PRIMEVAL_JUNGLE_PLANKS.asItem())
                .build();

        TerraformBoatType WALNUT_BOAT_TYPE = new TerraformBoatType.Builder()
                .item(ModItems.WALNUT_BOAT)
                .chestItem(ModItems.WALNUT_CHEST_BOAT)
                .planks(ModBlocks.WALNUT_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PRIMEVAL_JUNGLE_BOAT_KEY, PRIMEVAL_JUNGLE_BOAT_TYPE);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WALNUT_BOAT_KEY, WALNUT_BOAT_TYPE);
    }
}
