package net.killerkrow.paradigm.item.favor;

import net.killerkrow.paradigm.util.CustomRarityItem;
import net.killerkrow.paradigm.util.ModComponents;
import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SignedSoulDeal extends CustomRarityItem {
    public SignedSoulDeal(Settings settings, ModRarities rarity) {
        super(settings, rarity);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        String desc = ModComponents.getPlayerNameForSoulOwning(stack);
        String debugOne = ModComponents.getVesselUuid(stack);

        if ((desc == null || desc.isEmpty()) && (debugOne == null || debugOne.isEmpty())) {
            tooltip.add(Text.literal("/give?").formatted(Formatting.GOLD, Formatting.ITALIC));
        } else {
            if (desc != null && !desc.isEmpty()) {
                tooltip.add(Text.literal("Signed by " + desc).formatted(Formatting.AQUA));
            }

            if (debugOne != null && !debugOne.isEmpty() && MinecraftClient.getInstance().options.advancedItemTooltips) {
                tooltip.add(Text.literal("Debug UUID: " + debugOne).formatted(Formatting.DARK_GRAY));
            }
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}