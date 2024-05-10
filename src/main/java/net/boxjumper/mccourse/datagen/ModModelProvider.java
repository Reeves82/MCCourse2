package net.boxjumper.mccourse.datagen;

import net.boxjumper.mccourse.Item.ModItems;
import net.boxjumper.mccourse.block.ModBlocks;
import net.boxjumper.mccourse.block.custom.CauliflowerCropBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

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






        BlockStateModelGenerator.BlockTexturePool rockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROCK);
        rockTexturePool.stairs(ModBlocks.ROCK_STAIRS);
        rockTexturePool.slab(ModBlocks.ROCK_SLAB);

        BlockStateModelGenerator.BlockTexturePool softRockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOFT_ROCK);
        softRockTexturePool.stairs(ModBlocks.SOFT_ROCK_STAIRS);
        softRockTexturePool.slab(ModBlocks.SOFT_ROCK_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_ANDESITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFFACEOUS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUDDY_ROOTS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.KAOLIN_CLAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLIM_MUD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMELLY_MUD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MUDDY_CLAY);



        BlockStateModelGenerator.BlockTexturePool terracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        terracottaTexturePool.stairs(ModBlocks.TERRACOTTA_STAIRS);
        terracottaTexturePool.slab(ModBlocks.TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool whiteTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        whiteTerracottaTexturePool.stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        whiteTerracottaTexturePool.slab(ModBlocks.WHITE_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        lightGrayTerracottaTexturePool.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        lightGrayTerracottaTexturePool.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool grayTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        grayTerracottaTexturePool.stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        grayTerracottaTexturePool.slab(ModBlocks.GRAY_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool blackTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        blackTerracottaTexturePool.stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        blackTerracottaTexturePool.slab(ModBlocks.BLACK_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool blueTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        blueTerracottaTexturePool.stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        blueTerracottaTexturePool.slab(ModBlocks.BLUE_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool brownTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);
        brownTerracottaTexturePool.stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        brownTerracottaTexturePool.slab(ModBlocks.BROWN_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool redTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        redTerracottaTexturePool.stairs(ModBlocks.RED_TERRACOTTA_STAIRS);
        redTerracottaTexturePool.slab(ModBlocks.RED_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool orangeTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        orangeTerracottaTexturePool.stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        orangeTerracottaTexturePool.slab(ModBlocks.ORANGE_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool yellowTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        yellowTerracottaTexturePool.stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        yellowTerracottaTexturePool.slab(ModBlocks.YELLOW_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool limeTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        limeTerracottaTexturePool.stairs(ModBlocks.LIME_TERRACOTTA_STAIRS);
        limeTerracottaTexturePool.slab(ModBlocks.LIME_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool greenTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        greenTerracottaTexturePool.stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        greenTerracottaTexturePool.slab(ModBlocks.GREEN_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool cyanTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        cyanTerracottaTexturePool.stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        cyanTerracottaTexturePool.slab(ModBlocks.CYAN_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        lightBlueTerracottaTexturePool.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        lightBlueTerracottaTexturePool.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool purpleTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        purpleTerracottaTexturePool.stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        purpleTerracottaTexturePool.slab(ModBlocks.PURPLE_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool magentaTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        magentaTerracottaTexturePool.stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        magentaTerracottaTexturePool.slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB);

        BlockStateModelGenerator.BlockTexturePool pinkTerracottaTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);
        pinkTerracottaTexturePool.stairs(ModBlocks.PINK_TERRACOTTA_STAIRS);
        pinkTerracottaTexturePool.slab(ModBlocks.PINK_TERRACOTTA_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOWING_AZALEA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_AZALEA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_AZALEA_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_AZALEA_LEAVES);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CYAN_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.RED_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLUE_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.BLACK_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PURPLE_LOUNGE_CHAIR);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.WHITE_LOUNGE_CHAIR);



        BlockStateModelGenerator.BlockTexturePool bluePrismarinTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_PRISMARINE);
        bluePrismarinTexturePool.stairs(ModBlocks.BLUE_PRISMARINE_STAIRS);
        bluePrismarinTexturePool.slab(ModBlocks.BLUE_PRISMARINE_SLAB);

        BlockStateModelGenerator.BlockTexturePool redPrismarinTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_PRISMARINE);
        redPrismarinTexturePool.stairs(ModBlocks.RED_PRISMARINE_STAIRS);
        redPrismarinTexturePool.slab(ModBlocks.RED_PRISMARINE_SLAB);

        BlockStateModelGenerator.BlockTexturePool yellowPrismarinTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_PRISMARINE);
        yellowPrismarinTexturePool.stairs(ModBlocks.YELLOW_PRISMARINE_STAIRS);
        yellowPrismarinTexturePool.slab(ModBlocks.YELLOW_PRISMARINE_SLAB);

        BlockStateModelGenerator.BlockTexturePool purplePrismarinTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_PRISMARINE);
        purplePrismarinTexturePool.stairs(ModBlocks.PURPLE_PRISMARINE_STAIRS);
        purplePrismarinTexturePool.slab(ModBlocks.PURPLE_PRISMARINE_SLAB);

        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);




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

        itemModelGenerator.register(ModItems.ORICHALCUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORICHALCUM_PICKAXE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORICHALCUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORICHALCUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORICHALCUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ORICHALCUM_BOOTS));

        itemModelGenerator.register(ModItems.PORCUPINE_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));






    }
}
