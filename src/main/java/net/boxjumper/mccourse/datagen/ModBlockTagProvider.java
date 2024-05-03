package net.boxjumper.mccourse.datagen;

import net.boxjumper.mccourse.block.ModBlocks;
import net.boxjumper.mccourse.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

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



        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

    }
}
