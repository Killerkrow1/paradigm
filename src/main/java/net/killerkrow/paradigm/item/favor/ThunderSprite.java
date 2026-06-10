package net.killerkrow.paradigm.item.favor;

import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ThunderSprite extends Item {
    private final ModRarities rarity;
    public ThunderSprite(Settings settings, ModRarities rarity) {
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
            tooltip.add(Text.translatable("tooltip.paradigm.thundersprite.tooltip").formatted(Formatting.DARK_PURPLE));
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
            double radius = 15.0; // Set your desired radius here
            Box box = user.getBoundingBox().expand(radius);

            // Get all living entities within the bounding box
            List<LivingEntity> entities = world.getEntitiesByClass(LivingEntity.class, box, entity -> entity != user);

            for (LivingEntity entity : entities) {
                // Check if the entity is a Hostile Mob (Monster) or another Player
                if (entity instanceof Monster || entity instanceof PlayerEntity) {
                    // Strike 5 lightning bolts at the entity
                    for (int i = 0; i < 5; i++) {
                        LightningEntity lightning = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
                        lightning.setPosition(entity.getPos());
                        world.spawnEntity(lightning);
                    }
                }
            }
            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_ALLAY_AMBIENT_WITH_ITEM, SoundCategory.PLAYERS, 1.0F, 1.0F);

            user.getItemCooldownManager().set(this, 6000);
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}