package net.killerkrow.paradigm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.item.custom.*;
import net.minecraft.item.Item;
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

    //extended normal items
    public static final Item SMILEY_NOTES = registerItem("smiley_notes",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));
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

    public static final Item TEST = registerItem("test",
            new TestItem(new FabricItemSettings().maxCount(1)));

    // weapons n stuff
    public  static final Item WOODEN_CRUSHER = registerItem("wooden_crusher",
            new CrusherWooden(new FabricItemSettings().maxDamage(2)));
    public  static final Item STONE_CRUSHER = registerItem("stone_crusher",
            new CrusherStone(new FabricItemSettings().maxDamage(3)));
    public  static final Item IRON_CRUSHER = registerItem("iron_crusher",
            new CrusherIron(new FabricItemSettings().maxDamage(4)));
    public  static final Item GOLD_CRUSHER = registerItem("gold_crusher",
            new CrusherGold(new FabricItemSettings().maxDamage(5)));
    public  static final Item JADE_CRUSHER = registerItem("jade_crusher",
            new CrusherJade(new FabricItemSettings().maxDamage(6)));
    public  static final Item DIAMOND_CRUSHER = registerItem("diamond_crusher",
            new CrusherDiamond(new FabricItemSettings().maxDamage(7)));
    public  static final Item NETHERITE_CRUSHER = registerItem("netherite_crusher",
            new CrusherNetherite(new FabricItemSettings().maxDamage(8)));

    // trinkets and such from this section
    public static final Item JADE_EFFIGY = registerItem("jade_effigy",
            new JadeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item SOUL_EFFIGY = registerItem("soul_effigy",
            new SoulEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item AFTERLIFE_EFFIGY = registerItem("afterlife_effigy",
            new AfterlifeEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item SEMIGOD_EFFIGY = registerItem("semigod_effigy",
            new SemiGodEffigy(new FabricItemSettings().maxCount(1)));
    public static final Item DEMIGOD_EFFIGY = registerItem("demigod_effigy",
            new DemiGodEffigy(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(1)));
    public static final Item GOD_EFFIGY = registerItem("god_effigy",
            new GodEffigy(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1)));

    //foods and related
    public static final Item REVERENCE_BERRY = registerItem("reverence_berry",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_BERRY)));
    public static final Item GOLDEN_REVERENCE_BERRY = registerItem("golden_reverence_berry",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_REVERENCE_BERRY)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ParadigmMod.LOGGER.info("Registering Mod Items for " + ParadigmMod.MOD_ID);

        //This is kinda useless, but ima keep it for keepsakes
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemsGroup);

    }
}
