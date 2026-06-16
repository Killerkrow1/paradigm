package net.killerkrow.paradigm.item.custom;

import dev.emi.trinkets.api.TrinketItem;
import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.item.ItemUsageContext;

import java.util.List;

public class EmptyEffigy extends TrinketItem {
    public EmptyEffigy(Item.Settings settings) {
        super(settings);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.emptyeffigy.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        // These are what blocks are being absorbed
        if (state.isOf(ModBlocks.GILDEN_JADE_BLOCK) //Jade Effigy starter, Emerald is placeholder for now
                || state.isOf(Blocks.SCULK_SHRIEKER) || state.isOf(Blocks.SCULK_CATALYST) || state.isOf(Blocks.SCULK_SENSOR) //Soul Effigy starter
                || state.isOf(Blocks.BONE_BLOCK) //Afterlife Effigy starter
                || state.isOf(Blocks.CONDUIT) || state.isOf(Blocks.NETHERITE_BLOCK) || state.isOf(Blocks.ENCHANTING_TABLE) //Semigod Effigy starter
                || state.isOf(Blocks.BEACON) || state.isOf(Blocks.SPAWNER) //Demigod Effigy starter
                || state.isOf(Blocks.INFESTED_STONE) || state.isOf(Blocks.INFESTED_DEEPSLATE) //Esoteric Effigy Starter
                || state.isOf(Blocks.CALCITE) || state.isOf(Blocks.SOUL_SAND) //Lunar Effigy Starter
                || state.isOf(Blocks.SHROOMLIGHT) || state.isOf(Blocks.MAGMA_BLOCK) //Solar Effigy Starter
                || state.isOf(ModBlocks.REVERENCE_BERRY_SACK) //Reverence Effigy Starter
        ) {
            if (!world.isClient()) {
                NbtCompound nbt = stack.getOrCreateNbt();

                // Accounting
                int absorbedCount = nbt.getInt("AbsorbedCount");
                absorbedCount++;

                nbt.putInt("AbsorbedCount", absorbedCount);
                nbt.putString("LastAbsorbedBlock", state.getBlock().getName().getString());

                // Tranformers in disguise
                if (absorbedCount >= 1) {
                    ItemStack transformedItem = getTransformedItem(state);

                    if (player != null) {
                        if (!player.getInventory().insertStack(transformedItem)) {
                            player.dropItem(transformedItem, false);
                        }
                        stack.decrement(1); // Remove the original item
                    }
                } else {
                    // Soundsssssss
                    world.playSound(null, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_RESONATE, SoundCategory.PLAYERS, 1.0F, 1.0F);
                    world.breakBlock(pos, false); // Consume block
                }
            }
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }

    private ItemStack getTransformedItem(BlockState state) {

        //Start of the jade Effigy Givers
        if (state.isOf(ModBlocks.GILDEN_JADE_BLOCK)) {
            return new ItemStack(ModItems.EMPTY_JADE_EFFIGY);
        }

        //Start of the Soul Effigy Givers

        else if (state.isOf(Blocks.SCULK_SHRIEKER)) {
            return new ItemStack(ModItems.EMPTY_SOUL_EFFIGY);
        }

        else if (state.isOf(Blocks.SCULK_CATALYST)) {
            return new ItemStack(ModItems.EMPTY_SOUL_EFFIGY);
        }

        else if (state.isOf(Blocks.SCULK_SENSOR)) {
            return new ItemStack(ModItems.EMPTY_SOUL_EFFIGY);
        }

        //Start of the Afterlife Effigy Givers

        else if (state.isOf(Blocks.BONE_BLOCK)) {
            return new ItemStack(ModItems.EMPTY_AFTERLIFE_EFFIGY);
        }

        //Start of the Semigod Effigy Givers

        else if (state.isOf(Blocks.CONDUIT)) {
            return new ItemStack(ModItems.EMPTY_SEMI_EFFIGY);
        }

        else if (state.isOf(Blocks.NETHERITE_BLOCK)) {
            return new ItemStack(ModItems.EMPTY_SEMI_EFFIGY);
        }

        else if (state.isOf(Blocks.ENCHANTING_TABLE)) {
            return new ItemStack(ModItems.EMPTY_SEMI_EFFIGY);
        }

        //Start of the Demigod Effigy Givers

        else if (state.isOf(Blocks.BEACON)) {
            return new ItemStack(ModItems.EMPTY_DEMI_EFFIGY);
        }

        else if (state.isOf(Blocks.SPAWNER)) {
            return new ItemStack(ModItems.EMPTY_DEMI_EFFIGY);
        }

        //Start of the Esoteric Effigy Givers

        else if (state.isOf(Blocks.INFESTED_DEEPSLATE)) {
            return new ItemStack(ModItems.EMPTY_ESOTERIC_EFFIGY);
        }

        else if (state.isOf(Blocks.INFESTED_STONE)) {
            return new ItemStack(ModItems.EMPTY_ESOTERIC_EFFIGY);
        }

        //Start of the Lunar Effigy Givers

        else if (state.isOf(Blocks.CALCITE)) {
            return new ItemStack(ModItems.EMPTY_LUNAR_EFFIGY);
        }

        else if (state.isOf(Blocks.SOUL_SAND)) {
            return new ItemStack(ModItems.EMPTY_LUNAR_EFFIGY);
        }

        //Start of the Solar Effigy Givers

        else if (state.isOf(Blocks.SHROOMLIGHT)) {
            return new ItemStack(ModItems.EMPTY_SOLAR_EFFIGY);
        }

        else if (state.isOf(Blocks.MAGMA_BLOCK)) {
            return new ItemStack(ModItems.EMPTY_SOLAR_EFFIGY);
        }

        //Start of the Solar Effigy Givers

        else if (state.isOf(ModBlocks.REVERENCE_BERRY_SACK)) {
            return new ItemStack(ModItems.EMPTY_REVERENCE_EFFIGY);
        }


        return new ItemStack(ModItems.EMPTY_EFFIGY);
    }
}