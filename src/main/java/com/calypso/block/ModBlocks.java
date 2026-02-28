package com.calypso.block;

import com.calypso.Past_PoetryLost_Era;
import com.calypso.world.tree.PrimevalJungleTreeSaplingGenerator;
import com.calypso.world.tree.WalnutTreeSaplingGenerator;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
        //Primeval Jungle原始丛林
        //block普通方块
        public static final Block GOLDSTONE = register("goldstone",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block COBBLEGOLDSTONE = register("cobblegoldstone",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block MOSSY_COBBLEGOLDSTONE = register("mossy_cobblegoldstone",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block GOLDSTONE_BRICKS = register("goldstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block MOSSY_GOLDSTONE_BRICKS = register("mossy_goldstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block SMOOTH_GOLDSTONE = register("smooth_goldstone",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block CRACKED_GOLDSTONE_BRICKS = register("cracked_goldstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block CHISELED_GOLDSTONE_BRICKS = register("chiseled_goldstone_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
        public static final Block PRIMEVAL_JUNGLE_LOG = register("primeval_jungle_log",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
        public static final Block PRIMEVAL_JUNGLE_WOOD = register("primeval_jungle_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
        public static final Block STRIPPED_PRIMEVAL_JUNGLE_LOG = register("stripped_primeval_jungle_log",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
        public static final Block STRIPPED_PRIMEVAL_JUNGLE_WOOD = register("stripped_primeval_jungle_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
        public static final Block PRIMEVAL_JUNGLE_PLANKS = register("primeval_jungle_planks",
                new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        public static final Block PRIMEVAL_JUNGLE_LEAVES = register("primeval_jungle_leaves",
                new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
        //stairs楼梯
        public static final Block CRACKED_GOLDSTONE_BRICKS_STAIRS = register("cracked_goldstone_bricks_stairs",
                new StairsBlock(CRACKED_GOLDSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(CRACKED_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_BRICKS_STAIRS = register("goldstone_brick_stairs",
                new StairsBlock(GOLDSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(GOLDSTONE_BRICKS)));
        public static final Block COBBLEGOLDSTONE_STAIRS = register("cobblegoldstone_stairs",
                new StairsBlock(COBBLEGOLDSTONE.getDefaultState(), AbstractBlock.Settings.copy(COBBLEGOLDSTONE)));
        public static final Block MOSSY_COBBLEGOLDSTONE_STAIRS = register("mossy_cobblegoldstone_stairs",
                new StairsBlock(MOSSY_COBBLEGOLDSTONE.getDefaultState(), AbstractBlock.Settings.copy(MOSSY_COBBLEGOLDSTONE)));
        public static final Block MOSSY_GOLDSTONE_BRICKS_STAIRS = register("mossy_goldstone_bricks_stairs",
                new StairsBlock(MOSSY_GOLDSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(MOSSY_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_STAIRS = register("goldstone_stairs",
                new StairsBlock(GOLDSTONE.getDefaultState(), AbstractBlock.Settings.copy(GOLDSTONE)));
        public static final Block PRIMEVAL_JUNGLE_WOOD_STAIRS = register("primeval_jungle_wood_stairs",
                new StairsBlock(PRIMEVAL_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS)));
        //slab台阶
        public static final Block CRACKED_GOLDSTONE_BRICKS_SLAB = register("cracked_goldstone_bricks_slab",
                new SlabBlock(AbstractBlock.Settings.copy(CRACKED_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_BRICKS_SLAB = register("goldstone_bricks_slab",
                new SlabBlock(AbstractBlock.Settings.copy(GOLDSTONE_BRICKS)));
        public static final Block COBBLEGOLDSTONE_SLAB = register("cobblegoldstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(COBBLEGOLDSTONE)));
        public static final Block MOSSY_COBBLEGOLDSTONE_SLAB = register("mossy_cobblegoldstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(MOSSY_COBBLEGOLDSTONE)));
        public static final Block MOSSY_GOLDSTONE_BRICKS_SLAB = register("mossy_goldstone_bricks_slab",
                new SlabBlock(AbstractBlock.Settings.copy(MOSSY_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_SLAB = register("goldstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(GOLDSTONE)));
        public static final Block SMOOTH_GOLDSTONE_SLAB = register("smooth_goldstone_slab",
                new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_GOLDSTONE)));
        public static final Block PRIMEVAL_JUNGLE_WOOD_SLAB = register("primeval_jungle_wood_slab",
                new SlabBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS)));
        //button按钮
        public static final Block GOLDSTONE_BUTTON = register("goldstone_button",
                new ButtonBlock(AbstractBlock.Settings.copy(GOLDSTONE), BlockSetType.STONE, 60, false));
        public static final Block PRIMEVAL_JUNGLE_BUTTON = register("primeval_jungle_button",
                new ButtonBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), BlockSetType.JUNGLE, 60, false));
        //pressure plate压力板
        public static final Block GOLDSTONE_PRESSURE_PLATE = register("goldstone_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(GOLDSTONE), BlockSetType.STONE));
        public static final Block PRIMEVAL_JUNGLE_PRESSURE_PLATE = register("primeval_jungle_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), BlockSetType.JUNGLE));
        //wall墙
        public static final Block COBBLEGOLDSTONE_WALL = register("cobblegoldstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(COBBLEGOLDSTONE)));
        public static final Block CRACKED_GOLDSTONE_BRICKS_WALL = register("cracked_goldstone_bricks_wall",
                new WallBlock(AbstractBlock.Settings.copy(CRACKED_GOLDSTONE_BRICKS)));
        public static final Block GOLDSTONE_WALL = register("goldstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(GOLDSTONE)));
        public static final Block GOLDSTONE_BRICKS_WALL = register("goldstone_bricks_wall",
                new WallBlock(AbstractBlock.Settings.copy(GOLDSTONE_BRICKS)));
        public static final Block MOSSY_COBBLEGOLDSTONE_WALL = register("mossy_cobblegoldstone_wall",
                new WallBlock(AbstractBlock.Settings.copy(MOSSY_COBBLEGOLDSTONE)));
        public static final Block MOSSY_GOLDSTONE_BRICKS_WALL = register("mossy_goldstone_bricks_wall",
                new WallBlock(AbstractBlock.Settings.copy(MOSSY_GOLDSTONE_BRICKS)));
        //fence栅栏
        public static final Block PRIMEVAL_JUNGLE_FENCE = register("primeval_jungle_fence",
                new FenceBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS)));
        //fence_gate栅栏门
        public static final Block PRIMEVAL_JUNGLE_FENCE_GATE = register("primeval_jungle_fence_gate",
                new FenceGateBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), WoodType.JUNGLE));
        //door门
        public static final Block PRIMEVAL_JUNGLE_DOOR = register("primeval_jungle_door",
                new DoorBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), BlockSetType.JUNGLE));
        //trapdoor活板门
        public static final Block PRIMEVAL_JUNGLE_TRAPDOOR = register("primeval_jungle_trapdoor",
                new TrapdoorBlock(AbstractBlock.Settings.copy(PRIMEVAL_JUNGLE_PLANKS), BlockSetType.JUNGLE));
        //sapling树苗
        public static final Block PRIMEVAL_JUNGLE_SAPLING = register("primeval_jungle_sapling",
                new SaplingBlock(new PrimevalJungleTreeSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
        //sign告示牌
                //材质文件目录
        public static final Identifier PRIMEVAL_JUNGLE_SIGN_TEXTURE = new Identifier(Past_PoetryLost_Era.MOD_ID, "entity/signs/primeval_jungle");
        public static final Identifier PRIMEVAL_JUNGLE_HANGING_SIGN_TEXTURE = new Identifier(Past_PoetryLost_Era.MOD_ID, "entity/signs/hanging/primeval_jungle");
        public static final Identifier PRIMEVAL_JUNGLE_HANGING_SIGN_GUI = new Identifier(Past_PoetryLost_Era.MOD_ID, "textures/gui/hanging_signs/primeval_jungle");

        public static final Block  PRIMEVAL_JUNGLE_SIGN = Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, "primeval_jungle_sign"),
                new TerraformSignBlock(PRIMEVAL_JUNGLE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
        public static final Block  PRIMEVAL_JUNGLE_WALL_SIGN = Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, "primeval_jungle_wall_sign"),
                new TerraformWallSignBlock(PRIMEVAL_JUNGLE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
        public static final Block  PRIMEVAL_JUNGLE_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, "primeval_jungle_haning_sign"),
                new TerraformHangingSignBlock(PRIMEVAL_JUNGLE_HANGING_SIGN_TEXTURE, PRIMEVAL_JUNGLE_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
        public static final Block  PRIMEVAL_JUNGLE_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, "primeval_jungle_wall_haning_sign"),
                new TerraformWallHangingSignBlock(PRIMEVAL_JUNGLE_HANGING_SIGN_TEXTURE, PRIMEVAL_JUNGLE_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));
//Walnut Forest核桃林
        //block普通方块
        public static final Block WALNUT_LOG = register("walnut_log",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
        public static final Block WALNUT_WOOD = register("walnut_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
        public static final Block STRIPPED_WALNUT_LOG = register("stripped_walnut_log",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
        public static final Block STRIPPED_WALNUT_WOOD = register("stripped_walnut_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
        public static final Block WALNUT_PLANKS = register("walnut_planks",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        public static final Block SMOOTH_WALNUT = register("smooth_walnut",
                new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
        public static final Block WALNUT_LEAVES = register("walnut_leaves",
                new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
        //stairs楼梯
        public static final Block WALNUT_WOOD_STAIRS = register("walnut_wood_stairs",
                new StairsBlock(WALNUT_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(WALNUT_PLANKS)));
        //slab台阶
        public static final Block WALNUT_WOOD_SLAB = register("walnut_wood_slab",
                new SlabBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS)));
        //button按钮
        public static final Block WALNUT_BUTTON = register("walnut_button",
                new ButtonBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS), BlockSetType.OAK, 60, true));
        //pressure plate压力板
        public static final Block WALNUT_PRESSURE_PLATE = register("walnut_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(WALNUT_PLANKS), BlockSetType.OAK));
        //fence栅栏
        public static final Block WALNUT_FENCE = register("walnut_fence",
                new FenceBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS)));
        //fence_gate栅栏门
        public static final Block WALNUT_FENCE_GATE = register("walnut_fence_gate",
                new FenceGateBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS), WoodType.OAK));
        //door门
        public static final Block WALNUT_DOOR = register("walnut_door",
                new DoorBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS), BlockSetType.OAK));
        //trapdoor活板门
        public static final Block WALNUT_TRAPDOOR = register("walnut_trapdoor",
                new TrapdoorBlock(AbstractBlock.Settings.copy(WALNUT_PLANKS), BlockSetType.OAK));
        //sapling树苗
        public static final Block WALNUT_SAPLING = register("walnut_sapling",
                new SaplingBlock(new WalnutTreeSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
        //sign告示牌
                //材质文件目录
        public static final Identifier WALNUT_SIGN_TEXTURE = new Identifier(Past_PoetryLost_Era.MOD_ID, "entity/signs/walnut");
        public static final Identifier WALNUT_HANGING_SIGN_TEXTURE = new Identifier(Past_PoetryLost_Era.MOD_ID, "entity/signs/hanging/walnut");
        public static final Identifier WALNUT_HANGING_SIGN_GUI = new Identifier(Past_PoetryLost_Era.MOD_ID, "textures/gui/hanging_signs/walnut");

        public static final Block  WALNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, "walnut_sign"),
                new TerraformSignBlock(WALNUT_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
        public static final Block  WALNUT_WALL_SIGN = Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, "walnut_wall_sign"),
                new TerraformWallSignBlock(WALNUT_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
        public static final Block  WALNUT_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, "walnut_haning_sign"),
                new TerraformHangingSignBlock(WALNUT_HANGING_SIGN_TEXTURE, WALNUT_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
        public static final Block  WALNUT_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(Past_PoetryLost_Era.MOD_ID, "walnut_wall_haning_sign"),
                new TerraformWallHangingSignBlock(WALNUT_HANGING_SIGN_TEXTURE, WALNUT_HANGING_SIGN_GUI, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));

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
