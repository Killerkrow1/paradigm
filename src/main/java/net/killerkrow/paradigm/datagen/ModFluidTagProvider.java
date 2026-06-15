package net.killerkrow.paradigm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.killerkrow.paradigm.fluids.ModFluids;
import net.killerkrow.paradigm.util.ModTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModFluidTagProvider extends FabricTagProvider.FluidTagProvider {
    public ModFluidTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(ModTags.Fluid.VOYD_ESSENCE)
                .add(ModFluids.STILL_VOYD_ESSENCE)
                .add(ModFluids.FLOWING_VOYD_ESSENCE);
    }
}