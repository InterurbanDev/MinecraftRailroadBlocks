package io.github.samthegamer39.railroadblocks.common.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * A list of all mod items and stores them for registry with Minecraft.
 */
public class ItemInit {

    public static final List<Item> RAILROAD_BLOCKS_ITEMS = new ArrayList<>();

    // Item List
    public static final Item FLAG_BLUE =
            addToList(new Item(new Item.Properties()));

    public static final Item FLAG_GREEN =
            addToList(new Item(new Item.Properties()));

    public static final Item FLAG_RED =
            addToList(new Item(new Item.Properties()));

    public static final Item FLAG_YELLOW =
            addToList(new Item(new Item.Properties()));

    public static final Item IRON_CROSSBUCK_ITEM =
            addToList(new BlockItem(BlockInit.IRON_CROSSBUCK_BLOCK, new Item.Properties()));

    public static final Item IRON_POLE_ITEM =
            addToList(new BlockItem(BlockInit.IRON_POLE_BLOCK, new Item.Properties()));

    public static final Item RXR_ADVANCE_SIGN_ITEM =
            addToList(new BlockItem(BlockInit.RXR_ADVANCE_SIGN_BLOCK, new Item.Properties()));

    public static final Item WHISTLE_SIGN_ITEM =
            addToList(new BlockItem(BlockInit.WHISTLE_SIGN_BLOCK, new Item.Properties()));

    public static final Item WOODEN_CROSSBUCK_ITEM =
            addToList(new BlockItem(BlockInit.WOODEN_CROSSBUCK_BLOCK, new Item.Properties()));

    public static final Item WOODEN_POLE_ITEM =
            addToList(new BlockItem(BlockInit.WOODEN_POLE_BLOCK, new Item.Properties()));

    /**
     * Adds mod items to a list to be sent to the creative mode tab.
     * @param item Item
     * @return Item
     */
    public static Item addToList(Item item) {
        RAILROAD_BLOCKS_ITEMS.add(item);
        return item;
    }
}
