package de.ellpeck.actuallyadditions.common.blocks;

import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ActuallyBlock extends Block implements IActuallyBlock {
    public ActuallyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockItem createBlockItem() {
        return new BlockItem(this, this.getItemSettings());
    }

    @Override
    public Item.Settings getItemSettings() {
        return ActuallyItems.DEFAULT_SETTINGS;
    }
}
