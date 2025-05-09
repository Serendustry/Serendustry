package serendustry.blocks;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.jetbrains.annotations.NotNull;

public class BlockPCCoilHeating extends VariantBlock<BlockPCCoilHeating.PCCoilHeatingType> {

    public BlockPCCoilHeating() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("pc_coil_heating");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(PCCoilHeatingType.INFERNAL));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum PCCoilHeatingType implements IStringSerializable, IPCCoilHeatingBlockStats {

        INFERNAL("infernal"),
        SUPERNOVA("supernova");

        private final String name;

        PCCoilHeatingType(String name) {
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
