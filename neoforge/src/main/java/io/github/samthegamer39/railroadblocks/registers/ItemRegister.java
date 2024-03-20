package io.github.samthegamer39.railroadblocks.registers;

import io.github.samthegamer39.railroadblocks.common.init.ItemInit;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import static io.github.samthegamer39.railroadblocks.RailroadBlocks.MOD_ID;
import static io.github.samthegamer39.railroadblocks.common.init.ItemInit.*;

public class ItemRegister {

	// List of items to register.
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

	// Item List
	public static final DeferredItem<Item> FLAG_BLUE = CreativeTabRegister.addToTab(ITEMS.register("flag_blue", () -> ItemInit.FLAG_BLUE));
	public static final DeferredItem<Item> FLAG_GREEN = CreativeTabRegister.addToTab(ITEMS.register("flag_green", () -> ItemInit.FLAG_GREEN));
	public static final DeferredItem<Item> FLAG_RED = CreativeTabRegister.addToTab(ITEMS.register("flag_red", () -> ItemInit.FLAG_RED));
	public static final DeferredItem<Item> FLAG_YELLOW = CreativeTabRegister.addToTab(ITEMS.register("flag_yellow", () -> ItemInit.FLAG_YELLOW));
	public static final DeferredItem<Item> IRON_CROSSBUCK = CreativeTabRegister.addToTab(ITEMS.register("iron_crossbuck", () -> IRON_CROSSBUCK_ITEM));
	public static final DeferredItem<Item> IRON_POLE = CreativeTabRegister.addToTab(ITEMS.register("iron_pole", () -> IRON_POLE_ITEM));
	public static final DeferredItem<Item> RXR_ADVANCE = CreativeTabRegister.addToTab(ITEMS.register("rxr_advance_sign", () -> RXR_ADVANCE_SIGN_ITEM));
	public static final DeferredItem<Item> WHISTLE_SIGN = CreativeTabRegister.addToTab(ITEMS.register("whistle_sign", () -> WHISTLE_SIGN_ITEM));
	public static final DeferredItem<Item> WOODEN_CROSSBUCK = CreativeTabRegister.addToTab(ITEMS.register("wooden_crossbuck", () -> WOODEN_CROSSBUCK_ITEM));
	public static final DeferredItem<Item> WOODEN_POLE = CreativeTabRegister.addToTab(ITEMS.register("wooden_pole", () -> WOODEN_POLE_ITEM));
}
