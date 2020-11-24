package de.ellpeck.actuallyadditions.common.blocks.misc;

import de.ellpeck.actuallyadditions.common.blocks.ActuallyBlock;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;

import java.util.List;

public class TinyTorchBlock extends ActuallyBlock {
    public TinyTorchBlock() {
        super(Settings.of(Material.STONE));
    }

    @Override
    public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext options) {
        super.appendTooltip(stack, world, tooltip, options);

        tooltip.add(new TranslatableText("misc.message.so_cute"));
    }
}
