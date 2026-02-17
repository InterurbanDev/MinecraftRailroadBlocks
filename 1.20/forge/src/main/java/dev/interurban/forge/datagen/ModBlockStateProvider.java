package dev.interurban.forge.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Function;

import static dev.interurban.datagen.ModelHandler.horizontalBlockList;
import static dev.interurban.datagen.ModelHandler.nonCubeBlockList;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (RegistrySupplier<? extends Block> block : horizontalBlockList) {
            betterHorizontalBlock(block.get(), getModel(block));
        }
        for (RegistrySupplier<? extends Block> block : nonCubeBlockList) {
            simpleBlock(block.get(), getModel(block));
        }
    }

    private ModelFile getModel(RegistrySupplier<? extends Block> block) {
        ResourceLocation id = block.getId();

        return models().getExistingFile(modLoc("block/" + id.getPath()));
    }

    private void betterHorizontalBlock(Block block, ModelFile model) {
        betterHorizontalBlock(block, $ -> model);
    }

    private void betterHorizontalBlock(Block block, Function<BlockState, ModelFile> modelFunc) {
        getVariantBuilder(block)
                .forAllStatesExcept(state -> ConfiguredModel.builder()
                                .modelFile(modelFunc.apply(state))
                                .rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                                .build(),
                        BlockStateProperties.WATERLOGGED
                );
    }
}
