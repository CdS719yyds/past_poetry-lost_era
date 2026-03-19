package com.calypso.world.tree;

import com.calypso.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class PrimevalJungleTreeSaplingGenerator extends LargeTreeSaplingGenerator {
    @Override
    protected @Nullable RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.PRIMEVAL_JUNGLE_TREE_NO_VINE_KEY;
    }
    @Override
    protected @Nullable RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return ModConfiguredFeatures.MEGA_PRIMEVAL_JUNGLE_TREE_KEY;
    }
}
