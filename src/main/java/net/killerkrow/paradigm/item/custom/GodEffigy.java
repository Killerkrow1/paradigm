package net.killerkrow.paradigm.item.custom;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;


public class GodEffigy extends TrinketItem {
    public GodEffigy(Item.Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.paradigm.godeffigy.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);

        // +25% movement speed
        modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, "paradigm:movement_speed", 0.25,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +40% attack damage
        modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uuid, "paradigm:attack_damage", 0.4,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +30% max health
        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "paradigm:max_health", 0.3,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +25% armor
        modifiers.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uuid, "paradigm:armor_buff", 0.25,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +25% armor toughness
        modifiers.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uuid, "paradigm:armor_toughness", 0.25,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +100% knockback resistance
        modifiers.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uuid, "paradigm:armor_toughness", 1,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +25% attack speed
        modifiers.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(uuid, "paradigm:armor_toughness", 0.25,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

        // Adds the effects to make the God Effigy more godly
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 4800, 1));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4800, 1));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 4800, 1));

        // Night Vision or smth IDK
        // entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0, false, false));

        // If the player has access to # slots, this will give them an extra one
        // SlotAttributes.addSlotModifier(modifiers, "legs/belt", uuid, 1, EntityAttributeModifier.Operation.ADDITION);

        return modifiers;
    }
}