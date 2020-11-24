package de.ellpeck.actuallyadditions.common.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

public final class ToolSet {
    public final Item pickaxe;
    public final Item axe;
    public final Item shovel;
    public final Item sword;
    public final Item hoe;
    public final Item helmet;
    public final Item chest;
    public final Item leggings;
    public final Item boots;

    public final ToolMaterial tier;
    public final String name;

    public ToolSet(String name, ToolMaterial tier, ArmorMaterial armorTier, Item.Settings settings) {
        this.name = name;
        this.tier = tier;

        this.pickaxe = add("pickaxe", new PickaxeItem(tier, 1, -2.8f, settings));
        this.axe = add("axe", new AxeItem(tier, 6, -3.0f, settings));
        this.shovel = add("shovel", new ShovelItem(tier, 1, -3.0f, settings));

        // NOTE: Forge code uses ToolMaterials.RESTONIA.getAttackDamage() + 1.0f for the attack speed for some reason.
        this.sword = add("sword", new SwordItem(tier, 1, 3.25f, settings));
        this.hoe = add("hoe", new HoeItem(tier, 1, 3.25f, settings));

        this.helmet = add("helmet", new ArmorItem(armorTier, EquipmentSlot.HEAD, settings));
        this.chest = add("chest", new ArmorItem(armorTier, EquipmentSlot.CHEST, settings));
        this.leggings = add("leggings", new ArmorItem(armorTier, EquipmentSlot.LEGS, settings));
        this.boots = add("boots", new ArmorItem(armorTier, EquipmentSlot.FEET, settings));
    }

    private Item add(String name, Item item) {
        ActuallyItems.add(String.format("%s_%s", this.name, name), item);
        return item;
    }

    private static class PickaxeItem extends net.minecraft.item.PickaxeItem {
        public PickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    private static class AxeItem extends net.minecraft.item.AxeItem {
        public AxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }

    private static class HoeItem extends net.minecraft.item.HoeItem {
        public HoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
    }
}
