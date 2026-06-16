package net.killerkrow.paradigm.item.custom;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.killerkrow.paradigm.effect.ModStatusEffects;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class EsotericEffigy extends TrinketItem {
    public EsotericEffigy(Settings settings) {
        super(settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        String[] textArray = {
                "Holding this dangerous relic is a medal of it's own. Who knows what you had to do for it."//,
                //"This text has a broken code: SEC-104958",
                //"Final static line."
        };

        for (String line : textArray) {
            MutableText finalText = Text.literal("");

            // This does the random obfuscation
            for (char c : line.toCharArray()) {
                if (Math.random() < 0.60) { // Numberssssssss, 0.X0 is X0%
                    finalText.append(Text.literal(String.valueOf(c)).formatted(Formatting.OBFUSCATED));
                } else {
                    finalText.append(Text.literal(String.valueOf(c).formatted(Formatting.DARK_PURPLE)));
                }
            }

            if (Screen.hasShiftDown()) {
                // This adds the actual line
                tooltip.add(finalText.formatted(Formatting.DARK_RED));
            } else {
                tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
            }
            super.appendTooltip(stack, world, tooltip, context);
        }

    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Enables the enchanted shimmer
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);

        // +15% movement speed
        modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, "paradigm:movement_speed", -0.75,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +10% max health
        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "paradigm:max_health", 0.5,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
        // +10% max health
        modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uuid, "paradigm:max_health", 0.25,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

        return modifiers;
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (!entity.getWorld().isClient()) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 200, 1
            ));
            {
                entity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.WATCHED, 200, 0
                ));
            }
        }
    }
}