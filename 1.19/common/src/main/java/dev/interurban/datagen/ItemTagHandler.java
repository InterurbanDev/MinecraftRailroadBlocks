package dev.interurban.datagen;

import dev.interurban.RailroadBlocks;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.List;

import static dev.interurban.registers.ItemRegister.*;

/**
 * Defines all item tags and their respective items
 */
public class ItemTagHandler {

    // New items tags
    public static final TagKey<Item> FLAGS = TagKey.create(Registry.ITEM_REGISTRY, ResourceLocation.tryBuild(RailroadBlocks.MOD_ID, "flags"));
    public static final TagKey<Item> POLES = TagKey.create(Registry.ITEM_REGISTRY, ResourceLocation.tryBuild(RailroadBlocks.MOD_ID, "poles"));
    public static final TagKey<Item> SIGNS = TagKey.create(Registry.ITEM_REGISTRY, ResourceLocation.tryBuild(RailroadBlocks.MOD_ID, "signs"));

    // List of all item tags created or used
    public static final List<TagKey<Item>> ITEM_TAG_LIST = List.of(FLAGS, POLES, SIGNS);

    /**
     * Returns a list of items to be tagged with the given tag
     * @param tag which items will be tagged with
     * @return list of items to tag with given tag
     */
    public static List<Item> getItemsToTag(TagKey<Item> tag) {
        // List of items to tag with flags
        if (tag == FLAGS) return List.of(
                FLAG_BLUE.get(),
                FLAG_GREEN.get(),
                FLAG_RED.get(),
                FLAG_YELLOW.get()
        );
        // List of items to tag with poles
        if (tag == POLES) return List.of(
                POLE_IRON.get(),
                POLE_WOODEN.get()
        );
        // List of items to tag with signs
        if (tag == SIGNS) return List.of(
                SIGN_CROSSBUCK_IRON.get(),
                SIGN_CROSSBUCK_WOODEN.get(),
                SIGN_RXR_ADVANCE.get(),
                SIGN_WHISTLE.get(),
                SIGN_WHISTLE_OLD.get()
        );
        return List.of();
    }
}
