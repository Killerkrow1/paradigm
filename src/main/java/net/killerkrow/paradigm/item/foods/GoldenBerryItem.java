package net.killerkrow.paradigm.item.foods;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GoldenBerryItem extends Item {
    public GoldenBerryItem(Item.Settings settings) {
        super(settings);
    }


    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient() && user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;

            ItemStack rewardItem = new ItemStack(ModItems.REVERENCE_STEM);

            // Try to give the item to the player
            if (!player.getInventory().insertStack(rewardItem)) {
                player.dropItem(rewardItem, false);
            }
        }

        return super.finishUsing(stack, world, user);
    }
}