package dev.interurban.neoforge.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import dev.interurban.registers.BlockRegister;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        complexHorizontal(BlockRegister.CROSSING_LIGHT_DUAL);
        complex(BlockRegister.POLE_IRON);
        complex(BlockRegister.POLE_WOODEN);
        complexHorizontal(BlockRegister.SIGN_CROSSBUCK_IRON);
        complexHorizontal(BlockRegister.SIGN_CROSSBUCK_WOODEN);
        complexHorizontal(BlockRegister.SIGN_RXR_ADVANCE);
        complexHorizontal(BlockRegister.SIGN_WHISTLE);
        complexHorizontal(BlockRegister.SIGN_WHISTLE_OLD);
    }

    private void complex(RegistrySupplier<? extends Block> block) {
        ResourceLocation id = block.getId();

        simpleBlock(
                block.get(),
                models().getExistingFile(modLoc("block/" + id.getPath()))
        );
    }

    private void complexHorizontal(RegistrySupplier<? extends Block> block) {
        ResourceLocation id = block.getId();

        horizontalBlock(
                block.get(),
                models().getExistingFile(modLoc("block/" + id.getPath()))
        );
    }
}
