package serendustry.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;

public class BlockACRComponent extends VariantBlock<BlockACRComponent.ACRComponentType> {

    public BlockACRComponent() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("acr_component");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(ACRComponentType.ACR_EMPTY));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum ACRComponentType implements IStringSerializable, IACRComponentBlockStats {

        ACR_EMPTY("acr_empty", 0, 0),
        ACR_HEATER("acr_heater", 50, 2),
        ACR_COOLER("acr_cooler", -50, -2),
        ACR_VACUUM_PUMP("acr_vacuum_pump", -10, -10),
        ACR_COMPRESSOR("acr_compressor", 10, 10);

        private final String name;
        private final int temperatureMod;
        private final int pressureMod;

        ACRComponentType(String name, int temperatureMod, int pressureMod) {
            this.name = name;
            this.temperatureMod = temperatureMod;
            this.pressureMod = pressureMod;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public int getTemperatureMod() {
            return this.temperatureMod;
        }

        @Override
        public int getPressureMod() {
            return this.pressureMod;
        }
    }
}
