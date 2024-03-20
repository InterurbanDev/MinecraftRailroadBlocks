package io.github.samthegamer39.railroadblocks.registers;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import static io.github.samthegamer39.railroadblocks.RailroadBlocks.MOD_ID;
import static io.github.samthegamer39.railroadblocks.common.init.BlockInit.*;

public class BlockRegister {

	/**
	 * Registers blocks with Minecraft.
	 */
	public static void RegisterBlocks() {
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "iron_crossbuck"), IRON_CROSSBUCK_BLOCK);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "iron_pole"), IRON_POLE_BLOCK);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "rxr_advance_sign"), RXR_ADVANCE_SIGN_BLOCK);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "whistle_sign"), WHISTLE_SIGN_BLOCK);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "wooden_crossbuck"), WOODEN_CROSSBUCK_BLOCK);
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "wooden_pole"), WOODEN_POLE_BLOCK);
	}
}
