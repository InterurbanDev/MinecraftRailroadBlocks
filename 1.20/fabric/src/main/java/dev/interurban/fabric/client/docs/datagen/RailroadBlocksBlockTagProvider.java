package dev.interurban.fabric.client.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

import static dev.interurban.datagen.BlockTagHandler.BLOCK_TAG_LIST;
import static dev.interurban.datagen.BlockTagHandler.getBlocksToTag;

public class RailroadBlocksBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public RailroadBlocksBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        for (TagKey<Block> tag : BLOCK_TAG_LIST) {
            for (Block block : getBlocksToTag(tag)) {
                getOrCreateTagBuilder(tag).add(block);
            }
        }
    }
}
