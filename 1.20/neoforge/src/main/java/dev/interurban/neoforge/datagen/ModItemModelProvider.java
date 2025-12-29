package dev.interurban.neoforge.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import dev.interurban.registers.ItemRegister;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ItemRegister.FLAG_BLUE);
        handheldItem(ItemRegister.FLAG_GREEN);
        handheldItem(ItemRegister.FLAG_RED);
        handheldItem(ItemRegister.FLAG_YELLOW);
    }

    private ItemModelBuilder handheldItem(RegistrySupplier<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RailroadBlocks.MOD_ID, "item/" + item.getId().getPath()));
    }
}
