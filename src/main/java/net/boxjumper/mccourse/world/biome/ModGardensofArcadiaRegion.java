package net.boxjumper.mccourse.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class ModGardensofArcadiaRegion extends Region {
    public ModGardensofArcadiaRegion(Identifier name, int weight) {
        super(name, RegionType.NETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube,
            RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, ModBiomes.GARDENS_CAVES);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.PLAINS, ModBiomes.A_TEST_BIOME_2);
        });
    }
}