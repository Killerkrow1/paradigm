package net.killerkrow.paradigm.item;

import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.item.custom.GodEffigy;
import net.killerkrow.paradigm.item.custom.SmileyNotesItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //normal items with no real stuff to them
    public static final Item SMILE_ITEM = registerItem("smile_item", new Item(new FabricItemSettings()));


    // trinkets and such from this section
    public static final Item EMPTY_EFFIGY = registerItem("empty_effigy",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));
    public static final Item AFTERLIFE_EFFIGY = registerItem("afterlife_effigy",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));
    public static final Item SEMIGOD_EFFIGY = registerItem("semigod_effigy",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));
    public static final Item DEMIGOD_EFFIGY = registerItem("demigod_effigy",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));
    public static final Item GOD_EFFIGY = registerItem("god_effigy",
            new GodEffigy(new FabricItemSettings().maxCount(1)));

    //special items with functions
    public static final Item SMILEY_NOTES = registerItem("smiley_notes",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));

    //foods and related
    public static final Item REVERENCE_BERRY = registerItem("reverence_berry", new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_BERRY)));
    public static final Item GOLDEN_REVERENCE_BERRY = registerItem("golden_reverence_berry", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_REVERENCE_BERRY)));



    //This is kinda useless, but ima keep it for keepsakes
    // private static void addItemsToIngredientTabItemsGroup(FabricItemGroupEntries entries) {
    //    entries.add(SMILE_ITEM);
    //}

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ParadigmMod.LOGGER.info("Registering Mod Items for " + ParadigmMod.MOD_ID);

        //This is kinda useless, but ima keep it for keepsakes
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemsGroup);

    }
}
