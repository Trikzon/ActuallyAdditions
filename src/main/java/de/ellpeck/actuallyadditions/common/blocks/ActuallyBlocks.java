package de.ellpeck.actuallyadditions.common.blocks;

import de.ellpeck.actuallyadditions.common.ActuallyAdditions;
import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ActuallyBlocks {
    private static Block registerBlock(String name, Block block) {
        return registerBlock(name, block, ActuallyItems.DEFAULT_SETTINGS);
    }

    private static Block registerBlock(String name, Block block, Item.Settings settings) {
        Registry.register(Registry.BLOCK, new Identifier(ActuallyAdditions.MOD_ID, name), block);
        ActuallyItems.registerItem(name, new BlockItem(block, settings));
        return block;
    }
}
