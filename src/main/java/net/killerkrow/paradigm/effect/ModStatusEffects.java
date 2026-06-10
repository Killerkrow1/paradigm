package net.killerkrow.paradigm.effect;

import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {

    public static final StatusEffect SOUL_STRAIN = new SoulStrainEffect();
    public static final StatusEffect WATCHED = new WatchedEffect();

    public static void initialize() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(ParadigmMod.MOD_ID, "soul_strain"), SOUL_STRAIN);
        Registry.register(Registries.STATUS_EFFECT, new Identifier(ParadigmMod.MOD_ID, "watched_effect"), WATCHED);

        ParadigmMod.LOGGER.info("Registering Effects For " + ParadigmMod.MOD_ID);
    }

}