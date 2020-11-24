package de.ellpeck.actuallyadditions.common.blocks.building;

import de.ellpeck.actuallyadditions.common.blocks.IActuallyBlock;
import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ActuallyStairsBlock extends StairsBlock implements IActuallyBlock {
    public ActuallyStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
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
