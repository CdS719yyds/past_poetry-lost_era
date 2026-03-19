package com.calypso.assembly;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public final class AssemblyMechanics {
    private AssemblyMechanics() {
    }

    public static AssemblyMechanic glint(String translationKey) {
        return new AssemblyMechanic() {
            @Override
            public boolean hasGlint(AssemblyContext context) {
                return true;
            }

            @Override
            public void appendTooltip(AssemblyContext context, List<Text> tooltip) {
                tooltip.add(Text.translatable(translationKey));
            }
        };
    }

    public static AssemblyMechanic repairOverTime(int intervalTicks, int repairAmount, String translationKey) {
        return new AssemblyMechanic() {
            @Override
            public void inventoryTick(AssemblyContext context, ItemStack stack, World world, Entity entity, int slot, boolean selected) {
                if (world.isClient() || world.getTime() % intervalTicks != 0L || AssemblyData.getDamage(stack) <= 0) {
                    return;
                }
                AssemblyData.setDamage(stack, Math.max(0, AssemblyData.getDamage(stack) - repairAmount));
            }

            @Override
            public void appendTooltip(AssemblyContext context, List<Text> tooltip) {
                tooltip.add(Text.translatable(translationKey));
            }
        };
    }

    public static AssemblyMechanic hasteOnMine(int durationTicks, int amplifier, String translationKey) {
        return new AssemblyMechanic() {
            @Override
            public boolean postMine(AssemblyContext context, ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
                if (miner instanceof PlayerEntity player && !world.isClient()) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, durationTicks, amplifier));
                }
                return false;
            }

            @Override
            public void appendTooltip(AssemblyContext context, List<Text> tooltip) {
                tooltip.add(Text.translatable(translationKey));
            }
        };
    }

    public static AssemblyMechanic bonusDamage(float amount, String translationKey) {
        return new AssemblyMechanic() {
            @Override
            public boolean postHit(AssemblyContext context, ItemStack stack, LivingEntity target, LivingEntity attacker) {
                if (!attacker.getWorld().isClient()) {
                    target.damage(attacker.getDamageSources().mobAttack(attacker), amount);
                }
                return false;
            }

            @Override
            public void appendTooltip(AssemblyContext context, List<Text> tooltip) {
                tooltip.add(Text.translatable(translationKey, amount));
            }
        };
    }

    public static AssemblyMechanic pulseUse(int cooldownTicks, int durationTicks, int amplifier, String translationKey) {
        return new AssemblyMechanic() {
            @Override
            public TypedActionResult<ItemStack> use(AssemblyContext context, World world, PlayerEntity user, Hand hand) {
                ItemStack stack = user.getStackInHand(hand);
                if (user.getItemCooldownManager().isCoolingDown(stack.getItem())) {
                    return TypedActionResult.fail(stack);
                }

                if (!world.isClient()) {
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, durationTicks, amplifier));
                    user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, durationTicks, amplifier));
                    user.getItemCooldownManager().set(stack.getItem(), cooldownTicks);
                }

                return TypedActionResult.success(stack, world.isClient());
            }

            @Override
            public void appendTooltip(AssemblyContext context, List<Text> tooltip) {
                tooltip.add(Text.translatable(translationKey));
            }
        };
    }
}
