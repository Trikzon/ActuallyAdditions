package de.ellpeck.actuallyadditions.common.materials;

import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {
    EMERALD(3, 2000, 9.0f, 5.0f, 15, () -> Ingredient.ofItems(Items.EMERALD)),
    OBSIDIAN(3, 8000, 4.0f, 2.0f, 15, () -> Ingredient.ofItems(Items.OBSIDIAN)),

    // Custom resources
    QUARTZ(2, 280, 6.5f, 2.0f, 10, () -> Ingredient.ofItems(ActuallyItems.BLACK_QUARTS.get())),
    RESTONIA(2, 300, 7.0f, 2.25f, 12, () -> Ingredient.ofItems(ActuallyItems.RESTONIA_CRYSTAL.get())),
    PALIS(2, 300, 7.0f, 2.25f, 12, () -> Ingredient.ofItems(ActuallyItems.PALIS_CRYSTAL.get())),
    DIAMATINE(3, 1600, 9.0f, 4.0f, 14, () -> Ingredient.ofItems(ActuallyItems.DIAMATINE_CRYSTAL.get())),
    VOID(2, 280, 6.0f, 2.0f, 8, () -> Ingredient.ofItems(ActuallyItems.VOID_CRYSTAL.get())),
    EMERADIC(4, 2200, 9.5f, 5.55f, 18, () -> Ingredient.ofItems(ActuallyItems.EMERADIC_CRYSTAL.get())),
    ENORI(2, 280, 6.25f, 6.25f, 15, () -> Ingredient.ofItems(ActuallyItems.ENORI_CRYSTAL.get()));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
