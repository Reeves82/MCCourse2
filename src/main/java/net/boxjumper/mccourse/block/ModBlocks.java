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
