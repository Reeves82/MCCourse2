package net.boxjumper.mccourse.fluid;

import net.boxjumper.mccourse.MCCourseMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static final FlowableFluid STILL_SWAMP_WATER = Registry.register(Registries.FLUID,
            new Identifier(MCCourseMod.MOD_ID, "still_swamp_water"), new SwampWaterFluid.Still());

    public static final FlowableFluid FLOWING_SWAMP_WATER = Registry.register(Registries.FLUID,
            new Identifier(MCCourseMod.MOD_ID, "flowing_swamp_water"), new SwampWaterFluid.Flowing());

    public static final Block SWAMP_WATER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(MCCourseMod.MOD_ID,
            "swamp_water_block"), new FluidBlock(ModFluids.STILL_SWAMP_WATER, FabricBlockSettings.copyOf(Blocks.WATER)
            .replaceable().liquid()));

    public static final Item SWAMP_WATER_BUCKET = Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID,
            "swamp_water_bucket"), new BucketItem(ModFluids.STILL_SWAMP_WATER,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static void registerFluids() {
        MCCourseMod.LOGGER.info("Registering Fluid for " + MCCourseMod.MOD_ID);
    }
}