package net.killerkrow.paradigm.misc;

import net.killerkrow.paradigm.ParadigmMod;
import net.killerkrow.paradigm.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    IRONCHAIN("ironchain", 25, new int[] { 3, 7, 6, 3 }, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0, 0.0f, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    DIAMONDCHAIN("diamondchain", 25, new int[] { 4, 9, 7, 4 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.0f, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITECHAIN("netheritechain", 25, new int[] { 4, 9, 7, 4 }, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3f, 0.2f, () -> Ingredient.ofItems(Items.NETHERITE_SCRAP)),
    ADMINCHAIN("adminchain", 25, new int[] { 99, 99, 99, 99 }, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 99f, 1.0f, () -> Ingredient.ofItems(Items.NETHER_STAR)),
    GILDEN("gilden", 25, new int[] { 4, 4, 4, 4 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1f, 0.0f, () -> Ingredient.ofItems(ModItems.GILDEN_INGOT)),
    TERMINUS_COVERUS("terminus_coverus", 25, new int[] { 0, 0, 0, 0 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0.0f, () -> Ingredient.ofItems(Items.STICK)),
    ENDLESS_MASK("endless_mask", 25, new int[] { 0, 0, 0, 0 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0.0f, () -> Ingredient.ofItems(Items.STICK)),
    FLORA_VEIL("flora_veil", 25, new int[] { 0, 0, 0, 0 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0.0f, () -> Ingredient.ofItems(Items.STICK)),
    HELLISH_IDENTITY("hellish_identity", 25, new int[] { 0, 0, 0, 0 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0.0f, () -> Ingredient.ofItems(Items.STICK)),
    ETHEREAL_COVER("ethereal_cover", 25, new int[] { 0, 0, 0, 0 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0.0f, () -> Ingredient.ofItems(Items.STICK)),
    UNKNOWN_SLIDE("unkbown_slide", 25, new int[] { 0, 0, 0, 0 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0.0f, () -> Ingredient.ofItems(Items.STICK));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return ParadigmMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}