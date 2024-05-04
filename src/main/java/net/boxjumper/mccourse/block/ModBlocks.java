package net.boxjumper.mccourse.block;

import net.boxjumper.mccourse.MCCourseMod;
import net.boxjumper.mccourse.block.custom.SoundBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;


public class ModBlocks {
    public static final Block ORICHALCUM_BLOCK = regiserBlock("orichalcum_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), UniformIntProvider.create(0, 0)));
    public static final Block APATITE_STEEL_BLOCK = regiserBlock("apatite_steel_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), UniformIntProvider.create(0, 0)));
    public static final Block APATITE_ORE_BLOCK = regiserBlock("apatite_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(1, 2)));
    public static final Block ORICHALCUM_ORE_BLOCK = regiserBlock("orichalcum_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(1, 2)));


    public static final Block BLUE_SPORE_BLOSSOM = regiserBlock("blue_spore_blossom",
            new Block(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));
    public static final Block ORANGE_SPORE_BLOSSOM = regiserBlock("orange_spore_blossom",
            new Block(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));
    public static final Block YELLOW_SPORE_BLOSSOM = regiserBlock("yellow_spore_blossom",
            new Block(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));
    public static final Block RED_SPORE_BLOSSOM = regiserBlock("red_spore_blossom",
            new Block(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));


    public static final Block SOUND_BLOCK = regiserBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


//----------------------------------------------------------------------------------------------------------------------
//                            BUILDING BLOCKS
//----------------------------------------------------------------------------------------------------------------------


    public static final Block ROCK = regiserBlock("rock",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));








//----------------------------------------------------------------------------------------------------------------------
//                   TERRACOTTA STAIRS AND SLAB BLOCKS
//----------------------------------------------------------------------------------------------------------------------

    public static final Block TERRACOTTA_STAIRS = regiserBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_STAIRS = regiserBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = regiserBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_STAIRS = regiserBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_STAIRS = regiserBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_STAIRS = regiserBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block RED_TERRACOTTA_STAIRS = regiserBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_STAIRS = regiserBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_STAIRS = regiserBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_STAIRS = regiserBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_STAIRS = regiserBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_STAIRS = regiserBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = regiserBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_STAIRS = regiserBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_STAIRS = regiserBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_STAIRS = regiserBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_STAIRS = regiserBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

//----------------------------------------------------------------------------------------------------------------------

    public static final Block TERRACOTTA_SLAB = regiserBlock("terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_SLAB = regiserBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = regiserBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_SLAB = regiserBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_SLAB = regiserBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_SLAB = regiserBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block RED_TERRACOTTA_SLAB = regiserBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_SLAB = regiserBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_SLAB = regiserBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_SLAB = regiserBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_SLAB = regiserBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_SLAB = regiserBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = regiserBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_SLAB = regiserBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_SLAB = regiserBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_SLAB = regiserBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_SLAB = regiserBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));





    private static Block regiserBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        MCCourseMod.LOGGER.info("Registering ModBlocks for " + MCCourseMod.MOD_ID);
    }
}
