package mod.rat_pack_studios.fantastic_worlds.common.preset;

import mod.rat_pack_studios.fantastic_worlds.common.CommonFW;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.presets.WorldPreset;

public class WorldPresetKeys
{
    public static void perform()
    {
        final ResourceKey<WorldPreset> FANTASTIC_WORLDS = ResourceKey.create(Registries.WORLD_PRESET, ResourceLocation.fromNamespaceAndPath(CommonFW.MOD_ID, "fantastic_world.json"));
    }
}
