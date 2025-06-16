package serendustry.blocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.jetbrains.annotations.NotNull;

import gregtech.api.block.VariantBlock;
import gregtech.common.blocks.MetaBlocks;

public class SerendustryMetaBlocks {

    private SerendustryMetaBlocks() {}

    public static BlockMetalCasing METAL_CASING;
    public static BlockMultiCasing MULTI_CASING;
    public static BlockAALCoreCasing AAL_CORE_CASING;
    public static BlockEICHammerCasing EIC_HAMMER_CASING;
    public static BlockPCCoilHeating PC_COIL_HEATING;
    public static BlockPCCoilCooling PC_COIL_COOLING;
    public static BlockACRComponent ACR_COMPONENT;
    public static BlockWireCoil WIRE_COIL;

    public static List<VariantBlock<?>> ALL_CASINGS = new ArrayList<>();

    public static void init() {
        METAL_CASING = new BlockMetalCasing();
        METAL_CASING.setRegistryName("serendustry_metal_casing");

        MULTI_CASING = new BlockMultiCasing();
        MULTI_CASING.setRegistryName("serendustry_multi_casing");

        AAL_CORE_CASING = new BlockAALCoreCasing();
        AAL_CORE_CASING.setRegistryName("aal_core_casing");

        EIC_HAMMER_CASING = new BlockEICHammerCasing();
        EIC_HAMMER_CASING.setRegistryName("eic_hammer_casing");

        PC_COIL_HEATING = new BlockPCCoilHeating();
        PC_COIL_HEATING.setRegistryName("pc_coil_heating");

        PC_COIL_COOLING = new BlockPCCoilCooling();
        PC_COIL_COOLING.setRegistryName("pc_coil_cooling");

        ACR_COMPONENT = new BlockACRComponent();
        ACR_COMPONENT.setRegistryName("acr_component");

        WIRE_COIL = new BlockWireCoil();
        WIRE_COIL.setRegistryName("wire_coil");

        ALL_CASINGS.addAll(Arrays.asList(METAL_CASING, MULTI_CASING, AAL_CORE_CASING, EIC_HAMMER_CASING,
                PC_COIL_HEATING, PC_COIL_COOLING, ACR_COMPONENT, WIRE_COIL));
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        ALL_CASINGS.forEach(SerendustryMetaBlocks::registerItemModel);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(@NotNull Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            ResourceLocation location = block.getRegistryName();
            String stateProperties = MetaBlocks.statePropertiesToString(state.getProperties());

            Item item = Item.getItemFromBlock(block);
            int metaData = block.getMetaFromState(state);
            ModelResourceLocation modelResourceLocation = new ModelResourceLocation(location, stateProperties);

            // noinspection ConstantConditions
            ModelLoader.setCustomModelResourceLocation(item, metaData, modelResourceLocation);
        }
    }

    @SuppressWarnings({ "unused", "unchecked" })
    private static <T extends Comparable<T>> @NotNull String getPropertyName(@NotNull IProperty<T> property,
                                                                             Comparable<?> value) {
        return property.getName((T) value);
    }
}
