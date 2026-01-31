/*
 * MIT License
 *
 * Copyright (c) 2026. Interurban Dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
     *
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
