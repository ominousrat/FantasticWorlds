package mod.rat_pack_studios.fantastic_worlds.common.world.chunkgen;

import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

public class FWAbstractChunkGenerator extends NoiseBasedChunkGenerator
{
    public FWAbstractChunkGenerator(BiomeSource biomeSource, Holder<NoiseGeneratorSettings> settings)
    {
        super(biomeSource, settings);
    }
}
