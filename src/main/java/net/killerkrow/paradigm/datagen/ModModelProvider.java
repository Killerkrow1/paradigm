package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
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
        //itemModelGenerator.register(ModItems.FAVOR_OF_DIVINITY, Models.GENERATED);
        //itemModelGenerator.register(ModItems.ATLAS_WRATH, Models.HANDHELD);
    }
}
