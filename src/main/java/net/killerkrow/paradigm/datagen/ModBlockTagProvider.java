package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModBlocks.ASTRAVEN, ModBlocks.WOLFSBANE, ModBlocks.KAGAMI_BUD, ModBlocks.ROOTFERN, ModBlocks.AKAMI_ROSE, ModBlocks.HANME,
                        ModBlocks.ASTRAVEN, ModBlocks.MOONBLOOM, ModBlocks.SILVERTHORN, ModBlocks.DAWN_LILLY, ModBlocks.STARBRIGHT_PETAL, ModBlocks.RENMI,
                        ModBlocks.GILDED_ORCHID, ModBlocks.THORNSHADE, ModBlocks.MISTVINE, ModBlocks.GLOWFERN, ModBlocks.FROST_PETAL, ModBlocks.EMBERLOTUS,
                        ModBlocks.SPECTRAL_ORCHID, ModBlocks.PHANTOM_LACE, ModBlocks.VOIDMOSS, ModBlocks.SCARLET_CURL, ModBlocks.STARSHADE, ModBlocks.BRIMROSE,
                        ModBlocks.GLASSLEAF, ModBlocks.FLAMESPIRE, ModBlocks.LUNAR_PEONY, ModBlocks.BLOOMCROWN, ModBlocks.INFERNO_BELL, ModBlocks.SEARLING,
                        ModBlocks.EBON_ROSE, ModBlocks.FADEWISP, ModBlocks.GLOOMVINE, ModBlocks.EMBERBRUSH, ModBlocks.SPIRESAGE, ModBlocks.BRIGHTBLOOM,
                        ModBlocks.MIRAGE_LOTUS, ModBlocks.SHADOWTHORN
                );


    }
}
