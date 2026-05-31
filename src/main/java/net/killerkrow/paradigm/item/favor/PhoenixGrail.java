package net.killerkrow.paradigm.item.favor;

import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PhoenixGrail extends TrinketItem {
    public PhoenixGrail(Settings settings) {
        super(settings);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.phoenixgrail.tooltip").formatted(Formatting.DARK_PURPLE));
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
        ItemStack stack = user.getStackInHand(hand);

        if (user.isSneaking() && !world.isClient()) {

            double radius = 1.0;
            Box box = user.getBoundingBox().expand(radius);

            List<LivingEntity> entities = world.getEntitiesByClass(LivingEntity.class, box,
                    entity -> entity == user);

            for (LivingEntity entity : entities) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 1));
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 0));
            }

            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.1F, 1.0F);

            user.getItemCooldownManager().set(this, 1200);

            return TypedActionResult.success(stack);
        }

        return TypedActionResult.pass(stack);
    }
}