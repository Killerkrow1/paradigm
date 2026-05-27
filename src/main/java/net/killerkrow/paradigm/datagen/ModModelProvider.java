package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //BlockStateModelGenerator.BlockTexturePool gildenBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GILDEN_BRICKS);
        //BlockStateModelGenerator.BlockTexturePool crackedGildenBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_GILDEN_BRICKS);

        //gildenBricks.wall(ModBlocks.GILDEN_BRICK_WALL);
        //gildenBricks.stairs(ModBlocks.GILDEN_BRICK_STAIRS);
        //gildenBricks.slab(ModBlocks.GILDEN_BRICK_SLAB);

        //crackedGildenBricks.wall(ModBlocks.CRACKED_GILDEN_BRICK_WALL);
        //crackedGildenBricks.stairs(ModBlocks.CRACKED_GILDEN_BRICK_STAIRS);
        //crackedGildenBricks.slab(ModBlocks.CRACKED_GILDEN_BRICK_SLAB);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEAD_CHISELED_STONE_BRICKS);
        //blockStateModelGenerator.registerLantern(ModBlocks.SOUL_CHARGED_LANTERN);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.UNKNOWN_MASK, Models.GENERATED);
        itemModelGenerator.register(ModItems.REVERENCE_EFFIGY, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPTY_REVERENCE_EFFIGY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARGED_EMPTY_REVERENCE_EFFIGY, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADMINCHAIN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADMINCHAIN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADMINCHAIN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADMINCHAIN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NETHERITECHAIN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NETHERITECHAIN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NETHERITECHAIN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NETHERITECHAIN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DIAMONDCHAIN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DIAMONDCHAIN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DIAMONDCHAIN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DIAMONDCHAIN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRONCHAIN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRONCHAIN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRONCHAIN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.IRONCHAIN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.GILDEN_CROWN));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TERMINUS_COVERUS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDLESS_MASK));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLORA_VEIL));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HELLISH_IDENTITY));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ETHEREAL_COVER));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.UNKNOWN_SLIDE));
    }
}
