package de.ellpeck.actuallyadditions.common.blocks.functional;

import de.ellpeck.actuallyadditions.common.blocks.ActuallyBlock;
import de.ellpeck.actuallyadditions.common.blocks.types.LaserRelays;
import net.minecraft.block.Material;

public class LaserRelayBlock extends ActuallyBlock {
    public LaserRelayBlock(LaserRelays relayType) {
        super(Settings.of(Material.STONE));
    }
}
