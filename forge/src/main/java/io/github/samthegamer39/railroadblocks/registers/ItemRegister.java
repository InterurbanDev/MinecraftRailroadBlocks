package io.github.samthegamer39.railroadblocks.registers;

import io.github.samthegamer39.railroadblocks.common.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.github.samthegamer39.railroadblocks.common.init.ItemInit.*;
import static io.github.samthegamer39.railroadblocks.RailroadBlocks.MOD_ID;

public class ItemRegister {

	// List of items to register.
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

	// Item List
	public static final RegistryObject<Item> FLAG_BLUE = ITEMS.register("flag_blue", () -> ItemInit.FLAG_BLUE);
	public static final RegistryObject<Item> FLAG_GREEN = ITEMS.register("flag_green", () -> ItemInit.FLAG_GREEN);
	public static final RegistryObject<Item> FLAG_RED = ITEMS.register("flag_red", () -> ItemInit.FLAG_RED);
	public static final RegistryObject<Item> FLAG_YELLOW = ITEMS.register("flag_yellow", () -> ItemInit.FLAG_YELLOW);
	public static final RegistryObject<Item> IRON_CROSSBUCK = ITEMS.register("iron_crossbuck", () -> IRON_CROSSBUCK_ITEM);
	public static final RegistryObject<Item> IRON_POLE = ITEMS.register("iron_pole", () -> IRON_POLE_ITEM);
	public static final RegistryObject<Item> RXR_ADVANCE = ITEMS.register("rxr_advance_sign", () -> RXR_ADVANCE_SIGN_ITEM);
	public static final RegistryObject<Item> WHISTLE_SIGN = ITEMS.register("whistle_sign", () -> WHISTLE_SIGN_ITEM);
	public static final RegistryObject<Item> WOODEN_CROSSBUCK = ITEMS.register("wooden_crossbuck", () -> WOODEN_CROSSBUCK_ITEM);
	public static final RegistryObject<Item> WOODEN_POLE = ITEMS.register("wooden_pole", () -> WOODEN_POLE_ITEM);
}
