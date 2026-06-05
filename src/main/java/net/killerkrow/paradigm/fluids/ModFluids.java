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

    public static FlowableFluid STILL_JADE_EFFIGY;
    public static FlowableFluid FLOWING_JADE_EFFIGY;
    public static Block JADE_EFFIGY_BLOCK;
    public static Item JADE_EFFIGY_BUCKET;

    public static FlowableFluid STILL_AFTERLIFE_EFFIGY;
    public static FlowableFluid FLOWING_AFTERLIFE_EFFIGY;
    public static Block AFTERLIFE_EFFIGY_BLOCK;
    public static Item AFTERLIFE_EFFIGY_BUCKET;

    public static FlowableFluid STILL_ESOTERIC_EFFIGY;
    public static FlowableFluid FLOWING_ESOTERIC_EFFIGY;
    public static Block ESOTERIC_EFFIGY_BLOCK;
    public static Item ESOTERIC_EFFIGY_BUCKET;

    public static FlowableFluid STILL_SOUL_EFFIGY;
    public static FlowableFluid FLOWING_SOUL_EFFIGY;
    public static Block SOUL_EFFIGY_BLOCK;
    public static Item SOUL_EFFIGY_BUCKET;

    public static FlowableFluid STILL_DEMIGOD_EFFIGY;
    public static FlowableFluid FLOWING_DEMIGOD_EFFIGY;
    public static Block DEMIGOD_EFFIGY_BLOCK;
    public static Item DEMIGOD_EFFIGY_BUCKET;

    public static FlowableFluid STILL_REVERENCE_EFFIGY;
    public static FlowableFluid FLOWING_REVERENCE_EFFIGY;
    public static Block REVERENCE_EFFIGY_BLOCK;
    public static Item REVERENCE_EFFIGY_BUCKET;

    public static FlowableFluid STILL_SEMIGOD_EFFIGY;
    public static FlowableFluid FLOWING_SEMIGOD_EFFIGY;
    public static Block SEMIGOD_EFFIGY_BLOCK;
    public static Item SEMIGOD_EFFIGY_BUCKET;

    public static FlowableFluid STILL_LUNAR_EFFIGY;
    public static FlowableFluid FLOWING_LUNAR_EFFIGY;
    public static Block LUNAR_EFFIGY_BLOCK;
    public static Item LUNAR_EFFIGY_BUCKET;

    public static FlowableFluid STILL_SOLAR_EFFIGY;
    public static FlowableFluid FLOWING_SOLAR_EFFIGY;
    public static Block SOLAR_EFFIGY_BLOCK;
    public static Item SOLAR_EFFIGY_BUCKET;

    public static FlowableFluid STILL_GOD_EFFIGY;
    public static FlowableFluid FLOWING_GOD_EFFIGY;
    public static Block GOD_EFFIGY_BLOCK;
    public static Item GOD_EFFIGY_BUCKET;

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

        STILL_JADE_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "jade_effigy_fluid"), new JadeEffigyFluid.Still());
        FLOWING_JADE_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_jade_effigy_fluid"), new JadeEffigyFluid.Flowing());
        JADE_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "jade_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_JADE_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        JADE_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "jade_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_JADE_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_AFTERLIFE_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "afterlife_effigy_fluid"), new AfterlifeEffigyFluid.Still());
        FLOWING_AFTERLIFE_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_afterlife_effigy_fluid"), new AfterlifeEffigyFluid.Flowing());
        AFTERLIFE_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "afterlife_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_AFTERLIFE_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        AFTERLIFE_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "afterlife_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_AFTERLIFE_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_ESOTERIC_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "esoteric_effigy_fluid"), new EsotericEffigyFluid.Still());
        FLOWING_ESOTERIC_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_esoteric_effigy_fluid"), new EsotericEffigyFluid.Flowing());
        ESOTERIC_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "esoteric_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_ESOTERIC_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        ESOTERIC_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "esoteric_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_ESOTERIC_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_SOUL_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "soul_effigy_fluid"), new SoulEffigyFluid.Still());
        FLOWING_SOUL_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_soul_effigy_fluid"), new SoulEffigyFluid.Flowing());
        SOUL_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "soul_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_SOUL_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        SOUL_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "soul_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_SOUL_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_DEMIGOD_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "demigod_effigy_fluid"), new DemigodEffigyFluid.Still());
        FLOWING_DEMIGOD_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_demigod_effigy_fluid"), new DemigodEffigyFluid.Flowing());
        DEMIGOD_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "demigod_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_DEMIGOD_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        DEMIGOD_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "demigod_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_DEMIGOD_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_REVERENCE_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "reverence_effigy_fluid"), new ReverenceEffigyFluid.Still());
        FLOWING_REVERENCE_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_reverence_effigy_fluid"), new ReverenceEffigyFluid.Flowing());
        REVERENCE_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "reverence_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_REVERENCE_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        REVERENCE_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "reverence_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_REVERENCE_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_SEMIGOD_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "semigod_effigy_fluid"), new SemigodEffigyFluid.Still());
        FLOWING_SEMIGOD_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_semigod_effigy_fluid"), new SemigodEffigyFluid.Flowing());
        SEMIGOD_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "semigod_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_SEMIGOD_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        SEMIGOD_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "semigod_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_SEMIGOD_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_LUNAR_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "lunar_effigy_fluid"), new LunarEffigyFluid.Still());
        FLOWING_LUNAR_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_lunar_effigy_fluid"), new LunarEffigyFluid.Flowing());
        LUNAR_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "lunar_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_LUNAR_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        LUNAR_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "lunar_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_LUNAR_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_SOLAR_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "solar_effigy_fluid"), new SolarEffigyFluid.Still());
        FLOWING_SOLAR_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_solar_effigy_fluid"), new SolarEffigyFluid.Flowing());
        SOLAR_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "solar_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_SOLAR_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        SOLAR_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "solar_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_SOLAR_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

        STILL_GOD_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "god_effigy_fluid"), new GodEffigyFluid.Still());
        FLOWING_GOD_EFFIGY = Registry.register(Registries.FLUID,
                new Identifier(ParadigmMod.MOD_ID, "flowing_god_effigy_fluid"), new GodEffigyFluid.Flowing());
        GOD_EFFIGY_BLOCK = Registry.register(Registries.BLOCK, new Identifier(ParadigmMod.MOD_ID, "god_effigy_fluid_block"),
                new FluidBlock(ModFluids.STILL_GOD_EFFIGY, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        GOD_EFFIGY_BUCKET = Registry.register(Registries.ITEM, new Identifier(ParadigmMod.MOD_ID, "god_effigy_fluid_bucket"),
                new BucketItem(ModFluids.STILL_GOD_EFFIGY, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }
}