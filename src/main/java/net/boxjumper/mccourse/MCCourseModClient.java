package net.boxjumper.mccourse;

import net.boxjumper.mccourse.block.ModBlocks;
import net.boxjumper.mccourse.entity.ModEntities;
import net.boxjumper.mccourse.entity.client.PorcupineModel;
import net.boxjumper.mccourse.entity.client.PorcupineRenderer;
import net.boxjumper.mccourse.entity.layer.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class MCCourseModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_SPORE_BLOSSOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_SPORE_BLOSSOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_SPORE_BLOSSOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_SPORE_BLOSSOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOWING_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAULIFLOWER_CROP, RenderLayer.getCutout());

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);


        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);


    }
}
