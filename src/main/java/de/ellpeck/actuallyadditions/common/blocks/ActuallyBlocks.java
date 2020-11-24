package de.ellpeck.actuallyadditions.common.blocks;

import de.ellpeck.actuallyadditions.common.ActuallyAdditions;
import de.ellpeck.actuallyadditions.common.blocks.building.ActuallyStairsBlock;
import de.ellpeck.actuallyadditions.common.blocks.building.CrystalBlock;
import de.ellpeck.actuallyadditions.common.blocks.building.CrystalClusterBlock;
import de.ellpeck.actuallyadditions.common.blocks.building.ActuallyWallBlock;
import de.ellpeck.actuallyadditions.common.blocks.functional.*;
import de.ellpeck.actuallyadditions.common.blocks.misc.TinyTorchBlock;
import de.ellpeck.actuallyadditions.common.blocks.plant.BlackLotusBlock;
import de.ellpeck.actuallyadditions.common.blocks.plant.PlantBlock;
import de.ellpeck.actuallyadditions.common.blocks.types.Crystals;
import de.ellpeck.actuallyadditions.common.blocks.types.LaserRelays;
import de.ellpeck.actuallyadditions.common.blocks.types.PhantomType;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

public class ActuallyBlocks {
    public static final ArrayList<Pair<Block, String>> BLOCKS = new ArrayList<>();

    // Plants
    public static final Block BLACK_LOTUS = add("black_lotus_block", new BlackLotusBlock());
    public static final Block RICE = add("rice_block", new PlantBlock(1,2));
    public static final Block CANOLA = add("canola_block", new PlantBlock(2, 3));
    public static final Block FLAX = add("flax_block", new PlantBlock(2, 4));
    public static final Block COFFEE = add("coffee_block", new PlantBlock(2, 2));

    // Tile Blocks
    public static final Block BATTERY_BOX = add("battery_box_block", new BatteryBoxBlock());
    public static final Block HOPPING_ITEM_INTERFACE = add("hopping_item_interface_block", new ItemViewerHoppingBlock());
    public static final Block FARMER = add("farmer_block", new FarmerBlock());
    public static final Block BIO_REACTOR = add("bio_reactor_block", new BioReactorBlock());
    public static final Block EMPOWERER = add("empowerer_block", new EmpowererBlock());
    public static final Block TINY_TORCH = add("tiny_torch_block", new TinyTorchBlock());
    public static final Block SHOCK_SUPPRESSOR = add("shock_suppressor_block", new ShockSuppressorBlock());
    public static final Block DISPLAY_STAND = add("display_stand_block", new DisplayStandBlock());
    public static final Block PLAYER_INTERFACE = add("player_interface_block", new PlayerInterfaceBlock());
    public static final Block ITEM_INTERFACE = add("item_interface_block", new ItemViewerBlock());
    public static final Block FIREWORK_BOX = add("firework_box_block", new FireworkBoxBlock());
    public static final Block MINER = add("miner_block", new MinerBlock());
    public static final Block ATOMIC_RECONSTRUCTOR = add("atomic_reconstructor_block", new AtomicReconstructorBlock());
    public static final Block TREASURE_CHEST = add("treasure_chest_block", new TreasureChestBlock());
    public static final Block ENERGIZER = add("energizer_block", new EnergizerBlock(true));
    public static final Block ENERVATOR = add("enervator_block", new EnergizerBlock(false));
    public static final Block LAVA_FACTORY_CONTROLLER = add("lava_factory_controller_block", new LavaFactoryControllerBlock());
    public static final Block CANOLA_PRESS = add("canola_press_block", new CanolaPressBlock());
    public static final Block PHANTOMFACE = add("phantomface_block", new PhantomBlock(PhantomType.FACE));
    public static final Block PHANTOM_PLACER = add("phantom_placer_block", new PhantomBlock(PhantomType.PLACER));
    public static final Block PHANTOM_LIQUIFACE = add("phantom_liquiface_block", new PhantomBlock(PhantomType.LIQUIFACE));
    public static final Block PHANTOM_ENERGYFACE = add("phantom_energyface_block", new PhantomBlock(PhantomType.ENERGYFACE));
    public static final Block PHANTOM_REDSTONEFACE = add("phantom_redstoneface_block", new PhantomBlock(PhantomType.REDSTONEFACE));
    public static final Block PHANTOM_BREAKER = add("phantom_breaker_block", new PhantomBlock(PhantomType.BREAKER));
    public static final Block COAL_GENERATOR = add("coal_generator_block", new CoalGeneratorBlock());
    public static final Block OIL_GENERATOR = add("oil_generator_block", new OilGeneratorBlock());
    public static final Block FERMENTING_BARREL = add("fermenting_barrel_block", new FermentingBarrelBlock());
    public static final Block FEEDER = add("feeder_block", new FeederBlock());
    public static final Block CRUSHER = add("crusher_block", new GrinderBlock(false));
    public static final Block CRUSHER_DOUBLE = add("crusher_double_block", new GrinderBlock(true));
    public static final Block POWERED_FURNACE = add("powered_furnace_block", new FurnaceDoubleBlock());
    public static final Block ESD = add("esd_block", new InputterBlock(false));
    public static final Block ESD_ADVANCED = add("esd_advanced_block", new InputterBlock(true));
    public static final Block FISHING_NET = add("fishing_net_block", new FishingNetBlock());
    public static final Block SOLAR_PANEL = add("solar_panel_block", new FurnaceSolarBlock());
    public static final Block HEAT_COLLECTOR = add("heat_collector_block", new HeatCollectorBlock());
    public static final Block ITEM_REPAIRER = add("item_repairer_block", new ItemRepairerBlock());
    public static final Block GREENHOUSE_GLASS = add("greenhouse_glass_block", new GreenhouseGlassBlock());
    public static final Block BREAKER = add("breaker_block", new BreakerBlock(false));
    public static final Block PLACER = add("placer_block", new BreakerBlock(true));
    public static final Block DROPPER = add("dropper_block", new DropperBlock(AbstractBlock.Settings.of(Material.STONE)));
    public static final Block FLUID_PLACER = add("fluid_placer_block", new FluidCollectorBlock(true));
    public static final Block FLUID_COLLECTOR = add("fluid_collector_block", new FluidCollectorBlock(false));
    public static final Block COFFEE_MACHINE = add("coffee_machine_block", new CoffeeMachineBlock());
    public static final Block PHANTOM_BOOSTER = add("phantom_booster_block", new PhantomBoosterBlock());
    public static final Block RANGED_COLLECTOR = add("ranged_collector_block", new RangedCollectorBlock());
    public static final Block DIRECTIONAL_BREAKER = add("directional_breaker_block", new DirectionalBreakerBlock());
    public static final Block LEAF_GENERATOR = add("leaf_generator_block", new LeafGeneratorBlock());
    public static final Block SMILEY_CLOUD = add("smiley_cloud_block", new SmileyCloudBlock());
    public static final Block XP_SOLIDIFIER = add("xp_solidifier_block", new XPSolidifierBlock());

