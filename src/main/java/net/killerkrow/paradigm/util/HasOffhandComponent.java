package net.killerkrow.paradigm.util;

import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import net.killerkrow.paradigm.ParadigmMod;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

public class HasOffhandComponent implements ComponentV3 {
    boolean hasOffhand() {
        return false;
    }

    void setHasOffhand(boolean value) {

    }

    static ComponentKey<HasOffhandComponent> KEY = ComponentRegistryV3.INSTANCE.getOrCreate(
            new Identifier(ParadigmMod.MOD_ID, "has_offhand"), HasOffhandComponent.class
    );

    @Override
    public void readFromNbt(NbtCompound nbtCompound) {

    }

    @Override
    public void writeToNbt(NbtCompound nbtCompound) {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}