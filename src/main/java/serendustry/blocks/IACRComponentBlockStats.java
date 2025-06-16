package serendustry.blocks;

import net.minecraftforge.fluids.FluidStack;

import org.jetbrains.annotations.NotNull;

public interface IACRComponentBlockStats {

    @NotNull
    String getName();

    double getTemperatureMod();

    double getPressureMod();

    double getEUtMod();

    FluidStack getAddedFluidInput();
}
