package net.killerkrow.paradigm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PARADIGM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ParadigmMod.MOD_ID, "reverence_berry"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paradigm_tab"))
                    .icon(() -> new ItemStack(ModItems.REVERENCE_BERRY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.REVERENCE_STEM);
                        entries.add(ModItems.REVERENCE_BERRY);
                        entries.add(ModItems.GOLDEN_REVERENCE_BERRY);
                        entries.add(ModItems.BOWL_OF_REVERENCE_BERRIES);
                        entries.add(ModBlocks.REVERENCE_BERRY_SACK);
                        entries.add(ModItems.POPCORN);
                        entries.add(ModItems.COOKED_SCULK_RICE);
                        entries.add(ModItems.SCULK_ROLL);
                        entries.add(ModItems.SCULK_ROLL_SLICE);
                        entries.add(ModItems.SCULK_FRITTER);
                        entries.add(ModItems.SCULK_CABBAGE);
                        entries.add(ModItems.SCULK_CHEESE);
                        entries.add(ModItems.SCULK_TEA);
                        entries.add(ModItems.SCULK_BREAD);
                        entries.add(ModItems.ATLAS_COOKING_KNIFE);
                        entries.add(ModItems.EFFIGERIUM_SHARDS);
                        entries.add(ModItems.EFFIGERIUM_INGOT);
                        entries.add(ModItems.EFFIGERIUM_DUST);
                        entries.add(ModItems.GRODIUM_CRYSTALS);
                        entries.add(ModItems.GRODIUM_INGOT);
                        entries.add(ModItems.GRODIUM_DUST);
                        entries.add(ModItems.IMPERIUM_ROYALIUM);
                        entries.add(ModItems.IMPERIUM_INGOT);
                        entries.add(ModItems.IMPERIUM_DUST);
                        entries.add(ModItems.GILDEN_ORE);
                        entries.add(ModItems.GILDEN_INGOT);
                        entries.add(ModItems.GILDEN_DUST);
                        entries.add(ModItems.DEMIGOD_FAVOR);
                        entries.add(ModItems.GOD_FAVOR);
                        entries.add(ModItems.FAVOR_OF_DIVINITY);
                        entries.add(ModItems.EFFIGY_CORE);
                        entries.add(ModItems.EFFIGY_EXTRACT);
                        entries.add(ModItems.MARK_OF_THE_ARCHITECT);
                        entries.add(ModBlocks.EFFIGERIUM_FURNACE);
                        entries.add(ModItems.BROKEN_HEART);

                    }).build());

    public static final ItemGroup PARADIGM_BUILDING_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ParadigmMod.MOD_ID, "dead_stone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paradigm_building_tab"))
                    .icon(() -> new ItemStack(ModBlocks.DEAD_STONE)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.VOYD_DARK);
                        entries.add(ModBlocks.VOYD_LIGHT);
                        entries.add(ModBlocks.SOUL_CHARGED_LANTERN);
                        entries.add(ModBlocks.DEAD_GRASS);
                        entries.add(ModBlocks.DEAD_DIRT);
                        entries.add(ModBlocks.DEAD_STONE);
                        entries.add(ModBlocks.DEAD_STONE_STAIRS);
                        entries.add(ModBlocks.DEAD_STONE_SLAB);
                        entries.add(ModBlocks.DEAD_STONE_BUTTON);
                        entries.add(ModBlocks.DEAD_STONE_PREASURE_PLATE);
                        entries.add(ModBlocks.DEAD_COBBLESTONE);
                        entries.add(ModBlocks.DEAD_COBBLESTONE_STAIRS);
                        entries.add(ModBlocks.DEAD_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.DEAD_COBBLESTONE_WALL);
                        entries.add(ModBlocks.DEAD_STONE_BRICKS);
                        entries.add(ModBlocks.DEAD_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.DEAD_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.DEAD_STONE_BRICK_WALL);
                        entries.add(ModBlocks.DEAD_CRACKED_STONE_BRICKS);
                        entries.add(ModBlocks.DEAD_CRACKED_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.DEAD_CRACKED_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.DEAD_CRACKED_STONE_BRICK_WALL);
                        entries.add(ModBlocks.MOSSY_DEAD_COBBLESTONE);
                        entries.add(ModBlocks.MOSSY_DEAD_COBBLESTONE_STAIRS);
                        entries.add(ModBlocks.MOSSY_DEAD_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.MOSSY_DEAD_COBBLESTONE_WALL);
                        entries.add(ModBlocks.MOSSY_DEAD_STONE_BRICKS);
                        entries.add(ModBlocks.MOSSY_DEAD_STONE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSSY_DEAD_STONE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSSY_DEAD_STONE_BRICK_WALL);
                        entries.add(ModBlocks.DEAD_CHISELED_STONE_BRICKS);
                        entries.add(ModBlocks.DEAD_GLASS);
                        entries.add(ModBlocks.DEAD_GLASS_PANE);
                        entries.add(ModBlocks.GILDEN_ICON);
                        entries.add(ModBlocks.GILDEN_BRICKS);
                        entries.add(ModBlocks.GILDEN_BRICK_STAIRS);
                        entries.add(ModBlocks.GILDEN_BRICK_SLAB);
                        entries.add(ModBlocks.GILDEN_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_GILDEN_BRICKS);
                        entries.add(ModBlocks.CRACKED_GILDEN_BRICK_STAIRS);
                        entries.add(ModBlocks.CRACKED_GILDEN_BRICK_SLAB);
                        entries.add(ModBlocks.CRACKED_GILDEN_BRICK_WALL);

                    }).build());

    public static final ItemGroup PARADIGM_FLOWER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ParadigmMod.MOD_ID, "astraven_logo"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paradigm_flower_tab"))
                    .icon(() -> new ItemStack(ModBlocks.ASTRAVEN)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.ASTRAVEN);
                        entries.add(ModBlocks.WOLFSBANE);
                        entries.add(ModBlocks.KAGAMI_BUD);
                        entries.add(ModBlocks.ROOTFERN);
                        entries.add(ModBlocks.AKAMI_ROSE);
                        entries.add(ModBlocks.HANME);
                        entries.add(ModBlocks.ASHEN_BUD);
                        entries.add(ModBlocks.MOONBLOOM);
                        entries.add(ModBlocks.SHADOWTHORN);
                        entries.add(ModBlocks.SILVERTHORN);
                        entries.add(ModBlocks.DAWN_LILLY);
                        entries.add(ModBlocks.STARBRIGHT_PETAL);
                        entries.add(ModBlocks.RENMI);
                        entries.add(ModBlocks.GILDED_ORCHID);
                        entries.add(ModBlocks.THORNSHADE);
                        entries.add(ModBlocks.MISTVINE);
                        entries.add(ModBlocks.GLOWFERN);
                        entries.add(ModBlocks.FROST_PETAL);
                        entries.add(ModBlocks.EMBERLOTUS);
                        entries.add(ModBlocks.SPECTRAL_ORCHID);
                        entries.add(ModBlocks.PHANTOM_LACE);
                        entries.add(ModBlocks.VOIDMOSS);
                        entries.add(ModBlocks.SCARLET_CURL);
                        entries.add(ModBlocks.STARSHADE);
                        entries.add(ModBlocks.BRIMROSE);
                        entries.add(ModBlocks.GLASSLEAF);
                        entries.add(ModBlocks.FLAMESPIRE);
                        entries.add(ModBlocks.LUNAR_PEONY);
                        entries.add(ModBlocks.BLOOMCROWN);
                        entries.add(ModBlocks.INFERNO_BELL);
                        entries.add(ModBlocks.SEARLING);
                        entries.add(ModBlocks.EBON_ROSE);
                        entries.add(ModBlocks.FADEWISP);
                        entries.add(ModBlocks.GLOOMVINE);
                        entries.add(ModBlocks.EMBERBRUSH);
                        entries.add(ModBlocks.SPIRESAGE);
                        entries.add(ModBlocks.BRIGHTBLOOM);
                        entries.add(ModBlocks.MIRAGE_LOTUS);

                    }).build());

    public static final ItemGroup PARADIGM_RELICS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ParadigmMod.MOD_ID, "god_effigy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paradigm_relics_tab"))
                    .icon(() -> new ItemStack(ModItems.GOD_EFFIGY)).entries((displayContext, entries) -> {

                                entries.add(ModItems.EMPTY_EFFIGY);
                                entries.add(ModItems.EMPTY_JADE_EFFIGY);
                                entries.add(ModItems.EMPTY_SOUL_EFFIGY);
                                entries.add(ModItems.EMPTY_LUNAR_EFFIGY);
                                entries.add(ModItems.EMPTY_SOLAR_EFFIGY);
                                entries.add(ModItems.EMPTY_ESOTERIC_EFFIGY);
                                entries.add(ModItems.EMPTY_REVERENCE_EFFIGY);
                                entries.add(ModItems.EMPTY_AFTERLIFE_EFFIGY);
                                entries.add(ModItems.EMPTY_SEMI_EFFIGY);
                                entries.add(ModItems.EMPTY_DEMI_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_JADE_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_SOUL_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_LUNAR_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_SOLAR_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_ESOTERIC_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_REVERENCE_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_AFTERLIFE_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_SEMI_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_DEMI_EFFIGY);

                                entries.add(ModItems.JADE_EFFIGY);
                                entries.add(ModItems.LUNAR_EFFIGY);
                                entries.add(ModItems.SOLAR_EFFIGY);
                                entries.add(ModItems.ESOTERIC_EFFIGY);
                                entries.add(ModItems.REVERENCE_EFFIGY);
                                entries.add(ModItems.ECLIPSE_EFFIGY);
                                entries.add(ModItems.SOUL_EFFIGY);
                                entries.add(ModItems.AFTERLIFE_EFFIGY);
                                entries.add(ModItems.SEMIGOD_EFFIGY);
                                entries.add(ModItems.DEMIGOD_EFFIGY);
                                entries.add(ModItems.GOD_EFFIGY);

                                entries.add(ModItems.SMILEY_NOTES);
                                entries.add(ModItems.WOODEN_CRUSHER);
                                entries.add(ModItems.STONE_CRUSHER);
                                entries.add(ModItems.IRON_CRUSHER);
                                entries.add(ModItems.GOLD_CRUSHER);
                                entries.add(ModItems.JADE_CRUSHER);
                                entries.add(ModItems.DIAMOND_CRUSHER);
                                entries.add(ModItems.NETHERITE_CRUSHER);

                                entries.add(ModItems.INVERTED_SPEAR);
                                entries.add(ModItems.INVERTED_DIVIDER);
                                entries.add(ModItems.INVERTED_DAGGER);
                                entries.add(ModItems.INVERTED_BLADE);
                                entries.add(ModItems.INVERTED_CUTTER);
                                entries.add(ModItems.INVERTED_HAMMER);
                                entries.add(ModItems.INVERTED_BRAND);
                                entries.add(ModItems.INVERTED_BITE);
                                entries.add(ModItems.SOUL_INVERSION);
                                entries.add(ModItems.SMILEYS_IMPULSE);

                                entries.add(ModItems.ATLAS_BINDMENT);
                                entries.add(ModItems.NOVINGARD_BINDMENT);
                                entries.add(ModItems.ASTRAL_BINDMENT);
                                entries.add(ModItems.GERO_BINDMENT);
                                entries.add(ModItems.ISMENE_BINDMENT);
                                entries.add(ModItems.ULTIMUS_BINDMENT);
                                entries.add(ModItems.UNKNOWN_BINDMENT);

                                entries.add(ModItems.SOUL_DEAL);

                                entries.add(ModItems.BLANK_FAVOR);
                                entries.add(ModItems.ATLAS_FAVOR);
                                entries.add(ModItems.NOVINGARD_FAVOR);
                                entries.add(ModItems.ASTRAL_FAVOR);
                                entries.add(ModItems.GERO_FAVOR);
                                entries.add(ModItems.ISMENE_FAVOR);
                                entries.add(ModItems.ULTIMUS_FAVOR);
                                entries.add(ModItems.UNKNOWN_FAVOR);
                                entries.add(ModItems.PUMPKIN_FAVOR);
                                entries.add(ModItems.TOGG_FAVOR);
                                entries.add(ModItems.VELEN_FAVOR);
                                entries.add(ModItems.ZAPA_FAVOR);
                                entries.add(ModItems.SHADOW_FAVOR);
                                entries.add(ModItems.SMILEY_FAVOR);
                                entries.add(ModItems.NERA_FAVOR);
                                entries.add(ModItems.INVICTUS_FAVOR);
                                entries.add(ModItems.SPECTER_FAVOR);
                                entries.add(ModItems.YETI_FAVOR);
                                entries.add(ModItems.CASTIEL_FAVOR);

                                entries.add(ModItems.ATLAS_WRATH);
                                entries.add(ModItems.ATLAS_BETRAYAL);
                                entries.add(ModItems.NOVINGARD_BLESSING);
                                entries.add(ModItems.NOVINGARD_WISH);
                                entries.add(ModItems.ASTRAL_PRIDE);
                                entries.add(ModItems.ASTRAL_FURY);
                                entries.add(ModItems.GERO_SCAR);
                                entries.add(ModItems.GERO_LUST);
                                entries.add(ModItems.ISMENE_LINE);
                                entries.add(ModItems.ULTIMUS_RING);
                                entries.add(ModItems.UNKNOWN_DARKNESS);
                                entries.add(ModItems.DARK_BINDMENT);
                                entries.add(ModItems.TWIN_SHIELD_ATLAS);
                                entries.add(ModItems.TWIN_SWORD_ATLAS);
                                entries.add(ModItems.DEAD_HEART);
                                entries.add(ModItems.CHARGED_HEART);
                                entries.add(ModItems.FRAGMENTED_ICON);
                                entries.add(ModItems.SKULL_SCYTHE);
                                entries.add(ModItems.GILDEN_BLADE);
                                entries.add(ModItems.GILDEN_CROWN);
                                entries.add(ModItems.TERMINUS_COVERUS);
                                entries.add(ModItems.ENDLESS_MASK);
                                entries.add(ModItems.FLORA_VEIL);
                                entries.add(ModItems.HELLISH_IDENTITY);
                                entries.add(ModItems.ETHEREAL_COVER);
                                entries.add(ModItems.UNKNOWN_SLIDE);
                                entries.add(ModItems.UNKNOWN_MASK);

                                entries.add(ModItems.ADMINCHAIN_HELMET);
                                entries.add(ModItems.ADMINCHAIN_CHESTPLATE);
                                entries.add(ModItems.ADMINCHAIN_LEGGINGS);
                                entries.add(ModItems.ADMINCHAIN_BOOTS);

                                entries.add(ModItems.NETHERITECHAIN_HELMET);
                                entries.add(ModItems.NETHERITECHAIN_CHESTPLATE);
                                entries.add(ModItems.NETHERITECHAIN_LEGGINGS);
                                entries.add(ModItems.NETHERITECHAIN_BOOTS);

                                entries.add(ModItems.DIAMONDCHAIN_HELMET);
                                entries.add(ModItems.DIAMONDCHAIN_CHESTPLATE);
                                entries.add(ModItems.DIAMONDCHAIN_LEGGINGS);
                                entries.add(ModItems.DIAMONDCHAIN_BOOTS);

                                entries.add(ModItems.IRONCHAIN_HELMET);
                                entries.add(ModItems.IRONCHAIN_CHESTPLATE);
                                entries.add(ModItems.IRONCHAIN_LEGGINGS);
                                entries.add(ModItems.IRONCHAIN_BOOTS);
                            }).build());

    public static void registerItemGroups() {
        ParadigmMod.LOGGER.info("Registering Item Groups for " +ParadigmMod.MOD_ID);
    }
}
