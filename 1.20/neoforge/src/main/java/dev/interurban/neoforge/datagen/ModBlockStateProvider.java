package dev.interurban.neoforge.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import dev.interurban.registers.BlockRegister;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        standardHorizontal(BlockRegister.CROSSING_LIGHT_DUAL);
        standard(BlockRegister.POLE_IRON);
        standard(BlockRegister.POLE_WOODEN);
        standardHorizontal(BlockRegister.SIGN_CROSSBUCK_IRON);
        standardHorizontal(BlockRegister.SIGN_CROSSBUCK_WOODEN);
        standardHorizontal(BlockRegister.SIGN_RXR_ADVANCE);
        standardHorizontal(BlockRegister.SIGN_WHISTLE);
        standardHorizontal(BlockRegister.SIGN_WHISTLE_OLD);
    }


    private void standard(RegistrySupplier<? extends Block> block) {
        simpleBlockWithItem(block.get(), getModel(block));
    }

    private void standardHorizontal(RegistrySupplier<? extends Block> block) {
        horizontalBlock(block.get(), getModel(block));
        simpleBlockItem(block.get(), getModel(block));
    }

    private ModelFile getModel(RegistrySupplier<? extends Block> block) {
        ResourceLocation id = block.getId();

        return models().getExistingFile(modLoc("block/" + id.getPath()));
    }
}
