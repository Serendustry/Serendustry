package serendustry.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import serendustry.item.material.SerendustryMaterials;

public class SBlockMetalCasing extends VariantBlock<SBlockMetalCasing.SMetalCasingType> {

    public SBlockMetalCasing() {
        super(net.minecraft.block.material.Material.IRON);
        setTranslationKey("s_metal_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setHarvestLevel("wrench", 3);
        setSoundType(SoundType.METAL);
        setDefaultState(getState(SMetalCasingType.AMERICIUM));
    }

    @Override
    public boolean canCreatureSpawn(@NotNull IBlockState state, @NotNull IBlockAccess world, @NotNull BlockPos pos,
                                    @NotNull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum SMetalCasingType implements IStringSerializable {

        AMERICIUM("americium", Materials.Americium),
        CARBON("carbon", Materials.Carbon),
        ADAMANTIUM("adamantium", SerendustryMaterials.Adamantium),
        NEUTRONIUM("neutronium", Materials.Neutronium);

        private final String name;
        private final Material material;

        SMetalCasingType(String name, Material material) {
            this.name = name;
            this.material = material;
        }

        @NotNull
        @Override
        public String getName() {
            return this.name;
        }

        public Material getMaterial() {
            return this.material;
        }
    }
}
