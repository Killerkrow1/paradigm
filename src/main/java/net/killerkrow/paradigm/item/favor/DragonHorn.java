package net.killerkrow.paradigm.item.favor;

import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DragonHorn extends Item {
    private final ModRarities rarity;
    public DragonHorn(Settings settings, ModRarities rarity) {
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
            tooltip.add(Text.translatable("tooltip.paradigm.dragonhorn.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, net.minecraft.entity.player.PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        if (!world.isClient()) {
            // Get the player's look vector
            Vec3d lookVec = user.getRotationVec(1.0F);

            // Spawn the dragon fireball in front of the player
            double x = user.getX() + lookVec.x * 2.0;
            double y = user.getEyeY() - 0.2;
            double z = user.getZ() + lookVec.z * 2.0;

            DragonFireballEntity fireball = new DragonFireballEntity(world, user, lookVec.x, lookVec.y, lookVec.z);
            fireball.setPos(x, y, z);

            // Add velocity (you can adjust the multiplier for faster/slower fireballs)
            fireball.setVelocity(lookVec.x, lookVec.y, lookVec.z, 1.5F, 1.0F);

            world.spawnEntity(fireball);

            // Play the shoot sound
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_DRAGON_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F);

            // Optional: Cooldown
            user.getItemCooldownManager().set(this, 20);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}