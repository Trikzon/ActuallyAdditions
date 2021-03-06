package de.ellpeck.actuallyadditions.common.items.lens;

import java.util.ArrayList;

import de.ellpeck.actuallyadditions.api.internal.IAtomicReconstructor;
import de.ellpeck.actuallyadditions.api.lens.Lens;
import de.ellpeck.actuallyadditions.common.misc.DamageSources;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class LensDeath extends Lens {

    @Override
    public boolean invoke(IBlockState hitState, BlockPos hitBlock, IAtomicReconstructor tile) {
        ArrayList<EntityLivingBase> entities = (ArrayList<EntityLivingBase>) tile.getWorldObject().getEntitiesWithinAABB(EntityLivingBase.class, new AxisAlignedBB(hitBlock.getX(), hitBlock.getY(), hitBlock.getZ(), hitBlock.getX() + 1, hitBlock.getY() + 1, hitBlock.getZ() + 1));
        for (EntityLivingBase entity : entities) {
            int use = this.getUsePerEntity();
            if (tile.getEnergy() >= use) {
                tile.extractEnergy(use);

                this.onAttacked(entity, tile);
            }
        }

        return hitBlock != null && !hitState.getBlock().isAir(hitState, tile.getWorldObject(), hitBlock);
    }

    protected void onAttacked(EntityLivingBase entity, IAtomicReconstructor tile) {
        entity.attackEntityFrom(DamageSources.DAMAGE_ATOMIC_RECONSTRUCTOR, 20F);
    }

    protected int getUsePerEntity() {
        return 350;
    }

    @Override
    public float[] getColor() {
        return new float[] { 188F / 255F, 222F / 255F, 1F };
    }

    @Override
    public int getDistance() {
        return 15;
    }
}
