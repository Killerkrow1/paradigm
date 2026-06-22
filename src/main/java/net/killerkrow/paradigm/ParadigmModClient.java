package net.killerkrow.paradigm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.fluids.ModFluids;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class ParadigmModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASTRAVEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ASTRAVEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WOLFSBANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WOLFSBANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KAGAMI_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_KAGAMI_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROOTFERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ROOTFERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AKAMI_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_AKAMI_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_HANME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASHEN_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ASHEN_BUD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOONBLOOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MOONBLOOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SILVERTHORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SILVERTHORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DAWN_LILLY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DAWN_LILLY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STARBRIGHT_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STARBRIGHT_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RENMI, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_RENMI, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GILDED_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GILDED_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THORNSHADE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_THORNSHADE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MISTVINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MISTVINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWFERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GLOWFERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FROST_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FROST_PETAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EMBERLOTUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_EMBERLOTUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPECTRAL_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SPECTRAL_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PHANTOM_LACE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PHANTOM_LACE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VOIDMOSS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_VOIDMOSS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SCARLET_CURL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SCARLET_CURL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STARSHADE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STARSHADE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BRIMROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BRIMROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASSLEAF, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GLASSLEAF, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLAMESPIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FLAMESPIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LUNAR_PEONY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LUNAR_PEONY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLOOMCROWN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLOOMCROWN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.INFERNO_BELL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_INFERNO_BELL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEARLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SEARLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBON_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_EBON_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FADEWISP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_FADEWISP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOOMVINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GLOOMVINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EMBERBRUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_EMBERBRUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPIRESAGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SPIRESAGE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BRIGHTBLOOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BRIGHTBLOOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MIRAGE_LOTUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_MIRAGE_LOTUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHADOWTHORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_SHADOWTHORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REVERENCE_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REVERENCE_VINES_PLANT, RenderLayer.getCutout());

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DEAD_WATER, ModFluids.FLOWING_DEAD_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/dead_water"),
                        new Identifier("paradigm:block/dead_water"),
                        0xA1948E94
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_DEAD_WATER, ModFluids.FLOWING_DEAD_WATER);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_VOYD_ESSENCE, ModFluids.FLOWING_VOYD_ESSENCE,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/voyd_essence"),
                        new Identifier("paradigm:block/voyd_essence"),
                        0xA1B528FC
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_VOYD_ESSENCE, ModFluids.FLOWING_VOYD_ESSENCE);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_JADE_EFFIGY, ModFluids.FLOWING_JADE_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/jade_fluid"),
                        new Identifier("paradigm:block/jade_fluid"),
                        0xA7BD16D
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_JADE_EFFIGY, ModFluids.FLOWING_JADE_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_AFTERLIFE_EFFIGY, ModFluids.FLOWING_AFTERLIFE_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/afterlife_fluid"),
                        new Identifier("paradigm:block/afterlife_fluid"),
                        0xAF51818
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_AFTERLIFE_EFFIGY, ModFluids.FLOWING_AFTERLIFE_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_ESOTERIC_EFFIGY, ModFluids.FLOWING_ESOTERIC_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/esoteric_fluid"),
                        new Identifier("paradigm:block/esoteric_fluid"),
                        0xA705F32
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_ESOTERIC_EFFIGY, ModFluids.FLOWING_ESOTERIC_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SOUL_EFFIGY, ModFluids.FLOWING_SOUL_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/soul_fluid"),
                        new Identifier("paradigm:block/soul_fluid"),
                        0xA45E6E6
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SOUL_EFFIGY, ModFluids.FLOWING_SOUL_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_DEMIGOD_EFFIGY, ModFluids.FLOWING_DEMIGOD_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/demigod_fluid"),
                        new Identifier("paradigm:block/demigod_fluid"),
                        0xA319E9E
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_DEMIGOD_EFFIGY, ModFluids.FLOWING_DEMIGOD_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_REVERENCE_EFFIGY, ModFluids.FLOWING_REVERENCE_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/reverence_fluid"),
                        new Identifier("paradigm:block/reverence_fluid"),
                        0xA42E6FF
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_REVERENCE_EFFIGY, ModFluids.FLOWING_REVERENCE_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SEMIGOD_EFFIGY, ModFluids.FLOWING_SEMIGOD_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/semigod_fluid"),
                        new Identifier("paradigm:block/semigod_fluid"),
                        0xAED6FC8
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SEMIGOD_EFFIGY, ModFluids.FLOWING_SEMIGOD_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LUNAR_EFFIGY, ModFluids.FLOWING_LUNAR_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/lunar_fluid"),
                        new Identifier("paradigm:block/lunar_fluid"),
                        0xAE8DAE4
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_LUNAR_EFFIGY, ModFluids.FLOWING_LUNAR_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SOLAR_EFFIGY, ModFluids.FLOWING_SOLAR_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/solar_fluid"),
                        new Identifier("paradigm:block/solar_fluid"),
                        0xAFF9452
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_SOLAR_EFFIGY, ModFluids.FLOWING_SOLAR_EFFIGY);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GOD_EFFIGY, ModFluids.FLOWING_GOD_EFFIGY,
                new SimpleFluidRenderHandler(
                        new Identifier("paradigm:block/god_fluid"),
                        new Identifier("paradigm:block/god_fluid"),
                        0xACB38E0
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_GOD_EFFIGY, ModFluids.FLOWING_GOD_EFFIGY);
    }
}
