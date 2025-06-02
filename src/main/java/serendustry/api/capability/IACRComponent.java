package serendustry.api.capability;

import net.minecraftforge.fluids.FluidStack;

import java.util.List;

public interface IACRComponent {

    List<FluidStack> getCurrentAddedFluids();
}
