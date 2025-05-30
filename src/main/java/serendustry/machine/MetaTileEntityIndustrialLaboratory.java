package serendustry.machine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.google.common.collect.Table;

import gregtech.api.GTValues;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.TieredMetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;
import serendustry.SValues;
import serendustry.client.utils.STooltipHelper;
import serendustry.machine.LaboratoryProperty.LaboratoryEntry;
import serendustry.machine.structure.StructureDefinition;

public class MetaTileEntityIndustrialLaboratory extends RecipeMapMultiblockController {

    private Mode mode = Mode.NORMAL;

    private final LaboratoryResources laboratoryResources = new LaboratoryResources();

    // private final Map<BlockPos, MetaTileEntity> laboratoryResources = new HashMap<>();

    public MetaTileEntityIndustrialLaboratory(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, SerendustryRecipeMaps.LABORATORY_RECIPES);
        this.recipeMapWorkable = new IndustrialLaboratoryRecipeLogic(this);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityIndustrialLaboratory(metaTileEntityId);
    }

    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        FactoryBlockPattern pattern = FactoryBlockPattern.start();

        for (String[] aisle : StructureDefinition.INDUSTRIAL_LABORATORY) {
            pattern.aisle(aisle);
        }

        pattern.where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(14).or(autoAbilities()))
                .where('G', states(getGlassState()))
                .where('#', innerPredicate());

        return pattern.build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.INERT_PTFE_CASING; // todo
    }

    protected IBlockState getCasingState() {
        // todo
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.IV);
    }

    protected IBlockState getGlassState() {
        // todo
        return MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.LAMINATED_GLASS);
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.laboratoryResources.onInvalidateStructure();
    }

    @Nonnull
    protected TraceabilityPredicate innerPredicate() {
        return new TraceabilityPredicate(bws -> {
            if (bws.getBlockState().getBlock().isAir(bws.getBlockState(), bws.getWorld(), bws.getPos())) {
                return true;
            }
            TileEntity tileEntity = bws.getTileEntity();
            if (!(tileEntity instanceof IGregTechTileEntity)) {
                // remove an existing resource if this somehow got removed without deforming the multiblock
                laboratoryResources.removePos(bws.getPos());
                return false;
            }

            MetaTileEntity metaTileEntity = ((IGregTechTileEntity) tileEntity).getMetaTileEntity();
            if (!LaboratoryProperty.isMachineAllowed(metaTileEntity) ||
                    !(metaTileEntity instanceof TieredMetaTileEntity))
                return false;
            TieredMetaTileEntity tieredMte = (TieredMetaTileEntity) metaTileEntity;

            // insert into resources map if it doesn't exist, or if the machine at position somehow got changed
            laboratoryResources.putAtPos(bws.getPos(), tieredMte);
            return true;
        });
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);
        mode = Mode.NORMAL; // todo determine mode based on structure here
    }

    private enum Mode {
        NORMAL,
        PARALLEL_REACTOR, // todo more modes
    }

    private static class IndustrialLaboratoryRecipeLogic extends MultiblockRecipeLogic {

        public IndustrialLaboratoryRecipeLogic(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Nonnull
        @Override
        public MetaTileEntityIndustrialLaboratory getMetaTileEntity() {
            return (MetaTileEntityIndustrialLaboratory) super.getMetaTileEntity();
        }

        @Override
        public int getParallelLimit() {
            switch (getMetaTileEntity().mode) {
                case PARALLEL_REACTOR:
                    return 16; // todo details
                case NORMAL:
                default:
                    return 1;
            }
        }

        @Nullable
        @Override
        public RecipeMap<?> getRecipeMap() {
            switch (getMetaTileEntity().mode) {
                case PARALLEL_REACTOR:
                    return RecipeMaps.CHEMICAL_RECIPES;
                case NORMAL:
                default:
                    return SerendustryRecipeMaps.LABORATORY_RECIPES;
            }
        }

        @Override
        public boolean checkRecipe(@Nonnull Recipe recipe) {
            if (!super.checkRecipe(recipe)) {
                return false;
            }

            LaboratoryEntry entry = recipe.getProperty(LaboratoryProperty.getInstance(), null);
            if (entry != null) {
                return getMetaTileEntity().laboratoryResources.matchesEntry(entry);
            }
            return true;
        }
    }

    private static class LaboratoryResources {

        // placement data
        private final Map<BlockPos, TieredMetaTileEntity> internalMachines;

        private final Map<RecipeMap<?>, RecipeMapData> internalRecipeData;

        private LaboratoryResources() {
            this.internalMachines = new HashMap<>();
            this.internalRecipeData = new HashMap<>();
        }

        public void putAtPos(BlockPos pos, TieredMetaTileEntity machine) {
            if (!internalMachines.containsKey(pos) || internalMachines.get(pos) != machine) {
                RecipeMap<?> map = machine.getRecipeMap();
                int tier = machine.getTier();
                if (map == null || tier < 0) return;
                RecipeMapData mapData = internalRecipeData.computeIfAbsent(map, $ -> new RecipeMapData());
                mapData.insertAtTier(tier, 1);
                internalMachines.put(pos, machine);
            }
        }

        public void removePos(BlockPos pos) {
            TieredMetaTileEntity tieredMte = internalMachines.get(pos);
            if (tieredMte != null) {
                RecipeMap<?> map = tieredMte.getRecipeMap();
                int tier = tieredMte.getTier();
                if (map != null && tier >= 0) {
                    RecipeMapData mapData = internalRecipeData.get(map);
                    if (mapData != null) {
                        mapData.removeFromTier(tier, 1);
                    }
                }
                internalMachines.remove(pos);
            }
        }

        public void onInvalidateStructure() {
            internalMachines.clear();
            internalRecipeData.clear();
        }

        @SuppressWarnings("ConstantConditions")
        public boolean matchesEntry(LaboratoryEntry entry) {
            for (Table.Cell<RecipeMap<?>, Integer, Integer> cell : entry.getMachineTable().cellSet()) {
                RecipeMap<?> map = cell.getRowKey();
                int tier = cell.getColumnKey();
                int count = cell.getValue();
                RecipeMapData mapData = internalRecipeData.get(map);
                if (mapData.getNumMatchingTier(tier) < count) return false;
            }
            return true;
        }

        private static class RecipeMapData {

            // array of [tier] -> count
            private final int[] countArray;

            public RecipeMapData() {
                countArray = new int[GTValues.MAX];
            }

            public void insertAtTier(int tier, int count) {
                if (tier >= GTValues.MAX || tier < 0) return;
                for (int i = 0; i <= tier; i++) {
                    countArray[i] += count;
                }
            }

            public void removeFromTier(int tier, int count) {
                if (tier >= GTValues.MAX || tier < 0) return;
                for (int i = 0; i <= tier; i++) {
                    countArray[i] = Math.max(0, countArray[i] - count);
                }
            }

            public int getNumMatchingTier(int tier) {
                if (tier >= GTValues.MAX || tier < 0) return 0;
                return countArray[tier];
            }
        }
    }

    @Override
    public void addInformation(ItemStack stack, @org.jetbrains.annotations.Nullable World player, List<String> tooltip,
                               boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        STooltipHelper.addSerendustryInformation(tooltip, SValues.ENERGY_SUBSTATION, false,
                "serendustry.machine.author.serenibyss");
    }
}
