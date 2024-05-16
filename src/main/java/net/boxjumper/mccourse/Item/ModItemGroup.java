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
                        entries.add(ModBlocks.ROCK_SLAB);
                        entries.add(ModBlocks.ROCK_STAIRS);
                        entries.add(ModBlocks.SOFT_ROCK);
                        entries.add(ModBlocks.SOFT_ROCK_SLAB);
                        entries.add(ModBlocks.SOFT_ROCK_STAIRS);
                        entries.add(ModBlocks.DARK_ANDESITE);
                        entries.add(ModBlocks.TUFFACEOUS);
                        entries.add(ModBlocks.MUDDY_ROOTS);
                        entries.add(ModBlocks.KAOLIN_CLAY);
                        entries.add(ModBlocks.SLIM_MUD);
                        entries.add(ModBlocks.SMELLY_MUD);
                        entries.add(ModBlocks.MUDDY_CLAY);

                        entries.add(ModBlocks.GREEN_OBSIDIAN);

                        entries.add(ModBlocks.AVENTURINE);
                        entries.add(ModBlocks.CITRUS_AMETHYST);
                        entries.add(ModBlocks.BUDDING_CITRUS_AMETHYST);
                        entries.add(ModBlocks.BUDDING_AVENTURINE);

                        entries.add(ModBlocks.CITRUS_AMETHYST_BUD_00);
                        entries.add(ModBlocks.CITRUS_AMETHYST_BUD_01);
                        entries.add(ModBlocks.CITRUS_AMETHYST_BUD_02);
                        entries.add(ModBlocks.CITRUS_AMETHYST_BUD_03);
                        entries.add(ModBlocks.AVENTURINE_CRYSTAL_00);
                        entries.add(ModBlocks.AVENTURINE_CRYSTAL_01);
                        entries.add(ModBlocks.AVENTURINE_CRYSTAL_02);
                        entries.add(ModBlocks.AVENTURINE_CRYSTAL_03);

                        entries.add(ModBlocks.CYAN_LOUNGE_CHAIR);
                        entries.add(ModBlocks.RED_LOUNGE_CHAIR);
                        entries.add(ModBlocks.BLACK_LOUNGE_CHAIR);
                        entries.add(ModBlocks.BLUE_LOUNGE_CHAIR);
                        entries.add(ModBlocks.PURPLE_LOUNGE_CHAIR);
                        entries.add(ModBlocks.WHITE_LOUNGE_CHAIR);


                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.PEAT_BRICK);
                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);

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

                        entries.add(ModBlocks.GLOWING_AZALEA_LEAVES);
                        entries.add(ModBlocks.RED_AZALEA_LEAVES);
                        entries.add(ModBlocks.YELLOW_AZALEA_LEAVES);
                        entries.add(ModBlocks.PURPLE_AZALEA_LEAVES);
                        entries.add(ModBlocks.RED_AZALEA);
                        entries.add(ModBlocks.YELLOW_AZALEA);
                        entries.add(ModBlocks.PURPLE_AZALEA);
                        entries.add(ModBlocks.PETUNIA);

                        entries.add(ModBlocks.BLUE_PRISMARINE);
                        entries.add(ModBlocks.BLUE_PRISMARINE_STAIRS);
                        entries.add(ModBlocks.BLUE_PRISMARINE_SLAB);
                        entries.add(ModBlocks.RED_PRISMARINE);
                        entries.add(ModBlocks.RED_PRISMARINE_STAIRS);
                        entries.add(ModBlocks.RED_PRISMARINE_SLAB);
                        entries.add(ModBlocks.YELLOW_PRISMARINE);
                        entries.add(ModBlocks.YELLOW_PRISMARINE_STAIRS);
                        entries.add(ModBlocks.YELLOW_PRISMARINE_SLAB);
                        entries.add(ModBlocks.PURPLE_PRISMARINE);
                        entries.add(ModBlocks.PURPLE_PRISMARINE_STAIRS);
                        entries.add(ModBlocks.PURPLE_PRISMARINE_SLAB);






                    }).build());

    public static void registerItemGroups() {

    }
}
