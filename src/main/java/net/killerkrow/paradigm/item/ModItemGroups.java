package net.killerkrow.paradigm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PARADIGM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ParadigmMod.MOD_ID, "astraven_logo"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paradigm_tab"))
                    .icon(() -> new ItemStack(ModItems.ASTRAVEN_LOGO)).entries((displayContext, entries) -> {

                        entries.add(ModItems.REVERENCE_BERRY);
                        entries.add(ModItems.GOLDEN_REVERENCE_BERRY);
                        entries.add(ModBlocks.REVERENCE_BERRY_SACK);
                        entries.add(ModBlocks.VOYD_DARK);
                        entries.add(ModItems.EFFIGERIUM_SHARDS);
                        entries.add(ModItems.EFFIGERIUM_INGOT);
                        entries.add(ModItems.EFFIGERIUM_DUST);
                        entries.add(ModItems.GRODIUM_CRYSTALS);
                        entries.add(ModItems.GRODIUM_INGOT);
                        entries.add(ModItems.GRODIUM_DUST);

                    }).build());

    public static final ItemGroup PARADIGM_RELICS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ParadigmMod.MOD_ID, "god_effigy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paradigm_relics_tab"))
                    .icon(() -> new ItemStack(ModItems.GOD_EFFIGY)).entries((displayContext, entries) -> {

                                entries.add(ModItems.SMILEY_NOTES);

                                entries.add(ModItems.EMPTY_EFFIGY);
                                entries.add(ModItems.EMPTY_JADE_EFFIGY);
                                entries.add(ModItems.EMPTY_SOUL_EFFIGY);
                                entries.add(ModItems.EMPTY_AFTERLIFE_EFFIGY);
                                entries.add(ModItems.EMPTY_SEMI_EFFIGY);
                                entries.add(ModItems.EMPTY_DEMI_EFFIGY);
                                entries.add(ModItems.EMPTY_LUNAR_EFFIGY);
                                entries.add(ModItems.EMPTY_SOLAR_EFFIGY);
                                entries.add(ModItems.EMPTY_ESOTERIC_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_JADE_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_SOUL_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_AFTERLIFE_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_SEMI_EFFIGY);
                                entries.add(ModItems.CHARGED_EMPTY_DEMI_EFFIGY);

                                entries.add(ModItems.JADE_EFFIGY);
                                entries.add(ModItems.SOUL_EFFIGY);
                                entries.add(ModItems.AFTERLIFE_EFFIGY);
                                entries.add(ModItems.SEMIGOD_EFFIGY);
                                entries.add(ModItems.DEMIGOD_EFFIGY);
                                entries.add(ModItems.GOD_EFFIGY);

                                entries.add(ModItems.WOODEN_CRUSHER);
                                entries.add(ModItems.STONE_CRUSHER);
                                entries.add(ModItems.IRON_CRUSHER);
                                entries.add(ModItems.GOLD_CRUSHER);
                                entries.add(ModItems.JADE_CRUSHER);
                                entries.add(ModItems.DIAMOND_CRUSHER);
                                entries.add(ModItems.NETHERITE_CRUSHER);

                            }).build());

    public static void registerItemGroups() {
        ParadigmMod.LOGGER.info("Registering Item Groups for " +ParadigmMod.MOD_ID);
    }
}
