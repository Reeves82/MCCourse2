package net.boxjumper.mccourse.datagen;

import net.boxjumper.mccourse.Item.ModItems;
import net.boxjumper.mccourse.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORICHALCUM_BLOCK)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.ORICHALCUM_STEEL)
                .criterion(hasItem(ModBlocks.ORICHALCUM_BLOCK), conditionsFromItem(ModBlocks.ORICHALCUM_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORICHALCUM_BLOCK) + "_"));

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.ORICHALCUM_STEEL, RecipeCategory.MISC,ModBlocks.ORICHALCUM_BLOCK);


        offerSmelting(exporter, List.of(ModItems.ORICHALCUM_ORE), RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT,
                0.1f,3000,"orichalcum_ingot");

        offerBlasting(exporter, List.of(ModItems.ORICHALCUM_ORE), RecipeCategory.MISC, ModItems.ORICHALCUM_INGOT,
                0.1f,3000,"orichalcum_ingot");

        offerSmelting(exporter, List.of(ModItems.ORICHALCUM_INGOT), RecipeCategory.MISC, ModItems.ORICHALCUM_STEEL,
                0.1f,3000,"orichalcum_steel");

        offerBlasting(exporter, List.of(ModItems.ORICHALCUM_INGOT), RecipeCategory.MISC, ModItems.ORICHALCUM_STEEL,
                0.1f,3000,"orichalcum_steel");

//--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.APATITE_STEEL_BLOCK)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.APATITE_STEEL)
                .criterion(hasItem(ModBlocks.APATITE_STEEL_BLOCK), conditionsFromItem(ModBlocks.APATITE_STEEL_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.APATITE_STEEL_BLOCK) + "_"));

        offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.APATITE_STEEL, RecipeCategory.MISC,ModBlocks.APATITE_STEEL_BLOCK);


        offerSmelting(exporter, List.of(ModItems.APATITE_GEM), RecipeCategory.MISC, ModItems.APATITE_INGOT,
                0.1f,3000,"apatite_ingot");

        offerBlasting(exporter, List.of(ModItems.APATITE_GEM), RecipeCategory.MISC, ModItems.APATITE_INGOT,
                0.1f,3000,"apatite_ingot");

        offerSmelting(exporter, List.of(ModItems.APATITE_INGOT), RecipeCategory.MISC, ModItems.APATITE_STEEL,
                0.1f,3000,"apatite_steel");

        offerBlasting(exporter, List.of(ModItems.APATITE_INGOT), RecipeCategory.MISC, ModItems.APATITE_STEEL,
                0.1f,3000,"apatite_steel");





    }








}

