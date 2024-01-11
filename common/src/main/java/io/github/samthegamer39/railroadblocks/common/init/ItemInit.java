package io.github.samthegamer39.railroadblocks.common.init;

import io.github.samthegamer39.railroadblocks.common.Constants;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

/**
 * A list of all mod items and stores them for registry with Minecraft.
 */
public class ItemInit {

    // Item List
    public static final Item FLAG_BLUE =
           new Item(new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item FLAG_GREEN =
            new Item(new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item FLAG_RED =
            new Item(new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item FLAG_YELLOW =
            new Item(new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item IRON_CROSSBUCK_ITEM =
            new BlockItem(BlockInit.IRON_CROSSBUCK_BLOCK, new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item IRON_POLE_ITEM =
            new BlockItem(BlockInit.IRON_POLE_BLOCK, new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item RXR_ADVANCE_SIGN_ITEM =
            new BlockItem(BlockInit.RXR_ADVANCE_SIGN_BLOCK, new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item WHISTLE_SIGN_ITEM =
            new BlockItem(BlockInit.WHISTLE_SIGN_BLOCK, new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item WOODEN_CROSSBUCK_ITEM =
            new BlockItem(BlockInit.WOODEN_CROSSBUCK_BLOCK, new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

    public static final Item WOODEN_POLE_ITEM =
            new BlockItem(BlockInit.WOODEN_POLE_BLOCK, new Item.Properties()
                    .tab(Constants.RAILROAD_BLOCKS_TAB));

}
