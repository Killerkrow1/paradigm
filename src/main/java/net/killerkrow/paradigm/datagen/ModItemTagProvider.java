package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.WOODEN_CRUSHER.asItem())
                .add(ModItems.STONE_CRUSHER.asItem())
                .add(ModItems.IRON_CRUSHER.asItem())
                .add(ModItems.GOLD_CRUSHER.asItem())
                .add(ModItems.JADE_CRUSHER.asItem())
                .add(ModItems.DIAMOND_CRUSHER.asItem())
                .add(ModItems.NETHERITE_CRUSHER.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ADMINCHAIN_BOOTS, ModItems.ADMINCHAIN_LEGGINGS, ModItems.ADMINCHAIN_CHESTPLATE, ModItems.ADMINCHAIN_HELMET,
                        ModItems.IRONCHAIN_BOOTS, ModItems.IRONCHAIN_LEGGINGS, ModItems.IRONCHAIN_CHESTPLATE, ModItems.IRONCHAIN_HELMET,
                        ModItems.DIAMONDCHAIN_BOOTS, ModItems.DIAMONDCHAIN_LEGGINGS, ModItems.DIAMONDCHAIN_CHESTPLATE, ModItems.DIAMONDCHAIN_HELMET,
                        ModItems.NETHERITECHAIN_BOOTS, ModItems.NETHERITECHAIN_LEGGINGS, ModItems.NETHERITECHAIN_CHESTPLATE, ModItems.NETHERITECHAIN_HELMET);

        getOrCreateTagBuilder(ModTags.Items.CRUSHER_ITEM)
                .add(ModItems.WOODEN_CRUSHER, ModItems.STONE_CRUSHER, ModItems.IRON_CRUSHER, ModItems.GOLD_CRUSHER,
                        ModItems.JADE_CRUSHER, ModItems.DIAMOND_CRUSHER, ModItems.NETHERITE_CRUSHER);

        getOrCreateTagBuilder(ModTags.Items.BINDMENT_ITEM)
                .add(ModItems.ATLAS_BINDMENT, ModItems.NOVINGARD_BINDMENT, ModItems.ASTRAL_BINDMENT, ModItems.GERO_BINDMENT,
                        ModItems.ISMENE_BINDMENT, ModItems.ULTIMUS_BINDMENT, ModItems.UNKNOWN_BINDMENT);

        getOrCreateTagBuilder(ModTags.Items.FAVOR_ITEM)
                .add(ModItems.ATLAS_FAVOR, ModItems.NOVINGARD_FAVOR, ModItems.ASTRAL_FAVOR, ModItems.GERO_FAVOR, ModItems.ISMENE_FAVOR,
                        ModItems.ULTIMUS_FAVOR, ModItems.UNKNOWN_FAVOR, ModItems.PUMPKIN_FAVOR, ModItems.TOGG_FAVOR, ModItems.VELEN_FAVOR,
                        ModItems.ZAPA_FAVOR, ModItems.SHADOW_FAVOR, ModItems.SMILEY_FAVOR, ModItems.NERA_FAVOR, ModItems.INVICTUS_FAVOR,
                        ModItems.SPECTER_FAVOR, ModItems.YETI_FAVOR, ModItems.BLANK_FAVOR, ModItems.FAVOR_OF_DIVINITY, ModItems.GOD_FAVOR,
                        ModItems.DEMIGOD_FAVOR);
    }
}
