package com.calypso;

import com.calypso.block.ModBlocks;
import com.calypso.item.ModItemGroups;
import com.calypso.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Past_PoetryLost_Era implements ModInitializer {
	public static final String MOD_ID = "past_poetry-lost_era";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerItems();
		ModItemGroups.registerGroups();
		ModBlocks.registerModBlocks();
		//原木去皮
		StrippableBlockRegistry.register(ModBlocks.PRIMEVAL_JUNGLE_LOG, ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.PRIMEVAL_JUNGLE_WOOD, ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD);
		StrippableBlockRegistry.register(ModBlocks.WALNUT_LOG, ModBlocks.STRIPPED_WALNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.WALNUT_WOOD, ModBlocks.STRIPPED_WALNUT_WOOD);
		//燃烧属性
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_LEAVES, 25, 50);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_DOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_TRAPDOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_BUTTON, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PRIMEVAL_JUNGLE_PRESSURE_PLATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_LOG, 3, 3);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_WOOD, 3, 3);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WALNUT_LOG, 3, 3);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WALNUT_WOOD, 3, 3);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_PLANKS, 5, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SMOOTH_WALNUT, 3, 10);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_LEAVES, 25, 50);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_WOOD_STAIRS, 3, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_WOOD_SLAB, 3, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_FENCE, 3, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_FENCE_GATE, 3, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_DOOR, 3, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_TRAPDOOR, 3, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_BUTTON, 3, 15);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WALNUT_PRESSURE_PLATE, 3, 15);
	}
}