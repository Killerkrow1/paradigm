package net.killerkrow.paradigm.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemStackSet;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.EquipmentSlot;

import java.util.List;
import java.util.UUID;

public class FastInvertedWeapon extends Item {
    private static final UUID ATTACK_SPEED_MODIFIER_ID = UUID.fromString("0a35e4d2-7a8f-4b0c-99e2-2a281da96d93");

    public FastInvertedWeapon(Settings settings) {
        super(settings);
    }

    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        // Get the default modifiers for the item from the superclass
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(EquipmentSlot.MAINHAND);

        if (slot == EquipmentSlot.MAINHAND) {
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
            // Put all default modifiers back
            builder.putAll(modifiers);

            // Add custom attack speed (Amount is a multiplier on attack cooldown, a higher number attacks faster)
            builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(
                    ATTACK_SPEED_MODIFIER_ID,
                    "Weapon attack speed",
                    3.0, // Increase this value to swing significantly faster
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL
            ));

            return builder.build();
        }
        return modifiers;
    }

    // Messages sent when you hit an entity
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) { // Ensure it runs on the server
            // Check if the attacker is a player
            if (attacker instanceof PlayerEntity player) {
                player.sendMessage(Text.literal("You hit: " + target.getName().getString() + "While using an Inverted Weapon!")
                        .formatted(Formatting.AQUA), false);
            }

            // Send a message to the entity being hit if it's a player
            if (target instanceof PlayerEntity victim) {
                victim.sendMessage(Text.literal("You were hit by " + attacker.getName().getString() + " while they used a Soul Inverted Weapon!")
                        .formatted(Formatting.AQUA), false);
            }
        }
        return super.postHit(stack, target, attacker);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.base_inverted_weapon.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("Hold Shift for more info...").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}