    // Crystals
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


    public static final Block CRYSTAL_CLUSTER_RESTONIA = add("crystal_cluster_restonia_block", new CrystalClusterBlock(Crystals.REDSTONE));
    public static final Block CRYSTAL_CLUSTER_PALIS = add("crystal_cluster_palis_block", new CrystalClusterBlock(Crystals.LAPIS));
    public static final Block CRYSTAL_CLUSTER_DIAMATINE = add("crystal_cluster_diamatine_block", new CrystalClusterBlock(Crystals.DIAMOND));
    public static final Block CRYSTAL_CLUSTER_VOID = add("crystal_cluster_void_block", new CrystalClusterBlock(Crystals.COAL));
    public static final Block CRYSTAL_CLUSTER_EMERADIC = add("crystal_cluster_emeradic_block", new CrystalClusterBlock(Crystals.EMERALD));
    public static final Block CRYSTAL_CLUSTER_ENORI = add("crystal_cluster_enori_block", new CrystalClusterBlock(Crystals.IRON));

    // Lasers
    public static final Block ENERGY_LASER_RELAY = add("energy_laser_relay_block", new LaserRelayBlock(LaserRelays.ENERGY_BASIC));
    public static final Block ENERGY_LASER_RELAY_ADVANCED = add("energy_laser_relay_advanced_block", new LaserRelayBlock(LaserRelays.ENERGY_ADVANCED));
    public static final Block ENERGY_LASER_RELAY_EXTREME = add("energy_laser_relay_extreme_block", new LaserRelayBlock(LaserRelays.ENERGY_EXTREME));
    public static final Block FLUIDS_LASER_RELAY = add("fluids_laser_relay_block", new LaserRelayBlock(LaserRelays.FLUIDS));
    public static final Block ITEM_LASER_RELAY = add("item_laser_relay_block", new LaserRelayBlock(LaserRelays.ITEM));
    public static final Block ADVANCED_ITEM_LASER_RELAY = add("advanced_item_laser_relay_block", new LaserRelayBlock(LaserRelays.ITEM_WHITELIST));

    // Building Blocks
    public static final Block GREEN_BLOCK = add("green_block", new GenericBlock());
    public static final Block WHITE_BLOCK = add("white_block", new GenericBlock());
    public static final Block GREEN_STAIRS = add("green_stairs_block", new ActuallyStairsBlock(GREEN_BLOCK.getDefaultState(), AbstractBlock.Settings.of(Material.STONE)));
    public static final Block WHITE_STAIRS = add("white_stairs_block", new ActuallyStairsBlock(WHITE_BLOCK.getDefaultState(), AbstractBlock.Settings.of(Material.STONE)));
    public static final Block GREEN_SLAB = add("green_slab_block", new SlabBlock(AbstractBlock.Settings.of(Material.STONE)));
    public static final Block WHITE_SLAB = add("white_slab_block", new SlabBlock(AbstractBlock.Settings.of(Material.STONE)));
    public static final Block GREEN_WALL = add("green_wall_block", new ActuallyWallBlock(AbstractBlock.Settings.of(Material.STONE)));
    public static final Block WHITE_WALL = add("white_wall_block", new ActuallyWallBlock(AbstractBlock.Settings.of(Material.STONE)));

