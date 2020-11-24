package de.ellpeck.actuallyadditions.common.blocks.building;

import de.ellpeck.actuallyadditions.common.blocks.IActuallyBlock;
import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class WallBlock extends net.minecraft.block.WallBlock implements IActuallyBlock {
    public WallBlock(Settings settings) {
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
