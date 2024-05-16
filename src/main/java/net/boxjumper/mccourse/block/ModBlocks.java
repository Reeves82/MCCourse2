package net.boxjumper.mccourse.block;

import net.boxjumper.mccourse.MCCourseMod;
import net.boxjumper.mccourse.block.custom.*;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;


//----------------------------------------------------------------------------------------------------------------------
//                            ORE RELATED BLOCKS
//----------------------------------------------------------------------------------------------------------------------


public class ModBlocks {
    public static final Block ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), UniformIntProvider.create(0, 0)));

    public static final Block APATITE_STEEL_BLOCK = registerBlock("apatite_steel_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), UniformIntProvider.create(0, 0)));

    public static final Block APATITE_ORE_BLOCK = registerBlock("apatite_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(1, 2)));

    public static final Block ORICHALCUM_ORE_BLOCK = registerBlock("orichalcum_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(1, 2)));
//----------------------------------------------------------------------------------------------------------------------
//                            GEO BLOCKS
//----------------------------------------------------------------------------------------------------------------------

    public static final Block CITRUS_AMETHYST = registerBlock("citrus_amethyst",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));

    public static final Block BUDDING_AVENTURINE = registerBlock("budding_aventurine",
            new Block(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST)));

    public static final Block AVENTURINE = registerBlock("aventurine",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));



    public static final Block AVENTURINE_CRYSTAL_00 = registerBlock("aventurine_crystal_00",
            new Block(FabricBlockSettings.copyOf(Blocks.SMALL_AMETHYST_BUD)));

    public static final Block AVENTURINE_CRYSTAL_01 = registerBlock("aventurine_crystal_01",
            new Block(FabricBlockSettings.copyOf(Blocks.MEDIUM_AMETHYST_BUD)));

    public static final Block AVENTURINE_CRYSTAL_02 = registerBlock("aventurine_crystal_02",
            new Block(FabricBlockSettings.copyOf(Blocks.LARGE_AMETHYST_BUD)));

    public static final Block AVENTURINE_CRYSTAL_03 = registerBlock("aventurine_crystal_03",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER)));

    public static final Block CITRUS_AMETHYST_BUD_00 = registerBlock("citrus_amethyst_bud_00",
            new CitrusAmethystBud(3, 4, FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER)
                    .sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).solid()
                    .luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CITRUS_AMETHYST_BUD_01 = registerBlock("citrus_amethyst_bud_01",
            new CitrusAmethystBud(4, 3, FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER)
                    .sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).solid()
                    .luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CITRUS_AMETHYST_BUD_02 = registerBlock("citrus_amethyst_bud_02",
            new CitrusAmethystBud(5, 3, FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER)
                    .sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).solid()
                    .luminance(state -> 3).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CITRUS_AMETHYST_BUD_03 = registerBlock("citrus_amethyst_bud_03",
            new CitrusAmethystBud(5, 3, FabricBlockSettings.copyOf(Blocks.AMETHYST_CLUSTER)
                    .sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).solid()
                    .luminance(state -> 10).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BUDDING_CITRUS_AMETHYST = registerBlock("budding_citrus_amethyst",
            new BuddingCitrusAmethystBlock(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST).mapColor(MapColor.YELLOW)
                    .ticksRandomly().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool().pistonBehavior(PistonBehavior.DESTROY)));














//----------------------------------------------------------------------------------------------------------------------
//                            RANDOM BLOCKS
//----------------------------------------------------------------------------------------------------------------------



    public static final Block GREEN_OBSIDIAN = registerBlock("green_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

//----------------------------------------------------------------------------------------------------------------------
//                            PLANT CROP BLOCKS
//----------------------------------------------------------------------------------------------------------------------

    public static final Block CAULIFLOWER_CROP = registerBlockWithoutBlockItem("cauliflower_crop",
            new CauliflowerCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));



//----------------------------------------------------------------------------------------------------------------------
//                            FLOWER BLOCKS
//----------------------------------------------------------------------------------------------------------------------

    public static final Block PETUNIA = registerBlock("petunia",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 4,FabricBlockSettings.copyOf(Blocks.ALLIUM)));

    public static final Block POTTED_PETUNIA = registerBlock("potted_petunia",
            new FlowerPotBlock(PETUNIA,FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM)));

    public static final Block RED_AZALEA = registerBlock("red_azalea",
            new RedAzaleaBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA)));

    public static final Block POTTED_RED_AZALEA = registerBlock("potted_azalea",
            new FlowerPotBlock(RED_AZALEA,FabricBlockSettings.copyOf(Blocks.POTTED_AZALEA_BUSH)));

    public static final Block YELLOW_AZALEA = registerBlock("yellow_azalea",
            new YellowAzaleaBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA)));

    public static final Block POTTED_YELLOW_AZALEA = registerBlock("potted_yellow_azalea",
            new FlowerPotBlock(YELLOW_AZALEA,FabricBlockSettings.copyOf(Blocks.POTTED_AZALEA_BUSH)));

    public static final Block PURPLE_AZALEA = registerBlock("purple_azalea",
            new PurpleAzaleaBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA)));

    public static final Block POTTED_PURPLE_AZALEA = registerBlock("potted_purple_azalea",
            new FlowerPotBlock(PURPLE_AZALEA,FabricBlockSettings.copyOf(Blocks.POTTED_AZALEA_BUSH)));

    public static final Block BLUE_SPORE_BLOSSOM = registerBlock("blue_spore_blossom",
            new SporeBlossomBlock(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));

    public static final Block ORANGE_SPORE_BLOSSOM = registerBlock("orange_spore_blossom",
            new SporeBlossomBlock(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));

    public static final Block YELLOW_SPORE_BLOSSOM = registerBlock("yellow_spore_blossom",
            new SporeBlossomBlock(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));

    public static final Block RED_SPORE_BLOSSOM = registerBlock("red_spore_blossom",
            new SporeBlossomBlock(FabricBlockSettings.copyOf(Blocks.SPORE_BLOSSOM)));



