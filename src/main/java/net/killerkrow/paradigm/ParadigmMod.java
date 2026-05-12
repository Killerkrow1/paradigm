package net.killerkrow.paradigm;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParadigmMod implements ModInitializer {
	public static final String MOD_ID = "paradigm";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("I'm the biggest bird - Killerkrow");
	}
}