package serendustry.blocks;

import gregtech.api.GTValues;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;

public class BlockEICHammerCasing extends VariantBlock<BlockEICHammerCasing.EICHammerCasingType> {

    public BlockEICHammerCasing() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("eic_hammer_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(EICHammerCasingType.NEUTRONIUM));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum EICHammerCasingType implements IStringSerializable, IEICHammerBlockStats {

        NEUTRONIUM("neutronium"),
        HALKONITE("halkonite"),
        EHK("ehk");

        private final String name;

        EICHammerCasingType(String name) {
            this.name = name;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public int getHammerTier() {
            return this.ordinal();
        }
    }
}
