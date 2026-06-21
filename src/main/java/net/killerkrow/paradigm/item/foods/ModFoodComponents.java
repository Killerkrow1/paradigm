package net.killerkrow.paradigm.item.foods;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent REVERENCE_BERRY = new FoodComponent.Builder().hunger(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .build();
    public static final FoodComponent BOWL_OF_REVERENCE_BERRIES = new FoodComponent.Builder().hunger(12).saturationModifier(0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300), 1)
            .build();

    public static final FoodComponent POPCORN = new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(1f).build();
    public static final FoodComponent COOKED_SCULK_RICE = new FoodComponent.Builder().hunger(7).saturationModifier(0.5f).build();
    public static final FoodComponent SCULK_ROLL = new FoodComponent.Builder().hunger(24).saturationModifier(0.25f).build();
    public static final FoodComponent SCULK_ROLL_SLICE = new FoodComponent.Builder().hunger(8).saturationModifier(0.75f).build();
    public static final FoodComponent SCULK_FRITTER = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent SCULK_CABBAGE = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();
    public static final FoodComponent SCULK_CHEESE = new FoodComponent.Builder().hunger(8).saturationModifier(0.5f).build();
    public static final FoodComponent SCULK_TEA = new FoodComponent.Builder().hunger(1).saturationModifier(1f).build();
    public static final FoodComponent SCULK_BREAD = new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build();

    public static final FoodComponent GOLDEN_REVERENCE_BERRY = new FoodComponent.Builder().hunger(8).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.SATURATION, 600), 1)
            .statusEffect(new StatusEffectInstance(
                    StatusEffects.ABSORPTION, 200,2),  1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F)
            .build();

}
