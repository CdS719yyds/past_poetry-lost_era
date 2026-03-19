package com.calypso;

import com.calypso.assembly.AssemblyScreen;
import com.calypso.assembly.ModScreenHandlers;
import com.calypso.block.ModBlocks;
import com.calypso.entity.ModBoats;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class Past_PoetryLost_EraClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.ASSEMBLY, AssemblyScreen::new);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                    if (world == null || pos == null) {
                        return 0x48B518;
                    }
                    return BiomeColors.getFoliageColor(world, pos);
                },
                ModBlocks.PRIMEVAL_JUNGLE_LEAVES,
                ModBlocks.WALNUT_LEAVES
        );

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x48B518,
                ModBlocks.PRIMEVAL_JUNGLE_LEAVES.asItem(),
                ModBlocks.WALNUT_LEAVES.asItem()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PRIMEVAL_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WALNUT_LEAVES, RenderLayer.getCutout());

        TerraformBoatClientHelper.registerModelLayers(ModBoats.PRIMEVAL_JUNGLE_BOAT, false);
        TerraformBoatClientHelper.registerModelLayers(ModBoats.WALNUT_BOAT, false);
    }
}
