package net.killerkrow.paradigm.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SmileyInvertedWeapon extends Item {
    public SmileyInvertedWeapon(Settings settings) {
        super(settings);
    }

    // Messages sent when you hit an entity
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) { // Ensure it runs on the server
            // Check if the attacker is a player
            if (attacker instanceof PlayerEntity player) {
                player.sendMessage(Text.literal("You hit: " + target.getName().getString() + "While using an Inverted Weapon!")
                        .formatted(Formatting.AQUA), false);
            }

            // Send a message to the entity being hit if it's a player
            if (target instanceof PlayerEntity victim) {
                victim.sendMessage(Text.literal("You were hit by " + attacker.getName().getString() + " while they used a Soul Inverted Weapon!")
                        .formatted(Formatting.AQUA), false);
            }
        }
        return super.postHit(stack, target, attacker);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.smiley_inverted.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("Hold Shift for more info...").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}