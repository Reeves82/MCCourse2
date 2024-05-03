package net.boxjumper.mccourse.Item;

import net.boxjumper.mccourse.Item.custom.MetalDetectorItem;
import net.boxjumper.mccourse.MCCourseMod;
import net.boxjumper.mccourse.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings()));
    public static final Item ORICHALCUM_ORE = registerItem("orichalcum_ore",
            new Item(new FabricItemSettings()));
    public static final Item ORICHALCUM_STEEL = registerItem("orichalcum_steel",
            new Item(new FabricItemSettings()));
    public static final Item APATITE_GEM = registerItem("apatite_gem",
            new Item(new FabricItemSettings()));
    public static final Item APATITE_INGOT = registerItem("apatite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item APATITE_STEEL = registerItem("apatite_steel",
            new Item(new FabricItemSettings()));


    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new Item(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));

    public static final Item PEAT_BRICK = registerItem("peat_brick",
            new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(256)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(ORICHALCUM_INGOT);
        entries.add(ORICHALCUM_ORE);
        entries.add(ORICHALCUM_STEEL);
        entries.add(APATITE_GEM);
        entries.add(APATITE_INGOT);
        entries.add(APATITE_STEEL);

        entries.add(ModBlocks.ORICHALCUM_BLOCK);
        entries.add(ModBlocks.APATITE_STEEL_BLOCK);
        entries.add(ModBlocks.APATITE_ORE_BLOCK);
    }

    public static void registerModItems() {
        MCCourseMod.LOGGER.info("Registering Mod Items for" + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }


}

