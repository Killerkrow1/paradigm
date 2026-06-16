package net.killerkrow.paradigm.item.favor;

import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SaveTPItem extends Item {
    private final ModRarities rarity;

    public SaveTPItem(Settings settings, ModRarities rarity) {
        super(settings);
        this.rarity = rarity;
    }

    @Override
    public Text getName(ItemStack stack) {
        Text baseName = super.getName(stack);

        return baseName.copy().setStyle(Style.EMPTY.withColor(rarity.color));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        if (player != null && player.isSneaking()) {
            BlockPos pos = context.getBlockPos();

            NbtCompound nbt = stack.getOrCreateNbt();
            nbt.putInt("teleport.x", pos.getX());
            nbt.putInt("teleport.y", pos.getY());
            nbt.putInt("teleport.z", pos.getZ());

            if (!world.isClient) {
                player.sendMessage(Text.literal("Location saved: " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ()), true);
                world.playSound(null, player.getX(), player.getY(), player.getZ(),
                        SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
            }
            return ActionResult.SUCCESS;
        }
        return super.useOnBlock(context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (!user.isSneaking() && stack.hasNbt()) {
            NbtCompound nbt = stack.getNbt();
            if (nbt.contains("teleport.x") && nbt.contains("teleport.y") && nbt.contains("teleport.z")) {
                int x = nbt.getInt("teleport.x");
                int y = nbt.getInt("teleport.y");
                int z = nbt.getInt("teleport.z");

                if (!world.isClient) {
                    // Teleport the player
                    user.teleport(x, y + 1, z); // +1 prevents clipping into the block
                    world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT,
                            SoundCategory.PLAYERS, 1.0F, 1.0F);

                    user.getItemCooldownManager().set(this, 1200); // 60-second cooldown, every 20 is 1 second. 10 x 120 = 1200
                }
                return TypedActionResult.success(stack);
            }
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.tp_item.tooltip").formatted(Formatting.DARK_PURPLE));
            tooltip.add(Text.translatable("tooltip.paradigm.tp_item_line_2.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

}