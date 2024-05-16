package net.boxjumper.mccourse.world.biome;

import net.boxjumper.mccourse.MCCourseMod;
import net.boxjumper.mccourse.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

import static terrablender.api.SurfaceRuleManager.addSurfaceRules;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(MCCourseMod.MOD_ID, "gardens_of_arcadia"), 4));

        addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MCCourseMod.MOD_ID, ModMaterialRules.makeRules());

        addSurfaceRules(SurfaceRuleManager.RuleCategory.NETHER, MCCourseMod.MOD_ID, ModMaterialRules.makeRules());
    }
}
