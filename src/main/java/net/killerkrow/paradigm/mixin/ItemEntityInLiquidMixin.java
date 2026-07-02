package net.killerkrow.paradigm.mixin;

import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.util.ModSounds;
import net.killerkrow.paradigm.util.ModTags;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//Jarvis, initiate Terraria Shimmer Sequence
@Mixin(ItemEntity.class)
public abstract class ItemEntityInLiquidMixin {
    @Shadow public abstract ItemStack getStack();
    @Shadow public abstract void setStack(ItemStack stack);

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        ItemEntity itemEntity = (ItemEntity) (Object) this;

        if (itemEntity.getWorld().isClient()) {
            return;
        }

        // ARE YOU IN THE RIGHT THING?
        if (itemEntity.isSubmergedIn(ModTags.Fluid.VOYD_ESSENCE)) {
            ItemStack stack = getStack();
            ItemStack resultStack = getTransmutation(stack);

            if (resultStack != null) {
                // Actually does the shimmer transmutation
                setStack(resultStack);

                // Global Sound
                BlockPos pos = itemEntity.getBlockPos();
                itemEntity.getWorld().playSound(
                        null,
                        pos,
                        ModSounds.TRANSMUTATION,
                        SoundCategory.PLAYERS,
                        1.0f,
                        1.0f
                );
            }
        }
    }

    private ItemStack getTransmutation(ItemStack input) {
        // Transmutation Tables
        if (input.isOf(ModItems.ELDRITCH_RITE)) {
            return new ItemStack(ModItems.MARK_OF_THE_ARCHITECT, input.getCount());
        } else if (input.isOf(Items.DIAMOND)) {
            return new ItemStack(Items.GOLD_INGOT, input.getCount());
        }
        // If you no throw correct item, you will get NOTHING BROKE BOY
        return null;
    }
}