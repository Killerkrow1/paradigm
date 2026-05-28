package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.util.ModTags;
import net.minecraft.block.FlowerBlock;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.REVERENCE_BERRY, 4)
                .input(ItemTags.FLOWERS)
                .input(ItemTags.FLOWERS)
                .input(Items.GLOW_BERRIES)
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(Items.GLOW_BERRIES))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "reverence_berry"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ATLAS_COOKING_KNIFE)
                .pattern("  I")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "atlas_cooking_knife"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BOWL_OF_REVERENCE_BERRIES)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BNB")
                .input('B', ModItems.REVERENCE_BERRY)
                .input('N', Items.BOWL)
                .criterion(hasItem(ModItems.REVERENCE_BERRY), conditionsFromItem(ModItems.REVERENCE_BERRY))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "bowl_of_reverence_berries"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EFFIGERIUM_DUST)
                .input(ModTags.Items.CRUSHER_ITEM)
                .input(ModItems.EFFIGERIUM_INGOT)
                .criterion(hasItem(ModItems.WOODEN_CRUSHER), conditionsFromItem(ModItems.WOODEN_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "effigerium_dust"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GILDEN_DUST)
                .input(ModTags.Items.CRUSHER_ITEM)
                .input(ModItems.GILDEN_INGOT)
                .criterion(hasItem(ModItems.WOODEN_CRUSHER), conditionsFromItem(ModItems.WOODEN_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_dust"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRODIUM_DUST)
                .input(ModTags.Items.CRUSHER_ITEM)
                .input(ModItems.GRODIUM_INGOT)
                .criterion(hasItem(ModItems.WOODEN_CRUSHER), conditionsFromItem(ModItems.WOODEN_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "grodium_dust"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IMPERIUM_DUST)
                .input(ModTags.Items.CRUSHER_ITEM)
                .input(ModItems.IMPERIUM_INGOT)
                .criterion(hasItem(ModItems.WOODEN_CRUSHER), conditionsFromItem(ModItems.WOODEN_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "imperium_dust"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BROKEN_HEART)
                .input(ModTags.Items.CRUSHER_ITEM)
                .input(ModItems.CHARGED_HEART)
                .criterion(hasItem(ModItems.WOODEN_CRUSHER), conditionsFromItem(ModItems.WOODEN_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "broken_heart"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOD_FAVOR)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .criterion(hasItem(ModItems.GILDEN_ORE), conditionsFromItem(ModItems.GILDEN_ORE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "god_favor"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEMIGOD_FAVOR)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .input(ModTags.Items.FAVOR_ITEM)
                .criterion(hasItem(ModItems.GILDEN_ORE), conditionsFromItem(ModItems.GILDEN_ORE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "demigod_favor"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FAVOR_OF_DIVINITY)
                .input(ModItems.GOD_FAVOR)
                .input(ModItems.DEMIGOD_FAVOR)
                .criterion(hasItem(ModItems.GOD_FAVOR), conditionsFromItem(ModItems.GOD_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "favor_of_divinity"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_CRUSHER)
                .pattern(" BB")
                .pattern(" SB")
                .pattern("C  ")
                .input('B',ItemTags.PLANKS)
                .input('S', Items.STICK)
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "wooden_crusher"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STONE_CRUSHER)
                .pattern(" BB")
                .pattern("CSB")
                .pattern("CC ")
                .input('B',ItemTags.STONE_TOOL_MATERIALS)
                .input('S', ModItems.WOODEN_CRUSHER)
                .input('C', Items.FLINT)
                .criterion(hasItem(ModItems.WOODEN_CRUSHER), conditionsFromItem(ModItems.WOODEN_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "stone_crusher"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_CRUSHER)
                .pattern(" BB")
                .pattern("CSB")
                .pattern("CC ")
                .input('B',Items.IRON_INGOT)
                .input('S', ModItems.STONE_CRUSHER)
                .input('C', Items.BONE)
                .criterion(hasItem(ModItems.STONE_CRUSHER), conditionsFromItem(ModItems.STONE_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "iron_crusher"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOLD_CRUSHER)
                .pattern(" BB")
                .pattern("CSB")
                .pattern("RC ")
                .input('B',Items.GOLD_INGOT)
                .input('S', ModItems.IRON_CRUSHER)
                .input('C', Items.LAPIS_LAZULI)
                .input('R', Items.REDSTONE)
                .criterion(hasItem(ModItems.IRON_CRUSHER), conditionsFromItem(ModItems.IRON_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gold_crusher"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JADE_CRUSHER)
                .pattern(" BB")
                .pattern("BSB")
                .pattern("BB ")
                .input('B',Items.EMERALD)
                .input('S', ModItems.GOLD_CRUSHER)
                .criterion(hasItem(ModItems.GOLD_CRUSHER), conditionsFromItem(ModItems.GOLD_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "jade_crusher"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_CRUSHER)
                .pattern(" BB")
                .pattern("CSB")
                .pattern("CC ")
                .input('B',Items.DIAMOND)
                .input('S', ModItems.JADE_CRUSHER)
                .input('C', Items.HEART_OF_THE_SEA)
                .criterion(hasItem(ModItems.JADE_CRUSHER), conditionsFromItem(ModItems.JADE_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "diamond_crusher"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_CRUSHER)
                .pattern(" QB")
                .pattern("CSQ")
                .pattern("QC ")
                .input('B',Items.NETHERITE_INGOT)
                .input('Q',Items.NETHERITE_SCRAP)
                .input('S', ModItems.DIAMOND_CRUSHER)
                .input('C', Items.BLAZE_ROD)
                .criterion(hasItem(ModItems.DIAMOND_CRUSHER), conditionsFromItem(ModItems.DIAMOND_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "netherite_crusher"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GILDEN_BLADE)
                .pattern(" G ")
                .pattern("RGR")
                .pattern(" S ")
                .input('S',Items.STICK)
                .input('G', ModItems.GILDEN_INGOT)
                .input('R', ModItems.GILDEN_ORE)
                .criterion(hasItem(ModItems.GILDEN_INGOT), conditionsFromItem(ModItems.GILDEN_INGOT))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_blade"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GILDEN_CROWN)
                .pattern("GGG")
                .pattern("G G")
                .pattern("   ")
                .input('G',ModItems.GILDEN_INGOT)
                .criterion(hasItem(ModItems.GILDEN_INGOT), conditionsFromItem(ModItems.GILDEN_INGOT))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_crown"));



        ItemConvertible rawImperiemItem = ModItems.IMPERIUM_ROYALIUM;
        ItemConvertible cookedImperiumItem = ModItems.IMPERIUM_INGOT;
        ItemConvertible rawEffigeriumItem = ModItems.EFFIGERIUM_SHARDS;
        ItemConvertible cookedEffigeriumItem = ModItems.EFFIGERIUM_INGOT;

        // --- Smelting ---
        // offerSmelting takes: exporter, input, category, output, experience, cookingTime, group
        offerSmelting(exporter, List.of(rawEffigeriumItem), RecipeCategory.MISC, cookedEffigeriumItem, 200.0f,
                72000, "effigerium_ingot_furnace");
        offerSmelting(exporter, List.of(rawImperiemItem), RecipeCategory.MISC, cookedImperiumItem, 2.0f,
                200, "imperium_ingot_furnace");

        // --- Blasting ---
        // offerBlasting takes the same parameters, but uses a shorter cooking time (e.g., 100 ticks)
        offerBlasting(exporter, List.of(rawEffigeriumItem), RecipeCategory.MISC, cookedEffigeriumItem, 200.0f,
                72000, "effigerium_ingot_blasting");
        offerBlasting(exporter, List.of(rawImperiemItem), RecipeCategory.MISC, cookedImperiumItem, 20.0f,
                200, "imperium_ingot_blasting");
    }
}
