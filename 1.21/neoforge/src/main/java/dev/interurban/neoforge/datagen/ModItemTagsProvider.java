package dev.interurban.neoforge.datagen;

import dev.interurban.RailroadBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static dev.interurban.datagen.ItemTagHandler.ITEM_TAG_LIST;
import static dev.interurban.datagen.ItemTagHandler.getItemsToTag;

public class ModItemTagsProvider extends ItemTagsProvider {
    // Get parameters from GatherDataEvent.
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    // Add your tag entries here.
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        for (TagKey<Item> tag : ITEM_TAG_LIST) {
            for (Item item : getItemsToTag(tag)) {
                tag(tag).add(item);
            }
        }
    }
}