//----------------------------------------------------------------------------------------------------------------------
//                            BUILDING BLOCKS
//----------------------------------------------------------------------------------------------------------------------


    public static final Block ROCK = registerBlock("rock",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).luminance(15)));

    public static final Block SOFT_ROCK = registerBlock("soft_rock",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).luminance(15)));

    public static final Block ROCK_STAIRS = registerBlock("rock_stairs",
            new StairsBlock(ModBlocks.ROCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block ROCK_SLAB = registerBlock("rock_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block SOFT_ROCK_STAIRS = registerBlock("soft_rock_stairs",
            new StairsBlock(ModBlocks.SOFT_ROCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block SOFT_ROCK_SLAB = registerBlock("soft_rock_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block DARK_ANDESITE = registerBlock("dark_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).luminance(15)));

    public static final Block TUFFACEOUS = registerBlock("tuffaceous",
            new Block(FabricBlockSettings.copyOf(Blocks.TUFF).luminance(15)));

    public static final Block MUDDY_ROOTS = registerBlock("muddy_roots",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD).luminance(15)));

    public static final Block KAOLIN_CLAY = registerBlock("kaolin_clay",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD).luminance(15)));

    public static final Block SLIM_MUD = registerBlock("slim_mud",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD).slipperiness(1).luminance(15)));

    public static final Block SMELLY_MUD = registerBlock("smelly_mud",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD).jumpVelocityMultiplier(10).luminance(15)));

    public static final Block MUDDY_CLAY = registerBlock("muddy_clay",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD).luminance(15)));








//----------------------------------------------------------------------------------------------------------------------
//                   TERRACOTTA STAIRS AND SLAB BLOCKS
//----------------------------------------------------------------------------------------------------------------------

    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

//----------------------------------------------------------------------------------------------------------------------

    public static final Block BLUE_PRISMARINE = registerBlock("blue_prismarine",
        new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block BLUE_PRISMARINE_SLAB = registerBlock("blue_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block BLUE_PRISMARINE_STAIRS = registerBlock("blue_prismarine_stairs",
            new StairsBlock(Blocks.PRISMARINE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block RED_PRISMARINE = registerBlock("red_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block RED_PRISMARINE_SLAB = registerBlock("red_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block RED_PRISMARINE_STAIRS = registerBlock("red_prismarine_stairs",
            new StairsBlock(Blocks.PRISMARINE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block YELLOW_PRISMARINE = registerBlock("yellow_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block YELLOW_PRISMARINE_SLAB = registerBlock("yellow_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block YELLOW_PRISMARINE_STAIRS = registerBlock("yellow_prismarine_stairs",
            new StairsBlock(Blocks.PRISMARINE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block PURPLE_PRISMARINE = registerBlock("purple_prismarine",
            new Block(FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block PURPLE_PRISMARINE_SLAB = registerBlock("purple_prismarine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PRISMARINE)));

    public static final Block PURPLE_PRISMARINE_STAIRS = registerBlock("purple_prismarine_stairs",
            new StairsBlock(Blocks.PRISMARINE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.PRISMARINE)));




//----------------------------------------------------------------------------------------------------------------------

    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));

    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));


//----------------------------------------------------------------------------------------------------------------------
//
//----------------------------------------------------------------------------------------------------------------------

    public static final Block GLOWING_AZALEA_LEAVES = registerBlock("glowing_azalea_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES).luminance(15)));

    public static final Block PURPLE_AZALEA_LEAVES = registerBlock("purple_azalea_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));

    public static final Block RED_AZALEA_LEAVES = registerBlock("red_azalea_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));

    public static final Block YELLOW_AZALEA_LEAVES = registerBlock("yellow_azalea_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));

//----------------------------------------------------------------------------------------------------------------------
//
//----------------------------------------------------------------------------------------------------------------------


    public static final Block CYAN_LOUNGE_CHAIR = registerBlock("cyan_lounge_chair",
            new Lounge(FabricBlockSettings.copyOf(Blocks.CYAN_WOOL).nonOpaque()));

    public static final Block BLACK_LOUNGE_CHAIR = registerBlock("black_lounge_chair",
            new Lounge(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL).nonOpaque()));

    public static final Block BLUE_LOUNGE_CHAIR = registerBlock("blue_lounge_chair",
            new Lounge(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).nonOpaque()));

    public static final Block RED_LOUNGE_CHAIR = registerBlock("red_lounge_chair",
            new Lounge(FabricBlockSettings.copyOf(Blocks.RED_WOOL).nonOpaque()));

    public static final Block PURPLE_LOUNGE_CHAIR = registerBlock("purple_lounge_chair",
            new Lounge(FabricBlockSettings.copyOf(Blocks.PURPLE_WOOL).nonOpaque()));

    public static final Block WHITE_LOUNGE_CHAIR = registerBlock("white_lounge_chair",
            new Lounge(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));






//----------------------------------------------------------------------------------------------------------------------
//
//----------------------------------------------------------------------------------------------------------------------

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
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
