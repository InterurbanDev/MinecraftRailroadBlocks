package dev.interurban.fabric.client.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static dev.interurban.datagen.BlockTagHandler.BLOCK_TAG_LIST;
import static dev.interurban.datagen.BlockTagHandler.getBlocksToTag;

public class RailroadBlocksBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public RailroadBlocksBlockTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        for (TagKey<Block> tag : BLOCK_TAG_LIST) {
            for (Block block : getBlocksToTag(tag)) {
                getOrCreateTagBuilder(tag).add(block);
            }
        }
    }
}
