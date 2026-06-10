package net.killerkrow.paradigm.sound;

import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent DEAD_SOUND = registerSoundEvent("dead_sound");
    public static final SoundEvent SQUEAK_SOUND = registerSoundEvent("squeak_sound");

    public static final SoundEvent SEP_ABSORPTION = registerSoundEvent("sep_absorption");
    public static final SoundEvent SEP_REMOVAL = registerSoundEvent("sep_removal");

    public static final BlockSoundGroup DEAD_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.DEAD_SOUND, ModSounds.DEAD_SOUND, ModSounds.DEAD_SOUND,
            ModSounds.DEAD_SOUND, ModSounds.DEAD_SOUND);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ParadigmMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        ParadigmMod.LOGGER.info("Registering Sounds for " + ParadigmMod.MOD_ID);
    }
}
