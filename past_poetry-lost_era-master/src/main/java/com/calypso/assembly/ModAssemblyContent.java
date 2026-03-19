package com.calypso.assembly;

import com.calypso.Past_PoetryLost_Era;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

import java.util.List;

public final class ModAssemblyContent {
    private static final AssemblySlotDefinition HEAD = new AssemblySlotDefinition("head", new LocalizedName("Head", "工具头"), texture("slot_head"));
    private static final AssemblySlotDefinition BINDING = new AssemblySlotDefinition("binding", new LocalizedName("Binding", "连接件"), texture("slot_binding"));
    private static final AssemblySlotDefinition HANDLE = new AssemblySlotDefinition("handle", new LocalizedName("Handle", "握柄"), texture("slot_handle"));
    private static final AssemblySlotDefinition MODULE = new AssemblySlotDefinition("module", new LocalizedName("Module", "模块"), texture("slot_module"));
    private static final AssemblySlotDefinition BLADE = new AssemblySlotDefinition("blade", new LocalizedName("Blade", "刃部"), texture("slot_blade"));
    private static final AssemblySlotDefinition GUARD = new AssemblySlotDefinition("guard", new LocalizedName("Guard", "护手"), texture("slot_guard"));
    private static final AssemblySlotDefinition CORE = new AssemblySlotDefinition("core", new LocalizedName("Core", "核心"), texture("slot_core"));
    private static final AssemblySlotDefinition BRACE = new AssemblySlotDefinition("brace", new LocalizedName("Brace", "支撑件"), texture("slot_brace"));
    private static final AssemblySlotDefinition CHARM = new AssemblySlotDefinition("charm", new LocalizedName("Charm", "挂饰"), texture("slot_charm"));

    public static final AssemblyToolkitItem ASSEMBLY_TOOLKIT = Registry.register(
            Registries.ITEM,
            id("assembly_toolkit"),
            new AssemblyToolkitItem(new Item.Settings().maxCount(1))
    );

    public static final ModularToolItem EXPEDITION_PICKAXE = ToolAssemblyRegistry.registerTool(ToolTypeDefinition.builder(
                    id("expedition_pickaxe"),
                    new LocalizedName("Expedition Pickaxe", "远征镐"),
                    texture("expedition_pickaxe"))
            .slot(HEAD)
            .slot(BINDING)
            .slot(HANDLE)
            .slot(MODULE)
            .baseStat(AssemblyStat.DURABILITY, 140.0f)
            .baseStat(AssemblyStat.MINING_SPEED, 3.0f)
            .baseStat(AssemblyStat.ATTACK_DAMAGE, 3.5f)
            .baseStat(AssemblyStat.ATTACK_SPEED, 1.2f)
            .effectiveBlocks(BlockTags.PICKAXE_MINEABLE)
            .rule(AssemblyRules.requireSlot("head"))
            .rule(AssemblyRules.requireSlot("binding"))
            .rule(AssemblyRules.requireSlot("handle"))
            .rule(AssemblyRules.requireTraitWhenTraitPresent("heavy_head", "reinforced_mount", "binding"))
            .build());

    public static final ModularToolItem WARDEN_BLADE = ToolAssemblyRegistry.registerTool(ToolTypeDefinition.builder(
                    id("warden_blade"),
                    new LocalizedName("Warden Blade", "守望者长刃"),
                    texture("warden_blade"))
            .slot(BLADE)
            .slot(GUARD)
            .slot(HANDLE)
            .slot(CORE)
            .baseStat(AssemblyStat.DURABILITY, 120.0f)
            .baseStat(AssemblyStat.MINING_SPEED, 1.0f)
            .baseStat(AssemblyStat.ATTACK_DAMAGE, 5.0f)
            .baseStat(AssemblyStat.ATTACK_SPEED, 1.6f)
            .rule(AssemblyRules.requireSlot("blade"))
            .rule(AssemblyRules.requireSlot("guard"))
            .rule(AssemblyRules.requireSlot("handle"))
            .rule(AssemblyRules.bonusForTraits(List.of("balanced", "swift_grip"),
                    ToolStatModifier.add(AssemblyStat.ATTACK_SPEED, 0.3f),
                    ToolStatModifier.add(AssemblyStat.BONUS_DAMAGE, 1.0f)))
            .build());

    public static final ModularToolItem FIELD_HAMMER = ToolAssemblyRegistry.registerTool(ToolTypeDefinition.builder(
                    id("field_hammer"),
                    new LocalizedName("Field Hammer", "野战锤"),
                    texture("field_hammer"))
            .slot(HEAD)
            .slot(BRACE)
            .slot(HANDLE)
            .slot(CHARM)
            .baseStat(AssemblyStat.DURABILITY, 220.0f)
            .baseStat(AssemblyStat.MINING_SPEED, 2.4f)
            .baseStat(AssemblyStat.ATTACK_DAMAGE, 6.0f)
            .baseStat(AssemblyStat.ATTACK_SPEED, 0.9f)
            .effectiveBlocks(BlockTags.PICKAXE_MINEABLE)
            .rule(AssemblyRules.requireSlot("head"))
            .rule(AssemblyRules.requireSlot("brace"))
            .rule(AssemblyRules.requireSlot("handle"))
            .build());

