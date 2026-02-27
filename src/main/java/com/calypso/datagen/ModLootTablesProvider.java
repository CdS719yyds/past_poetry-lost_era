package com.calypso.datagen;

import com.calypso.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTablesProvider extends FabricBlockLootTableProvider {
    public ModLootTablesProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //挖完掉自己
        addDrop(ModBlocks.COBBLEGOLDSTONE);
        addDrop(ModBlocks.CRACKED_GOLDSTONE_BRICKS);
        addDrop(ModBlocks.SMOOTH_GOLDSTONE);
        addDrop(ModBlocks.GOLDSTONE_BRICKS);
        addDrop(ModBlocks.MOSSY_COBBLEGOLDSTONE);
        addDrop(ModBlocks.MOSSY_GOLDSTONE_BRICKS);
        addDrop(ModBlocks.COBBLEGOLDSTONE_STAIRS);
        addDrop(ModBlocks.CRACKED_GOLDSTONE_BRICKS_STAIRS);
        addDrop(ModBlocks.GOLDSTONE_STAIRS);
        addDrop(ModBlocks.GOLDSTONE_BRICKS_STAIRS);
        addDrop(ModBlocks.MOSSY_COBBLEGOLDSTONE_STAIRS);
        addDrop(ModBlocks.MOSSY_GOLDSTONE_BRICKS_STAIRS);
        addDrop(ModBlocks.COBBLEGOLDSTONE_WALL);
        addDrop(ModBlocks.CRACKED_GOLDSTONE_BRICKS_WALL);
        addDrop(ModBlocks.GOLDSTONE_WALL);
        addDrop(ModBlocks.GOLDSTONE_BRICKS_WALL);
        addDrop(ModBlocks.MOSSY_COBBLEGOLDSTONE_WALL);
        addDrop(ModBlocks.MOSSY_GOLDSTONE_BRICKS_WALL);
        addDrop(ModBlocks.GOLDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.GOLDSTONE_BUTTON);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_LOG);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_WOOD);
        addDrop(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG);
        addDrop(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_PLANKS);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_WOOD_STAIRS);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_FENCE);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_FENCE_GATE);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_BUTTON);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_PRESSURE_PLATE);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_TRAPDOOR);
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_SAPLING);
        addDrop(ModBlocks.WALNUT_LOG);
        addDrop(ModBlocks.WALNUT_WOOD);
        addDrop(ModBlocks.STRIPPED_WALNUT_LOG);
        addDrop(ModBlocks.STRIPPED_WALNUT_WOOD);
        addDrop(ModBlocks.WALNUT_PLANKS);
        addDrop(ModBlocks.SMOOTH_WALNUT);
        addDrop(ModBlocks.WALNUT_WOOD_STAIRS);
        addDrop(ModBlocks.WALNUT_FENCE);
        addDrop(ModBlocks.WALNUT_FENCE_GATE);
        addDrop(ModBlocks.WALNUT_BUTTON);
        addDrop(ModBlocks.WALNUT_PRESSURE_PLATE);
        addDrop(ModBlocks.WALNUT_TRAPDOOR);
        //挖完掉别的东西
        addDrop(ModBlocks.GOLDSTONE, oreDrops(ModBlocks.GOLDSTONE, Item.fromBlock(ModBlocks.COBBLEGOLDSTONE)));
        //一格掉两个（台阶）
        addDrop(ModBlocks.COBBLEGOLDSTONE_SLAB, slabDrops(ModBlocks.COBBLEGOLDSTONE_SLAB));
        addDrop(ModBlocks.CRACKED_GOLDSTONE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_GOLDSTONE_BRICKS_SLAB));
        addDrop(ModBlocks.GOLDSTONE_SLAB, slabDrops(ModBlocks.GOLDSTONE_SLAB));
        addDrop(ModBlocks.GOLDSTONE_BRICKS_SLAB, slabDrops(ModBlocks.GOLDSTONE_BRICKS_SLAB));
        addDrop(ModBlocks.MOSSY_COBBLEGOLDSTONE_SLAB, slabDrops(ModBlocks.MOSSY_COBBLEGOLDSTONE_SLAB));
        addDrop(ModBlocks.MOSSY_GOLDSTONE_BRICKS_SLAB, slabDrops(ModBlocks.MOSSY_GOLDSTONE_BRICKS_SLAB));
        addDrop(ModBlocks.SMOOTH_GOLDSTONE_SLAB, slabDrops(ModBlocks.SMOOTH_GOLDSTONE_SLAB));
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB, slabDrops(ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB));
        addDrop(ModBlocks.WALNUT_WOOD_SLAB, slabDrops(ModBlocks.WALNUT_WOOD_SLAB));
        //两格掉一个（门）
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_DOOR, doorDrops(ModBlocks.PRIMEVAL_JUNGLE_DOOR));
        addDrop(ModBlocks.WALNUT_DOOR, doorDrops(ModBlocks.WALNUT_DOOR));
        //树叶
        addDrop(ModBlocks.PRIMEVAL_JUNGLE_LEAVES, leavesDrops(ModBlocks.PRIMEVAL_JUNGLE_LEAVES, ModBlocks.PRIMEVAL_JUNGLE_SAPLING, 0.0025f));
    }

    //多物品掉落函数
    public LootTable.Builder likeCopperOreDrops(Block drop, Item item, float min, float max) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}
