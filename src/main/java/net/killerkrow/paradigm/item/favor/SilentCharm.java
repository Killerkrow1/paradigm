package net.killerkrow.paradigm.item.favor;

import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SilentCharm extends Item {
    private final ModRarities rarity;
    public SilentCharm(Settings settings, ModRarities rarity) {
        super(settings);
        this.rarity = rarity;
    }

    @Override
    public Text getName(ItemStack stack) {
        Text baseName = super.getName(stack);

        return baseName.copy().setStyle(Style.EMPTY.withColor(rarity.color));
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.silent_charm.tooltip").formatted(Formatting.DARK_PURPLE));
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
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {
            ServerWorld serverWorld = (ServerWorld) world;

            for (int i = 0; i < 3; i++) {
                WardenEntity warden = EntityType.WARDEN.create(serverWorld);
                if (warden != null) {
                    BlockPos pos = user.getBlockPos().add(
                            world.random.nextInt(5) - 2,
                            0,
                            world.random.nextInt(5) - 2
                    );

                    warden.refreshPositionAndAngles(pos, 0.0F, 0.0F);
                    warden.initialize(serverWorld, world.getLocalDifficulty(pos), SpawnReason.MOB_SUMMONED, null, null);

                    serverWorld.spawnEntity(warden);
                }
            }

            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_WARDEN_ROAR, SoundCategory.PLAYERS, 1.0F, 1.0F);

            user.getItemCooldownManager().set(this, 12000);
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}