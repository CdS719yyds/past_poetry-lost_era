package com.calypso.datagen;

import com.calypso.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //木头
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PRIMEVAL_JUNGLE_LOG)
                .add(ModBlocks.PRIMEVAL_JUNGLE_WOOD)
                .add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG)
                .add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD)
                .add(ModBlocks.WALNUT_LOG)
                .add(ModBlocks.WALNUT_WOOD)
                .add(ModBlocks.STRIPPED_WALNUT_LOG)
                .add(ModBlocks.STRIPPED_WALNUT_WOOD);
        //需要斧头
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PRIMEVAL_JUNGLE_LOG)
                .add(ModBlocks.PRIMEVAL_JUNGLE_WOOD)
                .add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG)
                .add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD)
                .add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_STAIRS)
                .add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB)
                .add(ModBlocks.PRIMEVAL_JUNGLE_FENCE)
                .add(ModBlocks.PRIMEVAL_JUNGLE_FENCE_GATE)
                .add(ModBlocks.PRIMEVAL_JUNGLE_BUTTON)
                .add(ModBlocks.PRIMEVAL_JUNGLE_PRESSURE_PLATE)
                .add(ModBlocks.PRIMEVAL_JUNGLE_DOOR)
                .add(ModBlocks.PRIMEVAL_JUNGLE_TRAPDOOR)
                .add(ModBlocks.PRIMEVAL_JUNGLE_PLANKS)
                .add(ModBlocks.WALNUT_LOG)
                .add(ModBlocks.WALNUT_WOOD)
                .add(ModBlocks.STRIPPED_WALNUT_LOG)
                .add(ModBlocks.STRIPPED_WALNUT_WOOD)
                .add(ModBlocks.WALNUT_PLANKS)
                .add(ModBlocks.SMOOTH_WALNUT)
                .add(ModBlocks.WALNUT_WOOD_STAIRS)
                .add(ModBlocks.WALNUT_WOOD_SLAB)
                .add(ModBlocks.WALNUT_FENCE)
                .add(ModBlocks.WALNUT_FENCE_GATE)
                .add(ModBlocks.WALNUT_BUTTON)
                .add(ModBlocks.WALNUT_PRESSURE_PLATE)
                .add(ModBlocks.WALNUT_DOOR)
                .add(ModBlocks.WALNUT_TRAPDOOR);
        //需要木制工具
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLEGOLDSTONE)
                .add(ModBlocks.CRACKED_GOLDSTONE_BRICKS)
                .add(ModBlocks.GOLDSTONE_BRICKS)
                .add(ModBlocks.MOSSY_COBBLEGOLDSTONE)
                .add(ModBlocks.MOSSY_GOLDSTONE_BRICKS)
                .add(ModBlocks.SMOOTH_GOLDSTONE)
                .add(ModBlocks.CHISELED_GOLDSTONE_BRICKS)
                .add(ModBlocks.COBBLEGOLDSTONE_STAIRS)
                .add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_STAIRS)
                .add(ModBlocks.GOLDSTONE_STAIRS)
                .add(ModBlocks.GOLDSTONE_BRICKS_STAIRS)
                .add(ModBlocks.MOSSY_COBBLEGOLDSTONE_STAIRS)
                .add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_STAIRS)
                .add(ModBlocks.COBBLEGOLDSTONE_SLAB)
                .add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_SLAB)
                .add(ModBlocks.GOLDSTONE_SLAB)
                .add(ModBlocks.GOLDSTONE_BRICKS_SLAB)
                .add(ModBlocks.MOSSY_COBBLEGOLDSTONE_SLAB)
                .add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_SLAB)
                .add(ModBlocks.COBBLEGOLDSTONE_WALL)
                .add(ModBlocks.SMOOTH_GOLDSTONE_SLAB)
                .add(ModBlocks.COBBLEGOLDSTONE_WALL)
                .add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_WALL)
                .add(ModBlocks.GOLDSTONE_WALL)
                .add(ModBlocks.GOLDSTONE_BRICKS_WALL)
                .add(ModBlocks.MOSSY_COBBLEGOLDSTONE_WALL)
                .add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_WALL)
                .add(ModBlocks.GOLDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.GOLDSTONE_BUTTON);

        //需要石制工具
        /*getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add();*/
        //需要铁制工具
        /*getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add();*/
        //需要钻石制工具
        /*getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add();*/

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.COBBLEGOLDSTONE_WALL)
                .add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_WALL)
                .add(ModBlocks.GOLDSTONE_WALL)
                .add(ModBlocks.GOLDSTONE_BRICKS_WALL)
                .add(ModBlocks.MOSSY_COBBLEGOLDSTONE_WALL)
                .add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PRIMEVAL_JUNGLE_FENCE)
                .add(ModBlocks.WALNUT_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PRIMEVAL_JUNGLE_FENCE_GATE)
                .add(ModBlocks.WALNUT_FENCE_GATE);
    }
}
