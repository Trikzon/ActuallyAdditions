package de.ellpeck.actuallyadditions.common.blocks.functional;

import de.ellpeck.actuallyadditions.common.blocks.ActuallyBlock;
import net.minecraft.block.Material;

public class EnergizerBlock extends ActuallyBlock {
    public EnergizerBlock(boolean isEnergizer) {
        super(Settings.of(Material.STONE));
    }
}
