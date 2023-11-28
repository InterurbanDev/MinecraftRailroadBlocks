package io.github.samthegamer39.railroadblocks.registers;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import static io.github.samthegamer39.railroadblocks.common.init.ItemInit.*;
import static io.github.samthegamer39.railroadblocks.RailroadBlocks.MOD_ID;

public class ItemRegister {

	/**
	 * Registers items with Minecraft.
	 */
	public static void RegisterItems() {
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "flag_blue"), FLAG_BLUE);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "flag_green"), FLAG_GREEN);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "flag_red"), FLAG_RED);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "flag_yellow"), FLAG_YELLOW);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "iron_crossbuck"), IRON_CROSSBUCK_ITEM);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "iron_pole"), IRON_POLE_ITEM);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "rxr_advance_sign"), RXR_ADVANCE_SIGN_ITEM);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "whistle_sign"), WHISTLE_SIGN_ITEM);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "wooden_crossbuck"), WOODEN_CROSSBUCK_ITEM);
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "wooden_pole"), WOODEN_POLE_ITEM);
	}
}
