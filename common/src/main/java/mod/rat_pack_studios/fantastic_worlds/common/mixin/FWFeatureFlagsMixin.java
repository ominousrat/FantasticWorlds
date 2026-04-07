package mod.rat_pack_studios.fantastic_worlds.common.mixin;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FeatureFlags.class)
public class FWFeatureFlagsMixin
{
    @Inject(method = "isExperimental", at = @At("HEAD"), cancellable = true)
    private static void overwriteIsExperimental(FeatureFlagSet $$0, CallbackInfoReturnable<Boolean> cir)
    {
        cir.setReturnValue(false);
    }
}
