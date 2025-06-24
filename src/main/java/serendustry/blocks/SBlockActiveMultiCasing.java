package serendustry.blocks;

import gregtech.api.block.VariantActiveBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;

public class SBlockActiveMultiCasing extends VariantActiveBlock<SBlockActiveMultiCasing.SActiveMultiCasingType> {

    public SBlockActiveMultiCasing() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("s_active_multi_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(SActiveMultiCasingType.ADV_FUSION_COIL));
    }

    @NotNull
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.SOLID;
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum SActiveMultiCasingType implements IStringSerializable {

        ADV_FUSION_COIL("adv_fusion_coil"),
        EMPYREAN_CORE("empyrean_core");

        private final String name;

        SActiveMultiCasingType(String name) {
            this.name = name;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }
    }
}
