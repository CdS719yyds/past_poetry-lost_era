package com.calypso.assembly;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public interface AssemblyMechanic {
    default void applyComputedStats(AssemblyContext context, AssemblyComputation computation) {
    }

    default boolean hasGlint(AssemblyContext context) {
        return false;
    }

    default void inventoryTick(AssemblyContext context, ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    }

    default void appendTooltip(AssemblyContext context, List<Text> tooltip) {
    }

    default TypedActionResult<ItemStack> use(AssemblyContext context, World world, PlayerEntity user, Hand hand) {
        return TypedActionResult.pass(user.getStackInHand(hand));
    }

    default boolean postHit(AssemblyContext context, ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return false;
    }

    default boolean postMine(AssemblyContext context, ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        return false;
    }
}
