package net.killerkrow.paradigm.mixin;

import net.killerkrow.paradigm.item.ModItems;
import net.killerkrow.paradigm.util.ModTags;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//Jarvis, initiate Terraria Shimmer Sequence
@Mixin(ItemEntity.class)
public abstract class ItemInLiquidMixin {
    @Shadow public abstract ItemStack getStack();

    @Inject(method = "tick", at = @At("HEAD"))
    private void transformItemInLiquid(CallbackInfo ci) {
        ItemEntity itemEntity = (ItemEntity) (Object) this;

        // Runs server side only to avoid a duplicate, I'm tempted to poof this to test it out
        if (itemEntity.getWorld().isClient()) {
            return;
        }

        // IS IT SUBMERGED
        if (itemEntity.isSubmergedIn(ModTags.Fluid.VOYD_ESSENCE)) { // I have no clue how tf to fix this
            ItemStack stack = this.getStack();

            // THIS IS THE ITEM THROWN IN
            if (stack.getItem() == ModItems.ELDRITCH_RITE) { // Placeholder item for now, it'll get fixed later
                ItemEntity transformedEntity = getItemEntity(stack, itemEntity);
                itemEntity.getWorld().spawnEntity(transformedEntity);

                // This deletes the old/initially thrown item
                itemEntity.discard();
            }
        }
    }

    private static @NotNull ItemEntity getItemEntity(ItemStack stack, ItemEntity itemEntity) {
        int count = stack.getCount();

        // Spawns da new item at the location of the other
        ItemStack transformedStack = new ItemStack(ModItems.MARK_OF_THE_ARCHITECT, count);
        ItemEntity transformedEntity = new ItemEntity(
                itemEntity.getWorld(),
                itemEntity.getX(),
                itemEntity.getY(),
                itemEntity.getZ(),
                transformedStack
        );


        // Natural stuff by copying momentum and velocity
        transformedEntity.setVelocity(itemEntity.getVelocity());
        return transformedEntity;
    }
}