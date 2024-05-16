package net.boxjumper.mccourse.block.custom;

import net.boxjumper.mccourse.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;


public class BuddingCitrusAmethystBlock extends CitrusAmethystBlock {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingCitrusAmethystBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) != 0) {
            return;
        }
        Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
        BlockPos blockPos = pos.offset(direction);
        BlockState blockState = world.getBlockState(blockPos);
        Block block = null;
        if (BuddingCitrusAmethystBlock.canGrowIn(blockState)) {
            block = ModBlocks.CITRUS_AMETHYST_BUD_00;
        } else if (blockState.isOf(ModBlocks.CITRUS_AMETHYST_BUD_00) && blockState.get(CitrusAmethystClusterBlock.FACING) == direction) {
            block = ModBlocks.CITRUS_AMETHYST_BUD_01;
        } else if (blockState.isOf(ModBlocks.CITRUS_AMETHYST_BUD_01) && blockState.get(CitrusAmethystClusterBlock.FACING) == direction) {
            block = ModBlocks.CITRUS_AMETHYST_BUD_02;
        } else if (blockState.isOf(ModBlocks.CITRUS_AMETHYST_BUD_02) && blockState.get(CitrusAmethystClusterBlock.FACING) == direction) {
            block = ModBlocks.CITRUS_AMETHYST_BUD_03;
        }
        if (block != null) {
            BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(CitrusAmethystClusterBlock.FACING, direction)).with(CitrusAmethystClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
            world.setBlockState(blockPos, blockState2);
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}