    public static final Block BLACK_QUARTZ = add("black_quartz_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block BLACK_QUARTZ_CHISELED = add("black_quartz_chiseled_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block BLACK_QUARTZ_PILLAR = add("black_quartz_pillar_block", new Block(Block.Settings.of(Material.STONE)));

    public static final Block BLACK_QUARTZ_WALL = add("black_quartz_wall_block", new ActuallyWallBlock(AbstractBlock.Settings.copy(BLACK_QUARTZ)));
    public static final Block BLACK_CHISELED_QUARTZ_WALL = add("black_chiseled_quartz_wall_block", new ActuallyWallBlock(AbstractBlock.Settings.copy(BLACK_QUARTZ_CHISELED)));
    public static final Block BLACK_PILLAR_QUARTZ_WALL = add("black_pillar_quartz_wall_block", new ActuallyWallBlock(AbstractBlock.Settings.copy(BLACK_QUARTZ_PILLAR)));
    public static final Block BLACK_QUARTZ_STAIR = add("black_quartz_stair_block", new ActuallyStairsBlock(BLACK_QUARTZ.getDefaultState(), AbstractBlock.Settings.of(Material.STONE)));
    public static final Block BLACK_CHISELED_QUARTZ_STAIR = add("black_chiseled_quartz_stair_block", new ActuallyStairsBlock(BLACK_QUARTZ.getDefaultState(), AbstractBlock.Settings.of(Material.STONE)));
    public static final Block BLACK_PILLAR_QUARTZ_STAIR = add("black_pillar_quartz_stair_block", new ActuallyStairsBlock(BLACK_QUARTZ.getDefaultState(), AbstractBlock.Settings.of(Material.STONE)));
    public static final Block BLACK_QUARTZ_SLAB = add("black_quartz_slab_block", new SlabBlock(AbstractBlock.Settings.of(Material.STONE)));
    public static final Block BLACK_CHISELED_QUARTZ_SLAB = add("black_chiseled_quartz_slab_block", new SlabBlock(AbstractBlock.Settings.of(Material.STONE)));
    public static final Block BLACK_PILLAR_QUARTZ_SLAB = add("black_pillar_quartz_slab_block", new SlabBlock(AbstractBlock.Settings.of(Material.STONE)));

    // Lamps
    public static final Block LAMP_WHITE = add("lamp_white_block", new ColoredLampBlock());
    public static final Block LAMP_ORANGE = add("lamp_orange_block", new ColoredLampBlock());
    public static final Block LAMP_MAGENTA = add("lamp_magenta_block", new ColoredLampBlock());
    public static final Block LAMP_LIGHT_BLUE = add("lamp_light_blue_block", new ColoredLampBlock());
    public static final Block LAMP_YELLOW = add("lamp_yellow_block", new ColoredLampBlock());
    public static final Block LAMP_LIME = add("lamp_lime_block", new ColoredLampBlock());
    public static final Block LAMP_PINK = add("lamp_pink_block", new ColoredLampBlock());
    public static final Block LAMP_GRAY = add("lamp_gray_block", new ColoredLampBlock());
    public static final Block LAMP_LIGHT_GRAY = add("lamp_light_gray_block", new ColoredLampBlock());
    public static final Block LAMP_CYAN = add("lamp_cyan_block", new ColoredLampBlock());
    public static final Block LAMP_PURPLE = add("lamp_purple_block", new ColoredLampBlock());
    public static final Block LAMP_BLUE = add("lamp_blue_block", new ColoredLampBlock());
    public static final Block LAMP_BROWN = add("lamp_brown_block", new ColoredLampBlock());
    public static final Block LAMP_GREEN = add("lamp_green_block", new ColoredLampBlock());
    public static final Block LAMP_RED = add("lamp_red_block", new ColoredLampBlock());
    public static final Block LAMP_BLACK = add("lamp_black_block", new ColoredLampBlock());

    public static final Block LAMP_CONTROLLER = add("lamp_controller_block", new LampPowererBlock());

    // Misc Blocks
    public static final Block ENDERPEARL = add("enderpearl_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block CHARCOAL = add("charcoal_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block ORE_BLACK_QUARTZ = add("ore_black_quartz_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block ENDER_CASING = add("ender_casing_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block IRON_CASING = add("iron_casing_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block IRON_CASING_SNOW = add("iron_casing_snow_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block LAVA_FACTORY_CASE = add("lava_factory_case_block", new Block(Block.Settings.of(Material.STONE)));
    public static final Block WOOD_CASING = add("wood_casing_block", new Block(Block.Settings.of(Material.STONE)));

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
