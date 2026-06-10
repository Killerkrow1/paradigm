package net.killerkrow.paradigm.item.favor;

import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SmileyNotesItem extends Item {
    private final ModRarities rarity;
    public SmileyNotesItem(Settings settings, ModRarities rarity) {
        super(settings);
        this.rarity = rarity;
    }

    @Override
    public Text getName(ItemStack stack) {
        Text baseName = super.getName(stack);

        return baseName.copy().setStyle(Style.EMPTY.withColor(rarity.color));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.paradigm.smileynotes.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    //Lowkey another thing I googled
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {

            if (user instanceof ServerPlayerEntity serverPlayer) {
                if (serverPlayer.getItemCooldownManager().isCoolingDown(this)) {
                    return TypedActionResult.fail(user.getStackInHand(hand));
                }
                serverPlayer.getItemCooldownManager().set(this, 100);
            }

            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_WITHER_SPAWN, SoundCategory.PLAYERS, 0.1f, 1.0f);

            user.sendMessage(Text.literal("The notes are empty and your mind hazes as they look at the notes. It's almost like they serve no purpose anymore."), false);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
