package net.boxjumper.mccourse.util;

import net.boxjumper.mccourse.Item.ModItems;
import net.boxjumper.mccourse.entity.ModEntities;
import net.boxjumper.mccourse.entity.custom.PorcupineEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModCompostables();
        registerAttributes();
    }

    private static void registerFuels(){
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.PEAT_BRICK, 200);

    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
    }



    private static void registerModCompostables() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER, 0.5F);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER_SEEDS, 0.25F);
    }
}
