package com.calypso.item;

import com.calypso.block.ModBlocks;
import com.calypso.Past_PoetryLost_Era;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//创造栏注册
    public static final RegistryKey<ItemGroup>  PRIMEVAL_JUNGLE = register("primeval_jungle");
    public static final RegistryKey<ItemGroup>  WALNUT_FOREST = register("walnut_forest");

    private static RegistryKey<ItemGroup> register(String id){
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Past_PoetryLost_Era.MOD_ID, id));
    }
//创造栏物品
    public static void registerGroups(){
        //原始丛林
        Registry.register(
                Registries.ITEM_GROUP,
                PRIMEVAL_JUNGLE,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.primeval_jungle"))
                        .icon(() -> new ItemStack(ModBlocks.GOLDSTONE))
                        .entries((displayContext, entries) -> {
                            //block普通方块
                            entries.add(ModBlocks.COBBLEGOLDSTONE);
                            entries.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS);
                            entries.add(ModBlocks.GOLDSTONE);
                            entries.add(ModBlocks.GOLDSTONE_BRICKS);
                            entries.add(ModBlocks.MOSSY_COBBLEGOLDSTONE);
                            entries.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS);
                            entries.add(ModBlocks.SMOOTH_GOLDSTONE);
                            entries.add(ModBlocks.CHISELED_GOLDSTONE_BRICKS);
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_LOG);
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD);
                            entries.add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG);
                            entries.add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD);
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_LEAVES);
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_PLANKS);
                            //stairs楼梯
                            entries.add(ModBlocks.COBBLEGOLDSTONE_STAIRS);
                            entries.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_STAIRS);
                            entries.add(ModBlocks.GOLDSTONE_STAIRS);
                            entries.add(ModBlocks.GOLDSTONE_BRICKS_STAIRS);
                            entries.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_STAIRS);
                            entries.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_STAIRS);
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_STAIRS);
                            //slab台阶
                            entries.add(ModBlocks.COBBLEGOLDSTONE_SLAB);
                            entries.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_SLAB);
                            entries.add(ModBlocks.GOLDSTONE_SLAB);
                            entries.add(ModBlocks.GOLDSTONE_BRICKS_SLAB);
                            entries.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_SLAB);
                            entries.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_SLAB);
                            entries.add(ModBlocks.SMOOTH_GOLDSTONE_SLAB);
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB);
                            //wall墙
                            entries.add(ModBlocks.COBBLEGOLDSTONE_WALL);
                            entries.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_WALL);
                            entries.add(ModBlocks.GOLDSTONE_WALL);
                            entries.add(ModBlocks.GOLDSTONE_BRICKS_WALL);
                            entries.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_WALL);
                            entries.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_WALL);
                            //fence栅栏
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_FENCE);
                            //fence gate栅栏门
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_FENCE_GATE);
                            //door门
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_DOOR);
                            //trapdoor活板门
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_TRAPDOOR);
                            //pressure plate压力板
                            entries.add(ModBlocks.GOLDSTONE_PRESSURE_PLATE);
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_PRESSURE_PLATE);
                            //button按钮
                            entries.add(ModBlocks.GOLDSTONE_BUTTON);
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_BUTTON);
                            //sapling树苗
                            entries.add(ModBlocks.PRIMEVAL_JUNGLE_SAPLING);
                            //告示牌
                            entries.add(ModItems.PRIMEVAL_JUNGLE_SIGN);
                            entries.add(ModItems.PRIMEVAL_JUNGLE_HANGING_SIGN);
                        }).build()
        );
        //核桃林
        Registry.register(
                Registries.ITEM_GROUP,
                WALNUT_FOREST,
                ItemGroup.create(ItemGroup.Row.TOP, 8)
                        .displayName(Text.translatable("itemGroup.walnut_forest"))
                        .icon(() -> new ItemStack(ModBlocks.WALNUT_LOG))
                        .entries((displayContext, entries) -> {
                            //block普通方块
                            entries.add(ModBlocks.WALNUT_LOG);
                            entries.add(ModBlocks.WALNUT_WOOD);
                            entries.add(ModBlocks.STRIPPED_WALNUT_LOG);
                            entries.add(ModBlocks.STRIPPED_WALNUT_WOOD);
                            entries.add(ModBlocks.WALNUT_PLANKS);
                            entries.add(ModBlocks.SMOOTH_WALNUT);
                            entries.add(ModBlocks.WALNUT_LEAVES);
                            //stairs楼梯
                            entries.add(ModBlocks.WALNUT_WOOD_STAIRS);
                            //slab台阶
                            entries.add(ModBlocks.WALNUT_WOOD_SLAB);
                            //fence栅栏
                            entries.add(ModBlocks.WALNUT_FENCE);
                            //fence gate栅栏门
                            entries.add(ModBlocks.WALNUT_FENCE_GATE);
                            //door门
                            entries.add(ModBlocks.WALNUT_DOOR);
                            //trapdoor活板门
                            entries.add(ModBlocks.WALNUT_TRAPDOOR);
                            //pressure plate压力板
                            entries.add(ModBlocks.WALNUT_PRESSURE_PLATE);
                            //button按钮
                            entries.add(ModBlocks.WALNUT_BUTTON);
                        }).build()
        );
    }
}
