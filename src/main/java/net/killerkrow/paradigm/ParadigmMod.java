package net.killerkrow.paradigm;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.block.entities.EffigeriumFurnaceBlockEntity;
import net.killerkrow.paradigm.effect.ModStatusEffects;
import net.killerkrow.paradigm.fluids.ModFluids;
import net.killerkrow.paradigm.item.ModItemGroups;
import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.recipe.EffigeriumFurnaceRecipe;
import net.killerkrow.paradigm.screen.EffigeriumFurnaceScreenHandler;
import net.killerkrow.paradigm.util.ModComponents;
import net.killerkrow.paradigm.util.ModLootTableModifiers;
import net.killerkrow.paradigm.util.ModPaintings;
import net.killerkrow.paradigm.util.ModSounds;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParadigmMod implements ModInitializer {
	public static final String MOD_ID = "paradigm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static RecipeType<EffigeriumFurnaceRecipe> KILN_RECIPE_TYPE;
	public static BlockEntityType<EffigeriumFurnaceBlockEntity> KILN_BLOCK_ENTITY;

	public static RecipeSerializer<EffigeriumFurnaceRecipe> KILN_RECIPE_SERIALIZER;

	public static ScreenHandlerType<EffigeriumFurnaceScreenHandler> KILN_SCREEN_HANDLER;

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModFluids.register();
		ModPaintings.registerPaintings();
		ModLootTableModifiers.modifyLootTables();
		ModStatusEffects.initialize();
		ModComponents.initialize();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GILDEN_ICON, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOUL_CHARGED_LANTERN, RenderLayer.getTranslucent());

		KILN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "kiln"),
				FabricBlockEntityTypeBuilder.create(EffigeriumFurnaceBlockEntity::new, ModBlocks.EFFIGERIUM_FURNACE).build());

		KILN_RECIPE_TYPE = Registry.register(Registries.RECIPE_TYPE, new Identifier(MOD_ID, "kiln"), new RecipeType<EffigeriumFurnaceRecipe>() {
			@Override
			public String toString() {
				return "kiln";
			}
		});

		KILN_RECIPE_SERIALIZER = Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MOD_ID, "kiln"), new CookingRecipeSerializer<EffigeriumFurnaceRecipe>(EffigeriumFurnaceRecipe::new, 100));
		KILN_SCREEN_HANDLER = new ScreenHandlerType<EffigeriumFurnaceScreenHandler>(EffigeriumFurnaceScreenHandler::new, FeatureSet.empty());
		Registry.register(Registries.SCREEN_HANDLER, new Identifier(MOD_ID, "kiln"), KILN_SCREEN_HANDLER);
	}
}