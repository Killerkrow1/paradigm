package net.killerkrow.paradigm.item.custom;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.client.gui.screen.Screen;
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
import net.minecraft.util.Formatting;
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
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.godeffigy.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
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

        // Adds the effects to make the God Effigy more godly [OLD CODE KEPT FOR MEMORY]
        //entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 4800, 1));
        //entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4800, 1));
        //entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 4800, 1));

        // Night Vision or smth IDK
        // entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0, false, false));

        // If the player has access to # slots, this will give them an extra one
        // SlotAttributes.addSlotModifier(modifiers, "legs/belt", uuid, 1, EntityAttributeModifier.Operation.ADDITION);

        return modifiers;
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        // Only apply effects on the server side to prevent duplication and desync
        if (!entity.getWorld().isClient()) {
            // Apply Haste I for 5 seconds (100 ticks).
            // The 3rd parameter (true) hides particles, similar to beacons.
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.HASTE, 100, 1, true, false
            ));
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.FIRE_RESISTANCE, 100, 0, true, false
            ));
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.RESISTANCE, 100, 1, true, false
            ));
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.DOLPHINS_GRACE, 100, 0, true, false
            ));
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.HERO_OF_THE_VILLAGE, 100, 0, true, false
            ));
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.CONDUIT_POWER, 100, 0, true, false
            ));
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.LUCK, 100, 0, true, false
            ));
            entity.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.REGENERATION, 100, 1, true, false
            ));
        }
    }

}