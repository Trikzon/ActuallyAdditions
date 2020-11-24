package de.ellpeck.actuallyadditions.common.items;

import de.ellpeck.actuallyadditions.common.ActuallyAdditions;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ActuallyItems {
    public static final Item.Settings DEFAULT_SETTINGS = new Item.Settings().group(ActuallyAdditions.ACTUALLY_GROUP);

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ActuallyAdditions.MOD_ID, name), item);
    }
}
