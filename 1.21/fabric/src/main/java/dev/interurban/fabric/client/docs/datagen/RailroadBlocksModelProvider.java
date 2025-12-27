package dev.interurban.fabric.client.docs.datagen;

import dev.interurban.registers.BlockRegister;
import dev.interurban.registers.ItemRegister;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import org.jetbrains.annotations.NotNull;


public class RailroadBlocksModelProvider extends FabricModelProvider {
    public RailroadBlocksModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createNonTemplateHorizontalBlock(BlockRegister.CROSSING_LIGHT_DUAL.get());
        blockStateModelGenerator.createNonTemplateModelBlock(BlockRegister.POLE_IRON.get());
        blockStateModelGenerator.createNonTemplateModelBlock(BlockRegister.POLE_WOODEN.get());
        blockStateModelGenerator.createNonTemplateHorizontalBlock(BlockRegister.SIGN_CROSSBUCK_IRON.get());
        blockStateModelGenerator.createNonTemplateHorizontalBlock(BlockRegister.SIGN_CROSSBUCK_WOODEN.get());
        blockStateModelGenerator.createNonTemplateHorizontalBlock(BlockRegister.SIGN_RXR_ADVANCE.get());
        blockStateModelGenerator.createNonTemplateHorizontalBlock(BlockRegister.SIGN_WHISTLE.get());
        blockStateModelGenerator.createNonTemplateHorizontalBlock(BlockRegister.SIGN_WHISTLE_OLD.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ItemRegister.FLAG_BLUE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ItemRegister.FLAG_GREEN.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ItemRegister.FLAG_RED.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ItemRegister.FLAG_YELLOW.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    @Override
    public @NotNull String getName() {
        return "ExampleModModelProvider";
    }
}
