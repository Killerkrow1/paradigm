package net.killerkrow.paradigm;

import net.fabricmc.api.ModInitializer;

import net.killerkrow.paradigm.block.ModBlocks;
import net.killerkrow.paradigm.item.ModItemGroups;
import net.killerkrow.paradigm.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParadigmMod implements ModInitializer {
	public static final String MOD_ID = "paradigm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}