package net.killerkrow.paradigm.util;

import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        //public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS =
        //        createTag("metal_detector_detectable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(ParadigmMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CRUSHER_ITEM =
                createTag("crusher_item");
        public static final TagKey<Item> BINDMENT_ITEM =
                createTag("bindment_item");
        public static final TagKey<Item> FAVOR_ITEM =
                createTag("favor_item");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(ParadigmMod.MOD_ID, name));
        }
    }
}