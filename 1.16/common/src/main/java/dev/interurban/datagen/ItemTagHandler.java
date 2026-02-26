package dev.interurban.datagen;

import com.google.common.collect.ImmutableList;
import dev.interurban.RailroadBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.StaticTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagContainer;
import net.minecraft.world.item.Item;

import java.util.List;

import static dev.interurban.registers.ItemRegister.*;

/**
 * Defines all item tags and their respective items
 */
public class ItemTagHandler {

    // New items tags
    public static final Tag.Named<Item> FLAGS = StaticTags.create(new ResourceLocation(RailroadBlocks.MOD_ID, "flags"), TagContainer::getItems).bind("flags");
    public static final Tag.Named<Item> LIGHTS = StaticTags.create(new ResourceLocation(RailroadBlocks.MOD_ID, "lights"), TagContainer::getItems).bind("lights");
    public static final Tag.Named<Item> POLES = StaticTags.create(new ResourceLocation(RailroadBlocks.MOD_ID, "poles"), TagContainer::getItems).bind("poles");
    public static final Tag.Named<Item> SIGNS = StaticTags.create(new ResourceLocation(RailroadBlocks.MOD_ID, "signs"), TagContainer::getItems).bind("signs");

    // List of all item tags created or used
    public static final List<Tag.Named<Item>> ITEM_TAG_LIST = ImmutableList.of(FLAGS, LIGHTS, POLES, SIGNS);


    /**
     * Returns a list of items to be tagged with the given tag
     *
     * @param tag which items will be tagged with
     * @return list of items to tag with given tag
     */
    public static List<Item> getItemsToTag(Tag.Named<Item> tag) {
        // List of items to tag with flags
        if (tag == FLAGS) return ImmutableList.of(
                FLAG_BLUE.get(),
                FLAG_GREEN.get(),
                FLAG_RED.get(),
                FLAG_YELLOW.get()
        );
        // List of items to tag with poles
        if (tag == LIGHTS) return ImmutableList.of(
                CROSSING_LIGHT.get(),
                CROSSING_LIGHT_DUAL.get()
        );
        // List of items to tag with poles
        if (tag == POLES) return ImmutableList.of(
                POLE_IRON.get(),
                POLE_WOODEN.get()
        );
        // List of items to tag with signs
        if (tag == SIGNS) return ImmutableList.of(
                SIGN_CROSSBUCK_IRON.get(),
                SIGN_CROSSBUCK_WOODEN.get(),
                SIGN_RXR_ADVANCE.get(),
                SIGN_WHISTLE.get(),
                SIGN_WHISTLE_OLD.get(),
                SIGN_YARD_LIMIT.get()
        );
        return ImmutableList.of();
    }
}
