package mod.rat_pack_studios.fantastic_worlds.common.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.BasaltColumnsFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BasaltColumnsFeature.class)
public class FWBasaltColumnsFeatureMixin
{
    @Inject(method = "isAirOrLavaOcean", at = @At("HEAD"), cancellable = true)
    private static void overwriteIsAirOrLavaOcean(LevelAccessor levelAccessor, int i, BlockPos blockPos, CallbackInfoReturnable<Boolean> cir) {
        BlockState blockState = levelAccessor.getBlockState(blockPos);
        cir.setReturnValue(blockState.is(Blocks.WATER) && blockPos.getY() <= i);
    }
}
