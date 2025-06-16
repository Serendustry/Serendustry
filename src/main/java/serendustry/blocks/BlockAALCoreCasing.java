package serendustry.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.GTValues;
import gregtech.api.block.VariantBlock;

public class BlockAALCoreCasing extends VariantBlock<BlockAALCoreCasing.AALCoreCasingType> {

    public BlockAALCoreCasing() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("aal_core_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(AALCoreCasingType.UV));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum AALCoreCasingType implements IStringSerializable, IAALCoreBlockStats {

        UV("uv"),
        UHV("uhv"),
        UEV("uev"),
        UIV("uiv"),
        UXV("uxv"),
        OpV("opv"),
        MAX("max");

        private final String name;

        AALCoreCasingType(String name) {
            this.name = name;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public int getCoreTier() {
            return this.ordinal() + GTValues.UV;
        }
    }
}
