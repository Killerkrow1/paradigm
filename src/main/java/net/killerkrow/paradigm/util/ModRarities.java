package net.killerkrow.paradigm.util;

import net.minecraft.text.TextColor;

public enum ModRarities {
    SOUL_DEAL(TextColor.fromRgb(0xB39E68)),
    SEP(TextColor.fromRgb(0xED0C0C)),
    SOUL(TextColor.fromRgb(0x27F5D6)),
    INVERTED(TextColor.fromRgb(0x5BE3E8));

    public final TextColor color;

    ModRarities(TextColor color) {
        this.color = color;
    }
}