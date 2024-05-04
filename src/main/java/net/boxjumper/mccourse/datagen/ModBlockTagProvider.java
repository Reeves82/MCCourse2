package net.boxjumper.mccourse.datagen;

import net.boxjumper.mccourse.block.ModBlocks;
import net.boxjumper.mccourse.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
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
                        ModBlocks.ROCK);

//----------------------------------------------------------------------------------------------------------------------
//                 SPORE BLOSSOM                SPORE BLOSSOM
//----------------------------------------------------------------------------------------------------------------------
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLUE_SPORE_BLOSSOM,
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
                        ModBlocks.MAGENTA_TERRACOTTA_STAIRS);






        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

//-----------------------Tag for custom Tool Material Orichcalcum ------------------------------------------------------
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")))
                .add(ModBlocks.ORICHALCUM_ORE_BLOCK);

    }
}
