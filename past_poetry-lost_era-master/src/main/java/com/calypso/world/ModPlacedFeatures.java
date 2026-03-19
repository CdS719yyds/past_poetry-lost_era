package com.calypso.world;

import com.calypso.Past_PoetryLost_Era;
import com.calypso.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> PRIMEVAL_JUNGLE_TREE_PLACED_KEY = registerKey("primeval_jungle_tree_placed");
    public static final RegistryKey<PlacedFeature> MEGA_PRIMEVAL_JUNGLE_TREE_PLACED_KEY = registerKey("mega_primeval_jungle_tree_placed");
    public static final RegistryKey<PlacedFeature> PRIMEVAL_JUNGLE_TREE_NO_VINE_PLACED_KEY = registerKey("primeval_jungle_tree_no_vine_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MEGA_PRIMEVAL_JUNGLE_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MEGA_PRIMEVAL_JUNGLE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        ModBlocks.PRIMEVAL_JUNGLE_SAPLING));

        register(context, PRIMEVAL_JUNGLE_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PRIMEVAL_JUNGLE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        ModBlocks.PRIMEVAL_JUNGLE_SAPLING));

        register(context, PRIMEVAL_JUNGLE_TREE_NO_VINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PRIMEVAL_JUNGLE_TREE_NO_VINE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.1f, 2),
                        ModBlocks.PRIMEVAL_JUNGLE_SAPLING));
    }

    public static final RegistryKey<PlacedFeature> registerKey(String id){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Past_PoetryLost_Era.MOD_ID, id));
    }

    public static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                List<PlacementModifier> modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
