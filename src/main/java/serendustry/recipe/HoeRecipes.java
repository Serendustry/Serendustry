package serendustry.recipe;

import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.UXV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.Europium;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Neptunium;
import static gregtech.api.unification.material.Materials.RutheniumTriniumAmericiumNeutronate;
import static gregtech.api.unification.material.Materials.UraniumRhodiumDinaquadide;
import static gregtech.api.unification.ore.OrePrefix.block;
import static gregtech.api.unification.ore.OrePrefix.bolt;
import static gregtech.api.unification.ore.OrePrefix.circuit;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.frameGt;
import static gregtech.api.unification.ore.OrePrefix.gear;
import static gregtech.api.unification.ore.OrePrefix.gearSmall;
import static gregtech.api.unification.ore.OrePrefix.gemExquisite;
import static gregtech.api.unification.ore.OrePrefix.plate;
import static gregtech.api.unification.ore.OrePrefix.plateDense;
import static gregtech.api.unification.ore.OrePrefix.screw;
import static gregtech.api.unification.ore.OrePrefix.stickLong;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;
import static gregtech.api.unification.ore.OrePrefix.wireGtHex;
import static gregtech.api.unification.ore.OrePrefix.wireGtOctal;
import static gregtech.api.unification.ore.OrePrefix.wireGtQuadruple;
import static gregtech.api.unification.ore.OrePrefix.wireGtSingle;
import static gregtech.common.items.MetaItems.ELECTRIC_MOTOR_UXV;
import static gregtech.common.items.MetaItems.ELECTRIC_PISTON_UXV;
import static gregtech.common.items.MetaItems.ELECTRIC_PUMP_UXV;
import static gregtech.common.items.MetaItems.EMITTER_UIV;
import static gregtech.common.items.MetaItems.EMITTER_UXV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UIV;
import static gregtech.common.items.MetaItems.FIELD_GENERATOR_UXV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_EV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_HV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_IV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_LV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_LuV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_MV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UEV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UHV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UIV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_UXV;
import static gregtech.common.items.MetaItems.ROBOT_ARM_ZPM;
import static gregtech.common.items.MetaItems.SENSOR_UXV;
import static serendustry.item.SerendustryMetaItems.FEMTOSCALE_SINGULARITY;
import static serendustry.item.SerendustryMetaItems.HOE_BINDING;
import static serendustry.item.SerendustryMetaItems.HOE_CORE;
import static serendustry.item.SerendustryMetaItems.HOE_CRYSTAL;
import static serendustry.item.SerendustryMetaItems.HOE_HANDLE;
import static serendustry.item.SerendustryMetaItems.HOE_HEAD;
import static serendustry.item.SerendustryMetaItems.HOE_STABILIZER;
import static serendustry.item.SerendustryMetaItems.STELLAR_ESSENCE_BEYOND;
import static serendustry.item.SerendustryToolItems.GENESIS_HOE;
import static serendustry.item.material.SerendustryMaterials.AbyssalAlloy;
import static serendustry.item.material.SerendustryMaterials.Adamantium;
import static serendustry.item.material.SerendustryMaterials.AwakenedDraconium;
import static serendustry.item.material.SerendustryMaterials.Azbantium;
import static serendustry.item.material.SerendustryMaterials.ChromaticGlass;
import static serendustry.item.material.SerendustryMaterials.DeepDarkSteel;
import static serendustry.item.material.SerendustryMaterials.Dilithium;
import static serendustry.item.material.SerendustryMaterials.Dragonblood;
import static serendustry.item.material.SerendustryMaterials.Envoite;
import static serendustry.item.material.SerendustryMaterials.ExoHalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.HalkoniteSteel;
import static serendustry.item.material.SerendustryMaterials.Hihiirokane;
import static serendustry.item.material.SerendustryMaterials.Hypogen;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.IrradiatedDiamond;
import static serendustry.item.material.SerendustryMaterials.NVCDiamond;
import static serendustry.item.material.SerendustryMaterials.NetherizedDiamond;
import static serendustry.item.material.SerendustryMaterials.Orundum;
import static serendustry.item.material.SerendustryMaterials.Periodicium;
import static serendustry.item.material.SerendustryMaterials.QCDM;
import static serendustry.item.material.SerendustryMaterials.Quantium40;
import static serendustry.item.material.SerendustryMaterials.RadoxPolymer;
import static serendustry.item.material.SerendustryMaterials.ReissnerNordstromium;
import static serendustry.item.material.SerendustryMaterials.Rhugnor;
import static serendustry.item.material.SerendustryMaterials.ScUevSane;
import static serendustry.item.material.SerendustryMaterials.ScUxvSane;
import static serendustry.item.material.SerendustryMaterials.SentientNanobots;
import static serendustry.item.material.SerendustryMaterials.Taranium;
import static serendustry.item.material.SerendustryMaterials.TengamAttuned;
import static serendustry.item.material.SerendustryMaterials.TiberiumAboreus;
import static serendustry.item.material.SerendustryMaterials.TiberiumCruentus;
import static serendustry.item.material.SerendustryMaterials.TiberiumRiparius;
import static serendustry.item.material.SerendustryMaterials.TiberiumVinifera;
import static serendustry.item.material.SerendustryMaterials.Trilithium;
import static serendustry.item.material.SerendustryMaterials.VibraniumAlloy;
import static serendustry.machine.SerendustryMetaTileEntities.EMPYREAN;
import static serendustry.machine.SerendustryRecipeMaps.EMPYREAN_RECIPES;

