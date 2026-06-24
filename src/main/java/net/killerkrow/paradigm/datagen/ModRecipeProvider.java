package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.fluids.ModFluids;
import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

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

        // Greater Favor Recipes
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOD_FAVOR)
                .input(ModItems.ATLAS_FAVOR)
                .input(ModItems.NOVINGARD_FAVOR)
                .input(ModItems.ASTRAL_FAVOR)
                .input(ModItems.GERO_FAVOR)
                .input(ModItems.ISMENE_FAVOR)
                .input(ModItems.ULTIMUS_FAVOR)
                .input(ModItems.UNKNOWN_FAVOR)
                .input(ModItems.SMILEY_FAVOR)
                .input(ModItems.NERA_FAVOR)
                .criterion(hasItem(ModItems.GILDEN_ORE), conditionsFromItem(ModItems.GILDEN_ORE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "god_favor"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEMIGOD_FAVOR)
                .input(ModItems.SPECTER_FAVOR)
                .input(ModItems.INVICTUS_FAVOR)
                .input(ModItems.SHADOW_FAVOR)
                .input(ModItems.YETI_FAVOR)
                .input(ModItems.ZAPA_FAVOR)
                .input(ModItems.PUMPKIN_FAVOR)
                .input(ModItems.CASTIEL_FAVOR)
                .input(ModItems.TOGG_FAVOR)
                .input(ModItems.VELEN_FAVOR)
                .criterion(hasItem(ModItems.GILDEN_ORE), conditionsFromItem(ModItems.GILDEN_ORE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "demigod_favor"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FAVOR_OF_DIVINITY)
                .input(ModItems.GOD_FAVOR)
                .input(ModItems.DEMIGOD_FAVOR)
                .input(ModItems.BLANK_FAVOR)
                .criterion(hasItem(ModItems.GOD_FAVOR), conditionsFromItem(ModItems.GOD_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "favor_of_divinity"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REVERENCE_BERRY)
                .input(ModItems.REVERENCE_STEM)
                .input(Items.GLOW_BERRIES)
                .criterion(hasItem(ModItems.REVERENCE_STEM), conditionsFromItem(ModItems.REVERENCE_STEM))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "stem_to_berry"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JADE_BRICK, 9)
                .input(ModBlocks.JADE_BLOCK)
                .criterion(hasItem(ModItems.REVERENCE_STEM), conditionsFromItem(ModItems.REVERENCE_STEM))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "jade_block_to_ingot"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.JADE_BLOCK)
                .input(ModItems.JADE_BRICK)
                .input(ModItems.JADE_BRICK)
                .input(ModItems.JADE_BRICK)
                .input(ModItems.JADE_BRICK)
                .input(ModItems.JADE_BRICK)
                .input(ModItems.JADE_BRICK)
                .input(ModItems.JADE_BRICK)
                .input(ModItems.JADE_BRICK)
                .input(ModItems.JADE_BRICK)
                .criterion(hasItem(ModItems.REVERENCE_STEM), conditionsFromItem(ModItems.REVERENCE_STEM))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "jade_ingot_to_block"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SOUL_CHARGED_LANTERN)
                .input(Blocks.LANTERN)
                .input(ModItems.SOUL)
                .criterion(hasItem(ModItems.SOUL), conditionsFromItem(ModItems.SOUL))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "soul_charged_lantern"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.JADE_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.JADE_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "jade_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.AFTERLIFE_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.AFTERLIFE_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "afterlife_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.ESOTERIC_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.ESOTERIC_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "esoteric_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.SOUL_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.SOUL_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "soul_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.DEMIGOD_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.DEMIGOD_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "demigod_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.SEMIGOD_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.SEMIGOD_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "semigod_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.REVERENCE_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.REVERENCE_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "reverence_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.LUNAR_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.LUNAR_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "lunar_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.SOLAR_EFFIGY_BUCKET)
                .input(ModItems.EFFIGY_EXTRACTOR)
                .input(ModItems.SOLAR_EFFIGY)
                .criterion(hasItem(ModItems.EFFIGY_EXTRACTOR), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "solar_bucket"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModFluids.GOD_EFFIGY_BUCKET)
                .input(ModFluids.JADE_EFFIGY_BUCKET)
                .input(ModFluids.AFTERLIFE_EFFIGY_BUCKET)
                .input(ModFluids.ESOTERIC_EFFIGY_BUCKET)
                .input(ModFluids.SOUL_EFFIGY_BUCKET)
                .input(ModFluids.DEMIGOD_EFFIGY_BUCKET)
                .input(ModFluids.SEMIGOD_EFFIGY_BUCKET)
                .input(ModFluids.REVERENCE_EFFIGY_BUCKET)
                .input(ModFluids.LUNAR_EFFIGY_BUCKET)
                .input(ModFluids.SOLAR_EFFIGY_BUCKET)
                .criterion(hasItem(ModFluids.AFTERLIFE_EFFIGY_BUCKET), conditionsFromItem(ModItems.EFFIGY_EXTRACTOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "god_bucket"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.WOLFSBANE)
                .criterion(hasItem(ModBlocks.WOLFSBANE), conditionsFromItem(ModBlocks.WOLFSBANE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_wolfsbane"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CYAN_DYE)
                .input(ModBlocks.KAGAMI_BUD)
                .criterion(hasItem(ModBlocks.KAGAMI_BUD), conditionsFromItem(ModBlocks.KAGAMI_BUD))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_kagami_bud"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE)
                .input(ModBlocks.ROOTFERN)
                .criterion(hasItem(ModBlocks.ROOTFERN), conditionsFromItem(ModBlocks.ROOTFERN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_rootfern"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE)
                .input(ModBlocks.AKAMI_ROSE)
                .criterion(hasItem(ModBlocks.AKAMI_ROSE), conditionsFromItem(ModBlocks.AKAMI_ROSE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_akami_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.MOONBLOOM)
                .criterion(hasItem(ModBlocks.MOONBLOOM), conditionsFromItem(ModBlocks.MOONBLOOM))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_moonbloom"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLACK_DYE)
                .input(ModBlocks.SILVERTHORN)
                .criterion(hasItem(ModBlocks.SILVERTHORN), conditionsFromItem(ModBlocks.SILVERTHORN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_silverthorn"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.DAWN_LILLY)
                .criterion(hasItem(ModBlocks.DAWN_LILLY), conditionsFromItem(ModBlocks.DAWN_LILLY))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_dawn_lilly"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.STARBRIGHT_PETAL)
                .criterion(hasItem(ModBlocks.STARBRIGHT_PETAL), conditionsFromItem(ModBlocks.STARBRIGHT_PETAL))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_starbright_petal"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.RENMI)
                .criterion(hasItem(ModBlocks.RENMI), conditionsFromItem(ModBlocks.RENMI))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_renmi"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.GILDED_ORCHID)
                .criterion(hasItem(ModBlocks.GILDED_ORCHID), conditionsFromItem(ModBlocks.GILDED_ORCHID))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_gilded_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.THORNSHADE)
                .criterion(hasItem(ModBlocks.THORNSHADE), conditionsFromItem(ModBlocks.THORNSHADE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_thornshade"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GRAY_DYE)
                .input(ModBlocks.MISTVINE)
                .criterion(hasItem(ModBlocks.MISTVINE), conditionsFromItem(ModBlocks.MISTVINE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_mistvine"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.GLOWFERN)
                .criterion(hasItem(ModBlocks.GLOWFERN), conditionsFromItem(ModBlocks.GLOWFERN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_glowfern"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.FROST_PETAL)
                .criterion(hasItem(ModBlocks.FROST_PETAL), conditionsFromItem(ModBlocks.FROST_PETAL))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_frost_petal"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.EMBERLOTUS)
                .criterion(hasItem(ModBlocks.EMBERLOTUS), conditionsFromItem(ModBlocks.EMBERLOTUS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_emberlotus"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.SPECTRAL_ORCHID)
                .criterion(hasItem(ModBlocks.SPECTRAL_ORCHID), conditionsFromItem(ModBlocks.SPECTRAL_ORCHID))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_spectral_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.PHANTOM_LACE)
                .criterion(hasItem(ModBlocks.PHANTOM_LACE), conditionsFromItem(ModBlocks.PHANTOM_LACE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_phanom_lace"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.VOIDMOSS)
                .criterion(hasItem(ModBlocks.VOIDMOSS), conditionsFromItem(ModBlocks.VOIDMOSS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_voidmoss"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.SCARLET_CURL)
                .criterion(hasItem(ModBlocks.SCARLET_CURL), conditionsFromItem(ModBlocks.SCARLET_CURL))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_scarlet_curl"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.STARSHADE)
                .criterion(hasItem(ModBlocks.STARSHADE), conditionsFromItem(ModBlocks.STARSHADE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_starshade"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIME_DYE)
                .input(ModBlocks.BRIMROSE)
                .criterion(hasItem(ModBlocks.BRIMROSE), conditionsFromItem(ModBlocks.BRIMROSE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_brimrose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GREEN_DYE)
                .input(ModBlocks.GLASSLEAF)
                .criterion(hasItem(ModBlocks.GLASSLEAF), conditionsFromItem(ModBlocks.GLASSLEAF))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_grassleaf"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.FLAMESPIRE)
                .criterion(hasItem(ModBlocks.FLAMESPIRE), conditionsFromItem(ModBlocks.FLAMESPIRE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_flamespire"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.LUNAR_PEONY)
                .criterion(hasItem(ModBlocks.LUNAR_PEONY), conditionsFromItem(ModBlocks.LUNAR_PEONY))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_lunar_peony"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.BLOOMCROWN)
                .criterion(hasItem(ModBlocks.BLOOMCROWN), conditionsFromItem(ModBlocks.BLOOMCROWN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_bloomcrown"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.INFERNO_BELL)
                .criterion(hasItem(ModBlocks.INFERNO_BELL), conditionsFromItem(ModBlocks.INFERNO_BELL))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_inferno_bell"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.SEARLING)
                .criterion(hasItem(ModBlocks.SEARLING), conditionsFromItem(ModBlocks.SEARLING))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_searling"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLACK_DYE)
                .input(ModBlocks.EBON_ROSE)
                .criterion(hasItem(ModBlocks.EBON_ROSE), conditionsFromItem(ModBlocks.EBON_ROSE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_ebon_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.FADEWISP)
                .criterion(hasItem(ModBlocks.FADEWISP), conditionsFromItem(ModBlocks.FADEWISP))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_fadewisp"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.GLOOMVINE)
                .criterion(hasItem(ModBlocks.GLOOMVINE), conditionsFromItem(ModBlocks.GLOOMVINE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_gloomvine"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.EMBERBRUSH)
                .criterion(hasItem(ModBlocks.EMBERBRUSH), conditionsFromItem(ModBlocks.EMBERBRUSH))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_emberbrush"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.SPIRESAGE)
                .criterion(hasItem(ModBlocks.SPIRESAGE), conditionsFromItem(ModBlocks.SPIRESAGE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_spiresage"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.BRIGHTBLOOM)
                .criterion(hasItem(ModBlocks.BRIGHTBLOOM), conditionsFromItem(ModBlocks.BRIGHTBLOOM))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_brightbloom"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.MIRAGE_LOTUS)
                .criterion(hasItem(ModBlocks.MIRAGE_LOTUS), conditionsFromItem(ModBlocks.MIRAGE_LOTUS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_mirage_lotus"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.SHADOWTHORN)
                .criterion(hasItem(ModBlocks.SHADOWTHORN), conditionsFromItem(ModBlocks.SHADOWTHORN))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_shadowthorn"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIME_DYE)
                .input(ModBlocks.HANME)
                .criterion(hasItem(ModBlocks.HANME), conditionsFromItem(ModBlocks.HANME))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_hanme"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.ASHEN_BUD)
                .criterion(hasItem(ModBlocks.ASHEN_BUD), conditionsFromItem(ModBlocks.ASHEN_BUD))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "dye_ashen_bud"));

        // Crusher Recipes
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
                .input('B',ModItems.JADE_BRICK)
                .input('S', ModItems.GOLD_CRUSHER)
                .criterion(hasItem(ModItems.GOLD_CRUSHER), conditionsFromItem(ModItems.GOLD_CRUSHER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "jade_crusher"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_CRUSHER)
                .pattern(" BB")
                .pattern("PSB")
                .pattern("CP ")
                .input('B',Items.DIAMOND)
                .input('S', ModItems.JADE_CRUSHER)
                .input('C', Items.HEART_OF_THE_SEA)
                .input('P', Items.PRISMARINE_SHARD)
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

        //Gilden Recipes
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GILDEN_BRICKS)
                .pattern("GG ")
                .pattern("GG ")
                .pattern("   ")
                .input('G',ModItems.GILDEN_INGOT)
                .criterion(hasItem(ModItems.GILDEN_INGOT), conditionsFromItem(ModItems.GILDEN_INGOT))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_brick"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GILDEN_BRICK_STAIRS, 4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .input('G',ModBlocks.GILDEN_BRICKS)
                .criterion(hasItem(ModBlocks.GILDEN_BRICKS), conditionsFromItem(ModBlocks.GILDEN_BRICKS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_brick_stairs"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GILDEN_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("GGG")
                .pattern("   ")
                .input('G',ModBlocks.GILDEN_BRICKS)
                .criterion(hasItem(ModBlocks.GILDEN_BRICKS), conditionsFromItem(ModBlocks.GILDEN_BRICKS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_brick_slab"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GILDEN_BRICK_WALL, 6)
                .pattern("   ")
                .pattern("GGG")
                .pattern("GGG")
                .input('G',ModBlocks.GILDEN_BRICKS)
                .criterion(hasItem(ModBlocks.GILDEN_BRICKS), conditionsFromItem(ModBlocks.GILDEN_BRICKS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_brick_wall"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRACKED_GILDEN_BRICK_STAIRS, 4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .input('G',ModBlocks.CRACKED_GILDEN_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_GILDEN_BRICKS), conditionsFromItem(ModBlocks.CRACKED_GILDEN_BRICKS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "cracked_gilden_brick_stairs"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRACKED_GILDEN_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("GGG")
                .pattern("   ")
                .input('G',ModBlocks.CRACKED_GILDEN_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_GILDEN_BRICKS), conditionsFromItem(ModBlocks.CRACKED_GILDEN_BRICKS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "cracked_gilden_brick_slab"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRACKED_GILDEN_BRICK_WALL, 6)
                .pattern("   ")
                .pattern("GGG")
                .pattern("GGG")
                .input('G',ModBlocks.CRACKED_GILDEN_BRICKS)
                .criterion(hasItem(ModBlocks.CRACKED_GILDEN_BRICKS), conditionsFromItem(ModBlocks.CRACKED_GILDEN_BRICKS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "cracked_gilden_brick_wall"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GILDEN_PILLAR, 6)
                .pattern(" G ")
                .pattern(" G ")
                .pattern("   ")
                .input('G',ModBlocks.GILDEN_BRICK_SLAB)
                .criterion(hasItem(ModBlocks.GILDEN_BRICKS), conditionsFromItem(ModBlocks.GILDEN_BRICKS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_pillar"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GILDEN_ICON, 6)
                .pattern(" G ")
                .pattern("GSG")
                .pattern(" G ")
                .input('G',ModItems.GILDEN_INGOT)
                .input('S',Blocks.GLASS)
                .criterion(hasItem(ModItems.GILDEN_INGOT), conditionsFromItem(ModItems.GILDEN_INGOT))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gilden_icon"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHARGED_HEART)
                .pattern(" S ")
                .pattern("EDE")
                .pattern(" I ")
                .input('S',Blocks.SCULK_SHRIEKER)
                .input('D',ModItems.DEAD_HEART)
                .input('I',Items.DIAMOND)
                .input('E',Items.ECHO_SHARD)
                .criterion(hasItem(ModItems.DEAD_HEART), conditionsFromItem(ModItems.DEAD_HEART))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "charged_heart"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SKULL_SCYTHE)
                .pattern("IES")
                .pattern(" B ")
                .pattern("B  ")
                .input('S',Blocks.SKELETON_SKULL)
                .input('I',Items.IRON_INGOT)
                .input('E',Items.ECHO_SHARD)
                .input('B',Items.BONE)
                .criterion(hasItem(Blocks.SKELETON_SKULL), conditionsFromItem(Blocks.SKELETON_SKULL))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "skull_scythe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ECLIPSE_SHARD)
                .pattern("GAG")
                .pattern("MCS")
                .pattern("GAG")
                .input('S',ModItems.SUN_SHARD)
                .input('M',ModItems.MOON_SHARD)
                .input('G',ModItems.GRODIUM_CRYSTALS)
                .input('A',Items.AMETHYST_SHARD)
                .input('C',Items.CLOCK)
                .criterion(hasItem(ModItems.MOON_SHARD), conditionsFromItem(ModItems.MOON_SHARD))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "eclipse_shard"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ECLIPSE_EFFIGY)
                .pattern(" F ")
                .pattern("LES")
                .pattern(" N ")
                .input('E',ModItems.ECLIPSE_SHARD)
                .input('S',ModItems.SOLAR_EFFIGY)
                .input('L',ModItems.LUNAR_EFFIGY)
                .input('N',Items.NETHERITE_INGOT)
                .input('F',Blocks.VERDANT_FROGLIGHT)
                .criterion(hasItem(ModItems.ECLIPSE_SHARD), conditionsFromItem(ModItems.ECLIPSE_SHARD))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "eclipse_effigy"));

        // Favor recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ATLAS_BINDMENT)
                .pattern("BOB")
                .pattern("OAO")
                .pattern("BOB")
                .input('O',Items.GOLD_INGOT)
                .input('B',Items.BOOK)
                .input('A',ModItems.ATLAS_FAVOR)
                .criterion(hasItem(ModItems.ATLAS_FAVOR), conditionsFromItem(ModItems.ATLAS_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "atlas_bindment"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NOVINGARD_BINDMENT)
                .pattern("BOB")
                .pattern("OAO")
                .pattern("BOB")
                .input('O',Items.END_STONE)
                .input('B',Items.BOOK)
                .input('A',ModItems.ATLAS_FAVOR)
                .criterion(hasItem(ModItems.ATLAS_FAVOR), conditionsFromItem(ModItems.ATLAS_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "novingard_bindment"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ASTRAL_BINDMENT)
                .pattern("BOB")
                .pattern("OAO")
                .pattern("BOB")
                .input('O',ItemTags.FLOWERS)
                .input('B',Items.BOOK)
                .input('A',ModItems.ATLAS_FAVOR)
                .criterion(hasItem(ModItems.ATLAS_FAVOR), conditionsFromItem(ModItems.ATLAS_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "astral_bindment"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GERO_BINDMENT)
                .pattern("BOB")
                .pattern("OAO")
                .pattern("BOB")
                .input('O',Items.NETHERRACK)
                .input('B',Items.BOOK)
                .input('A',ModItems.ATLAS_FAVOR)
                .criterion(hasItem(ModItems.ATLAS_FAVOR), conditionsFromItem(ModItems.ATLAS_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "gero_bindment"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ISMENE_BINDMENT)
                .pattern("BOB")
                .pattern("OAO")
                .pattern("BOB")
                .input('O',Items.CLOCK)
                .input('B',Items.BOOK)
                .input('A',ModItems.ATLAS_FAVOR)
                .criterion(hasItem(ModItems.ATLAS_FAVOR), conditionsFromItem(ModItems.ATLAS_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "ismene_bindment"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ULTIMUS_BINDMENT)
                .pattern("BOB")
                .pattern("OAO")
                .pattern("BOB")
                .input('O',Items.GUNPOWDER)
                .input('B',Items.BOOK)
                .input('A',ModItems.ATLAS_FAVOR)
                .criterion(hasItem(ModItems.ATLAS_FAVOR), conditionsFromItem(ModItems.ATLAS_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "ultimus_bindment"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.UNKNOWN_BINDMENT)
                .pattern("BOB")
                .pattern("OAO")
                .pattern("BOB")
                .input('O',Items.ROTTEN_FLESH)
                .input('B',Items.BOOK)
                .input('A',ModItems.ATLAS_FAVOR)
                .criterion(hasItem(ModItems.ATLAS_FAVOR), conditionsFromItem(ModItems.ATLAS_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "unknown_bindment"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SOUL_DEAL)
                .pattern("BOB")
                .pattern("PSP")
                .pattern("BOB")
                .input('P',Items.BOOK)
                .input('O',Items.PAPER)
                .input('B',Blocks.SOUL_SAND)
                .input('S',ModItems.SHADOW_FAVOR)
                .criterion(hasItem(ModItems.SHADOW_FAVOR), conditionsFromItem(ModItems.SHADOW_FAVOR))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "soul_deal"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JADE_EFFIGY)
                .pattern("JIJ")
                .pattern("CJH")
                .pattern("JIJ")
                .input('C',ModItems.CHARGED_EMPTY_JADE_EFFIGY)
                .input('J',ModBlocks.GILDEN_JADE_BLOCK)
                .input('H',ModItems.JADE_HEART)
                .input('I',ModTags.Items.JADE_BRICK)
                .criterion(hasItem(ModItems.JADE_HEART), conditionsFromItem(ModItems.JADE_HEART))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "jade_effigy"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REVERENCE_EFFIGY)
                .pattern("JIJ")
                .pattern("CJH")
                .pattern("JKJ")
                .input('C',ModItems.CHARGED_EMPTY_REVERENCE_EFFIGY)
                .input('J',ModBlocks.REVERENCE_BERRY_SACK)
                .input('H',ModItems.REVERENCE_IDOL)
                .input('I',ModItems.REVERENCE_STEM)
                .input('K',ModItems.REVERENCE_BERRY)
                .criterion(hasItem(ModItems.REVERENCE_IDOL), conditionsFromItem(ModItems.REVERENCE_IDOL))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "reverence_effigy"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AFTERLIFE_EFFIGY)
                .pattern("JIJ")
                .pattern("CJH")
                .pattern("JIJ")
                .input('C',ModItems.CHARGED_EMPTY_REVERENCE_EFFIGY)
                .input('H',ModItems.TOTEM_OF_DEATH)
                .input('I',ModItems.CRUCIFIED_BONE)
                .input('J',ModBlocks.CRUCIFIED_BONE_BLOCK)
                .criterion(hasItem(ModItems.TOTEM_OF_DEATH), conditionsFromItem(ModItems.TOTEM_OF_DEATH))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "afterlife_effigy"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SOUL_EFFIGY)
                .pattern("JIJ")
                .pattern("CJH")
                .pattern("JIJ")
                .input('C',ModItems.CHARGED_EMPTY_SOUL_EFFIGY)
                .input('H',ModItems.SOUL_EXTRACTER)
                .input('I',ModItems.IMPERIUM_DUST)
                .input('J',Items.SCULK_SHRIEKER)
                .criterion(hasItem(ModItems.SOUL_EXTRACTER), conditionsFromItem(ModItems.SOUL_EXTRACTER))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "soul_effigy"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LUNAR_EFFIGY)
                .pattern("JIJ")
                .pattern("CJH")
                .pattern("JIJ")
                .input('C',ModItems.CHARGED_EMPTY_LUNAR_EFFIGY)
                .input('H',ModItems.MOON_SHARD)
                .input('I',Blocks.CALCITE)
                .input('J',Blocks.PEARLESCENT_FROGLIGHT)
                .criterion(hasItem(ModItems.MOON_SHARD), conditionsFromItem(ModItems.MOON_SHARD))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "lunar_effigy"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SOLAR_EFFIGY)
                .pattern("JIJ")
                .pattern("CJH")
                .pattern("JIJ")
                .input('C',ModItems.CHARGED_EMPTY_SOLAR_EFFIGY)
                .input('H',ModItems.SUN_SHARD)
                .input('I',Blocks.MAGMA_BLOCK)
                .input('J',Blocks.VERDANT_FROGLIGHT)
                .criterion(hasItem(ModItems.SUN_SHARD), conditionsFromItem(ModItems.SUN_SHARD))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "solar_effigy"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEMIGOD_EFFIGY)
                .pattern("JIJ")
                .pattern("CJH")
                .pattern("JIJ")
                .input('C',ModItems.CHARGED_EMPTY_SEMI_EFFIGY)
                .input('H',ModItems.SPARK_OF_SEMI)
                .input('I',ModItems.GRODIUM_INGOT)
                .input('J',Blocks.NETHERITE_BLOCK)
                .criterion(hasItem(ModItems.SPARK_OF_SEMI), conditionsFromItem(ModItems.SPARK_OF_SEMI))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "semigod_effigy"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEMIGOD_EFFIGY)
                .pattern("JIJ")
                .pattern("CJH")
                .pattern("JIJ")
                .input('C',ModItems.CHARGED_EMPTY_DEMI_EFFIGY)
                .input('H',ModItems.DEMIGOD_EFFIGY_REMAINS)
                .input('I',ModItems.EFFIGERIUM_SHARDS)
                .input('J',Blocks.BEACON)
                .criterion(hasItem(ModItems.DEMIGOD_EFFIGY_REMAINS), conditionsFromItem(ModItems.DEMIGOD_EFFIGY_REMAINS))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "demigod_effigy"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ESOTERIC_EFFIGY)
                .pattern("JIJ")
                .pattern("CEH")
                .pattern("JIJ")
                .input('C',ModItems.CHARGED_EMPTY_ESOTERIC_EFFIGY)
                .input('H',ModItems.ESOTERIC_CORE)
                .input('E',ModItems.ELDRITCH_RITE)
                .input('I',ModItems.EFFIGERIUM_SHARDS)
                .input('J',ModBlocks.BUDDING_GILDEN_BLOCK)
                .criterion(hasItem(ModItems.ESOTERIC_CORE), conditionsFromItem(ModItems.ESOTERIC_CORE))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "esoteric_effigy"));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOD_EFFIGY)
                .pattern("ARS")
                .pattern("TEF")
                .pattern("DQG")
                .input('A',ModItems.AFTERLIFE_EFFIGY)
                .input('R',ModFluids.GOD_EFFIGY_BUCKET)
                .input('S',ModItems.SOUL_EFFIGY)
                .input('T',ModItems.EFFIGY_EXTRACT)
                .input('E',ModItems.EFFIGY_CORE)
                .input('F',ModItems.FAVOR_OF_DIVINITY)
                .input('D',ModItems.DEMIGOD_EFFIGY)
                .input('Q',ModItems.MARK_OF_THE_ARCHITECT)
                .input('G',ModItems.SEMIGOD_EFFIGY)
                .criterion(hasItem(ModItems.MARK_OF_THE_ARCHITECT), conditionsFromItem(ModItems.MARK_OF_THE_ARCHITECT))
                .offerTo(exporter, new Identifier(ParadigmMod.MOD_ID, "god_effigy"));



        ItemConvertible rawImperiemItem = ModItems.IMPERIUM_ROYALIUM;
        ItemConvertible cookedImperiumItem = ModItems.IMPERIUM_INGOT;
        ItemConvertible rawEffigeriumItem = ModItems.EFFIGERIUM_SHARDS;
        ItemConvertible cookedEffigeriumItem = ModItems.EFFIGERIUM_INGOT;
        ItemConvertible rawGildenItem = ModItems.GILDEN_ORE;
        ItemConvertible cookedGildenItem = ModItems.GILDEN_INGOT;
        ItemConvertible rawGrodiumItem = ModItems.GRODIUM_CRYSTALS;
        ItemConvertible cookedGrodiumItem = ModItems.GRODIUM_INGOT;
        ItemConvertible gilden_brick = ModBlocks.GILDEN_BRICKS;
        ItemConvertible crackedGildenBrick = ModBlocks.CRACKED_GILDEN_BRICKS;
        ItemConvertible popcornRaw = Items.WHEAT;
        ItemConvertible popcorn = ModItems.POPCORN;
        ItemConvertible gold = Items.GOLD_INGOT;

        // Smelting
        offerSmelting(exporter, List.of(rawEffigeriumItem), RecipeCategory.MISC, cookedEffigeriumItem, 200.0f,
                72000, "effigerium_ingot_furnace");
        offerSmelting(exporter, List.of(rawImperiemItem), RecipeCategory.MISC, cookedImperiumItem, 20.0f,
                400, "imperium_ingot_furnace");
        offerSmelting(exporter, List.of(rawGildenItem), RecipeCategory.MISC, cookedGildenItem, 0.8f,
                160, "gilden_ingot_furnace");
        offerSmelting(exporter, List.of(rawGrodiumItem), RecipeCategory.MISC, cookedGrodiumItem, 20.0f,
                400, "grodium_ingot_furnace");
        offerSmelting(exporter, List.of(popcornRaw), RecipeCategory.FOOD, popcorn, 0.1f,
                60, "popcorn");
        offerSmelting(exporter, List.of(gold), RecipeCategory.FOOD, rawGildenItem, 0.4f,
                160, "raw_gilden_furnace");
        offerSmelting(exporter, List.of(gilden_brick), RecipeCategory.FOOD, crackedGildenBrick, 0.4f,
                160, "cracked_gilden_furnace");

        // Blasting
        offerBlasting(exporter, List.of(rawEffigeriumItem), RecipeCategory.MISC, cookedEffigeriumItem, 200.0f,
                72000, "effigerium_ingot_blasting");
        offerBlasting(exporter, List.of(rawImperiemItem), RecipeCategory.MISC, cookedImperiumItem, 20.0f,
                200, "imperium_ingot_blasting");
        offerBlasting(exporter, List.of(rawGildenItem), RecipeCategory.MISC, cookedGildenItem, 0.8f,
                80,  "gilden_ingot_blasting");
        offerBlasting(exporter, List.of(rawGrodiumItem), RecipeCategory.MISC, cookedGrodiumItem, 20.0f,
                200, "grodium_ingot_blasting");
        offerBlasting(exporter, List.of(gold), RecipeCategory.MISC, rawGildenItem, 0.4f,
                80, "raw_gilden_blasting");
        offerBlasting(exporter, List.of(gilden_brick), RecipeCategory.MISC, crackedGildenBrick, 0.4f,
                80, "cracked_gilden_blasting");
    }
}
