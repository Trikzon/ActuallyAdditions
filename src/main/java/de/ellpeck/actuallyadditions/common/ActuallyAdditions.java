package de.ellpeck.actuallyadditions.common;

import de.ellpeck.actuallyadditions.common.blocks.ActuallyBlocks;
import de.ellpeck.actuallyadditions.common.items.ActuallyItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActuallyAdditions implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "actuallyadditions";

    public static final ItemGroup ACTUALLY_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "item_group"),
            () -> new ItemStack(Blocks.ACACIA_BUTTON)
    );

    @Override
    public void onInitialize() {
        ActuallyBlocks.register();
        ActuallyItems.register();
    }
}
