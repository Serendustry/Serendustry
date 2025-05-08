package serendustry.blocks;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.FluidStack;
import org.jetbrains.annotations.NotNull;

import static gregtech.api.unification.material.Materials.Air;
import static gregtech.api.unification.material.Materials.Mercury;
import static gregtech.api.unification.material.Materials.PCBCoolant;
import static gregtech.api.unification.material.Materials.Propane;
import static gregtech.api.unification.material.Materials.Water;
import static serendustry.item.material.SerendustryMaterials.MolybdeniteLubricant;

public class BlockACRComponent extends VariantBlock<BlockACRComponent.ACRComponentType> {

    public BlockACRComponent() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("acr_component");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(ACRComponentType.EMPTY));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum ACRComponentType implements IStringSerializable, IACRComponentBlockStats {

        EMPTY("empty", 1, 1, 0, new FluidStack(Water.getFluid(), 0)),
        HEATER_RESISTIVE("heater_resistive", 1.1, 1.05, 0.05, new FluidStack(Water.getFluid(), 0)),
        HEATER_GAS("heater_gas", 1.075, 1.025, 0, new FluidStack(Propane.getFluid(), 10)),
        COOLER_LIQUID("cooler_liquid", 0.9, 0.95, 0, new FluidStack(PCBCoolant.getFluid(), 10)),
        COOLER_THERMOELECTRIC("cooler_thermoelectric", 0.925, 0.975, 0.05, new FluidStack(Water.getFluid(), 0)),
        PUMP_DIFFUSION("pump_diffusion", 0.95, 0.9, 0, new FluidStack(Mercury.getFluid(), 10)),
        PUMP_PISTON("pump_piston", 0.975, 0.925, 0, new FluidStack(MolybdeniteLubricant.getFluid(), 10)),
        COMPRESSOR_RECIPROCATING("compressor_reciprocating", 1.05, 1.25, 0, new FluidStack(Air.getFluid(), 40)),
        COMPRESSOR_CENTRIFUGAL("compressor_centrifugal", 1.025, 1.2, 0, new FluidStack(MolybdeniteLubricant.getFluid(), 10));

        private final String name;
        private final double temperatureMod;
        private final double pressureMod;
        private final double EUtMod;
        private final FluidStack addedFluidInput;

        ACRComponentType(String name, double temperatureMod, double pressureMod, double EUtMod, FluidStack addedFluidInput) {
            this.name = name;
            this.temperatureMod = temperatureMod;
            this.pressureMod = pressureMod;
            this.EUtMod = EUtMod;
            this.addedFluidInput = addedFluidInput;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public double getTemperatureMod() {
            return this.temperatureMod;
        }

        @Override
        public double getPressureMod() {
            return this.pressureMod;
        }

        @Override
        public double getEUtMod() {
            return this.EUtMod;
        }

        @Override
        public FluidStack getAddedFluidInput() {
            return this.addedFluidInput;
        }
    }
}
