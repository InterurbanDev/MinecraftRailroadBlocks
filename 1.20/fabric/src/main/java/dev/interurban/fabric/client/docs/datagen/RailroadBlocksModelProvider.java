package dev.interurban.fabric.client.docs.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import static dev.interurban.datagen.ModelHandler.*;

public class RailroadBlocksModelProvider extends FabricModelProvider {
    public RailroadBlocksModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        for (RegistrySupplier<? extends Block> block : horizontalBlockList) {
            blockStateModelGenerator.createNonTemplateHorizontalBlock(block.get());
        }
        for (RegistrySupplier<? extends Block> block : nonCubeBlockList) {
            blockStateModelGenerator.createNonTemplateModelBlock(block.get());
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        for (RegistrySupplier<Item> item : handheldItemList) {
            itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        }
    }

    @Override
    public @NotNull String getName() {
        return "RailroadBlocksModelProvider";
    }
}
