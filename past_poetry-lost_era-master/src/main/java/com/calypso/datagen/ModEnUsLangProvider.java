package com.calypso.datagen;

import com.calypso.block.ModBlocks;
import com.calypso.item.ModItemGroups;
import com.calypso.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //普通方块
        translationBuilder.add(ModBlocks.COBBLEGOLDSTONE, "Cobblegoldstone");
        translationBuilder.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS, "Cracked Goldstone Bricks");
        translationBuilder.add(ModBlocks.GOLDSTONE, "Goldstone");
        translationBuilder.add(ModBlocks.GOLDSTONE_BRICKS, "Goldstone Bricks");
        translationBuilder.add(ModBlocks.MOSSY_COBBLEGOLDSTONE, "Mossy Cobblegoldstone");
        translationBuilder.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS, "Mossy Goldstone Bricks");
        translationBuilder.add(ModBlocks.SMOOTH_GOLDSTONE, "Smooth Goldstone");
        translationBuilder.add(ModBlocks.CHISELED_GOLDSTONE_BRICKS, "Chiseled Goldstone Bricks");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_LOG, "Primeval Jungle Log");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD, "Primeval Jungle Wood");
        translationBuilder.add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG, "Stripped Primeval Jungle Log");
        translationBuilder.add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD, "Stripped Primeval Jungle Wood");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_PLANKS, "Primeval Jungle Planks");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_LEAVES, "Primeval Jungle Leaves");

        translationBuilder.add(ModBlocks.WALNUT_LOG, "Walnut Log");
        translationBuilder.add(ModBlocks.WALNUT_WOOD, "Walnut Wood");
        translationBuilder.add(ModBlocks.STRIPPED_WALNUT_LOG, "Stripped Walnut Log");
        translationBuilder.add(ModBlocks.STRIPPED_WALNUT_WOOD, "Stripped Walnut Wood");
        translationBuilder.add(ModBlocks.WALNUT_PLANKS, "Walnut Planks");
        translationBuilder.add(ModBlocks.SMOOTH_WALNUT, "Smooth Walnut Planks");
        translationBuilder.add(ModBlocks.WALNUT_LEAVES, "Walnut Leaves");
        //楼梯
        translationBuilder.add(ModBlocks.COBBLEGOLDSTONE_STAIRS, "Cobblegoldstone Stairs");
        translationBuilder.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_STAIRS, "Cracked Goldstone Bricks Stairs");
        translationBuilder.add(ModBlocks.GOLDSTONE_STAIRS, "Goldstone Stairs");
        translationBuilder.add(ModBlocks.GOLDSTONE_BRICKS_STAIRS, "Goldstone Bricks Stairs");
        translationBuilder.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_STAIRS, "Mossy Cobblegoldstone Stairs");
        translationBuilder.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_STAIRS, "Mossy Goldstone Bricks Stairs");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_STAIRS, "Primeval Jungle Wood Stairs");

        translationBuilder.add(ModBlocks.WALNUT_WOOD_STAIRS, "Walnut Wood Stairs");
        //台阶
        translationBuilder.add(ModBlocks.COBBLEGOLDSTONE_SLAB, "Cobblegoldstone Slab");
        translationBuilder.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_SLAB, "Cracked Goldstone Bricks Slab");
        translationBuilder.add(ModBlocks.GOLDSTONE_SLAB, "Goldstone Slab");
        translationBuilder.add(ModBlocks.GOLDSTONE_BRICKS_SLAB, "Goldstone Bricks Slab");
        translationBuilder.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_SLAB, "Mossy Cobblegoldstone Slab");
        translationBuilder.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_SLAB, "Mossy Goldstone Bricks Slab");
        translationBuilder.add(ModBlocks.SMOOTH_GOLDSTONE_SLAB, "Smooth Goldstone Slab");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB, "Primeval Jungle Wood Slab");

        translationBuilder.add(ModBlocks.WALNUT_WOOD_SLAB, "Walnut Wood Slab");
        //墙
        translationBuilder.add(ModBlocks.COBBLEGOLDSTONE_WALL, "Cobblegoldstone Wall");
        translationBuilder.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_WALL, "Cracked Goldstone Bricks Wall");
        translationBuilder.add(ModBlocks.GOLDSTONE_WALL, "Goldstone Wall");
        translationBuilder.add(ModBlocks.GOLDSTONE_BRICKS_WALL, "Goldstone Bricks Wall");
        translationBuilder.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_WALL, "Mossy Cobblegoldstone Wall");
        translationBuilder.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_WALL, "Mossy Goldstone Bricks Wall");
        //栅栏
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_FENCE, "Primeval Jungle Fence");

        translationBuilder.add(ModBlocks.WALNUT_FENCE, "Walnut Fence");
        //栅栏门
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_FENCE_GATE, "Primeval Jungle Fence Gate");

        translationBuilder.add(ModBlocks.WALNUT_FENCE_GATE, "Walnut Fence Gate");
        //门
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_DOOR, "Primeval Jungle Door");

        translationBuilder.add(ModBlocks.WALNUT_DOOR, "Walnut Door");
        //活板门
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_TRAPDOOR, "Primeval Jungle Trapdoor");

        translationBuilder.add(ModBlocks.WALNUT_TRAPDOOR, "Walnut Trapdoor");
        //压力板
        translationBuilder.add(ModBlocks.GOLDSTONE_PRESSURE_PLATE, "Goldstone Pressure Plate");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_PRESSURE_PLATE, "Primeval Jungle Pressure Plate");

        translationBuilder.add(ModBlocks.WALNUT_PRESSURE_PLATE, "Walnut Pressure Plate");
        //按钮
        translationBuilder.add(ModBlocks.GOLDSTONE_BUTTON, "Goldstone Button");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_BUTTON, "Primeval Jungle Button");

        translationBuilder.add(ModBlocks.WALNUT_BUTTON, "Walnut Button");
        //树苗
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_SAPLING, "Primeval Jungle Sapling");

        translationBuilder.add(ModBlocks.WALNUT_SAPLING, "Walnut Sapling");
        //告示牌
        translationBuilder.add(ModItems.PRIMEVAL_JUNGLE_SIGN, "Primeval Jungle Sign");
        translationBuilder.add(ModItems.PRIMEVAL_JUNGLE_HANGING_SIGN, "Primeval Jungle Hanging Sign");

        translationBuilder.add(ModItems.WALNUT_SIGN, "Walnut Sign");
        translationBuilder.add(ModItems.WALNUT_HANGING_SIGN, "Walnut Hanging Sign");
        //船
        translationBuilder.add(ModItems.PRIMEVAL_JUNGLE_BOAT, "Primeval Jungle Boat");
        translationBuilder.add(ModItems.PRIMEVAL_JUNGLE_CHEST_BOAT, "Primeval Jungle Chest Boat");

        translationBuilder.add(ModItems.WALNUT_BOAT, "Walnut Boat");
        translationBuilder.add(ModItems.WALNUT_CHEST_BOAT, "Walnut Chest Boat");
        //其他
        translationBuilder.add(ModItems.WALNUT, "Walnut");
        translationBuilder.add(ModItems.DRIED_WALNUT, "Dried Walnut");
        translationBuilder.add(ModItems.WALNUT_MEAT, "Walnut Meat");
        //物品栏
        translationBuilder.add(ModItemGroups.PRIMEVAL_JUNGLE,"Primeval Jungle");
        translationBuilder.add(ModItemGroups.WALNUT_FOREST,"Walnut Forest");
    }
}
