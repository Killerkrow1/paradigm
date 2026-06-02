package net.killerkrow.paradigm.item.foods;

import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BerryItem extends Item {
    public BerryItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        // Run this logic on the server-side to prevent duplication
        if (!world.isClient() && user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;

            // Define the item you want to give the player (e.g., a vanilla Diamond)
            ItemStack rewardItem = new ItemStack(ModItems.REVERENCE_STEM);

            // Try to give the item to the player
            if (!player.getInventory().insertStack(rewardItem)) {
                // If the inventory is full, drop the item at the player's feet
                player.dropItem(rewardItem, false);
            }
        }

        // Return the standard finishUsing (consumes the item and plays the eating animation)
        return super.finishUsing(stack, world, user);
    }
}