package mod.rat_pack_studios.fantastic_worlds.common;

import mod.rat_pack_studios.fantastic_worlds.common.preset.WorldPresetKeys;
import mod.rat_pack_studios.fantastic_worlds.common.registry.ChunkGenRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonFW
{
    public static final String MOD_ID = "fantastic_worlds";

    public static final Logger LOGGER = LoggerFactory.getLogger("Fantastic Worlds");

    public static void init()
    {
        WorldPresetKeys.perform();
        ChunkGenRegistry.perform();
    }
}