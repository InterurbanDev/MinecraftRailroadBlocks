package dev.interurban.fabric.client.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.level.block.Block;

import static dev.interurban.registers.BlockRegister.getBlockList;

public class RailroadBlocksBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected RailroadBlocksBlockLootTableProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {
        for (Block block: getBlockList()) {
            dropSelf(block);
        }
    }
}