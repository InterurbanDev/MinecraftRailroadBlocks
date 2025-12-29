package dev.interurban.fabric.client.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.level.block.Block;

import static dev.interurban.registers.BlockRegister.getBlockList;

public class RailroadBlocksBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected RailroadBlocksBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (Block block: getBlockList()) {
            dropSelf(block);
        }
    }
}