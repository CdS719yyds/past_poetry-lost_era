package com.calypso;

import com.calypso.block.ModBlocks;
import com.calypso.entity.ModBoats;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

import javax.swing.border.MatteBorder;

public class Past_PoetryLost_EraClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		// 注册颜色提供器
		ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
					// 如果没有世界或位置信息，返回默认颜色
					if (world == null || pos == null) {
						return 0x48B518; // 默认绿色
					}
					// 返回生物群系的树叶颜色
					return BiomeColors.getFoliageColor(world, pos);
				},
				ModBlocks.PRIMEVAL_JUNGLE_LEAVES,
				ModBlocks.WALNUT_LEAVES
		);
		//物品颜色
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
					// 返回默认颜色（物品无法获取生物群系信息）
					return 0x48B518;
				},
				ModBlocks.PRIMEVAL_JUNGLE_LEAVES.asItem(),
				ModBlocks.WALNUT_LEAVES.asItem()
		);
		//地图颜色
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PRIMEVAL_JUNGLE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WALNUT_LEAVES, RenderLayer.getCutout());

		//船渲染
		TerraformBoatClientHelper.registerModelLayers(ModBoats.PRIMEVAL_JUNGLE_BOAT, false);
		TerraformBoatClientHelper.registerModelLayers(ModBoats.WALNUT_BOAT, false);
	}
}