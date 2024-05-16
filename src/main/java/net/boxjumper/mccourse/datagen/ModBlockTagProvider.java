package net.boxjumper.mccourse.datagen;

import net.boxjumper.mccourse.block.ModBlocks;
import net.boxjumper.mccourse.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.ORICHALCUM_ORE_BLOCK)
                .add(ModBlocks.APATITE_ORE_BLOCK)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .add(ModBlocks.BLUE_SPORE_BLOSSOM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ORICHALCUM_ORE_BLOCK,
                        ModBlocks.ORICHALCUM_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ORICHALCUM_ORE_BLOCK,
                        ModBlocks.ORICHALCUM_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.APATITE_ORE_BLOCK,
                        ModBlocks.APATITE_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.APATITE_ORE_BLOCK,
                        ModBlocks.APATITE_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ROCK,
                        ModBlocks.SOFT_ROCK,
                        ModBlocks.DARK_ANDESITE,
                        ModBlocks.MUDDY_ROOTS,
                        ModBlocks.KAOLIN_CLAY,
                        ModBlocks.SLIM_MUD,
                        ModBlocks.SMELLY_MUD,
                        ModBlocks.MUDDY_CLAY,
                        ModBlocks.TUFFACEOUS,
                        ModBlocks.SOFT_ROCK_STAIRS,
                        ModBlocks.ROCK_STAIRS,
                        ModBlocks.SOFT_ROCK_SLAB,
                        ModBlocks.ROCK_SLAB,
                        ModBlocks.GREEN_OBSIDIAN,
                        ModBlocks.CITRUS_AMETHYST,
                        ModBlocks.CITRUS_AMETHYST_BUD_00,
                        ModBlocks.CITRUS_AMETHYST_BUD_01,
                        ModBlocks.CITRUS_AMETHYST_BUD_02,
                        ModBlocks.CITRUS_AMETHYST_BUD_03,
                        ModBlocks.AVENTURINE_CRYSTAL_00,
                        ModBlocks.AVENTURINE_CRYSTAL_01,
                        ModBlocks.AVENTURINE_CRYSTAL_02,
                        ModBlocks.AVENTURINE_CRYSTAL_03,
                        ModBlocks.AVENTURINE,
                        ModBlocks.ROCK);

//----------------------------------------------------------------------------------------------------------------------
//                 SPORE BLOSSOM                SPORE BLOSSOM
//----------------------------------------------------------------------------------------------------------------------
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLUE_SPORE_BLOSSOM,
                        ModBlocks.RED_AZALEA,
                        ModBlocks.PURPLE_AZALEA,
                        ModBlocks.YELLOW_AZALEA,
                        ModBlocks.BLUE_SPORE_BLOSSOM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ORANGE_SPORE_BLOSSOM,
                        ModBlocks.ORANGE_SPORE_BLOSSOM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.YELLOW_SPORE_BLOSSOM,
                        ModBlocks.YELLOW_SPORE_BLOSSOM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RED_SPORE_BLOSSOM,
                        ModBlocks.RED_SPORE_BLOSSOM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TERRACOTTA_SLAB,
                        ModBlocks.WHITE_TERRACOTTA_SLAB,
                        ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB,
                        ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB,
                        ModBlocks.LIME_TERRACOTTA_SLAB,
                        ModBlocks.GRAY_TERRACOTTA_SLAB,
                        ModBlocks.GREEN_TERRACOTTA_SLAB,
                        ModBlocks.BLACK_TERRACOTTA_SLAB,
                        ModBlocks.BLUE_TERRACOTTA_SLAB,
                        ModBlocks.BROWN_TERRACOTTA_SLAB,
                        ModBlocks.RED_TERRACOTTA_SLAB,
                        ModBlocks.YELLOW_TERRACOTTA_SLAB,
                        ModBlocks.ORANGE_TERRACOTTA_SLAB,
                        ModBlocks.CYAN_TERRACOTTA_SLAB,
                        ModBlocks.PURPLE_TERRACOTTA_SLAB,
                        ModBlocks.PINK_TERRACOTTA_SLAB,
                        ModBlocks.MAGENTA_TERRACOTTA_SLAB,




                        ModBlocks.TERRACOTTA_STAIRS,
                        ModBlocks.WHITE_TERRACOTTA_STAIRS,
                        ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS,
                        ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS,
                        ModBlocks.LIME_TERRACOTTA_STAIRS,
                        ModBlocks.GRAY_TERRACOTTA_STAIRS,
                        ModBlocks.GREEN_TERRACOTTA_STAIRS,
                        ModBlocks.BLACK_TERRACOTTA_STAIRS,
                        ModBlocks.BLUE_TERRACOTTA_STAIRS,
                        ModBlocks.BROWN_TERRACOTTA_STAIRS,
                        ModBlocks.RED_TERRACOTTA_STAIRS,
                        ModBlocks.YELLOW_TERRACOTTA_STAIRS,
                        ModBlocks.ORANGE_TERRACOTTA_STAIRS,
                        ModBlocks.CYAN_TERRACOTTA_STAIRS,
                        ModBlocks.PURPLE_TERRACOTTA_STAIRS,
                        ModBlocks.PINK_TERRACOTTA_STAIRS,
                        ModBlocks.MAGENTA_TERRACOTTA_STAIRS,

                        ModBlocks.BLUE_PRISMARINE_SLAB,
                        ModBlocks.RED_PRISMARINE_SLAB,
                        ModBlocks.YELLOW_PRISMARINE_SLAB,
                        ModBlocks.PURPLE_PRISMARINE_SLAB,

                        ModBlocks.BLUE_PRISMARINE_STAIRS,
                        ModBlocks.RED_PRISMARINE_STAIRS,
                        ModBlocks.YELLOW_PRISMARINE_STAIRS,
                        ModBlocks.PURPLE_PRISMARINE_STAIRS,

                        ModBlocks.BLUE_PRISMARINE,
                        ModBlocks.RED_PRISMARINE,
                        ModBlocks.YELLOW_PRISMARINE,
                        ModBlocks.PURPLE_PRISMARINE);








        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

//-----------------------Tag for custom Tool Material Orichcalcum ------------------------------------------------------
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")))
                .add(ModBlocks.ORICHALCUM_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.CYAN_LOUNGE_CHAIR)
                .add(ModBlocks.BLUE_LOUNGE_CHAIR)
                .add(ModBlocks.BLACK_LOUNGE_CHAIR)
                .add(ModBlocks.RED_LOUNGE_CHAIR)
                .add(ModBlocks.PURPLE_LOUNGE_CHAIR)
                .add(ModBlocks.WHITE_LOUNGE_CHAIR)

                .add(ModBlocks.GLOWING_AZALEA_LEAVES)
                .add(ModBlocks.RED_AZALEA_LEAVES)
                .add(ModBlocks.YELLOW_AZALEA_LEAVES)
                .add(ModBlocks.PURPLE_AZALEA_LEAVES)
                .add(ModBlocks.CYAN_LOUNGE_CHAIR);



    }
}
