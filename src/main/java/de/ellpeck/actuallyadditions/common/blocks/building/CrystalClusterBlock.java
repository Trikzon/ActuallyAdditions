package de.ellpeck.actuallyadditions.common.blocks.building;

import de.ellpeck.actuallyadditions.common.blocks.FullyDirectionalBlock;
import de.ellpeck.actuallyadditions.common.blocks.types.Crystals;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

public class CrystalClusterBlock extends FullyDirectionalBlock {
    public static final DirectionProperty FACING = Properties.FACING;

    public CrystalClusterBlock(Crystals crystals) {
        super(FabricBlockSettings.of(Material.GLASS)
                .luminance((e) -> 7)
                .sounds(BlockSoundGroup.GLASS)
                .strength(0.25f, 1.0f));
    }

    @Override
    public BlockState getDefaultConstructorState() {
        return this.stateManager.getDefaultState().with(FACING, Direction.UP);
    }

    @Override
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }
}
