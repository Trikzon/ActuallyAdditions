package de.ellpeck.actuallyadditions.common.blocks.functional;

import de.ellpeck.actuallyadditions.common.blocks.ActuallyBlock;
import net.minecraft.block.Material;

public class FluidCollectorBlock extends ActuallyBlock {
    public FluidCollectorBlock(boolean isPlacer) {
        super(Settings.of(Material.STONE));
    }
}
