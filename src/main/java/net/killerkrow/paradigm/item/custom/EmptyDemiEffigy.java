package net.killerkrow.paradigm.item.custom;

import dev.emi.trinkets.api.TrinketItem;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EmptyDemiEffigy extends TrinketItem {
    public EmptyDemiEffigy(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.paradigm.emptydemieffigy.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        // 1. Define what blocks can be absorbed (e.g., Stone and Gold Block)
        if (state.isOf(Blocks.BEACON) || state.isOf(Blocks.SPAWNER) //Demigod Effigy starter
        ) {
            if (!world.isClient()) {
                NbtCompound nbt = stack.getOrCreateNbt();

                // 2. Track count and last block absorbed
                int absorbedCount = nbt.getInt("AbsorbedCount");
                absorbedCount++;

                nbt.putInt("AbsorbedCount", absorbedCount);
                nbt.putString("LastAbsorbedBlock", state.getBlock().getName().getString());

                // 3. Transform item conditionally
                if (absorbedCount >= 12) {
                    ItemStack transformedItem = getTransformedItem(state);

                    if (player != null) {
                        if (!player.getInventory().insertStack(transformedItem)) {
                            player.dropItem(transformedItem, false);
                        }
                        stack.decrement(1); // Remove the original item
                    }
                } else {
                    // Visual/Audio feedback for partial absorption
                    world.playSound(null, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_RESONATE, SoundCategory.PLAYERS, 1.0F, 1.0F);
                    world.breakBlock(pos, false); // Consume block
                }
            }
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }

    private ItemStack getTransformedItem(BlockState state) {
        // Return different items depending on what block was absorbed on stage 2

        if (state.isOf(Blocks.BEACON)) {
            // return your custom Lapis-Absorbed item [OLD NOTE I WILL NOT UPDATE]
            return new ItemStack(ModItems.CHARGED_EMPTY_DEMI_EFFIGY);
        }

        else if (state.isOf(Blocks.SPAWNER)) {
            // return your custom Lapis-Absorbed item [OLD NOTE I WILL NOT UPDATE]
            return new ItemStack(ModItems.CHARGED_EMPTY_DEMI_EFFIGY);
        }


        return new ItemStack(ModItems.EMPTY_EFFIGY);
    }
}