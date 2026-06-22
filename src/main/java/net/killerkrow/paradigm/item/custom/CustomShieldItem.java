package net.killerkrow.paradigm.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killerkrow.paradigm.util.ModRarities;
import net.killerkrow.paradigm.util.ParadigmToolMaterials;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomShieldItem extends ShieldItem implements Vanishable {
    private final ModRarities rarity;

    public CustomShieldItem(ToolMaterial toolMaterial, Item.Settings settings, ModRarities rarity) {
        super(settings);
        this.rarity = rarity;
    }

    @Override
    public Text getName(ItemStack stack) {
        Text baseName = super.getName(stack);

        return baseName.copy().setStyle(Style.EMPTY.withColor(rarity.color));
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        // Creates a new, undamaged copy of the tool to remain in the grid
        return new ItemStack(this);
    }

    // tooltip
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.paradigm.base_god_weapon.tooltip").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("[SHIFT]").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

}
