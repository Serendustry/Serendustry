package serendustry.recipe;

import static gregtech.api.GTValues.UIV;
import static gregtech.api.GTValues.VA;
import static gregtech.api.recipes.RecipeMaps.ARC_FURNACE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CENTRIFUGE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_BATH_RECIPES;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ELECTROLYZER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.FLUID_HEATER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LARGE_CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.AceticAcid;
import static gregtech.api.unification.material.Materials.Acetone;
import static gregtech.api.unification.material.Materials.Aluminium;
import static gregtech.api.unification.material.Materials.Ammonia;
import static gregtech.api.unification.material.Materials.AntimonyTrioxide;
import static gregtech.api.unification.material.Materials.Benzene;
import static gregtech.api.unification.material.Materials.Bromine;
import static gregtech.api.unification.material.Materials.Caprolactam;
import static gregtech.api.unification.material.Materials.Carbon;
import static gregtech.api.unification.material.Materials.CarbonDioxide;
import static gregtech.api.unification.material.Materials.CarbonMonoxide;
import static gregtech.api.unification.material.Materials.Chlorine;
import static gregtech.api.unification.material.Materials.Chlorobenzene;
import static gregtech.api.unification.material.Materials.Chloromethane;
import static gregtech.api.unification.material.Materials.CobaltOxide;
import static gregtech.api.unification.material.Materials.CupricOxide;
import static gregtech.api.unification.material.Materials.DilutedSulfuricAcid;
import static gregtech.api.unification.material.Materials.Dimethylamine;
import static gregtech.api.unification.material.Materials.DistilledWater;
import static gregtech.api.unification.material.Materials.Ethylene;
import static gregtech.api.unification.material.Materials.Flerovium;
import static gregtech.api.unification.material.Materials.Graphite;
import static gregtech.api.unification.material.Materials.Helium;
import static gregtech.api.unification.material.Materials.HydrochloricAcid;
import static gregtech.api.unification.material.Materials.HydrofluoricAcid;
import static gregtech.api.unification.material.Materials.Hydrogen;
import static gregtech.api.unification.material.Materials.HydrogenSulfide;
import static gregtech.api.unification.material.Materials.Lithium;
import static gregtech.api.unification.material.Materials.LithiumChloride;
import static gregtech.api.unification.material.Materials.Magnesium;
import static gregtech.api.unification.material.Materials.Mercury;
import static gregtech.api.unification.material.Materials.Methane;
import static gregtech.api.unification.material.Materials.Methanol;
import static gregtech.api.unification.material.Materials.Molybdenum;
import static gregtech.api.unification.material.Materials.NitricAcid;
import static gregtech.api.unification.material.Materials.Nitrogen;
import static gregtech.api.unification.material.Materials.NitrogenDioxide;
import static gregtech.api.unification.material.Materials.Oxygen;
import static gregtech.api.unification.material.Materials.Palladium;
import static gregtech.api.unification.material.Materials.Phenol;
import static gregtech.api.unification.material.Materials.Quicklime;
import static gregtech.api.unification.material.Materials.Silver;
import static gregtech.api.unification.material.Materials.Sodium;
import static gregtech.api.unification.material.Materials.SodiumHydroxide;
import static gregtech.api.unification.material.Materials.Steam;
import static gregtech.api.unification.material.Materials.SulfuricAcid;
import static gregtech.api.unification.material.Materials.Toluene;
import static gregtech.api.unification.material.Materials.Water;
import static gregtech.api.unification.material.Materials.Xenon;
import static gregtech.api.unification.material.Materials.Zinc;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.api.unification.ore.OrePrefix.ingot;
import static serendustry.item.material.SerendustryMaterials.Acetylene;
import static serendustry.item.material.SerendustryMaterials.Acrylonitrile;
import static serendustry.item.material.SerendustryMaterials.AluminiumHydride;
import static serendustry.item.material.SerendustryMaterials.AluminiumTrichloride;
import static serendustry.item.material.SerendustryMaterials.AmmoniumBisulfate;
import static serendustry.item.material.SerendustryMaterials.AmmoniumPersulfate;
import static serendustry.item.material.SerendustryMaterials.AmmoniumSulfate;
import static serendustry.item.material.SerendustryMaterials.Aniline;
import static serendustry.item.material.SerendustryMaterials.BenzoicAcid;
import static serendustry.item.material.SerendustryMaterials.Benzotrichloride;
import static serendustry.item.material.SerendustryMaterials.BenzoylChloride;
import static serendustry.item.material.SerendustryMaterials.BenzoylPeroxide;
import static serendustry.item.material.SerendustryMaterials.Boranediethylaniline;
import static serendustry.item.material.SerendustryMaterials.Boranetetrahydrofuran;
import static serendustry.item.material.SerendustryMaterials.BoronTrifluoride;
import static serendustry.item.material.SerendustryMaterials.BoronTrioxide;
import static serendustry.item.material.SerendustryMaterials.Bromobenzene;
import static serendustry.item.material.SerendustryMaterials.Bromoethane;
import static serendustry.item.material.SerendustryMaterials.Butanediol;
import static serendustry.item.material.SerendustryMaterials.Butene1;
import static serendustry.item.material.SerendustryMaterials.CalciumCarbide;
import static serendustry.item.material.SerendustryMaterials.CalciumCyanimide;
import static serendustry.item.material.SerendustryMaterials.CalciumHydrosulfide;
import static serendustry.item.material.SerendustryMaterials.CarbonTetrachloride;
import static serendustry.item.material.SerendustryMaterials.Cyclopentadiene;
import static serendustry.item.material.SerendustryMaterials.DBU;
import static serendustry.item.material.SerendustryMaterials.DIPC;
import static serendustry.item.material.SerendustryMaterials.DMAP;
import static serendustry.item.material.SerendustryMaterials.DMOPST;
import static serendustry.item.material.SerendustryMaterials.DPTS;
import static serendustry.item.material.SerendustryMaterials.Diborane;
import static serendustry.item.material.SerendustryMaterials.Dichloromethane;
import static serendustry.item.material.SerendustryMaterials.Diethylaniline;
import static serendustry.item.material.SerendustryMaterials.Diisopropylamine;
import static serendustry.item.material.SerendustryMaterials.Diisopropylthiourea;
import static serendustry.item.material.SerendustryMaterials.DimethylSulfide;
import static serendustry.item.material.SerendustryMaterials.DirtyPCBMSSludge;
import static serendustry.item.material.SerendustryMaterials.DissolvedFullereneSolution;
import static serendustry.item.material.SerendustryMaterials.FleroviumFullereneMatrix;
import static serendustry.item.material.SerendustryMaterials.FluoroboricAcid;
import static serendustry.item.material.SerendustryMaterials.Formaldehyde;
import static serendustry.item.material.SerendustryMaterials.Fullerene;
import static serendustry.item.material.SerendustryMaterials.FullerenePolymerMatrix;
import static serendustry.item.material.SerendustryMaterials.FullereneSoot;
import static serendustry.item.material.SerendustryMaterials.HNIW;
import static serendustry.item.material.SerendustryMaterials.HeatedFullereneSoot;
import static serendustry.item.material.SerendustryMaterials.HydrogenBromide;
import static serendustry.item.material.SerendustryMaterials.HydrogenPeroxide;
import static serendustry.item.material.SerendustryMaterials.Infinity;
import static serendustry.item.material.SerendustryMaterials.LithiumAluminiumHydride;
import static serendustry.item.material.SerendustryMaterials.LithiumDiisopropylamide;
import static serendustry.item.material.SerendustryMaterials.LithiumHydride;
import static serendustry.item.material.SerendustryMaterials.LithiumTetrafluoroborate;
import static serendustry.item.material.SerendustryMaterials.MercuricChloride;
import static serendustry.item.material.SerendustryMaterials.Methyl4Vinylbenzoate;
import static serendustry.item.material.SerendustryMaterials.Methyl5bromo5phenylvalerate;
import static serendustry.item.material.SerendustryMaterials.Methyl5phenylpentanoate;
import static serendustry.item.material.SerendustryMaterials.MixedFullerene;
import static serendustry.item.material.SerendustryMaterials.NBromosuccinimide;
import static serendustry.item.material.SerendustryMaterials.PCBA;
import static serendustry.item.material.SerendustryMaterials.PCBM;
import static serendustry.item.material.SerendustryMaterials.PCBMS;
import static serendustry.item.material.SerendustryMaterials.PPCBMS;
import static serendustry.item.material.SerendustryMaterials.PhenylvalericAcid;
import static serendustry.item.material.SerendustryMaterials.Pinacol;
import static serendustry.item.material.SerendustryMaterials.Pinacolborane;
import static serendustry.item.material.SerendustryMaterials.Piperidine;
import static serendustry.item.material.SerendustryMaterials.Propylene;
import static serendustry.item.material.SerendustryMaterials.PurifiedPCBMSSludge;
import static serendustry.item.material.SerendustryMaterials.Pyridine;
import static serendustry.item.material.SerendustryMaterials.PyridylpyridiniumChloride;
import static serendustry.item.material.SerendustryMaterials.Pyrrole;
import static serendustry.item.material.SerendustryMaterials.SilverBromide;
import static serendustry.item.material.SerendustryMaterials.SilverNitrate;
import static serendustry.item.material.SerendustryMaterials.SilverOxide;
import static serendustry.item.material.SerendustryMaterials.SilverTetrafluoroborate;
import static serendustry.item.material.SerendustryMaterials.SodiumNitrate;
import static serendustry.item.material.SerendustryMaterials.SuccinicAcid;
import static serendustry.item.material.SerendustryMaterials.Succinimide;
import static serendustry.item.material.SerendustryMaterials.Tetrahydrofuran;
import static serendustry.item.material.SerendustryMaterials.Thiourea;
import static serendustry.item.material.SerendustryMaterials.ValericAcid;
import static serendustry.item.material.SerendustryMaterials.Vibranium;
import static serendustry.item.material.SerendustryMaterials.VibraniumTetroxide;
import static serendustry.item.material.SerendustryMaterials.Vibranocene;
import static serendustry.item.material.SerendustryMaterials.Vinylphenylmethanol;
import static serendustry.item.material.SerendustryMaterials.ZincBromate;
import static serendustry.item.material.SerendustryMaterials.oDichlorobenzene;
import static serendustry.item.material.SerendustryMaterials.pToluenesulfonicAcid;
import static serendustry.item.material.SerendustryMaterials.paraXylene;
import static serendustry.machine.SerendustryRecipeMaps.ACR_RECIPES;
import static serendustry.machine.SerendustryRecipeMaps.ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES;

