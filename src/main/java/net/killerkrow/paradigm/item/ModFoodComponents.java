package net.killerkrow.paradigm.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent REVERENCE_BERRY = new FoodComponent.Builder().alwaysEdible().hunger(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .build();
    public static final FoodComponent BOWL_OF_REVERENCE_BERRIES = new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1)
            .build();

    public static final FoodComponent POPCORN = new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(1f).build();
    public static final FoodComponent COOKED_SCULK_RICE = new FoodComponent.Builder().alwaysEdible().hunger(7).saturationModifier(1f).build();
    public static final FoodComponent SCULK_ROLL = new FoodComponent.Builder().alwaysEdible().hunger(24).saturationModifier(2f).build();
    public static final FoodComponent SCULK_ROLL_SLICE = new FoodComponent.Builder().alwaysEdible().hunger(8).saturationModifier(1f).build();
    public static final FoodComponent SCULK_FRITTER = new FoodComponent.Builder().alwaysEdible().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent SCULK_CABBAGE = new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(0.5f).build();
    public static final FoodComponent SCULK_CHEESE = new FoodComponent.Builder().alwaysEdible().hunger(8).saturationModifier(2.25f).build();
    public static final FoodComponent SCULK_TEA = new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(1f).build();
    public static final FoodComponent SCULK_BREAD = new FoodComponent.Builder().alwaysEdible().hunger(5).saturationModifier(2.4f).build();

    public static final FoodComponent GOLDEN_REVERENCE_BERRY = new FoodComponent.Builder().alwaysEdible().hunger(8).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.SATURATION, 600), 1)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.ABSORPTION, 200,2),  1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F)
            .build();

}
