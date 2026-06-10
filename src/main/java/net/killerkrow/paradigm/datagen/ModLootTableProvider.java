package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.killerkrow.paradigm.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.REVERENCE_BERRY_SACK, dropsNineItems(ModBlocks.REVERENCE_BERRY_SACK, ModItems.REVERENCE_BERRY));
        //addDrop(ModBlocks.DEAD_COBBLESTONE_SLAB, slabDrops(ModBlocks.DEAD_COBBLESTONE_SLAB));
        //addDrop(ModBlocks.DEAD_CRACKED_STONE_BRICK_SLAB, slabDrops(ModBlocks.DEAD_CRACKED_STONE_BRICK_SLAB));
        //addDrop(ModBlocks.MOSSY_DEAD_COBBLESTONE_SLAB, slabDrops(ModBlocks.MOSSY_DEAD_COBBLESTONE_SLAB));
        //addDrop(ModBlocks.MOSSY_DEAD_STONE_BRICK_SLAB, slabDrops(ModBlocks.MOSSY_DEAD_STONE_BRICK_SLAB));
        //addDrop(ModBlocks.DEAD_STONE_BRICK_SLAB, slabDrops(ModBlocks.DEAD_STONE_BRICK_SLAB));
        //addDrop(ModBlocks.DEAD_STONE_SLAB, slabDrops(ModBlocks.DEAD_STONE_SLAB));
        //addDrop(ModBlocks.GILDEN_BRICKS);
        //addDrop(ModBlocks.GILDEN_BRICK_STAIRS);
        //addDrop(ModBlocks.GILDEN_BRICK_SLAB);
        //addDrop(ModBlocks.GILDEN_BRICK_WALL);
        //addDrop(ModBlocks.CRACKED_GILDEN_BRICKS);
        //addDrop(ModBlocks.CRACKED_GILDEN_BRICK_STAIRS);
        //addDrop(ModBlocks.CRACKED_GILDEN_BRICK_SLAB);
        //addDrop(ModBlocks.CRACKED_GILDEN_BRICK_WALL);
        //addDropWithSilkTouch(ModBlocks.GILDEN_ICON);
        //addDrop(ModBlocks.SOUL_CHARGED_LANTERN);
        addDrop(ModBlocks.JADE_BLOCK);
    }


    public LootTable.Builder dropsNineItems(Block block, Item item) {
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(9.0F)))));
    }
}