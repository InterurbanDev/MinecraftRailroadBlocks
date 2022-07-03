package io.github.samthegamer39.railroadblocks.init;

import io.github.samthegamer39.railroadblocks.RailroadBlocks;

import net.minecraft.client.renderer.debug.RaidDebugRenderer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RailroadBlocks.MOD_ID);

    public static final RegistryObject<Item> FLAG_BLUE = ITEMS.register("flag_blue",
            () -> new Item(new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<Item> FLAG_GREEN = ITEMS.register("flag_green",
            () -> new Item(new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<Item> FLAG_RED = ITEMS.register("flag_red",
            () -> new Item(new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<Item> FLAG_YELLOW = ITEMS.register("flag_yellow",
            () -> new Item(new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<BlockItem> IRON_CROSSBUCK = ITEMS.register("iron_crossbuck",
            () -> new BlockItem(BlockInit.IRON_CROSSBUCK.get(), new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<BlockItem> IRON_POLE = ITEMS.register("iron_pole",
            () -> new BlockItem(BlockInit.IRON_POLE.get(), new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<BlockItem> RXR_ADVANCE = ITEMS.register("rxr_advance_sign",
            () -> new BlockItem(BlockInit.RXR_ADVANCE.get(), new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<BlockItem> WHISTLE_SIGN = ITEMS.register("whistle_sign",
            () -> new BlockItem(BlockInit.WHISTLE_SIGN.get(), new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<BlockItem> WOODEN_CROSSBUCK = ITEMS.register("wooden_crossbuck",
            () -> new BlockItem(BlockInit.WOODEN_CROSSBUCK.get(), new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

    public static final RegistryObject<BlockItem> WOODEN_POLE = ITEMS.register("wooden_pole",
            () -> new BlockItem(BlockInit.WOODEN_POLE.get(), new Item.Properties()
                    .tab(RailroadBlocks.RAILROAD_BLOCKS_TAB)));

}
