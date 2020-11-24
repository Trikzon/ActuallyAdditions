package de.ellpeck.actuallyadditions.common.blocks;

import de.ellpeck.actuallyadditions.common.ActuallyAdditions;
import de.ellpeck.actuallyadditions.common.blocks.building.CrystalBlock;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class ActuallyBlocks {
    public static final ArrayList<Pair<Block, String>> BLOCKS = new ArrayList<>();

    public static final Block CRYSTAL_ENORI = add("crystal_enori_block", new CrystalBlock(false));
    public static final Block CRYSTAL_RESTONIA = add("crystal_restonia_block", new CrystalBlock(false));
    public static final Block CRYSTAL_PALIS = add("crystal_palis_block", new CrystalBlock(false));
    public static final Block CRYSTAL_DIAMATINE = add("crystal_diamatine_block", new CrystalBlock(false));
    public static final Block CRYSTAL_VOID = add("crystal_void_block", new CrystalBlock(false));
    public static final Block CRYSTAL_EMERADIC = add("crystal_emeradic_block", new CrystalBlock(false));

    public static final Block CRYSTAL_EMPOWERED_ENORI = add("crystal_enori_empowered_block", new CrystalBlock(true));
    public static final Block CRYSTAL_EMPOWERED_RESTONIA = add("crystal_restonia_empowered_block", new CrystalBlock(true));
    public static final Block CRYSTAL_EMPOWERED_PALIS = add("crystal_palis_empowered_block", new CrystalBlock(true));
    public static final Block CRYSTAL_EMPOWERED_DIAMATINE = add("crystal_diamatine_empowered_block", new CrystalBlock(true));
    public static final Block CRYSTAL_EMPOWERED_VOID = add("crystal_void_empowered_block", new CrystalBlock(true));
    public static final Block CRYSTAL_EMPOWERED_EMERADIC = add("crystal_emeradic_empowered_block", new CrystalBlock(true));

    public static void register() {
        BLOCKS.forEach(pair -> {
            Identifier id = new Identifier(ActuallyAdditions.MOD_ID, pair.getRight());
            Registry.register(Registry.BLOCK, id, pair.getLeft());

            if (pair.getLeft() instanceof IActuallyBlock) {
                Registry.register(Registry.ITEM, id, ((IActuallyBlock)pair.getLeft()).createBlockItem());
            }
        });
    }

    private static Block add(String name, Block block) {
        BLOCKS.add(new Pair<>(block, name));
        return block;
    }
}
