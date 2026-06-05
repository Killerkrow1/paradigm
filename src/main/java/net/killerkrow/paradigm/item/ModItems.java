package net.killerkrow.paradigm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.item.custom.*;
import net.killerkrow.paradigm.item.favor.*;
import net.killerkrow.paradigm.item.foods.BerryItem;
import net.killerkrow.paradigm.misc.ModArmorMaterials;
import net.killerkrow.paradigm.misc.ParadigmToolMaterials;
import net.killerkrow.paradigm.util.ModRarities;
import net.minecraft.item.*;
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
    public static final Item GILDEN_ORE = registerItem("gilden_ore",
            new Item(new FabricItemSettings()));
    public static final Item GILDEN_INGOT = registerItem("gilden_ingot",
            new Item(new FabricItemSettings()));
    public static final Item GILDEN_DUST = registerItem("gilden_dust",
            new Item(new FabricItemSettings()));
    public static final Item BROKEN_HEART = registerItem("broken_heart",
            new Item(new FabricItemSettings()));
    public static final Item JADE_BRICK = registerItem("jade_brick",
            new Item(new FabricItemSettings()));

    //extended normal items
    public static final Item EFFIGY_EXTRACT = registerItem("effigy_extract",
            new EffigyExtract(new FabricItemSettings().maxCount(1)));
    public static final Item EFFIGY_CORE = registerItem("effigy_core",
            new EffigyCore(new FabricItemSettings().maxCount(1)));
    public static final Item MARK_OF_THE_ARCHITECT = registerItem("mark_of_the_architect",
            new MarkOfTheArchitect(new FabricItemSettings().maxCount(1)));
    public static final Item ATLAS_COOKING_KNIFE = registerItem("atlas_cooking_knife",
            new CookingKnife(ToolMaterials.IRON, 1, 2,
                    new FabricItemSettings().recipeRemainder(ModItems.ATLAS_COOKING_KNIFE)));

    //Favor Items
    public static final Item ATLAS_FAVOR = registerItem("atlas_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item NOVINGARD_FAVOR = registerItem("novingard_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item ASTRAL_FAVOR = registerItem("astral_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item GERO_FAVOR = registerItem("gero_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item ISMENE_FAVOR = registerItem("ismene_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item ULTIMUS_FAVOR = registerItem("ultimus_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item UNKNOWN_FAVOR = registerItem("unknown_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item PUMPKIN_FAVOR = registerItem("pumpkin_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item TOGG_FAVOR = registerItem("togg_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item VELEN_FAVOR = registerItem("velen_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item ZAPA_FAVOR = registerItem("zapa_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item SHADOW_FAVOR = registerItem("shadow_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item SMILEY_FAVOR = registerItem("smiley_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item NERA_FAVOR = registerItem("nera_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item INVICTUS_FAVOR = registerItem("invictus_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPECTER_FAVOR = registerItem("specter_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item YETI_FAVOR = registerItem("yeti_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item CASTIEL_FAVOR = registerItem("castiel_favor",
            new FavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLANK_FAVOR = registerItem("blank_favor",
            new BlankFavorItem(new FabricItemSettings().maxCount(1)));
    public static final Item GOD_FAVOR = registerItem("god_favor",
            new GodFavor(new FabricItemSettings().maxCount(1)));
    public static final Item DEMIGOD_FAVOR = registerItem("demigod_favor",
            new DemigodFavor(new FabricItemSettings().maxCount(1)));
    public static final Item FAVOR_OF_DIVINITY = registerItem("favor_of_divinity",
            new DivinityFavor(new FabricItemSettings().maxCount(1)));

    //Favor Craftables
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
    public static final Item SOUL_DEAL = registerItem("soul_deal",
            new SoulDeal(new FabricItemSettings().maxCount(1)));
    public static final Item SOUL_DEAL_SIGNED = registerItem("soul_deal_signed",
            new SignedSoulDeal(new Item.Settings().maxCount(1), ModRarities.SOUL_DEAL));
    public static final Item SMILEY_NOTES = registerItem("smiley_notes",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));
    public static final Item STASIS_MARK = registerItem("stasis_mark",
            new SaveTPItem(new FabricItemSettings().maxCount(1)));
    public static final Item DRAGON_HORN = registerItem("dragon_horn",
            new DragonHorn(new FabricItemSettings().maxCount(1)));
    public static final Item PHOENIX_GRAIL = registerItem("phoenix_grail",
            new PhoenixGrail(new FabricItemSettings().maxCount(1)));
    public static final Item SILENT_CHARM = registerItem("silent_charm",
            new SilentCharm(new FabricItemSettings().maxCount(1)));
    public static final Item THUNDERSPRITE = registerItem("thundersprite",
            new ThunderSprite(new FabricItemSettings().maxCount(1)));
    public static final Item MARK_OF_CHAOS = registerItem("mark_of_chaos",
            new ChaosMark(new FabricItemSettings().maxCount(1)));
    public static final Item HEALING_TOUCH = registerItem("healing_touch",
            new HealingTouch(new FabricItemSettings().maxCount(1)));

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
    public static final Item EMPTY_REVERENCE_EFFIGY = registerItem("empty_reverence_effigy",
            new EmptyReverenceEffigy(new FabricItemSettings().maxCount(1)));

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
    public static final Item CHARGED_EMPTY_REVERENCE_EFFIGY = registerItem("charged_empty_reverence_effigy",
            new ChargedEmptyReverenceEffigy(new FabricItemSettings().maxCount(1)));

    public static final Item TEST = registerItem("test",
            new TestItem(new FabricItemSettings().maxCount(1)));

    // weapons n stuff
    public  static final Item WOODEN_CRUSHER = registerItem("wooden_crusher",
            new CrusherWooden(ParadigmToolMaterials.CRUSHERWOOD, 0, -3.4f, new FabricItemSettings()));
    public  static final Item STONE_CRUSHER = registerItem("stone_crusher",
            new CrusherStone(ParadigmToolMaterials.CRUSHERSTONE, 0, -3.4f, new FabricItemSettings()));
    public  static final Item IRON_CRUSHER = registerItem("iron_crusher",
            new CrusherIron(ParadigmToolMaterials.CRUSHERIRON, 0, -3.4f, new FabricItemSettings()));
    public  static final Item GOLD_CRUSHER = registerItem("gold_crusher",
            new CrusherGold(ParadigmToolMaterials.CRUSHERGOLD, 0, -3.4f, new FabricItemSettings()));
    public  static final Item JADE_CRUSHER = registerItem("jade_crusher",
            new CrusherJade(ParadigmToolMaterials.CRUSHERJADE, 0, -3.4f, new FabricItemSettings()));
    public  static final Item DIAMOND_CRUSHER = registerItem("diamond_crusher",
            new CrusherDiamond(ParadigmToolMaterials.CRUSHERDIAMOND, 0, -3.4f, new FabricItemSettings()));
    public  static final Item NETHERITE_CRUSHER = registerItem("netherite_crusher",
            new CrusherNetherite(ParadigmToolMaterials.CRUSHERNETHERITE, 0, -3.4f, new FabricItemSettings().fireproof()));

    public  static final Item INVERTED_SPEAR = registerItem("inverted_spear",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 14, -2.5f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item INVERTED_DIVIDER = registerItem("inverted_divider",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 16, -2.8f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item INVERTED_DAGGER = registerItem("inverted_dagger",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 6, -2.2f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item INVERTED_CUTTER = registerItem("inverted_cutter",
            new FastInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 11, -2.0f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item SMILEYS_IMPULSE = registerItem("smileys_impulse",
            new SmileyInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 29, -2.4f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item INVERTED_BRAND = registerItem("inverted_brand",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 14, -2.4f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item SOUL_INVERSION = registerItem("soul_inversion",
            new SoulInversion(ParadigmToolMaterials.IMPERIUM, 17, -2.4f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item INVERTED_BLADE = registerItem("inverted_blade",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 14, -2.4f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item INVERTED_BITE = registerItem("inverted_bite",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 15, -2.5f, new FabricItemSettings(), ModRarities.INVERTED));
    public  static final Item INVERTED_HAMMER = registerItem("inverted_hammer",
            new BaseInvertedWeapon(ParadigmToolMaterials.IMPERIUM, 18, -3.1f, new FabricItemSettings(), ModRarities.INVERTED));

    public  static final Item ATLAS_WRATH = registerItem("atlas_wrath",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item ATLAS_BETRAYAL = registerItem("atlas_betrayal",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item ASTRAL_PRIDE = registerItem("astral_pride",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item ASTRAL_FURY = registerItem("astral_fury",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item GERO_SCAR = registerItem("gero_scar",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item GERO_LUST = registerItem("gero_lust",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item NOVINGARD_BLESSING = registerItem("novingard_blessing",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item NOVINGARD_WISH = registerItem("novingard_wish",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item ISMENE_LINE = registerItem("ismene_line",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item ULTIMUS_RING = registerItem("ultimus_ring",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item UNKNOWN_DARKNESS = registerItem("unknown_darkness",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item TWIN_SWORD_ATLAS = registerItem("twin_sword_atlas",
            new BaseGodWeapon(ParadigmToolMaterials.GOD, 1, 2, new FabricItemSettings().fireproof()));
    public  static final Item TWIN_SHIELD_ATLAS = registerItem("twin_shield_atlas",
            new ShieldItem(new FabricItemSettings().fireproof()));

    public  static final Item FRAGMENTED_ICON = registerItem("fragmented_icon",
            new FragmentedIcon(ParadigmToolMaterials.UNIQUE, 1, 2, new FabricItemSettings()));
    public  static final Item DARK_BINDMENT = registerItem("dark_bindment",
            new DarkBindment(ParadigmToolMaterials.UNIQUE, 1, 2, new FabricItemSettings()));
    public  static final Item SKULL_SCYTHE = registerItem("skull_scythe",
            new SwordItem(ParadigmToolMaterials.AFTERLIFE, 1, 2, new FabricItemSettings()));

    public  static final Item DEAD_HEART = registerItem("dead_heart",
            new SwordItem(ToolMaterials.DIAMOND, 1, 2, new FabricItemSettings()));
    public  static final Item CHARGED_HEART = registerItem("charged_heart",
            new SwordItem(ToolMaterials.DIAMOND, 1, 2, new FabricItemSettings()));
    public  static final Item GILDEN_BLADE = registerItem("gilden_blade",
            new SwordItem(ParadigmToolMaterials.UNIQUE, 1, 2, new FabricItemSettings()));

    // trinkets and such from this section
    public static final Item JADE_EFFIGY = registerItem("jade_effigy",
            new JadeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item REVERENCE_EFFIGY = registerItem("reverence_effigy",
            new ReverenceEffigy(new FabricItemSettings().maxCount(1)));
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
            new GodEffigy(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1).fireproof()));
    public static final Item UNKNOWN_MASK = registerItem("unknown_mask",
            new UnknownMask(new FabricItemSettings().maxCount(1)));

    //Gilden Crown
    public static final Item GILDEN_CROWN = registerItem("gilden_crown",
            new ArmorItem(ModArmorMaterials.GILDEN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDLESS_MASK = registerItem("endless_mask",
            new ArmorItem(ModArmorMaterials.ENDLESS_MASK, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item FLORA_VEIL = registerItem("flora_veil",
            new ArmorItem(ModArmorMaterials.FLORA_VEIL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TERMINUS_COVERUS = registerItem("terminus_coverus",
            new ArmorItem(ModArmorMaterials.TERMINUS_COVERUS, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item HELLISH_IDENTITY = registerItem("hellish_identity",
            new ArmorItem(ModArmorMaterials.HELLISH_IDENTITY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ETHEREAL_COVER = registerItem("ethereal_cover",
            new ArmorItem(ModArmorMaterials.ETHEREAL_COVER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item UNKNOWN_SLIDE = registerItem("unknown_slide",
            new ArmorItem(ModArmorMaterials.UNKNOWN_SLIDE, ArmorItem.Type.HELMET, new FabricItemSettings()));

    //Iron Chain
    public static final Item IRONCHAIN_HELMET = registerItem("iron_chain_helmet",
            new ArmorItem(ModArmorMaterials.IRONCHAIN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRONCHAIN_CHESTPLATE = registerItem("iron_chain_chestplate",
            new ArmorItem(ModArmorMaterials.IRONCHAIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item IRONCHAIN_LEGGINGS = registerItem("iron_chain_leggings",
            new ArmorItem(ModArmorMaterials.IRONCHAIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item IRONCHAIN_BOOTS = registerItem("iron_chain_boots",
            new ArmorItem(ModArmorMaterials.IRONCHAIN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //Diamond Chain
    public static final Item DIAMONDCHAIN_HELMET = registerItem("diamond_chain_helmet",
            new ArmorItem(ModArmorMaterials.DIAMONDCHAIN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIAMONDCHAIN_CHESTPLATE = registerItem("diamond_chain_chestplate",
            new ArmorItem(ModArmorMaterials.DIAMONDCHAIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DIAMONDCHAIN_LEGGINGS = registerItem("diamond_chain_leggings",
            new ArmorItem(ModArmorMaterials.DIAMONDCHAIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DIAMONDCHAIN_BOOTS = registerItem("diamond_chain_boots",
            new ArmorItem(ModArmorMaterials.DIAMONDCHAIN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //Netherite Chain
    public static final Item NETHERITECHAIN_HELMET = registerItem("netherite_chain_helmet",
            new ArmorItem(ModArmorMaterials.NETHERITECHAIN, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITECHAIN_CHESTPLATE = registerItem("netherite_chain_chestplate",
            new ArmorItem(ModArmorMaterials.NETHERITECHAIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITECHAIN_LEGGINGS = registerItem("netherite_chain_leggings",
            new ArmorItem(ModArmorMaterials.NETHERITECHAIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item NETHERITECHAIN_BOOTS = registerItem("netherite_chain_boots",
            new ArmorItem(ModArmorMaterials.NETHERITECHAIN, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    //Admin Chain
    public static final Item ADMINCHAIN_HELMET = registerItem("admin_chain_helmet",
            new ArmorItem(ModArmorMaterials.ADMINCHAIN, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item ADMINCHAIN_CHESTPLATE = registerItem("admin_chain_chestplate",
            new ArmorItem(ModArmorMaterials.ADMINCHAIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item ADMINCHAIN_LEGGINGS = registerItem("admin_chain_leggings",
            new ArmorItem(ModArmorMaterials.ADMINCHAIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item ADMINCHAIN_BOOTS = registerItem("admin_chain_boots",
            new ArmorItem(ModArmorMaterials.ADMINCHAIN, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

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
    public static final Item SCULK_ROLL = registerItem("sculk_roll",
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

    private static void addItemsToOperatorTabItemsGroup(FabricItemGroupEntries entries) {
        entries.add(SMILE_ITEM);
        entries.add(TEST);
        entries.add(ASTRAVEN_LOGO);
    }
    public static void registerModItems() {
        ParadigmMod.LOGGER.info("Registering Mod Items for " + ParadigmMod.MOD_ID);



        //This is kinda useless, but ima keep it for keepsakes
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(ModItems::addItemsToOperatorTabItemsGroup);

    }
}
