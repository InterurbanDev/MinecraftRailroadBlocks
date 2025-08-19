package dev.interurban.fabric;

import net.fabricmc.api.ModInitializer;

import dev.interurban.RailroadBlocks;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
public class RailroadBlocksFabric implements ModInitializer {
	/**
	 * This function initializes the mod and registers all blocks and items to the game.
	 */
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Run our common setup.
		RailroadBlocks.init();
		RailroadBlocks.LOGGER.info("Railroad Blocks successfully loaded.");
	}
}
