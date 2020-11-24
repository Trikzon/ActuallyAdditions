package de.ellpeck.actuallyadditions.common.blocks.functional;

import de.ellpeck.actuallyadditions.common.blocks.FullyDirectionalBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;

public class AtomicReconstructorBlock extends FullyDirectionalBlock {
    public static final DirectionProperty FACING = Properties.FACING;

    public AtomicReconstructorBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .breakByTool(FabricToolTags.PICKAXES, 0)
                .strength(10.0f, 80.0f)
                .sounds(BlockSoundGroup.STONE));
    }
}
