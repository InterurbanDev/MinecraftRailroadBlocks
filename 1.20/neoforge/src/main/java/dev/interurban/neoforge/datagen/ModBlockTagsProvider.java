package dev.interurban.neoforge.datagen;

import dev.interurban.RailroadBlocks;
import dev.interurban.registers.BlockRegister;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    // Get parameters from GatherDataEvent.
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    // Add your tag entries here.
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        // Create a tag builder for our tag. This could also be e.g. a vanilla or NeoForge tag.
        tag(BlockTags.MINEABLE_WITH_AXE)
                // Add entries. This is a vararg parameter.
                // Non-intrinsic providers must provide ResourceKeys here instead of the actual objects.
                .add(BlockRegister.CROSSING_LIGHT_DUAL.get())
                .add(BlockRegister.SIGN_CROSSBUCK_IRON.get())
                .add(BlockRegister.SIGN_CROSSBUCK_WOODEN.get())
                .add(BlockRegister.SIGN_RXR_ADVANCE.get())
                .add(BlockRegister.SIGN_WHISTLE.get())
                .add(BlockRegister.SIGN_WHISTLE_OLD.get());
    }
}
