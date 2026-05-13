package net.killerkrow.paradigm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.item.custom.SmileyNotesItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SMILE_ITEM = registerItem("smile_item", new Item(new FabricItemSettings()));


    public static final Item SMILEY_NOTES = registerItem("smiley_notes",
            new SmileyNotesItem(new FabricItemSettings().maxCount(1)));

    public static final Item REVERENCE_BERRY = registerItem("reverence_berry", new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_BERRY)));
    public static final Item GOLDEN_REVERENCE_BERRY = registerItem("golden_reverence_berry", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_REVERENCE_BERRY)));




    private static void addItemsToIngredientTabItemsGroup(FabricItemGroupEntries entries) {
        entries.add(SMILE_ITEM);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ParadigmMod.LOGGER.info("Registering Mod Items for " + ParadigmMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemsGroup);
    }
}
