package net.killerkrow.paradigm.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;

public class HasOffhandComponentImpl extends HasOffhandComponent {
    private boolean hasOffhand = true;
    private final PlayerEntity player;

    public HasOffhandComponentImpl(PlayerEntity player) {
        this.player = player;
    }

    @Override public boolean hasOffhand() { return hasOffhand; }

    @Override
    public void setHasOffhand(boolean value) {
        this.hasOffhand = value;
        HasOffhandComponent.KEY.sync(player);
    }

    @Override
    public void readFromNbt(NbtCompound tag) {
        hasOffhand = tag.getBoolean("hasOffhand");
    }

    @Override
    public void writeToNbt(NbtCompound tag) {
        tag.putBoolean("hasOffhand", hasOffhand);
    }
}