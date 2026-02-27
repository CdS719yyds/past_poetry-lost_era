package com.calypso.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;
//方块家族
public class ModBlockFamilies {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();
    //原始丛林
    public static final BlockFamily COBBLEGOLDSTONE = register(ModBlocks.COBBLEGOLDSTONE)
            .stairs(ModBlocks.COBBLEGOLDSTONE_STAIRS)
            .slab(ModBlocks.COBBLEGOLDSTONE_SLAB)
            .wall(ModBlocks.COBBLEGOLDSTONE_WALL)
            .build();

    public static final BlockFamily CRACKED_GOLDSTONE_BRICKS = register(ModBlocks.CRACKED_GOLDSTONE_BRICKS)
            .stairs(ModBlocks.CRACKED_GOLDSTONE_BRICKS_STAIRS)
            .slab(ModBlocks.CRACKED_GOLDSTONE_BRICKS_SLAB)
            .wall(ModBlocks.CRACKED_GOLDSTONE_BRICKS_WALL)
            .build();

    public static final BlockFamily GOLDSTONE = register(ModBlocks.GOLDSTONE)
            .stairs(ModBlocks.GOLDSTONE_STAIRS)
            .slab(ModBlocks.GOLDSTONE_SLAB)
            .wall(ModBlocks.GOLDSTONE_WALL)
            .pressurePlate(ModBlocks.GOLDSTONE_PRESSURE_PLATE)
            .button(ModBlocks.GOLDSTONE_BUTTON)
            .build();

    public static final BlockFamily GOLDSTONE_BRICKS = register(ModBlocks.GOLDSTONE_BRICKS)
            .stairs(ModBlocks.GOLDSTONE_BRICKS_STAIRS)
            .slab(ModBlocks.GOLDSTONE_BRICKS_SLAB)
            .wall(ModBlocks.GOLDSTONE_BRICKS_WALL)
            .build();

    public static final BlockFamily MOSSY_COBBLEGOLDSTONE = register(ModBlocks.MOSSY_COBBLEGOLDSTONE)
            .stairs(ModBlocks.MOSSY_COBBLEGOLDSTONE_STAIRS)
            .slab(ModBlocks.MOSSY_COBBLEGOLDSTONE_SLAB)
            .wall(ModBlocks.MOSSY_COBBLEGOLDSTONE_WALL)
            .build();

    public static final BlockFamily MOSSY_GOLDSTONE_BRICKS = register(ModBlocks.MOSSY_GOLDSTONE_BRICKS)
            .stairs(ModBlocks.MOSSY_GOLDSTONE_BRICKS_STAIRS)
            .slab(ModBlocks.MOSSY_GOLDSTONE_BRICKS_SLAB)
            .wall(ModBlocks.MOSSY_GOLDSTONE_BRICKS_WALL)
            .build();

    public static final BlockFamily PRIMEVAL_JUNGLE_PLANKS = register(ModBlocks.PRIMEVAL_JUNGLE_PLANKS)
            .stairs(ModBlocks.PRIMEVAL_JUNGLE_WOOD_STAIRS)
            .slab(ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB)
            .fence(ModBlocks.PRIMEVAL_JUNGLE_FENCE)
            .fenceGate(ModBlocks.PRIMEVAL_JUNGLE_FENCE_GATE)
            .door(ModBlocks.PRIMEVAL_JUNGLE_DOOR)
            .trapdoor(ModBlocks.PRIMEVAL_JUNGLE_TRAPDOOR)
            .pressurePlate(ModBlocks.PRIMEVAL_JUNGLE_PRESSURE_PLATE)
            .button(ModBlocks.PRIMEVAL_JUNGLE_BUTTON)
            .sign(ModBlocks.PRIMEVAL_JUNGLE_SIGN, ModBlocks.PRIMEVAL_JUNGLE_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("wooden")
            .build();
    //核桃林
    public static final BlockFamily WALNUT_PLANKS = register(ModBlocks.WALNUT_PLANKS)
            .stairs(ModBlocks.WALNUT_WOOD_STAIRS)
            .slab(ModBlocks.WALNUT_WOOD_SLAB)
            .fence(ModBlocks.WALNUT_FENCE)
            .fenceGate(ModBlocks.WALNUT_FENCE_GATE)
            .door(ModBlocks.WALNUT_DOOR)
            .trapdoor(ModBlocks.WALNUT_TRAPDOOR)
            .pressurePlate(ModBlocks.WALNUT_PRESSURE_PLATE)
            .button(ModBlocks.WALNUT_BUTTON)
            .sign(ModBlocks.WALNUT_SIGN, ModBlocks.WALNUT_WALL_SIGN)
            .build();

    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily)BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }

    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
