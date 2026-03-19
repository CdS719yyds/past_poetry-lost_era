package com.calypso.datagen;

import com.calypso.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.PRIMEVAL_JUNGLE_PLANKS.asItem())
                .add(ModBlocks.WALNUT_PLANKS.asItem())
                .add(ModBlocks.SMOOTH_WALNUT.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PRIMEVAL_JUNGLE_LOG.asItem())
                .add(ModBlocks.PRIMEVAL_JUNGLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD.asItem())
                .add(ModBlocks.WALNUT_LOG.asItem())
                .add(ModBlocks.WALNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WALNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_WALNUT_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.PRIMEVAL_JUNGLE_LOG.asItem())
                .add(ModBlocks.PRIMEVAL_JUNGLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD.asItem())
                .add(ModBlocks.WALNUT_LOG.asItem())
                .add(ModBlocks.WALNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WALNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_WALNUT_WOOD.asItem());
    }
}
