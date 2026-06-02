package net.killerkrow.paradigm.fluids;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static FlowableFluid STILL_DEAD_WATER;
    public static FlowableFluid FLOWING_DEAD_WATER;
    public static Block DEAD_WATER_BLOCK;
    public static Item DEAD_WATER_BUCKET;

    public static FlowableFluid STILL_VOYD_ESSENCE;
    public static FlowableFluid FLOWING_VOYD_ESSENCE;
    public static Block VOYD_ESSENCE_BLOCK;
    public static Item VOYD_ESSENCE_BUCKET;

    public static void register() {
        STILL_DEAD_WATER = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "dead_water"), new DeadWaterFluid.Still());
        FLOWING_DEAD_WATER = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_dead_water"), new DeadWaterFluid.Flowing());
        DEAD_WATER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "dead_water_block"),
                new FluidBlock(ModFluids.STILL_DEAD_WATER, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        DEAD_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "dead_water_bucket"),
                new BucketItem(ModFluids.STILL_DEAD_WATER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_VOYD_ESSENCE = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "voyd_essence"), new VoydEssenceFluid.Still());
        FLOWING_VOYD_ESSENCE = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_voyd_essence"), new VoydEssenceFluid.Flowing());
        VOYD_ESSENCE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "voyd_essence_block"),
                new FluidBlock(ModFluids.STILL_VOYD_ESSENCE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        VOYD_ESSENCE_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "voyd_essence_bucket"),
                new BucketItem(ModFluids.STILL_VOYD_ESSENCE, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}