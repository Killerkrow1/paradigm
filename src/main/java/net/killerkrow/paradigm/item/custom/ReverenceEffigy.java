package net.killerkrow.paradigm.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ReverenceEffigy extends Item{
    public ReverenceEffigy(Settings settings) {
        super(settings);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.reverenceeffigy.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("Hold Shift for more info...").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (entity instanceof PlayerEntity player) {
            player.getHungerManager().setFoodLevel(20);
            player.getHungerManager().setSaturationLevel(0);
        }
    }
}