package de.ellpeck.actuallyadditions.common.items;

import de.ellpeck.actuallyadditions.common.ActuallyAdditions;
import de.ellpeck.actuallyadditions.common.materials.ArmorMaterials;
import de.ellpeck.actuallyadditions.common.materials.ToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class ActuallyItems {
    public static final ArrayList<Pair<Item, String>> ITEMS = new ArrayList<>();
    public static final Item.Settings DEFAULT_SETTINGS = new Item.Settings().group(ActuallyAdditions.ACTUALLY_GROUP);

    public static final Item BLACK_QUARTZ = add("black_quartz", new Item(DEFAULT_SETTINGS));
    public static final Item RESTONIA_CRYSTAL = add("restonia_crystal", new Item(DEFAULT_SETTINGS));
    public static final Item PALIS_CRYSTAL = add("palis_crystal", new Item(DEFAULT_SETTINGS));
    public static final Item DIAMATINE_CRYSTAL = add("diamatine_crystal", new Item(DEFAULT_SETTINGS));
    public static final Item VOID_CRYSTAL = add("void_crystal", new Item(DEFAULT_SETTINGS));
    public static final Item EMERADIC_CRYSTAL = add("emeradic_crystal", new Item(DEFAULT_SETTINGS));
    public static final Item ENORI_CRYSTAL = add("enori_crystal", new Item(DEFAULT_SETTINGS));

    public static final Item BOOKLET = add("booklet", new Item(DEFAULT_SETTINGS));

    public static final ToolSet EMERALD_SET = new ToolSet("emerald", ToolMaterials.EMERALD, ArmorMaterials.EMERALD, DEFAULT_SETTINGS);
    public static final ToolSet OBSIDIAN_SET = new ToolSet("obsidian", ToolMaterials.OBSIDIAN, ArmorMaterials.OBSIDIAN, DEFAULT_SETTINGS);
    public static final ToolSet QUARTZ_SET = new ToolSet("quartz", ToolMaterials.QUARTZ, ArmorMaterials.QUARTZ, DEFAULT_SETTINGS);
    public static final ToolSet ENORI_SET = new ToolSet("enori", ToolMaterials.ENORI, ArmorMaterials.ENORI, DEFAULT_SETTINGS);
    public static final ToolSet EMERADIC_SET = new ToolSet("emeradic", ToolMaterials.EMERADIC, ArmorMaterials.EMERADIC, DEFAULT_SETTINGS);
    public static final ToolSet VOID_SET = new ToolSet("void", ToolMaterials.VOID, ArmorMaterials.VOID, DEFAULT_SETTINGS);
    public static final ToolSet DIAMATINE_SET = new ToolSet("diamatine", ToolMaterials.DIAMATINE, ArmorMaterials.DIAMATINE, DEFAULT_SETTINGS);
    public static final ToolSet PALIS_SET = new ToolSet("palis", ToolMaterials.PALIS, ArmorMaterials.PALIS, DEFAULT_SETTINGS);
    public static final ToolSet RESTONIA_SET = new ToolSet("restonia", ToolMaterials.RESTONIA, ArmorMaterials.RESTONIA, DEFAULT_SETTINGS);

    public static void register() {
        ITEMS.forEach(pair -> {
            Registry.register(Registry.ITEM, new Identifier(ActuallyAdditions.MOD_ID, pair.getRight()), pair.getLeft());
        });
    }

    static Item add(String name, Item item) {
        ITEMS.add(new Pair<>(item, name));
        return item;
    }
}
