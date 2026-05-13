package net.killerkrow.paradigm.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block REVERENCE_BERRY_SACK = registerBlock("reverence_berry_sack",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block VOYD_DARK = registerBlock("voyd_dark",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new  Identifier(ParadigmMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ParadigmMod.LOGGER.info("Registering ModBlocks for " + ParadigmMod.MOD_ID);
    }
}
