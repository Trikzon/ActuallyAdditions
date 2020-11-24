package de.ellpeck.actuallyadditions.common.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class GenericBlock extends ActuallyBlock {
    public GenericBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .strength(1.5f, 10.0f)
                .breakByTool(FabricToolTags.PICKAXES, 0)
                .sounds(BlockSoundGroup.STONE));
    }
}
