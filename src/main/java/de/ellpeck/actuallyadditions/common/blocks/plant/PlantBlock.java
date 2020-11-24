package de.ellpeck.actuallyadditions.common.blocks.plant;

import de.ellpeck.actuallyadditions.common.blocks.IActuallyBlock;
import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class PlantBlock extends CropBlock implements IActuallyBlock {
    public PlantBlock(int minDropAmount, int maxDropAmount) {
        super(Settings.of(Material.STONE));
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
