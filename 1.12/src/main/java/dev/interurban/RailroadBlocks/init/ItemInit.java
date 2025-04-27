package dev.interurban.RailroadBlocks.init;

import java.util.ArrayList;
import java.util.List;

import dev.interurban.RailroadBlocks.objects.items.ItemBase;
import net.minecraft.item.Item;

/**
 * Defines all mod items and stores them for registry with Minecraft.
 */
public class ItemInit {
    // Creates a deferred register which each item will be stored into until it is time to register the items.
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item FLAG_BLUE = new ItemBase("flag_blue");
    public static final Item FLAG_GREEN = new ItemBase("flag_green");
    public static final Item FLAG_RED = new ItemBase("flag_red");
    public static final Item FLAG_YELLOW = new ItemBase("flag_yellow");
}
