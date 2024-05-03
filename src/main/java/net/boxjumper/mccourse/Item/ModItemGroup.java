package net.boxjumper.mccourse.Item;

import net.boxjumper.mccourse.MCCourseMod;
import net.boxjumper.mccourse.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ORICHALCUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "orichalcum_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup_orichalcum_group"))
                    .icon(() -> new ItemStack(ModItems.ORICHALCUM_STEEL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ORICHALCUM_STEEL);
                        entries.add(ModItems.ORICHALCUM_INGOT);
                        entries.add(ModItems.ORICHALCUM_ORE);

                        entries.add(ModBlocks.ORICHALCUM_BLOCK);
                        entries.add(ModBlocks.ORICHALCUM_ORE_BLOCK);

                        entries.add(ModItems.APATITE_STEEL);
                        entries.add(ModItems.APATITE_GEM);
                        entries.add(ModItems.APATITE_INGOT);

                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModBlocks.APATITE_STEEL_BLOCK);
                        entries.add(ModBlocks.APATITE_ORE_BLOCK);


                        entries.add(ModBlocks.BLUE_SPORE_BLOSSOM);
                        entries.add(ModBlocks.ORANGE_SPORE_BLOSSOM);
                        entries.add(ModBlocks.YELLOW_SPORE_BLOSSOM);
                        entries.add(ModBlocks.RED_SPORE_BLOSSOM);

                        entries.add(ModBlocks.ROCK);


                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.PEAT_BRICK);




                    }).build());

    public static void registerItemGroups() {

    }
}
