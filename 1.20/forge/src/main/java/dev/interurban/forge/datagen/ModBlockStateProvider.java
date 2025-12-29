package dev.interurban.forge.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static dev.interurban.datagen.ModelHandler.horizontalBlockList;
import static dev.interurban.datagen.ModelHandler.nonCubeBlockList;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (RegistrySupplier<? extends Block> block : horizontalBlockList) {
            horizontalBlock(block.get(), getModel(block));
        }
        for (RegistrySupplier<? extends Block> block : nonCubeBlockList) {
            simpleBlock(block.get(), getModel(block));
        }
    }

    private ModelFile getModel(RegistrySupplier<? extends Block> block) {
        ResourceLocation id = block.getId();

        return models().getExistingFile(modLoc("block/" + id.getPath()));
    }
}
