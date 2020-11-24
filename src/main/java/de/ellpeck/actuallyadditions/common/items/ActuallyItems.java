package de.ellpeck.actuallyadditions.common.items;

import de.ellpeck.actuallyadditions.common.ActuallyAdditions;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class ActuallyItems {
    public static final ArrayList<Pair<Item, String>> ITEMS = new ArrayList<>();
    public static final Item.Settings DEFAULT_SETTINGS = new Item.Settings().group(ActuallyAdditions.ACTUALLY_GROUP);

    public static void register() {
        ITEMS.forEach(pair -> {
            Registry.register(Registry.ITEM, new Identifier(ActuallyAdditions.MOD_ID, pair.getRight()), pair.getLeft());
        });
    }

    private static Item add(String name, Item item) {
        ITEMS.add(new Pair<>(item, name));
        return item;
    }
}
