package dev.interurban.neoforge.datagen;

import dev.interurban.RailroadBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static dev.interurban.datagen.ModelHandler.handheldItemList;
import static dev.interurban.registers.BlockRegister.getBlockList;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (Block block : getBlockList()) {
            simpleBlockItem(block);
        }
        for (Item item : handheldItemList) {
            handheldItem(item);
        }
    }
}
