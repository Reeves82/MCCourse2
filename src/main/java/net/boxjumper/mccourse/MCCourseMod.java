package net.boxjumper.mccourse;

import net.boxjumper.mccourse.Item.ModItemGroup;
import net.boxjumper.mccourse.Item.ModItems;
import net.boxjumper.mccourse.block.ModBlocks;
import net.boxjumper.mccourse.entity.ModEntities;
import net.boxjumper.mccourse.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModEntities.registerModEntites();

	}
}

