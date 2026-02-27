package com.calypso.datagen;

import com.calypso.Past_PoetryLost_Era;
import com.calypso.block.ModBlocks;
import com.calypso.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }
//合成表
    public static final List<ItemConvertible> GOLDSTONE = List.of(ModBlocks.COBBLEGOLDSTONE);
    public static final List<ItemConvertible> SMOOTH_GOLDSTONE = List.of(ModBlocks.GOLDSTONE);
    public static final List<ItemConvertible> DRIED_WALNT = List.of(ModItems.WALNUT);

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        //4*4合成
        offer2x2CompactingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS, ModBlocks.GOLDSTONE);
        //熔炉
        offerSmelting(consumer, GOLDSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE, 0.7f, 160, "goldstone");
        offerSmelting(consumer, SMOOTH_GOLDSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GOLDSTONE, 0.7f, 160, "smooth_goldstone");
        offerSmelting(consumer, DRIED_WALNT, RecipeCategory.BUILDING_BLOCKS, ModItems.DRIED_WALNUT, 0.7f, 160, "dried_walnut");
        //高炉
        offerBlasting(consumer, GOLDSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE, 0.7f, 100, "goldstone");
        offerBlasting(consumer, SMOOTH_GOLDSTONE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GOLDSTONE, 0.7f, 100, "smooth_goldstone");
        offerBlasting(consumer, DRIED_WALNT, RecipeCategory.BUILDING_BLOCKS, ModItems.DRIED_WALNT, 0.7f, 100, "dried_walnut");
        //切石机
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GOLDSTONE_BRICKS, ModBlocks.GOLDSTONE, 1);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_SLAB, ModBlocks.GOLDSTONE, 2);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_STAIRS, ModBlocks.GOLDSTONE, 1);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_WALL, ModBlocks.GOLDSTONE, 1);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS, ModBlocks.GOLDSTONE, 1);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_SLAB, ModBlocks.GOLDSTONE, 2);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_STAIRS, ModBlocks.GOLDSTONE, 1);

        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLEGOLDSTONE_SLAB, ModBlocks.COBBLEGOLDSTONE, 2);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLEGOLDSTONE_STAIRS, ModBlocks.COBBLEGOLDSTONE, 1);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLEGOLDSTONE_WALL, ModBlocks.COBBLEGOLDSTONE, 1);

        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GOLDSTONE_BRICKS, ModBlocks.GOLDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_SLAB, ModBlocks.GOLDSTONE_BRICKS, 2);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_STAIRS, ModBlocks.GOLDSTONE_BRICKS, 1);
        offerStonecuttingRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_WALL, ModBlocks.GOLDSTONE_BRICKS, 1);
        //台阶
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLEGOLDSTONE_SLAB, ModBlocks.COBBLEGOLDSTONE);
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_SLAB, ModBlocks.GOLDSTONE);
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GOLDSTONE_SLAB, ModBlocks.SMOOTH_GOLDSTONE);
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB, ModBlocks.PRIMEVAL_JUNGLE_PLANKS);
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_SLAB, ModBlocks.GOLDSTONE_BRICKS);
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_WOOD_SLAB, ModBlocks.WALNUT_PLANKS);
        //楼梯
        offerStairsRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLEGOLDSTONE_STAIRS, ModBlocks.COBBLEGOLDSTONE, 4,"cobblegoldstone_stairs");
        offerStairsRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_STAIRS, ModBlocks.GOLDSTONE, 4, "goldstone_stairs");
        offerStairsRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_STAIRS, ModBlocks.GOLDSTONE_BRICKS, 4, "goldstone_bricks_stairs");
        offerStairsRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRIMEVAL_JUNGLE_WOOD_STAIRS, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, 4, "primeval_jungle_wood_stairs");
        offerStairsRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WALNUT_WOOD_STAIRS, ModBlocks.WALNUT_PLANKS, 4, "walnut_wood_stairs");
        //墙
        offerWallRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_WALL, ModBlocks.GOLDSTONE);
        offerWallRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLDSTONE_BRICKS_WALL, ModBlocks.GOLDSTONE_BRICKS);
        offerWallRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLEGOLDSTONE_WALL, ModBlocks.COBBLEGOLDSTONE);
        //物品一合二
        offerModNumberItemRecipe(consumer, ModItems.WALNUT_MEAT, ModItems.DRIED_WALNUT, 2, "primeval_jungle_log");
        //木头
        offerModPlanksRecipe(consumer, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, ModBlocks.PRIMEVAL_JUNGLE_LOG, 4, "primeval_jungle_log");
        offerModPlanksRecipe(consumer, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG, 4, "sipped_primeval_jungle_log");
        offerModPlanksRecipe(consumer, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, ModBlocks.PRIMEVAL_JUNGLE_WOOD, 4, "primeval_jungle_wood");
        offerModPlanksRecipe(consumer, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD, 4, "stripped_primeval_jungle_wood");
        offerShapelessRecipe(consumer, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, ModBlocks.PRIMEVAL_JUNGLE_LOG, "primeval_jungle_log", 4);
        offerShapelessRecipe(consumer, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG, "stripped_primeval_jungle_log", 4);
        offerShapelessRecipe(consumer, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, ModBlocks.PRIMEVAL_JUNGLE_WOOD, "primeval_jungle_wood", 4);
        offerShapelessRecipe(consumer, ModBlocks.PRIMEVAL_JUNGLE_PLANKS, ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD, "stripped_primeval_jungle_wood", 4);

        offerModPlanksRecipe(consumer, ModBlocks.WALNUT_PLANKS, ModBlocks.WALNUT_LOG, 4, "walnut_log");
        offerModPlanksRecipe(consumer, ModBlocks.WALNUT_PLANKS, ModBlocks.STRIPPED_WALNUT_LOG, 4, "stripped_walnut_log");
        offerModPlanksRecipe(consumer, ModBlocks.WALNUT_PLANKS, ModBlocks.WALNUT_WOOD, 4, "walnut_wood");
        offerModPlanksRecipe(consumer, ModBlocks.WALNUT_PLANKS, ModBlocks.STRIPPED_WALNUT_WOOD, 4, "stripped_walnut_wood");
        offerShapelessRecipe(consumer, ModBlocks.WALNUT_PLANKS, ModBlocks.WALNUT_LOG, "walnut_log", 4);
        offerShapelessRecipe(consumer, ModBlocks.WALNUT_PLANKS, ModBlocks.STRIPPED_WALNUT_LOG, "stripped_walnut_log", 4);
        offerShapelessRecipe(consumer, ModBlocks.WALNUT_PLANKS, ModBlocks.WALNUT_WOOD, "walnut_wood", 4);
        offerShapelessRecipe(consumer, ModBlocks.WALNUT_PLANKS, ModBlocks.STRIPPED_WALNUT_WOOD, "stripped_walnut_wood", 4);
    }
    //楼梯合成配方函数
    public static void offerStairsRecipe(Consumer<RecipeJsonProvider> consumer, RecipeCategory category, Block blockout, Block block_input, int count, String group) {
        ShapedRecipeJsonBuilder.create(category, blockout, count)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', block_input)
                .criterion(hasItem(block_input), conditionsFromItem(block_input))
                .offerTo(consumer, new Identifier(Past_PoetryLost_Era.MOD_ID, group));
    }
    public static void offerModPlanksRecipe(Consumer<RecipeJsonProvider> consumer, Block blockout, Block block_input, int count, String group) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, blockout, count)
                .input(block_input)
                .criterion(hasItem(block_input),conditionsFromItem(block_input))
                .offerTo(consumer, new Identifier(Past_PoetryLost_Era.MOD_ID, group));
    }
    public static void offerModNumberItemRecipe(Consumer<RecipeJsonProvider> consumer, Item itemout, Item item_input, int count, String group) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, itemout, count)
                .input(item_input)
                .criterion(hasItem(item_input),conditionsFromItem(item_input))
                .offerTo(consumer, new Identifier(Past_PoetryLost_Era.MOD_ID, group));
    }
}
