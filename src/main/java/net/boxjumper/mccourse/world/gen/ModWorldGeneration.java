package net.boxjumper.mccourse.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModGeodeGeneration.generateGeodes();

        ModOreGeneration.generateOres();
        ModSporeGeneration.generateSporeBlossoms();

        ModTreeGeneration.generateTrees();
        ModFlowerGeneration.generateFlowers();

    }
}