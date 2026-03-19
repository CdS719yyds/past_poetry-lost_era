package com.calypso.datagen;

import com.calypso.assembly.ModAssemblyContent;
import com.calypso.assembly.ToolAssemblyRegistry;
import com.calypso.block.ModBlocks;
import com.calypso.item.ModItemGroups;
import com.calypso.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //普通方块
        translationBuilder.add(ModBlocks.COBBLEGOLDSTONE, "金圆石");
        translationBuilder.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS, "裂纹金石砖");
        translationBuilder.add(ModBlocks.GOLDSTONE, "金石");
        translationBuilder.add(ModBlocks.GOLDSTONE_BRICKS, "金石砖");
        translationBuilder.add(ModBlocks.MOSSY_COBBLEGOLDSTONE, "苔金圆石");
        translationBuilder.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS, "苔金石砖");
        translationBuilder.add(ModBlocks.SMOOTH_GOLDSTONE, "平滑金石");
        translationBuilder.add(ModBlocks.CHISELED_GOLDSTONE_BRICKS, "錾制金石砖");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_LOG, "原始丛林原木");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD, "原始丛林木头");
        translationBuilder.add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_LOG, "去皮原始丛林原木");
        translationBuilder.add(ModBlocks.STRIPPED_PRIMEVAL_JUNGLE_WOOD, "去皮原始丛林木头");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_PLANKS, "原始丛林木板");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_LEAVES,"原始丛林树叶");

        translationBuilder.add(ModBlocks.WALNUT_LOG, "核桃原木");
        translationBuilder.add(ModBlocks.WALNUT_WOOD, "核桃木头");
        translationBuilder.add(ModBlocks.STRIPPED_WALNUT_LOG, "去皮核桃原木");
        translationBuilder.add(ModBlocks.STRIPPED_WALNUT_WOOD, "去皮核桃木头");
        translationBuilder.add(ModBlocks.WALNUT_PLANKS, "核桃木板");
        translationBuilder.add(ModBlocks.SMOOTH_WALNUT, "核桃木");
        translationBuilder.add(ModBlocks.WALNUT_LEAVES, "核桃树叶");
        //楼梯
        translationBuilder.add(ModBlocks.COBBLEGOLDSTONE_STAIRS, "金圆石楼梯");
        translationBuilder.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_STAIRS, "裂纹金圆石楼梯");
        translationBuilder.add(ModBlocks.GOLDSTONE_STAIRS, "金石楼梯");
        translationBuilder.add(ModBlocks.GOLDSTONE_BRICKS_STAIRS, "金石砖楼梯");
        translationBuilder.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_STAIRS, "苔金圆石楼梯");
        translationBuilder.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_STAIRS, "苔金石砖楼梯");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_STAIRS, "原始丛林楼梯");

        translationBuilder.add(ModBlocks.WALNUT_WOOD_STAIRS, "核桃楼梯");
        //台阶
        translationBuilder.add(ModBlocks.COBBLEGOLDSTONE_SLAB, "金圆石台阶");
        translationBuilder.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_SLAB, "裂纹金石砖台阶");
        translationBuilder.add(ModBlocks.GOLDSTONE_SLAB, "金石台阶");
        translationBuilder.add(ModBlocks.GOLDSTONE_BRICKS_SLAB, "金石砖台阶");
        translationBuilder.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_SLAB, "苔金圆石台阶");
        translationBuilder.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_SLAB, "苔金石砖台阶");
        translationBuilder.add(ModBlocks.SMOOTH_GOLDSTONE_SLAB, "平滑金石台阶");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_WOOD_SLAB, "原始丛林台阶");

        translationBuilder.add(ModBlocks.WALNUT_WOOD_SLAB, "核桃台阶");
        //墙
        translationBuilder.add(ModBlocks.COBBLEGOLDSTONE_WALL, "金圆石墙");
        translationBuilder.add(ModBlocks.CRACKED_GOLDSTONE_BRICKS_WALL, "裂纹金石砖墙");
        translationBuilder.add(ModBlocks.GOLDSTONE_WALL, "金石墙");
        translationBuilder.add(ModBlocks.GOLDSTONE_BRICKS_WALL, "金石砖墙");
        translationBuilder.add(ModBlocks.MOSSY_COBBLEGOLDSTONE_WALL, "苔金圆石墙");
        translationBuilder.add(ModBlocks.MOSSY_GOLDSTONE_BRICKS_WALL, "苔金石砖墙");
        //栅栏
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_FENCE, "原始丛林栅栏");

        translationBuilder.add(ModBlocks.WALNUT_FENCE, "核桃栅栏");
        //栅栏门
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_FENCE_GATE, "原始丛林栅栏门");

        translationBuilder.add(ModBlocks.WALNUT_FENCE_GATE, "核桃栅栏门");
        //门
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_DOOR, "原始丛林门");

        translationBuilder.add(ModBlocks.WALNUT_DOOR, "核桃门");
        //活板门
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_TRAPDOOR, "原始丛林活板门");

        translationBuilder.add(ModBlocks.WALNUT_TRAPDOOR, "核桃活版门");
        //压力板
        translationBuilder.add(ModBlocks.GOLDSTONE_PRESSURE_PLATE, "金石压力板");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_PRESSURE_PLATE, "原始丛林压力板");

        translationBuilder.add(ModBlocks.WALNUT_PRESSURE_PLATE, "核桃压力板");
        //按钮
        translationBuilder.add(ModBlocks.GOLDSTONE_BUTTON, "金石按钮");
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_BUTTON, "原始丛林按钮");

        translationBuilder.add(ModBlocks.WALNUT_BUTTON, "核桃按钮");
        //树苗
        translationBuilder.add(ModBlocks.PRIMEVAL_JUNGLE_SAPLING, "原始丛林树苗");

        translationBuilder.add(ModBlocks.WALNUT_SAPLING, "核桃树苗");
        //告示牌
        translationBuilder.add(ModItems.PRIMEVAL_JUNGLE_SIGN, "原始丛林告示牌");
        translationBuilder.add(ModItems.PRIMEVAL_JUNGLE_HANGING_SIGN, "悬挂式原始丛林告示牌");

        translationBuilder.add(ModItems.WALNUT_SIGN, "核桃告示牌");
        translationBuilder.add(ModItems.WALNUT_HANGING_SIGN, "悬挂式核桃告示牌");
        //船
        translationBuilder.add(ModItems.PRIMEVAL_JUNGLE_BOAT, "原始丛林船");
        translationBuilder.add(ModItems.PRIMEVAL_JUNGLE_CHEST_BOAT, "原始丛林箱船");

        translationBuilder.add(ModItems.WALNUT_BOAT, "核桃船");
        translationBuilder.add(ModItems.WALNUT_CHEST_BOAT, "核桃箱船");
        //其他
        translationBuilder.add(ModItems.WALNUT, "核桃");
        translationBuilder.add(ModItems.DRIED_WALNUT, "干核桃");
        translationBuilder.add(ModItems.WALNUT_MEAT, "核桃仁");
        //物品栏
        translationBuilder.add(ModItemGroups.PRIMEVAL_JUNGLE,"原始丛林");
        translationBuilder.add(ModItemGroups.WALNUT_FOREST,"核桃林");
        translationBuilder.add(ModAssemblyContent.ASSEMBLY_TOOLKIT, "组装工具箱");
        ToolAssemblyRegistry.toolItems().forEach(item -> translationBuilder.add(item, item.definition().name().chinese()));
        ToolAssemblyRegistry.partItems().forEach(item -> translationBuilder.add(item, item.definition().name().chinese()));

        translationBuilder.add("assembly_slot.head", "工具头");
        translationBuilder.add("assembly_slot.binding", "连接件");
        translationBuilder.add("assembly_slot.handle", "握柄");
        translationBuilder.add("assembly_slot.module", "模块");
        translationBuilder.add("assembly_slot.blade", "刃部");
        translationBuilder.add("assembly_slot.guard", "护手");
        translationBuilder.add("assembly_slot.core", "核心");
        translationBuilder.add("assembly_slot.brace", "支撑件");
        translationBuilder.add("assembly_slot.charm", "挂饰");

        translationBuilder.add("assembly.tooltip.unassembled", "需要在组装工具箱中完成组装");
        translationBuilder.add("assembly.tooltip.parts", "已安装配件");
        translationBuilder.add("assembly.tooltip.stats", "计算属性");
        translationBuilder.add("assembly.tooltip.part_slots", "可安装槽位");

        translationBuilder.add("assembly.error.required_slot", "缺少必需槽位：%s");
        translationBuilder.add("assembly.error.required_trait", "特性 %s 需要槽位 %s 中有匹配配件");
        translationBuilder.add("assembly.error.invalid_part", "这里只能放入模组化配件");
        translationBuilder.add("assembly.error.slot_mismatch", "%s 无法安装到 %s");

        translationBuilder.add("assembly.mechanic.resonance", "共振：命中时释放电弧");
        translationBuilder.add("assembly.mechanic.arc_damage", "电弧：额外造成 %s 点命中伤害");
        translationBuilder.add("assembly.mechanic.wind_repair", "风调：携带时缓慢自修复");
        translationBuilder.add("assembly.mechanic.fleet_grip", "疾握：采掘后获得急迫");
        translationBuilder.add("assembly.mechanic.pulse", "脉冲核心：右键短暂爆发速度");

        translationBuilder.add("screen.past_poetry-lost_era.assembly_toolkit", "工具组装台");
        translationBuilder.add("screen.past_poetry-lost_era.assembly_hint", "将空白模组化工具与兼容配件组合");
        translationBuilder.add("screen.past_poetry-lost_era.tool_base", "底座");
        translationBuilder.add("screen.past_poetry-lost_era.result", "结果");
        translationBuilder.add("screen.past_poetry-lost_era.insert_tool", "先放入一个空白模组化工具");
        translationBuilder.add("screen.past_poetry-lost_era.valid", "可组装");
        translationBuilder.add("screen.past_poetry-lost_era.invalid", "组装受阻");
        translationBuilder.add(ModItemGroups.ASSEMBLY_WORKSHOP, "工具装配");
    }
}
