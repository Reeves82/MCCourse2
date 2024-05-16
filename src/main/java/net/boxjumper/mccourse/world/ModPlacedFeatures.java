package net.boxjumper.mccourse.world;

import net.boxjumper.mccourse.MCCourseMod;
import net.boxjumper.mccourse.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;


public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> PURPLE_AZALEA_TREE = registerKey("purple_azalea_tree");
    public static final RegistryKey<PlacedFeature> YELLOW_AZALEA_TREE = registerKey("yellow_azalea_tree");
    public static final RegistryKey<PlacedFeature> RED_AZALEA_TREE = registerKey("red_azalea_tree");
    public static final RegistryKey<PlacedFeature> ORICHALCUM_ORE_BLOCK = registerKey("orichalcum_ore_block");
    public static final RegistryKey<PlacedFeature> PETUNIA_PLACED_KEY = registerKey("petunia_placed");
    public static final RegistryKey<PlacedFeature> CITRUS_AMETHYST_GEO_KEY = registerKey("citrus_amethyst_geode");
    public static final RegistryKey<PlacedFeature> RED_SPORE_BLOSSOM_KEY = registerKey("red_spore_blossom");
    public static final RegistryKey<PlacedFeature> BLUE_SPORE_BLOSSOM_KEY = registerKey("blue_spore_blossom");
    public static final RegistryKey<PlacedFeature> YELLOW_SPORE_BLOSSOM_KEY = registerKey("yellow_spore_blossom");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PURPLE_AZALEA_TREE, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PURPLE_AZALEA_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.PURPLE_AZALEA));

        register(context, YELLOW_AZALEA_TREE, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_AZALEA_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.YELLOW_AZALEA));

        register(context, RED_AZALEA_TREE, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_AZALEA_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.RED_AZALEA));

        register(context, ORICHALCUM_ORE_BLOCK, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORICHALCUM_ORE_BLOCK),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

        register(context, PETUNIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PETUNIA_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, CITRUS_AMETHYST_GEO_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CITRUS_AMETHYST_GEO_KEY),
                RarityFilterPlacementModifier.of(42), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());

        register(context, RED_SPORE_BLOSSOM_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_SPORE_BLOSSOM_KEY),
                CountPlacementModifier.of(25), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_120_RANGE, EnvironmentScanPlacementModifier.of(Direction.UP, BlockPredicate.solid(), BlockPredicate.IS_AIR, 12),
                RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)), BiomePlacementModifier.of());

        register(context, BLUE_SPORE_BLOSSOM_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_SPORE_BLOSSOM_KEY),
                CountPlacementModifier.of(25), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_120_RANGE, EnvironmentScanPlacementModifier.of(Direction.UP, BlockPredicate.solid(), BlockPredicate.IS_AIR, 12),
                RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)), BiomePlacementModifier.of());

        register(context, YELLOW_SPORE_BLOSSOM_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_SPORE_BLOSSOM_KEY),
                CountPlacementModifier.of(25), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_120_RANGE, EnvironmentScanPlacementModifier.of(Direction.UP, BlockPredicate.solid(), BlockPredicate.IS_AIR, 12),
                RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)), BiomePlacementModifier.of());




















    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MCCourseMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}

