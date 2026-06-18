package net.killerkrow.paradigm.item.weapons;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.killerkrow.paradigm.util.ModRarities;
import net.killerkrow.paradigm.util.particles.ScreenParticleEffects;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import team.lodestar.lodestone.handlers.screenparticle.ParticleEmitterHandler;
import team.lodestar.lodestone.systems.particle.screen.ScreenParticleHolder;

import java.util.List;
import java.util.UUID;

public class InvertedSpear extends SwordItem implements Vanishable, ParticleEmitterHandler.ItemParticleSupplier {
    private static final UUID ATTACK_RANGE_MODIFIER_UUID = UUID.fromString("12345678-1234-5678-1234-567812345678");
    private final float attackDamage;
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    private final ModRarities rarity;

    public InvertedSpear(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, ModRarities rarity) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        this.attackDamage = (float) attackDamage + toolMaterial.getAttackDamage();
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", (double) this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", (double) attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
        this.rarity = rarity;
    }

    @Override
    public Text getName(ItemStack stack) {
        Text baseName = super.getName(stack);

        return baseName.copy().setStyle(Style.EMPTY.withColor(rarity.color));
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    //This is for the item to remain in the crafting table
    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return new ItemStack(this);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(stack, slot);

        if (slot == EquipmentSlot.MAINHAND) {
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
            builder.putAll(modifiers);

            // Default is 3, so put putting 2 I add 2 more blocks
            builder.put(ReachEntityAttributes.ATTACK_RANGE, new EntityAttributeModifier(
                    ATTACK_RANGE_MODIFIER_UUID,
                    "Weapon attack range bonus",
                    2.0D,
                    EntityAttributeModifier.Operation.ADDITION
            ));

            return builder.build();
        }

        return modifiers;
    }

    // Messages sent when you hit an entity
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {
            if (attacker instanceof PlayerEntity player) {
                player.sendMessage(Text.literal("You hit: " + target.getName().getString() + " while using an Inverted Weapon!")
                        .formatted(Formatting.AQUA), false);
            }

            if (target instanceof PlayerEntity victim) {
                victim.sendMessage(Text.literal("You were hit by " + attacker.getName().getString() + " while they used a Soul Inverted Weapon!")
                        .formatted(Formatting.AQUA), false);
                victim.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60, 0));
            }
        }
        return super.postHit(stack, target, attacker);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.inverted_spear.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void spawnEarlyParticles(ScreenParticleHolder target, World level, float partialTick, ItemStack stack, float x, float y) {
        ScreenParticleEffects.spawnInvertedParticles(target, level, 0.8f, partialTick);
    }
}