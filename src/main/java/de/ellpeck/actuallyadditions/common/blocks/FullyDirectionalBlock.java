package de.ellpeck.actuallyadditions.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

public class FullyDirectionalBlock extends Block {
    public static final DirectionProperty FACING = Properties.FACING;

    public FullyDirectionalBlock(Settings settings) {
        super(settings);

        this.setDefaultState(getDefaultConstructorState());
    }

    public BlockState getDefaultConstructorState() {
        return this.stateManager.getDefaultState().with(FACING, Direction.NORTH);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
