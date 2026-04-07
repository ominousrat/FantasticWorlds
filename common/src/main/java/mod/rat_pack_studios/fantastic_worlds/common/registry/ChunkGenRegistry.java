package mod.rat_pack_studios.fantastic_worlds.common.registry;

import mod.rat_pack_studios.fantastic_worlds.common.CommonFW;
import mod.rat_pack_studios.fantastic_worlds.common.world.chunkgen.FWChunkGenEnd;
import mod.rat_pack_studios.fantastic_worlds.common.world.chunkgen.FWChunkGenNether;
import mod.rat_pack_studios.fantastic_worlds.common.world.chunkgen.FWChunkGenOverworld;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class ChunkGenRegistry
{
    public static void perform()
    {
        Registry.register(BuiltInRegistries.CHUNK_GENERATOR, ResourceLocation.fromNamespaceAndPath(CommonFW.MOD_ID, "overworld"), FWChunkGenOverworld.CODEC);
        Registry.register(BuiltInRegistries.CHUNK_GENERATOR, ResourceLocation.fromNamespaceAndPath(CommonFW.MOD_ID, "nether"), FWChunkGenNether.CODEC);
        Registry.register(BuiltInRegistries.CHUNK_GENERATOR, ResourceLocation.fromNamespaceAndPath(CommonFW.MOD_ID, "end"), FWChunkGenEnd.CODEC);
    }
}
