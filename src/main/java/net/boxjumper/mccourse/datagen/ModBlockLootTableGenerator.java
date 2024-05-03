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

        addDrop(ModBlocks.APATITE_ORE_BLOCK, oreDrops(ModBlocks.APATITE_ORE_BLOCK, ModItems.APATITE_GEM));
        addDrop(ModBlocks.ORICHALCUM_ORE_BLOCK, oreDrops(ModBlocks.ORICHALCUM_ORE_BLOCK, ModItems.ORICHALCUM_ORE));

    }
}
