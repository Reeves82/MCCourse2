package net.boxjumper.mccourse.datagen;

import net.boxjumper.mccourse.Item.ModItems;
import net.boxjumper.mccourse.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APATITE_STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.APATITE_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORICHALCUM_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORICHALCUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_SPORE_BLOSSOM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_SPORE_BLOSSOM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_SPORE_BLOSSOM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SPORE_BLOSSOM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEAT_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORICHALCUM_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.APATITE_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.APATITE_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.APATITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORICHALCUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORICHALCUM_ORE, Models.GENERATED);
    }
}