public class FPMRecipes {

    public static void init() {
        ARC_FURNACE_RECIPES.recipeBuilder()
                .input(dust, Graphite)
                .fluidInputs(Helium.getFluid(100))
                .fluidOutputs(Graphite.getPlasma(144))
                .duration(20).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() // heat exchanger
                .fluidInputs(DistilledWater.getFluid(1000),
                        Graphite.getPlasma(144))
                .fluidOutputs(FullereneSoot.getFluid(1000),
                        Steam.getFluid(10000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(FullereneSoot.getFluid(1000))
                .fluidOutputs(HeatedFullereneSoot.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(HeatedFullereneSoot.getFluid(1000),
                        Benzene.getFluid(1000))
                .fluidOutputs(DissolvedFullereneSolution.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(DissolvedFullereneSolution.getFluid(1000))
                .fluidOutputs(Benzene.getFluid(500))
                .output(dust, MixedFullerene)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, MixedFullerene)
                .fluidInputs(paraXylene.getFluid(1000))
                .output(dust, Fullerene)
                .output(dust, Carbon)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Silver)
                .fluidInputs(NitricAcid.getFluid(2000))
                .output(dust, SilverNitrate)
                .fluidOutputs(Water.getFluid(1000),
                        NitrogenDioxide.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SilverNitrate, 2)
                .input(dust, SodiumHydroxide, 2)
                .output(dust, SilverOxide)
                .output(dust, SodiumNitrate, 2)
                .fluidOutputs(Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SilverOxide, 3)
                .fluidInputs(Benzene.getFluid(1000),
                        BoronTrifluoride.getFluid(2000),
                        HydrofluoricAcid.getFluid(2000))
                .output(dust, SilverTetrafluoroborate, 12)
                .fluidOutputs(Water.getFluid(3000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Butene1.getFluid(1000),
                        CarbonMonoxide.getFluid(1000),
                        Oxygen.getFluid(1000))
                .fluidOutputs(ValericAcid.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(ValericAcid.getFluid(1000),
                        Phenol.getFluid(1000))
                .output(dust, PhenylvalericAcid, 27)
                .fluidOutputs(Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, PhenylvalericAcid, 27)
                .fluidInputs(Methanol.getFluid(1000))
                .fluidOutputs(Methyl5phenylpentanoate.getFluid(1000),
                        Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Toluene.getFluid(1000),
                        Chlorine.getFluid(3000))
                .fluidOutputs(Benzotrichloride.getFluid(1000),
                        Hydrogen.getFluid(3000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Benzotrichloride.getFluid(1000),
                        Water.getFluid(1000))
                .fluidOutputs(BenzoylChloride.getFluid(1000),
                        HydrochloricAcid.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Ammonia.getFluid(2000),
                        SulfuricAcid.getFluid(1000))
                .output(dust, AmmoniumSulfate, 15)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .input(dust, AmmoniumSulfate, 15)
                .fluidInputs(Water.getFluid(4000))
                .output(dust, AmmoniumPersulfate, 20)
                .fluidOutputs(Hydrogen.getFluid(8000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, AmmoniumPersulfate, 20)
                .fluidInputs(Water.getFluid(2000))
                .output(dust, AmmoniumBisulfate, 22)
                .fluidOutputs(HydrogenPeroxide.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(BenzoylChloride.getFluid(2000),
                        HydrogenPeroxide.getFluid(1000))
                .output(dust, BenzoylPeroxide, 28)
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Butanediol.getFluid(1000),
                        Oxygen.getFluid(4000))
                .output(dust, SuccinicAcid, 14)
                .fluidOutputs(Water.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SuccinicAcid, 14)
                .fluidInputs(Ammonia.getFluid(1000))
                .output(dust, Succinimide, 12)
                .fluidOutputs(Water.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SodiumHydroxide, 3)
                .input(dust, Succinimide, 12)
                .fluidInputs(Bromine.getFluid(1000))
                .output(dust, NBromosuccinimide, 12)
                .output(dust, Sodium)
                .fluidOutputs(Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Methane.getFluid(1000),
                        Chlorine.getFluid(8000))
                .fluidOutputs(CarbonTetrachloride.getFluid(1000),
                        HydrochloricAcid.getFluid(4000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, BenzoylPeroxide, 28)
                .input(dust, NBromosuccinimide, 12)
                .fluidInputs(Methyl5phenylpentanoate.getFluid(1000),
                        CarbonTetrachloride.getFluid(1000))
                .output(dust, Succinimide, 12)
                .fluidOutputs(Methyl5bromo5phenylvalerate.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Chloromethane.getFluid(1000),
                        Chlorine.getFluid(2000),
                        Water.getFluid(1000))
                .fluidOutputs(Dichloromethane.getFluid(1000),
                        HydrochloricAcid.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() // todo fix stoich
                .input(dust, Aluminium) // alumina
                .fluidInputs(Methanol.getFluid(2000),
                        HydrogenSulfide.getFluid(1000))
                .fluidOutputs(DimethylSulfide.getFluid(1000),
                        Water.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, SilverTetrafluoroborate, 12)
                .fluidInputs(Methyl5bromo5phenylvalerate.getFluid(1000),
                        DimethylSulfide.getFluid(1000))
                .output(dust, DMOPST, 43)
                .output(dust, SilverBromide, 2)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Molybdenum)
                .fluidInputs(Propylene.getFluid(2000),
                        Ammonia.getFluid(2000),
                        Oxygen.getFluid(6000))
                .fluidOutputs(Acrylonitrile.getFluid(2000),
                        Water.getFluid(6000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Caprolactam, 19)
                .fluidInputs(Acrylonitrile.getFluid(1000),
                        Hydrogen.getFluid(4000))
                .fluidOutputs(DBU.getFluid(1000),
                        Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Chlorobenzene.getFluid(1000),
                        Chlorine.getFluid(2000),
                        Water.getFluid(1000))
                .fluidOutputs(oDichlorobenzene.getFluid(1000),
                        HydrochloricAcid.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        // Ex Hills: 21 Res Heater + 1 Piston Pump
        ACR_RECIPES.recipeBuilder()
                .temperature(2000, 2500)
                .pressure(70, 270)
                .input(dust, Fullerene)
                .input(dust, DMOPST, 43)
                .fluidInputs(DBU.getFluid(1000))
                .output(dust, PCBM, 88)
                .fluidOutputs(DimethylSulfide.getFluid(1000),
                        FluoroboricAcid.getFluid(1000),
                        Piperidine.getFluid(1000),
                        Pyrrole.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, PCBM, 88)
                .fluidInputs(Chlorobenzene.getFluid(1000),
                        HydrochloricAcid.getFluid(1000),
                        AceticAcid.getFluid(1000))
                .output(dust, PCBA, 85)
                .fluidOutputs(Methanol.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Pyridine.getFluid(2000),
                        Chlorine.getFluid(2000),
                        Water.getFluid(1000))
                .output(dust, PyridylpyridiniumChloride, 22)
                .fluidOutputs(HydrochloricAcid.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, PyridylpyridiniumChloride, 22)
                .fluidInputs(Dimethylamine.getFluid(1000),
                        Water.getFluid(1000))
                .output(dust, DMAP, 19)
                .fluidOutputs(Pyridine.getFluid(1000),
                        HydrochloricAcid.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Toluene.getFluid(1000),
                        SulfuricAcid.getFluid(1000))
                .output(dust, pToluenesulfonicAcid, 19)
                .fluidOutputs(Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, DMAP, 19)
                .input(dust, pToluenesulfonicAcid, 19)
                .fluidInputs(Oxygen.getFluid(4000))
                .output(dust, DPTS, 30)
                .fluidOutputs(Water.getFluid(4000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, Quicklime, 2)
                .input(dust, Carbon, 3)
                .output(ingot, CalciumCarbide, 3)
                .fluidOutputs(CarbonDioxide.getFluid(1000))
                .blastFurnaceTemp(10800)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, CalciumCarbide, 3)
                .fluidInputs(Nitrogen.getFluid(2000))
                .output(dust, CalciumCyanimide, 4)
                .output(dust, Carbon)
                .blastFurnaceTemp(10800)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, CalciumCyanimide, 4)
                .fluidInputs(HydrogenSulfide.getFluid(3000))
                .output(dust, CalciumHydrosulfide, 5)
                .output(dust, Thiourea, 8)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, CupricOxide)
                .input(dust, Thiourea, 8)
                .fluidInputs(Acetone.getFluid(2000),
                        Ammonia.getFluid(1000),
                        Hydrogen.getFluid(4000))
                .fluidOutputs(Diisopropylamine.getFluid(1000),
                        Water.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Thiourea, 8)
                .fluidInputs(Diisopropylamine.getFluid(1000),
                        Water.getFluid(1000))
                .output(dust, Diisopropylthiourea, 26)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        // Ex Hills: 24 Centri Compr + 2 TE Cooler + 2 Lq Cooler
        ACR_RECIPES.recipeBuilder()
                .temperature(370, 390)
                .pressure(7000, 9000)
                .input(dust, AntimonyTrioxide)
                .input(dust, Diisopropylthiourea, 52)
                .fluidInputs(paraXylene.getFluid(1000),
                        Oxygen.getFluid(1000))
                .output(dust, DIPC, 23)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, CobaltOxide)
                .fluidInputs(Toluene.getFluid(1000),
                        Oxygen.getFluid(3000))
                .output(dust, BenzoicAcid, 15)
                .fluidOutputs(Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, Aluminium)
                .fluidInputs(HydrochloricAcid.getFluid(3000))
                .output(dust, AluminiumTrichloride, 4)
                .fluidOutputs(Hydrogen.getFluid(3000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, AluminiumTrichloride)
                .fluidInputs(Bromine.getFluid(1000),
                        Benzene.getFluid(1000))
                .fluidOutputs(Bromobenzene.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() // todo fix stoich
                .input(dust, Palladium)
                .input(dust, BenzoicAcid, 15)
                .fluidInputs(Bromobenzene.getFluid(1000),
                        Methanol.getFluid(1000))
                .fluidOutputs(Methyl4Vinylbenzoate.getFluid(1000),
                        Water.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(HydrogenBromide.getFluid(1000),
                        Ethylene.getFluid(1000))
                .fluidOutputs(Bromoethane.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Aniline.getFluid(1000),
                        Bromoethane.getFluid(2000))
                .fluidOutputs(Diethylaniline.getFluid(1000),
                        HydrogenBromide.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Lithium)
                .fluidInputs(Hydrogen.getFluid(1000))
                .output(dust, LithiumHydride, 2)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, LithiumHydride, 8)
                .input(dust, AluminiumTrichloride, 4)
                .output(dust, LithiumAluminiumHydride, 6)
                .output(dust, LithiumChloride, 3)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, LithiumAluminiumHydride, 6)
                .fluidInputs(BoronTrifluoride.getFluid(8000))
                .output(dust, LithiumTetrafluoroborate, 6)
                .output(dust, AluminiumHydride, 6)
                .fluidOutputs(Diborane.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Acetylene.getFluid(1000),
                        Formaldehyde.getFluid(2000),
                        Hydrogen.getFluid(4000))
                .fluidOutputs(Butanediol.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Butanediol.getFluid(1000),
                        SulfuricAcid.getFluid(1000))
                .fluidOutputs(Tetrahydrofuran.getFluid(1000),
                        Water.getFluid(1000),
                        DilutedSulfuricAcid.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Tetrahydrofuran.getFluid(2000),
                        Diborane.getFluid(1000))
                .fluidOutputs(Boranetetrahydrofuran.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() // todo fix stoich
                .fluidInputs(Diethylaniline.getFluid(1000),
                        Boranetetrahydrofuran.getFluid(1000))
                .fluidOutputs(Boranediethylaniline.getFluid(1000),
                        CarbonDioxide.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(Mercury.getFluid(1000),
                        Chlorine.getFluid(2000))
                .fluidOutputs(MercuricChloride.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Magnesium)
                .fluidInputs(Acetone.getFluid(2000),
                        MercuricChloride.getFluid(1000))
                .fluidOutputs(Pinacol.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() // todo fix stoich
                .fluidInputs(Boranediethylaniline.getFluid(1000),
                        Pinacol.getFluid(1000))
                .fluidOutputs(Pinacolborane.getFluid(1000),
                        Methane.getFluid(4000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() // todo fix stoich
                .input(dust, LithiumDiisopropylamide)
                .fluidInputs(Methyl4Vinylbenzoate.getFluid(2000),
                        Pinacolborane.getFluid(5000),
                        Tetrahydrofuran.getFluid(1000))
                .output(dust, BoronTrioxide, 10)
                .fluidOutputs(Vinylphenylmethanol.getFluid(2000),
                        Methane.getFluid(16000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        // Ex Hills: 9 Recip Compr + 15 Res Heater
        ACR_RECIPES.recipeBuilder()
                .temperature(2000, 2500)
                .pressure(3000, 4300)
                .input(dust, PCBA, 85)
                .input(dust, DIPC, 23)
                .input(dust, DPTS, 30)
                .fluidInputs(Vinylphenylmethanol.getFluid(1000),
                        Dichloromethane.getFluid(1000))
                .fluidOutputs(DirtyPCBMSSludge.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(DirtyPCBMSSludge.getFluid(3000),
                        Toluene.getFluid(1000))
                .fluidOutputs(PurifiedPCBMSSludge.getFluid(2000),
                        Dichloromethane.getFluid(1000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(PurifiedPCBMSSludge.getFluid(1000),
                        Methanol.getFluid(1000))
                .output(dust, PCBMS, 103)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .input(dust, PCBMS)
                .fluidInputs(Xenon.getFluid(1000))
                .output(dust, PPCBMS)
                .blastFurnaceTemp(10800)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Vibranium)
                .fluidInputs(Oxygen.getFluid(4000))
                .output(dust, VibraniumTetroxide, 5)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, VibraniumTetroxide, 10)
                .input(dust, Zinc)
                .fluidInputs(HydrogenBromide.getFluid(2000),
                        Cyclopentadiene.getFluid(1000))
                .output(dust, Vibranocene, 42)
                .output(dust, ZincBromate, 9)
                .fluidOutputs(Water.getFluid(2000),
                        Hydrogen.getFluid(2000))
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        // Ex Hills: 19 Lq Cooler + 3 TE Cooler
        ACR_RECIPES.recipeBuilder()
                .temperature(20, 30)
                .pressure(35, 90)
                .input(dust, Flerovium)
                .input(dust, Vibranocene, 42)
                .input(dust, Fullerene)
                .fluidInputs(paraXylene.getFluid(1000),
                        Vibranium.getFluid(144))
                .output(dust, FleroviumFullereneMatrix, 3)
                .duration(20 * 2).EUt(VA[UIV]).buildAndRegister();

        ELECTRIC_IMPLOSION_COMPRESSOR_RECIPES.recipeBuilder()
                .input(dust, FleroviumFullereneMatrix, 2)
                .input(dust, PPCBMS, 103)
                .input(dust, HNIW, 4)
                .fluidInputs(Infinity.getPlasma(144))
                .fluidOutputs(FullerenePolymerMatrix.getFluid(144 * 2))
                .duration(20 * 12).EUt(VA[UIV]).buildAndRegister();

        // is 500k coal tar per FPM too much?
    }
}
