package dev.interurban.neoforge.datagen;

import dev.interurban.RailroadBlocks;
import dev.interurban.registers.BlockRegister;
import dev.interurban.registers.ItemRegister;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(BlockRegister.CROSSING_LIGHT_DUAL.get());
        handheldItem(ItemRegister.FLAG_BLUE.get());
        handheldItem(ItemRegister.FLAG_GREEN.get());
        handheldItem(ItemRegister.FLAG_RED.get());
        handheldItem(ItemRegister.FLAG_YELLOW.get());
        simpleBlockItem(BlockRegister.POLE_IRON.get());
        simpleBlockItem(BlockRegister.POLE_WOODEN.get());
        simpleBlockItem(BlockRegister.SIGN_CROSSBUCK_IRON.get());
        simpleBlockItem(BlockRegister.SIGN_CROSSBUCK_WOODEN.get());
        simpleBlockItem(BlockRegister.SIGN_RXR_ADVANCE.get());
        simpleBlockItem(BlockRegister.SIGN_WHISTLE.get());
        simpleBlockItem(BlockRegister.SIGN_WHISTLE_OLD.get());
    }
}
