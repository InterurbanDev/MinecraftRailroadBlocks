package dev.interurban.forge.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static dev.interurban.datagen.ModelHandler.*;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistrySupplier<Item> item : handheldItemList) {
            handheldItem(item);
        }
        for (RegistrySupplier<? extends Block> block : horizontalBlockList) {
            simpleBlockItem(block);
        }
        for (RegistrySupplier<? extends Block> block : nonCubeBlockList) {
            simpleBlockItem(block);
        }
    }

    private ItemModelBuilder handheldItem(RegistrySupplier<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/handheld")).texture("layer0",
                ResourceLocation.tryBuild(RailroadBlocks.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistrySupplier<? extends Block> block) {
        return withExistingParent(block.getId().getPath(),
                ResourceLocation.tryBuild(RailroadBlocks.MOD_ID, "block/" + block.getId().getPath()));
    }
}
