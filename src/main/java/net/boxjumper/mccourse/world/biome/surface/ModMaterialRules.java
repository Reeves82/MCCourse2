package net.boxjumper.mccourse.world.biome.surface;

import net.boxjumper.mccourse.block.ModBlocks;
import net.boxjumper.mccourse.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

import static net.boxjumper.mccourse.block.ModBlocks.ROCK;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(ROCK);
    private static final MaterialRules.MaterialRule MUDDY_ROOTS = makeStateRule(ModBlocks.MUDDY_ROOTS);
    private static final MaterialRules.MaterialRule MUDDY_CLAY = makeStateRule(ROCK);
    private static final MaterialRules.MaterialRule SOFT_ROCK = makeStateRule(ModBlocks.MUDDY_CLAY);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, MUDDY_ROOTS), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.GARDENS_CAVES),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, SOFT_ROCK)),
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, MUDDY_CLAY)),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
