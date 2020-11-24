package de.ellpeck.actuallyadditions.common.blocks.building;

import de.ellpeck.actuallyadditions.common.blocks.IActuallyBlock;
import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ActuallyWallBlock extends WallBlock implements IActuallyBlock {
    public ActuallyWallBlock(Settings settings) {
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
