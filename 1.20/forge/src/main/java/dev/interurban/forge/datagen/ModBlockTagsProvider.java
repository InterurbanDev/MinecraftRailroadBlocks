package dev.interurban.forge.datagen;

import dev.interurban.RailroadBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static dev.interurban.datagen.BlockTagHandler.BLOCK_TAG_LIST;
import static dev.interurban.datagen.BlockTagHandler.getBlocksToTag;

public class ModBlockTagsProvider extends BlockTagsProvider {
    // Get parameters from GatherDataEvent.
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    // Add your tag entries here.
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        for (TagKey<Block> tag : BLOCK_TAG_LIST) {
            for (Block block : getBlocksToTag(tag)) {
                tag(tag).add(block);
            }
        }
    }
}
