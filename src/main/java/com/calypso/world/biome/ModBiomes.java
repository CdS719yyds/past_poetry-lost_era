package com.calypso.world.biome;/*package com.Calypso.poetry_of_this_moment_lost_era.world.biome;

import com.Calypso.poetry_of_this_moment_lost_era.Poetry_of_this_moment_Lost_era;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class ModBiomes {
    public static final RegistryKey<Biome> PRIMEVAL_JUNGLE = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Poetry_of_this_moment_Lost_era.MOD_ID, "primeval_jungle"));
    public static void boostrap(Registerable<Biome> context) {
        context.register(PRIMEVAL_JUNGLE, new PrimevalJungle(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome PrimevalJungle(RegistryKey<Biome> context) {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xe82e3b)
                        .waterFogColor(0xbf1b26)
                        .skyColor(0x30c918)
                        .grassColor(0x7f03f7)
                        .foliageColor(0xd203fc)
                        .fogColor(0x22a1e6)
                        .build())
                .build();
    }
}*/
