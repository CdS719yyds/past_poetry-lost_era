package com.calypso.datagen;

import com.calypso.block.ModBlockFamilies;
import com.calypso.block.ModBlocks;
import com.calypso.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }
    //方块模型
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //方块家族调用
        ModBlockFamilies.getFamilies()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach((family) ->
                        blockStateModelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family));

        /*blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLEGOLDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_GOLDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_COBBLEGOLDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_GOLDSTONE_BRICKS);*/
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_GOLDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_GOLDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_WALNUT);

        blockStateModelGenerator.registerLog(ModBlocks.PRIMEVAL_JUNGLE_LOG).log(ModBlocks.PRIMEVAL_JUNGLE_LOG).wood(ModBlocks.PRIMEVAL_JUNGLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG).log(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG).wood(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.PRIMEVAL_JUNGLE_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerLog(ModBlocks.WALNUT_LOG).log(ModBlocks.WALNUT_LOG).wood(ModBlocks.WALNUT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WALNUT_LOG).log(ModBlocks.STRIPPED_WALNUT_LOG).wood(ModBlocks.STRIPPED_WALNUT_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.WALNUT_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerTintableCross(ModBlocks.PRIMEVAL_JUNGLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }
    //物品模型
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
