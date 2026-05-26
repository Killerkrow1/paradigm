package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.killerkrow.paradigm.item.ModItems;
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
    }
}
