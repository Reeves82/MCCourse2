package net.boxjumper.mccourse.block.custom;

import net.boxjumper.mccourse.world.tree.PurpleAzaleaSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class PurpleAzaleaBlock extends PlantBlock implements Fertilizable {
    private static final PurpleAzaleaSaplingGenerator GENERATOR = new PurpleAzaleaSaplingGenerator();
    private static final VoxelShape SHAPE = VoxelShapes.union(Block.createCuboidShape(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), Block.createCuboidShape(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

    public PurpleAzaleaBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.CLAY) || super.canPlantOnTop(floor, world, pos);
    }



    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return world.getFluidState(pos.up()).isEmpty();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return (double)world.random.nextFloat() < 0.45;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        GENERATOR.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
    }
}


