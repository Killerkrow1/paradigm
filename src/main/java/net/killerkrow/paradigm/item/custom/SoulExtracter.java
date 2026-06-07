package net.killerkrow.paradigm.item.custom;

import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SoulExtracter extends Item {
    private final ModRarities rarity;
    public SoulExtracter(Settings settings, ModRarities rarity) {
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
        return true;
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.soul_extracter.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("Hold Shift for more info...").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof ServerPlayerEntity player && target instanceof LivingEntity) {
            ItemStack givenItem = new ItemStack(ModItems.SOUL);
            boolean success = player.giveItemStack(givenItem);

            if (!success) {
                player.dropItem(givenItem, false);
            }
            player.sendMessage(
                    Text.literal("You extracted:" + target.getName().getString() + "'s soul!'").formatted(Formatting.AQUA),
                    false
            );
            target.sendMessage(
                    Text.literal("Your soul was extracted!").formatted(Formatting.AQUA)
            );
        }
        return super.postHit(stack, target, attacker);
    }


}
