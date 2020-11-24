package de.ellpeck.actuallyadditions.common.materials;

import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ArmorMaterials implements ArmorMaterial {
    EMERALD("emerald_armor_material", 30,  new int[] { 5, 8, 9, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2, 0f, () -> Ingredient.ofItems(Items.EMERALD)),
    OBSIDIAN("obsidian_armor_material", 28, new int[] { 1, 3, 4, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1, 0f, () -> Ingredient.ofItems(Items.OBSIDIAN)),

    // Custom resources
    QUARTZ("quartz_armor_material", 15, new int[] { 3, 5, 6, 3 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1, 0f, () -> Ingredient.ofItems(ActuallyItems.BLACK_QUARTZ)),
    RESTONIA("restonia_armor_material", 18, new int[] { 3, 6, 7, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0f, () -> Ingredient.ofItems(ActuallyItems.RESTONIA_CRYSTAL)),
    PALIS("palis_armor_material", 10, new int[] { 3, 6, 7, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0f, () -> Ingredient.ofItems(ActuallyItems.PALIS_CRYSTAL)),
    DIAMATINE("diamatine_armor_material", 36, new int[] { 4, 7, 8, 4 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3, 0f, () -> Ingredient.ofItems(ActuallyItems.DIAMATINE_CRYSTAL)),
    VOID("void_armor_material", 23, new int[] { 1, 3, 4, 1 }, 13, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0f, () -> Ingredient.ofItems(ActuallyItems.VOID_CRYSTAL)),
    EMERADIC("emeradic_armor_material", 32, new int[] { 6, 9, 9, 4 }, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3, 0f, () -> Ingredient.ofItems(ActuallyItems.EMERADIC_CRYSTAL)),
    ENORI("enori_armor_material", 24, new int[] { 3, 6, 6, 3 }, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0, 0f, () -> Ingredient.ofItems(ActuallyItems.ENORI_CRYSTAL));

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    ArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Environment(EnvType.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
