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

                        entries.add(ModItems.ORICHALCUM_AXE);
                        entries.add(ModItems.ORICHALCUM_SWORD);
                        entries.add(ModItems.ORICHALCUM_HOE);
                        entries.add(ModItems.ORICHALCUM_SHOVEL);
                        entries.add(ModItems.ORICHALCUM_PICKAXE);

                        entries.add(ModItems.ORICHALCUM_HELMET);
                        entries.add(ModItems.ORICHALCUM_CHESTPLATE);
                        entries.add(ModItems.ORICHALCUM_LEGGINGS);
                        entries.add(ModItems.ORICHALCUM_BOOTS);

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

                        entries.add(ModBlocks.TERRACOTTA_SLAB);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.RED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIME_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PINK_TERRACOTTA_SLAB);

                        entries.add(ModBlocks.TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.RED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PINK_TERRACOTTA_STAIRS);




                    }).build());

    public static void registerItemGroups() {

    }
}
