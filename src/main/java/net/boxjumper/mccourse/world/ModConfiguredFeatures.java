package net.boxjumper.mccourse.world;

import net.boxjumper.mccourse.MCCourseMod;
import net.boxjumper.mccourse.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;

import java.util.List;


public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_AZALEA_TREE = registerKey("purple_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_AZALEA_TREE = registerKey("yellow_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_AZALEA_TREE = registerKey("red_azalea_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORICHALCUM_ORE_BLOCK = registerKey("orichalcum_ore_block");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PETUNIA_KEY = registerKey("petunia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CITRUS_AMETHYST_GEO_KEY = registerKey("citrus_amethyst_geode");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOFT_ROCK = registerKey("soft_rock");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_SPORE_BLOSSOM_KEY = registerKey("red_spore_blossom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_SPORE_BLOSSOM_KEY = registerKey("blue_spore_blossom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_SPORE_BLOSSOM_KEY = registerKey("yellow_spore_blossom");




    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, PURPLE_AZALEA_TREE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                BlockStateProvider.of(ModBlocks.PURPLE_AZALEA_LEAVES),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK)).build());

        register(context, YELLOW_AZALEA_TREE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                BlockStateProvider.of(ModBlocks.YELLOW_AZALEA_LEAVES),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK)).build());

        register(context, RED_AZALEA_TREE, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformIntProvider.create(1, 2)),
                BlockStateProvider.of(ModBlocks.RED_AZALEA_LEAVES),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK)).build());




        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        //RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        //RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldOrichalcumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ORICHALCUM_ORE_BLOCK.getDefaultState()));
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ORICHALCUM_ORE_BLOCK.getDefaultState());

        register(context, ORICHALCUM_ORE_BLOCK, Feature.ORE, new OreFeatureConfig(overworldOrichalcumOres, 12));



        List<OreFeatureConfig.Target> gardensofarcadiaStoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SOFT_ROCK.getDefaultState()));
        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SOFT_ROCK.getDefaultState());

        register(context, SOFT_ROCK, Feature.ORE, new OreFeatureConfig(gardensofarcadiaStoneOres, 0));




        register(context, CITRUS_AMETHYST_GEO_KEY, Feature.GEODE, new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                BlockStateProvider.of(ModBlocks.CITRUS_AMETHYST),
                BlockStateProvider.of(ModBlocks.CITRUS_AMETHYST),
                BlockStateProvider.of(Blocks.CALCITE),
                BlockStateProvider.of(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.BUDDING_CITRUS_AMETHYST.getDefaultState()),
                BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackConfig(0.25D, 1.5D, 1),
                0.5D, 0.1D,
                true, UniformIntProvider.create(3, 8),
                UniformIntProvider.create(2, 6), UniformIntProvider.create(1, 2),
                -16, 16, 0.05, 1));

















        register(context, PETUNIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.PETUNIA)))));

        register(context, RED_SPORE_BLOSSOM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(1, 1, 0, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_SPORE_BLOSSOM)))));

        register(context, BLUE_SPORE_BLOSSOM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(1, 1, 0, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_SPORE_BLOSSOM)))));

        register(context, YELLOW_SPORE_BLOSSOM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(1, 1, 0, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_SPORE_BLOSSOM)))));







    }























    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MCCourseMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}