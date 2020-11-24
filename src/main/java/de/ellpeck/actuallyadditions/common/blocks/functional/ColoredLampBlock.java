package de.ellpeck.actuallyadditions.common.blocks.functional;

import de.ellpeck.actuallyadditions.common.blocks.ActuallyBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ColoredLampBlock extends ActuallyBlock {
    private static final BooleanProperty LIT = Properties.LIT;

    public ColoredLampBlock() {
        super(Settings.of(Material.STONE).luminance(state -> state.get(LIT) ? 15 : 0));
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!state.get(LIT)) {
            world.setBlockState(pos, state.getBlock().getDefaultState().with(LIT, true));
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
