package net.boxjumper.mccourse.datagen;

import net.boxjumper.mccourse.Item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ORICHALCUM_HELMET,
                        ModItems.ORICHALCUM_CHESTPLATE,
                        ModItems.ORICHALCUM_LEGGINGS,
                        ModItems.ORICHALCUM_BOOTS);

    }
}
