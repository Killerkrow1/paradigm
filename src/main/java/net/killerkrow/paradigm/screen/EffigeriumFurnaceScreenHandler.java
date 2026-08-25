package net.killerkrow.paradigm.screen;

import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class EffigeriumFurnaceScreenHandler extends AbstractFurnaceScreenHandler {
    public EffigeriumFurnaceScreenHandler(int i, PlayerInventory playerInventory) {
        super(ParadigmMod.KILN_SCREEN_HANDLER, ParadigmMod.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory);
    }

    public EffigeriumFurnaceScreenHandler(int i, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(ParadigmMod.KILN_SCREEN_HANDLER, ParadigmMod.KILN_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory, inventory, propertyDelegate);
    }
}