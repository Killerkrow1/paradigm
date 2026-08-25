package net.killerkrow.paradigm.block.entities;

import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.screen.EffigeriumFurnaceScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class EffigeriumFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public EffigeriumFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(ParadigmMod.KILN_BLOCK_ENTITY, pos, state, ParadigmMod.KILN_RECIPE_TYPE);
    }

    @Override
    protected int getFuelTime(ItemStack fuel) {
        return super.getFuelTime(fuel) / 2;
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container." + ParadigmMod.MOD_ID + ".kiln");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new EffigeriumFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}