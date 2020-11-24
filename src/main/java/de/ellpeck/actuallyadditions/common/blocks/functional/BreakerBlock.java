package de.ellpeck.actuallyadditions.common.blocks.functional;

import de.ellpeck.actuallyadditions.common.blocks.ActuallyBlock;
import net.minecraft.block.Material;

public class BreakerBlock extends ActuallyBlock {
    public BreakerBlock(boolean isPlacer) {
        super(Settings.of(Material.STONE));
    }
}
