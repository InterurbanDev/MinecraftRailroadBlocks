package dev.interurban.datagen;

import com.google.common.collect.ImmutableList;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;

import java.util.List;

/**
 * Defines all block tags and their respective blocks
 */
public class BlockTagHandler {

    // List of all block tags created or used
    public static final List<Tag.Named<Block>> BLOCK_TAG_LIST = ImmutableList.of();

    /**
     * Returns a list of blocks to be tagged with the given tag
     *
     * @param tag which blocks will be tagged with
     * @return list of blocks to tag with given tag
     */
    public static List<Block> getBlocksToTag(Tag.Named<Block> tag) {
        // List of blocks to tag with given tag
        return ImmutableList.of();
    }
}
