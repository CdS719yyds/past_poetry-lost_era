package com.calypso.block;

import com.calypso.Past_PoetryLost_Era;
import com.calypso.world.tree.PrimevalJungleTreeSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
//Primeval Jungle原始丛林
        //block普通方块
        public static final Block GOLDSTONE = register("primeval_jungle/goldstone",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block COBBLEGOLDSTONE = register("primeval_jungle/cobblegoldstone",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block MOSSY_COBBLEGOLDSTONE = register("primeval_jungle/mossy_cobblegoldstone",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block GOLDSTONE_BRICKS = register("primeval_jungle/goldstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block MOSSY_GOLDSTONE_BRICKS = register("primeval_jungle/mossy_goldstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block SMOOTH_GOLDSTONE = register("primeval_jungle/smooth_goldstone",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block CRACKED_GOLDSTONE_BRICKS = register("primeval_jungle/cracked_goldstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block CHISELED_GOLDSTONE_BRICKS = register("primeval_jungle/chiseled_goldstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block PRIMEVAL_JUNGLE_LOG = register("primeval_jungle/primeval_jungle_log",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
        public static final Block PRIMEVAL_JUNGLE_WOOD = register("primeval_jungle/primeval_jungle_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
        public static final Block STRIPPED_PRIMEVAL_JUNGLE_LOG = register("primeval_jungle/stripped_primeval_jungle_log",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
        public static final Block STRIPPED_PRIMEVAL_JUNGLE_WOOD = register("primeval_jungle/stripped_primeval_jungle_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
        public static final Block PRIMEVAL_JUNGLE_PLANKS = register("primeval_jungle/primeval_jungle_planks",
                new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        public static final Block PRIMEVAL_JUNGLE_LEAVES = register("primeval_jungle/primeval_jungle_leaves",
                new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
        //stairs楼梯
        public static final Block CRACKED_GOLDSTONE_BRICKS_STAIRS = register("primeval_jungle/cracked_goldstone_bricks_stairs",
                new StairsBlock(CRACKED_GOLDSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(CRACKED_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_BRICKS_STAIRS = register("primeval_jungle/goldstone_brick_stairs",
                new StairsBlock(GOLDSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(GOLDSTONE_BRICKS)));
        public static final Block COBBLEGOLDSTONE_STAIRS = register("primeval_jungle/cobblegoldstone_stairs",
                new StairsBlock(COBBLEGOLDSTONE.getDefaultState(), AbstractBlock.Settings.copy(COBBLEGOLDSTONE)));
        public static final Block MOSSY_COBBLEGOLDSTONE_STAIRS = register("primeval_jungle/mossy_cobblegoldstone_stairs",
                new StairsBlock(MOSSY_COBBLEGOLDSTONE.getDefaultState(), AbstractBlock.Settings.copy(MOSSY_COBBLEGOLDSTONE)));
        public static final Block MOSSY_GOLDSTONE_BRICKS_STAIRS = register("primeval_jungle/mossy_goldstone_bricks_stairs",
                new StairsBlock(MOSSY_GOLDSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(MOSSY_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_STAIRS = register("primeval_jungle/goldstone_stairs",
                new StairsBlock(GOLDSTONE.getDefaultState(), AbstractBlock.Settings.copy(GOLDSTONE)));
        public static final Block PRIMEVAL_JUNGLE_WOOD_STAIRS = register("primeval_jungle/primeval_jungle_wood_stairs",
                new StairsBlock(PRIMEVAL_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS)));
        //slab台阶
        public static final Block CRACKED_GOLDSTONE_BRICKS_SLAB = register("primeval_jungle/cracked_goldstone_bricks_slab",
                new SlabBlock(AbstractBlock.Settings.copy(CRACKED_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_BRICKS_SLAB = register("primeval_jungle/goldstone_bricks_slab",
                new SlabBlock(AbstractBlock.Settings.copy(GOLDSTONE_BRICKS)));
        public static final Block COBBLEGOLDSTONE_SLAB = register("primeval_jungle/cobblegoldstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(COBBLEGOLDSTONE)));
        public static final Block MOSSY_COBBLEGOLDSTONE_SLAB = register("primeval_jungle/mossy_cobblegoldstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(MOSSY_COBBLEGOLDSTONE)));
        public static final Block MOSSY_GOLDSTONE_BRICKS_SLAB = register("primeval_jungle/mossy_goldstone_bricks_slab",
                new SlabBlock(AbstractBlock.Settings.copy(MOSSY_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_SLAB = register("primeval_jungle/goldstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(GOLDSTONE)));
        public static final Block SMOOTH_GOLDSTONE_SLAB = register("primeval_jungle/smooth_goldstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_GOLDSTONE)));
        public static final Block PRIMEVAL_JUNGLE_WOOD_SLAB = register("primeval_jungle/primeval_jungle_wood_slab",
                new SlabBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS)));
        //button按钮
        public static final Block GOLDSTONE_BUTTON = register("primeval_jungle/goldstone_button",
                new ButtonBlock(AbstractBlock.Settings.copy(GOLDSTONE), BlockSetType.STONE, 60, false));
        public static final Block PRIMEVAL_JUNGLE_BUTTON = register("primeval_jungle/primeval_jungle_button",
                new ButtonBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), BlockSetType.JUNGLE, 60, false));
        //pressure plate压力板
        public static final Block GOLDSTONE_PRESSURE_PLATE = register("primeval_jungle/goldstone_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(GOLDSTONE), BlockSetType.STONE));
        public static final Block PRIMEVAL_JUNGLE_PRESSURE_PLATE = register("primeval_jungle/primeval_jungle_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), BlockSetType.JUNGLE));
        //wall墙
        public static final Block COBBLEGOLDSTONE_WALL = register("primeval_jungle/cobblegoldstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(COBBLEGOLDSTONE)));
        public static final Block CRACKED_GOLDSTONE_BRICKS_WALL = register("primeval_jungle/cracked_goldstone_bricks_wall",
                new WallBlock(AbstractBlock.Settings.copy(CRACKED_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_WALL = register("primeval_jungle/goldstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(GOLDSTONE)));
        public static final Block GOLDSTONE_BRICKS_WALL = register("primeval_jungle/goldstone_bricks_wall",
                new WallBlock(AbstractBlock.Settings.copy(GOLDSTONE_BRICKS)));
        public static final Block MOSSY_COBBLEGOLDSTONE_WALL = register("primeval_jungle/mossy_cobblegoldstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(MOSSY_COBBLEGOLDSTONE)));
        public static final Block MOSSY_GOLDSTONE_BRICKS_WALL = register("primeval_jungle/mossy_goldstone_bricks_wall",
                new WallBlock(AbstractBlock.Settings.copy(MOSSY_GOLDSTONE_BRICKS)));
        //fence栅栏
        public static final Block PRIMEVAL_JUNGLE_FENCE = register("primeval_jungle/primeval_jungle_fence",
                new FenceBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS)));
        //fence_gate栅栏门
        public static final Block PRIMEVAL_JUNGLE_FENCE_GATE = register("primeval_jungle/primeval_jungle_fence_gate",
                new FenceGateBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), WoodType.JUNGLE));
        //door门
        public static final Block PRIMEVAL_JUNGLE_DOOR = register("primeval_jungle/primeval_jungle_door",
                new DoorBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), BlockSetType.JUNGLE));
        //trapdoor活板门
        public static final Block PRIMEVAL_JUNGLE_TRAPDOOR = register("primeval_jungle/primeval_jungle_trapdoor",
                new TrapdoorBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), BlockSetType.JUNGLE));
        //sapling树苗
        public static final Block PRIMEVAL_JUNGLE_SAPLING = register("primeval_jungle/primeval_jungle_sapling",
                new SaplingBlock(new PrimevalJungleTreeSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
//Walnut Forest核桃林
        //block普通方块
        public static final Block WALNUT_LOG = register("walnut_forest/walnut_log",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
        public static final Block WALNUT_WOOD = register("walnut_forest/walnut_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
        public static final Block STRIPPED_WALNUT_LOG = register("walnut_forest/stripped_walnut_log",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
        public static final Block STRIPPED_WALNUT_WOOD = register("walnut_forest/stripped_walnut_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
        public static final Block WALNUT_PLANKS = register("walnut_forest/walnut_planks",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        public static final Block SMOOTH_WALNUT = register("walnut_forest/smooth_walnut",
                new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        public static final Block WALNUT_LEAVES = register("walnut_forest/walnut_leaves",
                new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
        //stairs楼梯
        public static final Block WALNUT_WOOD_STAIRS = register("walnut_forest/walnut_wood_stairs",
                new StairsBlock(WALNUT_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(WALNUT_PLANKS)));
        //slab台阶
        public static final Block WALNUT_WOOD_SLAB = register("walnut_forest/walnut_wood_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS)));
        //button按钮
        public static final Block WALNUT_BUTTON = register("walnut_forest/walnut_button",
                new ButtonBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS), BlockSetType.OAK, 60, true));
        //pressure plate压力板
        public static final Block WALNUT_PRESSURE_PLATE = register("walnut_forest/walnut_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(WALNUT_PLANKS), BlockSetType.OAK));
        //fence栅栏
        public static final Block WALNUT_FENCE = register("walnut_forest/walnut_fence",
                new FenceBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS)));
        //fence_gate栅栏门
        public static final Block WALNUT_FENCE_GATE = register("walnut_forest/walnut_fence_gate",
                new FenceGateBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS), WoodType.OAK));
        //door门
        public static final Block WALNUT_DOOR = register("walnut_forest/walnut_door",
                new DoorBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS), BlockSetType.OAK));
        //trapdoor活板门
        public static final Block WALNUT_TRAPDOOR = register("walnut_forest/walnut_trapdoor",
                new TrapdoorBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS), BlockSetType.OAK));

    public static Block register(String id, Block block){
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, id), block);
    }

    public static void registerBlockItems(String id, Block block){
        Registry.register(Registries.ITEM, new Identifier(Past_PoetryLost_Era.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

    }
}
