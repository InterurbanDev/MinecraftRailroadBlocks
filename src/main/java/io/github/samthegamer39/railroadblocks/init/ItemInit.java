package io.github.samthegamer39.railroadblocks.init;

import io.github.samthegamer39.railroadblocks.RailroadBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * A list of all mod items and stores them for registry with Minecraft.
 */
public class ItemInit {

    // List of items to register.
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RailroadBlocks.MOD_ID);

    // Item List
    public static final RegistryObject<Item> FLAG_BLUE = CreativeTabInit.addToTab(ITEMS.register("flag_blue",
            () -> new Item(new Item.Properties()

            )));
    public static final RegistryObject<Item> FLAG_GREEN = CreativeTabInit.addToTab(ITEMS.register("flag_green",
            () -> new Item(new Item.Properties()

            )));

    public static final RegistryObject<Item> FLAG_RED = CreativeTabInit.addToTab(ITEMS.register("flag_red",
            () -> new Item(new Item.Properties()

            )));

    public static final RegistryObject<Item> FLAG_YELLOW = CreativeTabInit.addToTab(ITEMS.register("flag_yellow",
            () -> new Item(new Item.Properties()

            )));

    public static final RegistryObject<BlockItem> IRON_CROSSBUCK = CreativeTabInit.addToTab(ITEMS.register("iron_crossbuck",
            () -> new BlockItem(BlockInit.IRON_CROSSBUCK.get(),
                    new Item.Properties()

            )));

    public static final RegistryObject<BlockItem> IRON_POLE = CreativeTabInit.addToTab(ITEMS.register("iron_pole",
            () -> new BlockItem(BlockInit.IRON_POLE.get(),
                    new Item.Properties()

            )));
    public static final RegistryObject<BlockItem> RXR_ADVANCE = CreativeTabInit.addToTab(ITEMS.register("rxr_advance_sign",
            () -> new BlockItem(BlockInit.RXR_ADVANCE.get(),
                    new Item.Properties()

            )));
    public static final RegistryObject<BlockItem> WHISTLE_SIGN = CreativeTabInit.addToTab(ITEMS.register("whistle_sign",
            () -> new BlockItem(BlockInit.WHISTLE_SIGN.get(),
                    new Item.Properties()

            )));
    public static final RegistryObject<BlockItem> WOODEN_CROSSBUCK = CreativeTabInit.addToTab(ITEMS.register("wooden_crossbuck",
            () -> new BlockItem(BlockInit.WOODEN_CROSSBUCK.get(),
                    new Item.Properties()

            )));
    public static final RegistryObject<BlockItem> WOODEN_POLE = CreativeTabInit.addToTab(ITEMS.register("wooden_pole",
            () -> new BlockItem(BlockInit.WOODEN_POLE.get(),
                    new Item.Properties()

            )));
}
