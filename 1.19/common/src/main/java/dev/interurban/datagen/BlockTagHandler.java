package dev.interurban.datagen;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.List;

import static dev.interurban.registers.BlockRegister.*;

/**
 * Defines all block tags and their respective blocks
 */
public class BlockTagHandler {

    // List of all block tags created or used
    public static final List<TagKey<Block>> BLOCK_TAG_LIST = List.of(BlockTags.MINEABLE_WITH_AXE);

    /**
     * Returns a list of blocks to be tagged with the given tag
     * @param tag which blocks will be tagged with
     * @return list of blocks to tag with given tag
     */
    public static List<Block> getBlocksToTag(TagKey<Block> tag) {
        // List of blocks to tag with given tag
        if (tag == BlockTags.MINEABLE_WITH_AXE) return List.of(
                CROSSING_LIGHT_DUAL.get(),
                POLE_IRON.get(),
                POLE_WOODEN.get(),
                SIGN_CROSSBUCK_IRON.get(),
                SIGN_CROSSBUCK_WOODEN.get(),
                SIGN_RXR_ADVANCE.get(),
                SIGN_WHISTLE.get(),
                SIGN_WHISTLE_OLD.get()
        );
        return List.of();
    }
}
