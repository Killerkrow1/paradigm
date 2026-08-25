package net.killerkrow.paradigm.item.foods;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class BowlItem extends Item {
    public BowlItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient() && user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;

            ItemStack rewardItem = new ItemStack(Items.BOWL);

            // Try to give the item to the player
            if (!player.getInventory().insertStack(rewardItem)) {
                player.dropItem(rewardItem, false);
            }
        }

        return super.finishUsing(stack, world, user);
    }
}