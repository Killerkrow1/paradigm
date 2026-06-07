package net.killerkrow.paradigm.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.text.Text;

import java.util.List;
import java.util.Random;

public class WatchedEffect extends StatusEffect {

    private static final List<String> VARIANTS = List.of(
            "...",
            "Martyr",
            "Champion",
            "Benefactor",
            "Beneficiary",
            "Outcast",
            "Supernumerary",
            "Expendable",
            "Misfit",
            "Marionette",
            "Pertinacious",
            "Receptacle",
            "Worthless",
            "Etheric",
            "Transcendent"
    );

    private String cachedName = VARIANTS.get(0);
    private int tickCounter = 0;

    public WatchedEffect() {
        super(StatusEffectCategory.HARMFUL, 0x840E0E);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        tickCounter++;
        if (tickCounter >= 20) {
            cachedName = VARIANTS.get(new Random().nextInt(VARIANTS.size()));
            tickCounter = 0;
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public Text getName() {
        return Text.literal(cachedName);
    }

}