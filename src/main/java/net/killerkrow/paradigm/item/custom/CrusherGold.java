package net.killerkrow.paradigm.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrusherGold extends MiningToolItem {
    public CrusherGold(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        // Creates a new, undamaged copy of the tool to remain in the grid
        return new ItemStack(this);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            // Check if the player is falling (distance in blocks)
            double fallDistance = player.fallDistance;

            if (fallDistance > 1.5F) {
                // Calculate bonus damage based on fall height
                float smashDamage = (float) (fallDistance * 1.5F); // Adjust multiplier as desired

                // Deal the smash damage
                target.damage(attacker.getDamageSources().playerAttack(player), smashDamage);

                // Negate fall damage like a Mace
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