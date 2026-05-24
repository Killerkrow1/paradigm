package net.killerkrow.paradigm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.item.custom.*;
import net.killerkrow.paradigm.item.foods.BerryItem;
import net.killerkrow.paradigm.misc.ParadigmToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    //normal items with no real stuff to them
    public static final Item SMILE_ITEM = registerItem("smile_item",
            new Item(new FabricItemSettings()));
    public static final Item ASTRAVEN_LOGO = registerItem("astraven_logo",
            new Item(new FabricItemSettings()));
    public static final Item EFFIGERIUM_SHARDS = registerItem("effigerium_shards",
            new Item(new FabricItemSettings()));
    public static final Item EFFIGERIUM_INGOT = registerItem("effigerium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item EFFIGERIUM_DUST = registerItem("effigerium_dust",
            new Item(new FabricItemSettings()));
    public static final Item GRODIUM_CRYSTALS = registerItem("grodium_crystals",
            new Item(new FabricItemSettings()));
    public static final Item GRODIUM_INGOT = registerItem("grodium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GRODIUM_DUST = registerItem("grodium_dust",
            new Item(new FabricItemSettings()));
    public static final Item IMPERIUM_ROYALIUM = registerItem("imperium_royalium",
            new Item(new FabricItemSettings()));
    public static final Item IMPERIUM_INGOT = registerItem("imperium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item IMPERIUM_DUST = registerItem("imperium_dust",
            new Item(new FabricItemSettings()));

    //extended normal items
    public static final Item SMILEY_NOTES = registerItem("smiley_notes",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));
    public static final Item FAVOR_OF_DIVINITY = registerItem("favor_of_divinity",
            new DivinityFavor(new FabricItemSettings().maxCount(1)));
    public static final Item EFFIGY_EXTRACT = registerItem("effigy_extract",
            new EffigyExtract(new FabricItemSettings().maxCount(1)));
    public static final Item EFFIGY_CORE = registerItem("effigy_core",
            new EffigyCore(new FabricItemSettings().maxCount(1)));
    public static final Item MARK_OF_THE_ARCHITECT = registerItem("mark_of_the_architect",
            new MarkOfTheArchitect(new FabricItemSettings().maxCount(1)));
    public static final Item ATLAS_COOKING_KNIFE = registerItem("atlas_cooking_knife",
            new CookingKnife(new FabricItemSettings().maxCount(1).recipeRemainder(ModItems.ATLAS_COOKING_KNIFE)));

    public static final Item ATLAS_BINDMENT = registerItem("atlas_bindment",
            new BindmentBook(new FabricItemSettings().maxCount(1)));
    public static final Item NOVINGARD_BINDMENT = registerItem("novingard_bindment",
            new BindmentBook(new FabricItemSettings().maxCount(1)));
    public static final Item ASTRAL_BINDMENT = registerItem("astral_bindment",
            new BindmentBook(new FabricItemSettings().maxCount(1)));
    public static final Item GERO_BINDMENT = registerItem("gero_bindment",
            new BindmentBook(new FabricItemSettings().maxCount(1)));
    public static final Item ISMENE_BINDMENT = registerItem("ismene_bindment",
            new BindmentBook(new FabricItemSettings().maxCount(1)));
    public static final Item ULTIMUS_BINDMENT = registerItem("ultimus_bindment",
            new BindmentBook(new FabricItemSettings().maxCount(1)));
    public static final Item UNKNOWN_BINDMENT = registerItem("unknown_bindment",
            new BindmentBook(new FabricItemSettings().maxCount(1)));

    public static final Item EMPTY_EFFIGY = registerItem("empty_effigy",
            new EmptyEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item EMPTY_DEMI_EFFIGY = registerItem("empty_demi_effigy",
            new EmptyDemiEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item EMPTY_SOUL_EFFIGY = registerItem("empty_soul_effigy",
            new EmptySoulEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item EMPTY_AFTERLIFE_EFFIGY = registerItem("empty_afterlife_effigy",
            new EmptyAfterlifeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item EMPTY_JADE_EFFIGY = registerItem("empty_jade_effigy",
            new EmptyJadeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item EMPTY_SEMI_EFFIGY = registerItem("empty_semi_effigy",
            new EmptySemiEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item EMPTY_LUNAR_EFFIGY = registerItem("empty_lunar_effigy",
            new EmptyLunarEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item EMPTY_SOLAR_EFFIGY = registerItem("empty_solar_effigy",
            new EmptySolarEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item EMPTY_ESOTERIC_EFFIGY = registerItem("empty_esoteric_effigy",
            new EmptyEsotericEffigy(new FabricItemSettings().maxCount(1)));

    public static final Item CHARGED_EMPTY_DEMI_EFFIGY = registerItem("charged_empty_demi_effigy",
            new ChargedEmptyDemiEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item CHARGED_EMPTY_SOUL_EFFIGY = registerItem("charged_empty_soul_effigy",
            new ChargedEmptySoulEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item CHARGED_EMPTY_AFTERLIFE_EFFIGY = registerItem("charged_empty_afterlife_effigy",
            new ChargedEmptyAfterlifeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item CHARGED_EMPTY_JADE_EFFIGY = registerItem("charged_empty_jade_effigy",
            new ChargedEmptyJadeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item CHARGED_EMPTY_SEMI_EFFIGY = registerItem("charged_empty_semi_effigy",
            new ChargedEmptySemiEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item CHARGED_EMPTY_SOLAR_EFFIGY = registerItem("charged_empty_solar_effigy",
            new ChargedEmptySolarEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item CHARGED_EMPTY_LUNAR_EFFIGY = registerItem("charged_empty_lunar_effigy",
            new ChargedEmptyLunarEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item CHARGED_EMPTY_ESOTERIC_EFFIGY = registerItem("charged_empty_esoteric_effigy",
            new ChargedEmptyEsotericEffigy(new FabricItemSettings().maxCount(1)));

    public static final Item TEST = registerItem("test",
            new TestItem(new FabricItemSettings().maxCount(1)));

    // weapons n stuff
    public  static final Item WOODEN_CRUSHER = registerItem("wooden_crusher",
            new CrusherWooden(ParadigmToolMaterials.CRUSHERNETHERITE, 1, 2, new FabricItemSettings()));
    public  static final Item STONE_CRUSHER = registerItem("stone_crusher",
            new CrusherStone(ParadigmToolMaterials.CRUSHERNETHERITE, 1, 2, new FabricItemSettings()));
    public  static final Item IRON_CRUSHER = registerItem("iron_crusher",
            new CrusherIron(ParadigmToolMaterials.CRUSHERNETHERITE, 1, 2, new FabricItemSettings()));
    public  static final Item GOLD_CRUSHER = registerItem("gold_crusher",
            new CrusherGold(ParadigmToolMaterials.CRUSHERNETHERITE, 1, 2, new FabricItemSettings()));
    public  static final Item JADE_CRUSHER = registerItem("jade_crusher",
            new CrusherJade(ParadigmToolMaterials.CRUSHERNETHERITE, 1, 2, new FabricItemSettings()));
    public  static final Item DIAMOND_CRUSHER = registerItem("diamond_crusher",
            new CrusherDiamond(ParadigmToolMaterials.CRUSHERDIAMOND, 1, 2, new FabricItemSettings()));
    public  static final Item NETHERITE_CRUSHER = registerItem("netherite_crusher",
            new CrusherNetherite(ParadigmToolMaterials.CRUSHERNETHERITE, 1, 2, new FabricItemSettings()));

    public  static final Item INVERTED_SPEAR = registerItem("inverted_spear",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));
    public  static final Item INVERTED_DIVIDER = registerItem("inverted_divider",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));
    public  static final Item INVERTED_DAGGER = registerItem("inverted_dagger",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));
    public  static final Item INVERTED_CUTTER = registerItem("inverted_cutter",
            new FastInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 0.1f, new FabricItemSettings()));
    public  static final Item SMILEYS_IMPULSE = registerItem("smileys_impulse",
            new SmileyInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));
    public  static final Item INVERTED_BRAND = registerItem("inverted_brand",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));
    public  static final Item SOUL_INVERSION = registerItem("soul_inversion",
            new SoulInversion(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));
    public  static final Item INVERTED_BLADE = registerItem("inverted_blade",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));
    public  static final Item INVERTED_BITE = registerItem("inverted_bite",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));
    public  static final Item INVERTED_HAMMER = registerItem("inverted_hammer",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 1, 2, new FabricItemSettings()));

    // trinkets and such from this section
    public static final Item JADE_EFFIGY = registerItem("jade_effigy",
            new JadeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item ESOTERIC_EFFIGY = registerItem("esoteric_effigy",
            new EsotericEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item LUNAR_EFFIGY = registerItem("lunar_effigy",
            new LunarEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item SOLAR_EFFIGY = registerItem("solar_effigy",
            new SolarEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item ECLIPSE_EFFIGY = registerItem("eclipse_effigy",
            new EclipseEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item SOUL_EFFIGY = registerItem("soul_effigy",
            new SoulEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item AFTERLIFE_EFFIGY = registerItem("afterlife_effigy",
            new AfterlifeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item SEMIGOD_EFFIGY = registerItem("semigod_effigy",
            new SemiGodEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item DEMIGOD_EFFIGY = registerItem("demigod_effigy",
            new DemiGodEffigy(new FabricItemSettings().rarity(Rarity.RARE).maxCount(1)));
    public static final Item GOD_EFFIGY = registerItem("god_effigy",
            new GodEffigy(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1)));

    //foods and related
    public static final Item REVERENCE_BERRY = registerItem("reverence_berry",
            new BerryItem(new FabricItemSettings().food(ModFoodComponents.REVERENCE_BERRY)));
    public static final Item GOLDEN_REVERENCE_BERRY = registerItem("golden_reverence_berry",
            new BerryItem(new FabricItemSettings().food(ModFoodComponents.GOLDEN_REVERENCE_BERRY).maxCount(16)));
    public static final Item REVERENCE_STEM = registerItem("reverence_stem",
            new Item(new FabricItemSettings().food(ModFoodComponents.POPCORN)));
    public static final Item POPCORN = registerItem("popcorn",
            new Item(new FabricItemSettings().food(ModFoodComponents.POPCORN)));
    public static final Item COOKED_SCULK_RICE = registerItem("cooked_sculk_rice",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SCULK_RICE)));
    public static final Item SCULK_ROLL = registerItem("cooked_roll",
            new Item(new FabricItemSettings().food(ModFoodComponents.SCULK_ROLL)));
    public static final Item SCULK_ROLL_SLICE = registerItem("sculk_roll_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.SCULK_ROLL_SLICE)));
    public static final Item SCULK_FRITTER = registerItem("sculk_fritter",
            new Item(new FabricItemSettings().food(ModFoodComponents.SCULK_FRITTER)));
    public static final Item BOWL_OF_REVERENCE_BERRIES = registerItem("bowl_of_reverence_berries",
            new StewItem(new FabricItemSettings().food(ModFoodComponents.BOWL_OF_REVERENCE_BERRIES).maxCount(16)));
    public static final Item SCULK_CABBAGE = registerItem("sculk_cabbage",
            new Item(new FabricItemSettings().food(ModFoodComponents.SCULK_CABBAGE)));
    public static final Item SCULK_CHEESE = registerItem("sculk_cheese",
            new Item(new FabricItemSettings().food(ModFoodComponents.SCULK_CHEESE)));
    public static final Item SCULK_TEA = registerItem("sculk_tea",
            new Item(new FabricItemSettings().food(ModFoodComponents.SCULK_TEA).maxCount(16)));
    public static final Item SCULK_BREAD = registerItem("sculk_bread",
            new Item(new FabricItemSettings().food(ModFoodComponents.SCULK_BREAD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ParadigmMod.LOGGER.info("Registering Mod Items for " + ParadigmMod.MOD_ID);

        //This is kinda useless, but ima keep it for keepsakes
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemsGroup);

    }
}
