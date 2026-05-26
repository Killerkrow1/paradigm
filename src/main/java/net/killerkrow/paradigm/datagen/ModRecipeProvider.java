package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> EFFIGERIUM_SMELT = List.of(ModItems.EFFIGERIUM_SHARDS);


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRONCHAIN_HELMET, 1)
                .input(Items.CHAIN, 3)
                .input(Items.IRON_HELMET)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "ironchain_helmet"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRONCHAIN_CHESTPLATE, 1)
                .input(Items.CHAIN, 3)
                .input(Items.IRON_CHESTPLATE)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "ironchain_chestplate"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRONCHAIN_LEGGINGS, 1)
                .input(Items.CHAIN, 3)
                .input(Items.IRON_LEGGINGS)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "ironchain_leggings"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRONCHAIN_BOOTS, 1)
                .input(Items.CHAIN, 3)
                .input(Items.IRON_BOOTS)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "ironchain_boots"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMONDCHAIN_HELMET, 1)
                .input(Items.CHAIN, 3)
                .input(Items.DIAMOND_HELMET)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "diamondchain_helmet"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMONDCHAIN_CHESTPLATE, 1)
                .input(Items.CHAIN, 3)
                .input(Items.DIAMOND_CHESTPLATE)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "diamondchain_chestplate"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMONDCHAIN_LEGGINGS, 1)
                .input(Items.CHAIN, 3)
                .input(Items.DIAMOND_LEGGINGS)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "diamondchain_leggings"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMONDCHAIN_BOOTS, 1)
                .input(Items.CHAIN, 3)
                .input(Items.DIAMOND_BOOTS)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "diamondchain_boots"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITECHAIN_HELMET, 1)
                .input(Items.CHAIN, 3)
                .input(Items.NETHERITE_HELMET)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "netheritechain_helmet"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITECHAIN_CHESTPLATE, 1)
                .input(Items.CHAIN, 3)
                .input(Items.NETHERITE_CHESTPLATE)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "netheritechain_chestplate"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITECHAIN_LEGGINGS, 1)
                .input(Items.CHAIN, 3)
                .input(Items.NETHERITE_LEGGINGS)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "netheritechain_leggings"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITECHAIN_BOOTS, 1)
                .input(Items.CHAIN, 3)
                .input(Items.NETHERITE_BOOTS)
                .criterion(hasItem(Items.CHAIN), conditionsFromItem(Items.CHAIN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "netheritechain_boots"));

    }
}
