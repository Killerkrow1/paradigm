package net.killerkrow.paradigm;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.effect.WatchedEffect;
import net.killerkrow.paradigm.fluids.ModFluids;
import net.killerkrow.paradigm.item.ModItemGroups;
import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.util.ModPaintings;
import net.killerkrow.paradigm.sound.ModSounds;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParadigmMod implements ModInitializer {
	public static final String MOD_ID = "paradigm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final StatusEffect WATCHED_EFFECT = new WatchedEffect();

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModFluids.register();
		ModPaintings.registerPaintings();

		Registry.register(Registries.STATUS_EFFECT, new Identifier("paradigm",
				"watched_effect"), WATCHED_EFFECT);

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DEAD_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GILDEN_ICON, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SOUL_CHARGED_LANTERN, RenderLayer.getTranslucent());


	}
}