package com.calypso.world;

import com.calypso.Past_PoetryLost_Era;
import com.calypso.block.ModBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.CocoaBeansTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_PRIMEVAL_JUNGLE_TREE_KEY = registerKey("mega_primeval_jungle_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PRIMEVAL_JUNGLE_TREE_NO_VINE_KEY = registerKey("primeval_jungle_tree_no_vine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PRIMEVAL_JUNGLE_TREE_KEY = registerKey("primeval_jungle_tree");

    public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT_TREE_KEY = registerKey("walnut_tree");

    private static TreeFeatureConfig.Builder primeval_jungle() {
        return builder(ModBlocks.PRIMEVAL_JUNGLE_LOG, ModBlocks.PRIMEVAL_JUNGLE_LEAVES, 4, 8, 0, 2);
    }

    private static TreeFeatureConfig.Builder walnut() {
        return builder(ModBlocks.WALNUT_LOG, ModBlocks.WALNUT_LEAVES, 3, 2, 3, 2);
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, MEGA_PRIMEVAL_JUNGLE_TREE_KEY, Feature.TREE, (
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.PRIMEVAL_JUNGLE_LOG),
                        new MegaJungleTrunkPlacer(10, 2, 19),
                        BlockStateProvider.of(ModBlocks.PRIMEVAL_JUNGLE_LEAVES),
                        new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                        new TwoLayersFeatureSize(1, 1, 2)
                )
        ).decorators(ImmutableList.of(TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).build());
        register(context, PRIMEVAL_JUNGLE_TREE_NO_VINE_KEY, Feature.TREE, primeval_jungle().ignoreVines().build());
        register(context, PRIMEVAL_JUNGLE_TREE_KEY, Feature.TREE, primeval_jungle().decorators(
                ImmutableList.of(
                        new CocoaBeansTreeDecorator(0.2F),
                        TrunkVineTreeDecorator.INSTANCE,
                        new LeavesVineTreeDecorator(0.25F)
                )
        ).ignoreVines().build());

        register(context, WALNUT_TREE_KEY, Feature.TREE, walnut().ignoreVines().build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Past_PoetryLost_Era.MOD_ID, id));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration
    ){
        context.register(key, new ConfiguredFeature<FC, F>(feature, configuration));
    }

    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }
}
