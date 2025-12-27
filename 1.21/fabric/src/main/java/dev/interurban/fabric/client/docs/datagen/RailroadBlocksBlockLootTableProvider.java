package dev.interurban.fabric.client.docs.datagen;

import dev.interurban.registers.BlockRegister;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class RailroadBlocksBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected RailroadBlocksBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(BlockRegister.CROSSING_LIGHT_DUAL.get());
        dropSelf(BlockRegister.POLE_IRON.get());
        dropSelf(BlockRegister.POLE_WOODEN.get());
        dropSelf(BlockRegister.SIGN_CROSSBUCK_IRON.get());
        dropSelf(BlockRegister.SIGN_CROSSBUCK_WOODEN.get());
        dropSelf(BlockRegister.SIGN_RXR_ADVANCE.get());
        dropSelf(BlockRegister.SIGN_WHISTLE.get());
        dropSelf(BlockRegister.SIGN_WHISTLE_OLD.get());
    }
}