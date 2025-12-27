package dev.interurban.fabric.client.docs.datagen;

import dev.interurban.registers.BlockRegister;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class RailroadBlocksBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public RailroadBlocksBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockRegister.CROSSING_LIGHT_DUAL.get())
                .add(BlockRegister.POLE_IRON.get())
                .add(BlockRegister.POLE_WOODEN.get())
                .add(BlockRegister.SIGN_CROSSBUCK_IRON.get())
                .add(BlockRegister.SIGN_CROSSBUCK_WOODEN.get())
                .add(BlockRegister.SIGN_RXR_ADVANCE.get())
                .add(BlockRegister.SIGN_WHISTLE.get())
                .add(BlockRegister.SIGN_WHISTLE_OLD.get());
    }
}