import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import serendustry.blocks.SBlockActiveMultiCasing;
import serendustry.blocks.SBlockGlassCasing;
import serendustry.blocks.SBlockMultiCasing;
import serendustry.blocks.SerendustryMetaBlocks;

public class HoeRecipes {

    public static void init() {
        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(STELLAR_ESSENCE_BEYOND)
                .inputs(SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING.getItemVariant(SBlockActiveMultiCasing.SActiveMultiCasingType.EMPYREAN_CORE, 64))
                .input(FIELD_GENERATOR_UXV, 32)
                .input(circuit, MarkerMaterials.Tier.OpV, 16)
                .input(plate, ExoHalkoniteSteel, 64)
                .input(plate, DeepDarkSteel, 64)
                .input(plate, Infinity, 64)
                .input(plate, FullerenePolymerMatrix, 64)
                .input(gear, ExoHalkoniteSteel, 64)
                .input(gear, DeepDarkSteel, 64)
                .input(gear, Infinity, 64)
                .input(gear, AbyssalAlloy, 64)
                .input(foil, QCDM, 64)
                .input(screw, ExoHalkoniteSteel, 64)
                .input(wireGtSingle, Hypogen, 64)
                .input(wireGtSingle, ScUxvSane, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 512),
                        Periodicium.getPlasma(144 * 256),
                        Flerovium.getFluid(144 * 65536),
                        Neptunium.getFluid(144 * 65536))
                .output(EMPYREAN)
                .stationResearch(b -> b
                        .researchStack(new ItemStack(Items.DIAMOND_HOE))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                // UXV AAL @ 4k UXV = 450s
                .duration(20 * 60 * 120 * 32).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(MetaBlocks.TRANSPARENT_CASING.getItemVariant(BlockGlassCasing.CasingType.FUSION_GLASS, 64))
                .input(FEMTOSCALE_SINGULARITY)
                .input(EMITTER_UIV, 4)
                .input(plate, ChromaticGlass, 4)
                .input(plate, FullerenePolymerMatrix, 4)
                .input(wireGtSingle, ScUxvSane, 4)
                .fluidInputs(SentientNanobots.getFluid(144 * 6),
                        Periodicium.getPlasma(144 * 6),
                        Flerovium.getFluid(144 * 512),
                        Neptunium.getFluid(144 * 512))
                // default 32 per recipe, 1204 in structure + 1456 in cores, so 84 recipes
                .outputs(SerendustryMetaBlocks.S_GLASS_CASING.getItemVariant(SBlockGlassCasing.SGlassCasingType.EMPYREAN_GLASS, ConfigHolder.recipes.casingsPerCraft * 16))
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(block, ChromaticGlass))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                // UXV AAL @ 4k UXV = 590s total
                .duration(20 * 60 * 60).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(SerendustryMetaBlocks.S_GLASS_CASING.getItemVariant(SBlockGlassCasing.SGlassCasingType.EMPYREAN_GLASS, 16))
                .input(FEMTOSCALE_SINGULARITY, 4)
                .input(circuit, MarkerMaterials.Tier.UXV)
                .input(FIELD_GENERATOR_UIV, 4)
                .input(plate, ExoHalkoniteSteel, 4)
                .input(plate, FullerenePolymerMatrix, 4)
                .input(wireGtSingle, ScUxvSane, 8)
                .fluidInputs(SentientNanobots.getFluid(144 * 12),
                        Periodicium.getPlasma(144 * 12),
                        Flerovium.getFluid(144 * 1024),
                        Neptunium.getFluid(144 * 1024))
                // 16 per recipe, 1379 in structure + 64 in controller, so 91 recipes
                .outputs(SerendustryMetaBlocks.S_ACTIVE_MULTI_CASING.getItemVariant(SBlockActiveMultiCasing.SActiveMultiCasingType.EMPYREAN_CORE, 16))
                .stationResearch(b -> b
                        .researchStack(SerendustryMetaBlocks.S_GLASS_CASING.getItemVariant(SBlockGlassCasing.SGlassCasingType.EMPYREAN_GLASS))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                // UXV AAL @ 4k UXV = 1279s total
                .duration(20 * 60 * 120).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Periodicium, 64)
                .input(ELECTRIC_PISTON_UXV, 64)
                .input(ELECTRIC_MOTOR_UXV, 64)
                .input(circuit, MarkerMaterials.Tier.OpV, 16)
                .input(plate, ExoHalkoniteSteel, 64)
                .input(plate, Periodicium, 64)
                .input(plate, Envoite, 64)
                .input(plate, DeepDarkSteel, 64)
                .input(plate, Infinity, 64)
                .input(plate, FullerenePolymerMatrix, 64)
                .input(plate, RadoxPolymer, 64)
                .input(plate, HalkoniteSteel, 64)
                .input(plate, ReissnerNordstromium, 64)
                .input(plate, QCDM, 64)
                .input(wireGtDouble, Hypogen, 64)
                .input(wireGtDouble, ScUxvSane, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 1024),
                        FullerenePolymerMatrix.getFluid(144 * 512),
                        Rhugnor.getPlasma(144 * 512),
                        Hypogen.getPlasma(144 * 128))
                .output(HOE_HEAD)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(plateDense, Periodicium))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                // UXV AAL @ 4k UXV = 1406s
                .duration(20 * 60 * 120 * 100).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Periodicium, 64)
                .input(FIELD_GENERATOR_UXV, 64)
                .input(circuit, MarkerMaterials.Tier.OpV, 16)
                .input(circuit, MarkerMaterials.Tier.UXV, 32)
                .input(gear, ExoHalkoniteSteel, 64)
                .input(gear, ReissnerNordstromium, 64)
                .input(gear, Infinity, 64)
                .input(gear, DeepDarkSteel, 64)
                .input(gearSmall, ExoHalkoniteSteel, 64)
                .input(gearSmall, ReissnerNordstromium, 64)
                .input(gearSmall, Infinity, 64)
                .input(gearSmall, DeepDarkSteel, 64)
                .input(plate, QCDM, 64)
                .input(plate, FullerenePolymerMatrix, 64)
                .input(bolt, ReissnerNordstromium, 64)
                .input(bolt, ExoHalkoniteSteel, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 1024),
                        FullerenePolymerMatrix.getFluid(144 * 512),
                        Periodicium.getPlasma(144 * 512),
                        Hypogen.getPlasma(144 * 128))
                .output(HOE_BINDING)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(gear, ReissnerNordstromium))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                .duration(20 * 60 * 120 * 100).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Periodicium, 64)
                .input(ELECTRIC_PUMP_UXV, 64)
                .input(SENSOR_UXV, 64)
                .input(circuit, MarkerMaterials.Tier.OpV, 16)
                .input(gemExquisite, Trilithium, 64)
                .input(gemExquisite, Dilithium, 64)
                .input(gemExquisite, Orundum, 64)
                .input(gemExquisite, Azbantium, 64)
                .input(gemExquisite, TiberiumAboreus, 64)
                .input(gemExquisite, TiberiumCruentus, 64)
                .input(gemExquisite, TiberiumRiparius, 64)
                .input(gemExquisite, TiberiumVinifera, 64)
                .input(gemExquisite, IrradiatedDiamond, 64)
                .input(gemExquisite, NVCDiamond, 64)
                .input(gemExquisite, NetherizedDiamond, 64)
                .input(gemExquisite, ChromaticGlass, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 1024),
                        FullerenePolymerMatrix.getFluid(144 * 512),
                        Infinity.getPlasma(144 * 512),
                        Hypogen.getPlasma(144 * 128))
                .output(HOE_CRYSTAL)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(gemExquisite, Trilithium))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                .duration(20 * 60 * 120 * 100).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Periodicium, 64)
                .input(ELECTRIC_MOTOR_UXV, 64)
                .input(circuit, MarkerMaterials.Tier.OpV, 16)
                .input(circuit, MarkerMaterials.Tier.UXV, 32)
                .input(plateDense, ExoHalkoniteSteel, 64)
                .input(plateDense, Periodicium, 64)
                .input(plateDense, Envoite, 64)
                .input(plateDense, FullerenePolymerMatrix, 64)
                .input(wireGtHex, UraniumRhodiumDinaquadide, 64)
                .input(wireGtHex, Europium, 64)
                .input(wireGtHex, Hihiirokane, 64)
                .input(wireGtHex, RutheniumTriniumAmericiumNeutronate, 64)
                .input(wireGtOctal, Quantium40, 64)
                .input(wireGtOctal, ScUevSane, 64)
                .input(wireGtQuadruple, Hypogen, 64)
                .input(wireGtQuadruple, ScUxvSane, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 1024),
                        FullerenePolymerMatrix.getFluid(144 * 512),
                        Dragonblood.getPlasma(144 * 512),
                        Hypogen.getPlasma(144 * 128))
                .output(HOE_CORE)
                .stationResearch(b -> b
                        .researchStack(OreDictUnifier.get(plateDense, ExoHalkoniteSteel))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                .duration(20 * 60 * 120 * 100).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Periodicium, 64)
                .input(circuit, MarkerMaterials.Tier.OpV, 16)
                .input(circuit, MarkerMaterials.Tier.UXV, 32)
                .input(circuit, MarkerMaterials.Tier.UIV, 64)
                .input(ROBOT_ARM_UXV, 64)
                .input(ROBOT_ARM_UIV, 64)
                .input(ROBOT_ARM_UEV, 64)
                .input(ROBOT_ARM_UHV, 64)
                .input(ROBOT_ARM_UV, 64)
                .input(ROBOT_ARM_ZPM, 64)
                .input(ROBOT_ARM_LuV, 64)
                .input(ROBOT_ARM_IV, 64)
                .input(ROBOT_ARM_EV, 64)
                .input(ROBOT_ARM_HV, 64)
                .input(ROBOT_ARM_MV, 64)
                .input(ROBOT_ARM_LV, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 1024),
                        FullerenePolymerMatrix.getFluid(144 * 512),
                        ChromaticGlass.getPlasma(144 * 512),
                        Hypogen.getPlasma(144 * 128))
                .output(HOE_STABILIZER)
                .stationResearch(b -> b
                        .researchStack(ROBOT_ARM_UXV.getStackForm())
                        .CWUt(144)
                        .EUt(VA[UIV]))
                .duration(20 * 60 * 120 * 100).EUt(VA[UIV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Periodicium, 64)
                .input(frameGt, DeepDarkSteel, 64)
                .input(EMITTER_UXV, 64)
                .input(circuit, MarkerMaterials.Tier.OpV, 16)
                .input(stickLong, ExoHalkoniteSteel, 64)
                .input(stickLong, ReissnerNordstromium, 64)
                .input(stickLong, Periodicium, 64)
                .input(stickLong, Envoite, 64)
                .input(stickLong, DeepDarkSteel, 64)
                .input(stickLong, Infinity, 64)
                .input(stickLong, Taranium, 64)
                .input(stickLong, AbyssalAlloy, 64)
                .input(stickLong, TengamAttuned, 64)
                .input(stickLong, Azbantium, 64)
                .input(stickLong, VibraniumAlloy, 64)
                .input(stickLong, Adamantium, 64)
                .fluidInputs(SentientNanobots.getFluid(144 * 1024),
                        FullerenePolymerMatrix.getFluid(144 * 512),
                        AwakenedDraconium.getPlasma(144 * 512),
                        Hypogen.getPlasma(144 * 128))
                .output(HOE_HANDLE)
                .stationResearch(b -> b
                        .researchStack(new ItemStack(Items.STICK))
                        .CWUt(144)
                        .EUt(VA[UIV]))
                .duration(20 * 60 * 120 * 100).EUt(VA[UIV]).buildAndRegister();

        EMPYREAN_RECIPES.recipeBuilder()
                .input(HOE_HEAD)
                .input(HOE_BINDING)
                .input(HOE_CRYSTAL)
                .input(HOE_CORE)
                .input(HOE_STABILIZER)
                .input(HOE_HANDLE)
                .output(GENESIS_HOE)
                // @ 16k UXV = 6553.6s
                .duration(2147483647).EUt(VA[UXV]).buildAndRegister();
    }
}
