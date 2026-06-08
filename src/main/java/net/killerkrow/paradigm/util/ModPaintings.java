package net.killerkrow.paradigm.util;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant ABSTRACTION = Registry.register(
            Registries.PAINTING_VARIANT,
            new Identifier("paradigm", "abstraction"),
            new PaintingVariant(16, 16)
    );
    public static final PaintingVariant ABSTRACTION_2X2 = Registry.register(
            Registries.PAINTING_VARIANT,
            new Identifier("paradigm", "abstraction_2x2"),
            new PaintingVariant(32, 32)
    );
    public static final PaintingVariant ABSTRACTION_3X3 = Registry.register(
            Registries.PAINTING_VARIANT,
            new Identifier("paradigm", "abstraction_3x3"),
            new PaintingVariant(48, 48)
    );

    public static void registerPaintings() {

    }
}