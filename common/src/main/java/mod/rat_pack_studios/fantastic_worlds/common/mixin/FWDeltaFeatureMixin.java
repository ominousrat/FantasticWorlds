package mod.rat_pack_studios.fantastic_worlds.common.mixin;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.DeltaFeature;
import net.minecraft.world.level.levelgen.feature.configurations.DeltaFeatureConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DeltaFeature.class)
public class FWDeltaFeatureMixin
{
    private static final ImmutableList<Block> CANNOT_REPLACE = ImmutableList.of(Blocks.BEDROCK, Blocks.NETHER_BRICKS, Blocks.NETHER_BRICK_FENCE, Blocks.NETHER_BRICK_STAIRS, Blocks.NETHER_WART, Blocks.CHEST, Blocks.SPAWNER);;
    private static final Direction[] DIRECTIONS = Direction.values();;


    @Inject(method = "isClear", at = @At("HEAD"), cancellable = true)
    private static void overwriteIsClear(LevelAccessor levelAccessor, BlockPos blockPos, DeltaFeatureConfiguration deltaFeatureConfiguration, CallbackInfoReturnable<Boolean> cir)
    {
        BlockState blockState = levelAccessor.getBlockState(blockPos);
        if (blockState.is(deltaFeatureConfiguration.contents().getBlock())) {
            cir.setReturnValue(false);
        } else if (CANNOT_REPLACE.contains(blockState.getBlock())) {
            cir.setReturnValue(false);
        } else {
            Direction[] var4 = DIRECTIONS;
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Direction direction = var4[var6];
                cir.setReturnValue(false);
            }

            cir.setReturnValue(true);
        }
    }
}
