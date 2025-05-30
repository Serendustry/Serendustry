package serendustry.api.capability;

import java.util.List;

import net.minecraftforge.fluids.FluidStack;

public interface IACRComponent {

    List<FluidStack> getCurrentAddedFluids();
}
