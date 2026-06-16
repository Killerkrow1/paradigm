package net.killerkrow.paradigm.item.favor;

import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.util.ModComponents;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WritableBookItem;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SoulDeal extends WritableBookItem {
    public SoulDeal(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack unsignedStack = user.getStackInHand(hand);

        if (user.isSneaking()) {
            if (ModComponents.getContractSigned(unsignedStack) != 0) {
                return TypedActionResult.fail(unsignedStack);
            }

            ItemStack signedStack = new ItemStack(ModItems.SOUL_DEAL_SIGNED);

            ModComponents.setVesselUuid(signedStack, user.getUuid().toString());
            ModComponents.setContractSigned(signedStack, 1);
            ModComponents.setPlayerNameForSoulOwning(signedStack, user.getName().getString());
            user.setStackInHand(hand, signedStack);
            return TypedActionResult.success(signedStack, world.isClient());
        }
        return TypedActionResult.success(unsignedStack, world.isClient());
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.soul_deal.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}