    public static final ToolPartItem OBSIDIAN_HEAD = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("obsidian_head"),
                    new LocalizedName("Obsidian Head", "黑曜石工具头"),
                    texture("obsidian_head"))
            .allowSlots("head")
            .trait("heavy_head")
            .modifier(ToolStatModifier.add(AssemblyStat.DURABILITY, 90.0f))
            .modifier(ToolStatModifier.add(AssemblyStat.MINING_SPEED, 2.0f))
            .modifier(ToolStatModifier.add(AssemblyStat.BONUS_DAMAGE, 1.5f))
            .build());

    public static final ToolPartItem SUNSTEEL_HEAD = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("sunsteel_head"),
                    new LocalizedName("Sunsteel Head", "日钢工具头"),
                    texture("sunsteel_head"))
            .allowSlots("head")
            .trait("precision_head")
            .modifier(ToolStatModifier.add(AssemblyStat.DURABILITY, 45.0f))
            .modifier(ToolStatModifier.add(AssemblyStat.MINING_SPEED, 3.5f))
            .modifier(ToolStatModifier.add(AssemblyStat.ATTACK_SPEED, 0.2f))
            .build());

    public static final ToolPartItem WALNUT_HANDLE = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("walnut_handle"),
                    new LocalizedName("Walnut Handle", "核桃木柄"),
                    texture("walnut_handle"))
            .allowSlots("handle")
            .trait("steady_grip")
            .modifier(ToolStatModifier.add(AssemblyStat.DURABILITY, 30.0f))
            .modifier(ToolStatModifier.add(AssemblyStat.ATTACK_SPEED, 0.1f))
            .build());

    public static final ToolPartItem PRIMEVAL_GRIP = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("primeval_grip"),
                    new LocalizedName("Primeval Grip", "原始丛林握柄"),
                    texture("primeval_grip"))
            .allowSlots("handle")
            .trait("swift_grip")
            .modifier(ToolStatModifier.add(AssemblyStat.MINING_SPEED, 1.2f))
            .modifier(ToolStatModifier.add(AssemblyStat.ATTACK_SPEED, 0.2f))
            .mechanic(AssemblyMechanics.hasteOnMine(60, 0, "assembly.mechanic.fleet_grip"))
            .build());

    public static final ToolPartItem REINFORCED_BINDING = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("reinforced_binding"),
                    new LocalizedName("Reinforced Binding", "加固连接件"),
                    texture("reinforced_binding"))
            .allowSlots("binding", "brace")
            .trait("reinforced_mount")
            .modifier(ToolStatModifier.add(AssemblyStat.DURABILITY, 70.0f))
            .build());

    public static final ToolPartItem BALANCED_GUARD = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("balanced_guard"),
                    new LocalizedName("Balanced Guard", "平衡护手"),
                    texture("balanced_guard"))
            .allowSlots("guard")
            .trait("balanced")
            .modifier(ToolStatModifier.add(AssemblyStat.ATTACK_SPEED, 0.2f))
            .modifier(ToolStatModifier.add(AssemblyStat.BONUS_DAMAGE, 0.5f))
            .build());

    public static final ToolPartItem STABILITY_BRACE = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("stability_brace"),
                    new LocalizedName("Stability Brace", "稳定支撑件"),
                    texture("stability_brace"))
            .allowSlots("brace", "binding")
            .trait("reinforced_mount")
            .modifier(ToolStatModifier.add(AssemblyStat.DURABILITY, 50.0f))
            .modifier(ToolStatModifier.add(AssemblyStat.MINING_SPEED, 0.7f))
            .build());

    public static final ToolPartItem RESONANCE_MODULE = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("resonance_module"),
                    new LocalizedName("Resonance Module", "共振模块"),
                    texture("resonance_module"))
            .allowSlots("module", "core", "charm")
            .trait("resonant")
            .modifier(ToolStatModifier.multiplyBase(AssemblyStat.MINING_SPEED, 0.2f))
            .modifier(ToolStatModifier.add(AssemblyStat.BONUS_DAMAGE, 1.0f))
            .mechanic(AssemblyMechanics.glint("assembly.mechanic.resonance"))
            .mechanic(AssemblyMechanics.bonusDamage(1.0f, "assembly.mechanic.arc_damage"))
            .build());

    public static final ToolPartItem WIND_CHARM = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("wind_charm"),
                    new LocalizedName("Wind Charm", "疾风挂饰"),
                    texture("wind_charm"))
            .allowSlots("charm", "module", "core")
            .trait("windborn")
            .modifier(ToolStatModifier.add(AssemblyStat.ATTACK_SPEED, 0.15f))
            .mechanic(AssemblyMechanics.repairOverTime(160, 1, "assembly.mechanic.wind_repair"))
            .build());

    public static final ToolPartItem PULSE_CORE = ToolAssemblyRegistry.registerPart(ToolPartDefinition.builder(
                    id("pulse_core"),
                    new LocalizedName("Pulse Core", "脉冲核心"),
                    texture("pulse_core"))
            .allowSlots("core", "module", "charm")
            .trait("pulse")
            .modifier(ToolStatModifier.add(AssemblyStat.DURABILITY, 35.0f))
            .mechanic(AssemblyMechanics.pulseUse(120, 80, 1, "assembly.mechanic.pulse"))
            .build());

    private ModAssemblyContent() {
    }

    public static void register() {
        ModScreenHandlers.register();
    }

    public static Identifier id(String path) {
        return new Identifier(Past_PoetryLost_Era.MOD_ID, path);
    }

    public static Identifier texture(String path) {
        return new Identifier(Past_PoetryLost_Era.MOD_ID, "item/" + path);
    }
}
