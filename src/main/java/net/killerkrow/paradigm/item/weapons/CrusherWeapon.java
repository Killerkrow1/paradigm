package net.killerkrow.paradigm.item.weapons;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrusherWeapon extends MiningToolItem {
    public CrusherWeapon(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }

    // FUCK YOU, YOU GET AN UNDAMAGED COPY WHEN CRAFTING
    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return new ItemStack(this);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            // ARE YOU FALLING? GOOD
            double fallDistance = player.fallDistance;

            if (fallDistance > 1.5F) {
                // Maths for bonus damage for how you fall
                float smashDamage = (float) (fallDistance * 1.5F); // 1.5 IS THE BASE, you can increase it tho

                // Hammer go brrrrrrrrrrr
                target.damage(attacker.getDamageSources().playerAttack(player), smashDamage);

                // I could be really funny... but setting this to 0 negates fall damage
                player.fallDistance = 0.0F;

                player.sendMessage(Text.literal("Crushed the target!"));
            }
        }
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
        tooltip.add(Text.literal("Crush Attack: Deals bonus damage while falling!").formatted(Formatting.GOLD));
        } else {
            tooltip.add(Text.literal("Hold Shift for more info...").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}