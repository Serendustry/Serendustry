package serendustry.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;

public class SBlockMultiCasing extends VariantBlock<SBlockMultiCasing.SMultiCasingType> {

    public SBlockMultiCasing() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("s_multi_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum SMultiCasingType implements IStringSerializable {

        SPACE_ELEVATOR("space_elevator"),
        ACR("acr"),
        ADV_FUSION("adv_fusion");

        private final String name;

        SMultiCasingType(String name) {
            this.name = name;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }
    }
}
