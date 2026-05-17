package net.killerkrow.paradigm.item.custom;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ChargedEmptyJadeEffigy extends TrinketItem {
    public ChargedEmptyJadeEffigy(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.paradigm.charged_empty_jade_effigy.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }

}
