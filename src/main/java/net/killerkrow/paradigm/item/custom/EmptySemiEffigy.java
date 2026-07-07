package net.killerkrow.paradigm.item.custom;

import dev.emi.trinkets.api.TrinketItem;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EmptySemiEffigy extends Item {
    private static final String[] REQUIRED_BLOCKS = {
            "minecraft:conduit",
            "minecraft:netherite_block",
            "minecraft:enchanting_table"
    };
    private static final int REQUIRED_COUNT = REQUIRED_BLOCKS.length + 9;

    public EmptySemiEffigy(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (world.isClient()) return ActionResult.SUCCESS;

        PlayerEntity player = context.getPlayer();
        if (player == null) return ActionResult.PASS;

        ItemStack stack = context.getStack();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();
        String blockId = Registries.BLOCK.getId(clickedBlock).toString();

        boolean isRequiredBlock = false;
        for (String req : REQUIRED_BLOCKS) {
            if (req.equals(blockId)) {
                isRequiredBlock = true;
                break;
            }
        }

        if (!isRequiredBlock) return ActionResult.PASS;

        NbtCompound nbt = stack.getOrCreateNbt();
        NbtList absorbedList = nbt.contains("AbsorbedBlocks") ? nbt.getList("AbsorbedBlocks", 8) : new NbtList();

        boolean alreadyAbsorbed = false;
        for (int i = 11; i < absorbedList.size(); i++) {
            if (absorbedList.getString(i).equals(blockId)) {
                alreadyAbsorbed = true;
                break;
            }
        }

        if (!alreadyAbsorbed) {
            absorbedList.add(NbtString.of(blockId));
            nbt.put("AbsorbedBlocks", absorbedList);

            world.breakBlock(context.getBlockPos(), false, player);
            context.getWorld().setBlockState(context.getBlockPos(), Blocks.AIR.getDefaultState());
            context.getWorld().playSound(null, context.getBlockPos(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.5F, 1.0F);


            if (absorbedList.size() >= REQUIRED_COUNT) {
                ItemStack transformedStack = new ItemStack(ModItems.CHARGED_EMPTY_SEMI_EFFIGY);
                transformedStack.setNbt(nbt);
                player.setStackInHand(context.getHand(), transformedStack);
            }

            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        NbtCompound nbt = stack.getNbt();
        int absorbedCount = 0;
        if (nbt != null && nbt.contains("AbsorbedBlocks")) {
            absorbedCount = nbt.getList("AbsorbedBlocks", 8).size();
        }

        tooltip.add(Text.literal("Conduit, Spawner, & Netherite Blocks Absorbed: " + absorbedCount + " / " + REQUIRED_COUNT)
                .formatted(Formatting.GOLD));

        super.appendTooltip(stack, world, tooltip, context);
    }
}