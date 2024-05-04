package net.boxjumper.mccourse.datagen;

import net.boxjumper.mccourse.Item.ModItems;
import net.boxjumper.mccourse.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ORICHALCUM_BLOCK);
        addDrop(ModBlocks.APATITE_STEEL_BLOCK);
        addDrop(ModBlocks.BLUE_SPORE_BLOSSOM);
        addDrop(ModBlocks.ORANGE_SPORE_BLOSSOM);
        addDrop(ModBlocks.YELLOW_SPORE_BLOSSOM);
        addDrop(ModBlocks.RED_SPORE_BLOSSOM);
        addDrop(ModBlocks.ROCK);

        addDrop(ModBlocks.TERRACOTTA_SLAB, slabDrops(ModBlocks.TERRACOTTA_SLAB));
        addDrop(ModBlocks.WHITE_TERRACOTTA_SLAB, slabDrops(ModBlocks.WHITE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLACK_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLACK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BROWN_TERRACOTTA_SLAB, slabDrops(ModBlocks.BROWN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.RED_TERRACOTTA_SLAB, slabDrops(ModBlocks.RED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.ORANGE_TERRACOTTA_SLAB, slabDrops(ModBlocks.ORANGE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.YELLOW_TERRACOTTA_SLAB, slabDrops(ModBlocks.YELLOW_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIME_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIME_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GREEN_TERRACOTTA_SLAB, slabDrops(ModBlocks.GREEN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.CYAN_TERRACOTTA_SLAB, slabDrops(ModBlocks.CYAN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PURPLE_TERRACOTTA_SLAB, slabDrops(ModBlocks.PURPLE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_SLAB, slabDrops(ModBlocks.MAGENTA_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PINK_TERRACOTTA_SLAB, slabDrops(ModBlocks.PINK_TERRACOTTA_SLAB));


        addDrop(ModBlocks.TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_TERRACOTTA_STAIRS);




        addDrop(ModBlocks.APATITE_ORE_BLOCK, oreDrops(ModBlocks.APATITE_ORE_BLOCK, ModItems.APATITE_GEM));
        addDrop(ModBlocks.ORICHALCUM_ORE_BLOCK, oreDrops(ModBlocks.ORICHALCUM_ORE_BLOCK, ModItems.ORICHALCUM_ORE));

    }
}
