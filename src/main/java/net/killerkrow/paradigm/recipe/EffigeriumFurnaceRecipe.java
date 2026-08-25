package net.killerkrow.paradigm.recipe;

import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.util.Identifier;

public class EffigeriumFurnaceRecipe extends AbstractCookingRecipe {
    public EffigeriumFurnaceRecipe(Identifier id, String group, CookingRecipeCategory category, Ingredient input, ItemStack output, float experience, int cookTime) {
        super(ParadigmMod.KILN_RECIPE_TYPE, id, group, category, input, output, experience, cookTime);
    }

    @Override
    public RecipeSerializer<EffigeriumFurnaceRecipe> getSerializer() {
        return ParadigmMod.KILN_RECIPE_SERIALIZER;
    }
}