package de.ellpeck.actuallyadditions.common.blocks.building;

import de.ellpeck.actuallyadditions.common.blocks.ActuallyBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class CrystalBlock extends ActuallyBlock {
    private boolean isEmpowered;

    public CrystalBlock(boolean isEmpowered) {
        super(FabricBlockSettings.of(Material.STONE)
                .strength(1.5f, 10.0f)
                .breakByTool(FabricToolTags.PICKAXES, 1));

        this.isEmpowered = isEmpowered;
    }

    @Override
    public BlockItem createBlockItem() {
        return new BlockItem(this, this.getItemSettings()) {
            @Override
            public boolean hasGlint(ItemStack stack) {
                return isEmpowered;
            }
        };
    }
}
