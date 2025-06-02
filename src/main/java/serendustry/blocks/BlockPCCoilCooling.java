package serendustry.blocks;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.jetbrains.annotations.NotNull;

public class BlockPCCoilCooling extends VariantBlock<BlockPCCoilCooling.PCCoilCoolingType> {

    public BlockPCCoilCooling() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("pc_coil_cooling");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(PCCoilCoolingType.GLACIAL));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum PCCoilCoolingType implements IStringSerializable, IPCCoilCoolingBlockStats {

        GLACIAL("glacial"),
        BLACK_HOLE("black_hole");

        private final String name;

        PCCoilCoolingType(String name) {
            this.name = name;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public int getTier() {
            return this.ordinal();
        }
    }
}
