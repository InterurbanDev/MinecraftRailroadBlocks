package dev.interurban.forge.datagen;

import dev.interurban.RailroadBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import static dev.interurban.datagen.BlockTagHandler.BLOCK_TAG_LIST;
import static dev.interurban.datagen.BlockTagHandler.getBlocksToTag;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    // Get parameters from GatherDataEvent.


    // Add your tag entries here.
    @Override
    protected void addTags() {
        for (TagKey<Block> tag : BLOCK_TAG_LIST) {
            for (Block block : getBlocksToTag(tag)) {
                tag(tag).add(block);
            }
        }
    }
}
