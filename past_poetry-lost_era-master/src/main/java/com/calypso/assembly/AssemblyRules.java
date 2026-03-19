package com.calypso.assembly;

import net.minecraft.text.Text;

import java.util.List;

public final class AssemblyRules {
    private AssemblyRules() {
    }

    public static AssemblyRule requireSlot(String slotId) {
        return (context, computation) -> {
            if (!context.hasPart(slotId)) {
                String slotName = slotId;
                AssemblySlotDefinition slot = context.toolType().slots().stream()
                        .filter(candidate -> candidate.id().equals(slotId))
                        .findFirst()
                        .orElse(null);
                if (slot != null) {
                    slotName = slot.name().english();
                }
                computation.error(Text.translatable("assembly.error.required_slot", Text.literal(slotName)));
            }
        };
    }

    public static AssemblyRule requireTraitWhenTraitPresent(String presentTrait, String requiredTrait, String requiredSlotId) {
        return (context, computation) -> {
            if (context.hasTrait(presentTrait) && !context.slotHasTrait(requiredSlotId, requiredTrait)) {
                computation.error(Text.translatable("assembly.error.required_trait", Text.literal(requiredTrait), Text.literal(requiredSlotId)));
            }
        };
    }

    public static AssemblyRule bonusForTraits(List<String> requiredTraits, ToolStatModifier... modifiers) {
        return (context, computation) -> {
            boolean matches = requiredTraits.stream().allMatch(context::hasTrait);
            if (matches) {
                for (ToolStatModifier modifier : modifiers) {
                    computation.addModifier(modifier);
                }
            }
        };
    }

    public static AssemblyRule bonusForPart(String partPath, ToolStatModifier... modifiers) {
        return (context, computation) -> {
            if (context.hasPartId(partPath)) {
                for (ToolStatModifier modifier : modifiers) {
                    computation.addModifier(modifier);
                }
            }
        };
    }
}
