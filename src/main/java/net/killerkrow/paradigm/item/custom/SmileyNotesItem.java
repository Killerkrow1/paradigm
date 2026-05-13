package net.killerkrow.paradigm.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SmileyNotesItem extends Item {
    public SmileyNotesItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) { // Ensure we are on the server side

            // 1. Check/Set Cooldown (5 seconds = 100 ticks)
            if (user instanceof ServerPlayerEntity serverPlayer) {
                if (serverPlayer.getItemCooldownManager().isCoolingDown(this)) {
                    return TypedActionResult.fail(user.getStackInHand(hand));
                }
                serverPlayer.getItemCooldownManager().set(this, 100);
            }

            // 2. Play Sound for Everyone (null means everyone hears it)
            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_WITHER_SPAWN, SoundCategory.PLAYERS, 0.1f, 1.0f);

            // 3. Send Message to User
            user.sendMessage(Text.literal("The notes are empty and your mind hazes as they look at the notes. It's almost like they serve no purpose anymore."), false);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
