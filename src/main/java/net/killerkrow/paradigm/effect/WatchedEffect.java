package net.killerkrow.paradigm.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class WatchedEffect extends StatusEffect {
    public WatchedEffect() {
        // Category can be BENEFICIAL or HARMFUL. Provide a color in Hexadecimal (RGB).
        super(StatusEffectCategory.HARMFUL, 0x840E0E);
    }

    // Determines if applyUpdateEffect() should be called this tick
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true; // Return true to make it trigger every tick
    }

}
