package net.killerkrow.paradigm.util;

import net.fabricmc.yarn.constants.MiningLevels;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ParadigmToolMaterials implements ToolMaterial {
    CRUSHERWOOD(MiningLevels.WOOD, 59, 4.0F, 3.0F, 15,
            () -> Ingredient.fromTag(ItemTags.PLANKS)),
    CRUSHERSTONE(MiningLevels.STONE, 131, 5.0F, 4.0F, 5,
            () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    CRUSHERIRON(MiningLevels.IRON, 250, 6.0F, 5.0F, 14,
            () -> Ingredient.ofItems(Items.IRON_INGOT)),
    CRUSHERGOLD(MiningLevels.IRON, 561, 9.0F, 5.0F, 22,
            () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    CRUSHERJADE(MiningLevels.DIAMOND, 1084, 7.0F, 6.0F, 10,
            () -> Ingredient.ofItems(ModItems.JADE_BRICK)),
    CRUSHERDIAMOND(MiningLevels.DIAMOND, 1561 , 7.0F, 6.0F, 10,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    CRUSHERNETHERITE(MiningLevels.NETHERITE, 2031, 8.0F, 7.0F, 15,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    IMPERIUM(MiningLevels.NETHERITE, 2031, 9.0F, 0.0F, 15,
            () -> Ingredient.ofItems(ModItems.IMPERIUM_INGOT)),
    GOD(MiningLevels.NETHERITE, 2031, 9.0F, 0.0F, 15,
            () -> Ingredient.ofItems(ModItems.EFFIGERIUM_INGOT)),
    AFTERLIFE(MiningLevels.NETHERITE, 2031, 9.0F, 0.0F, 15,
            () -> Ingredient.ofItems(Items.BONE)),
    UNIQUE(MiningLevels.NETHERITE, 2031, 9.0F, 0.0F, 15,
            () -> Ingredient.ofItems(ModItems.GILDEN_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ParadigmToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}