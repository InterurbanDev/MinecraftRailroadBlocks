package io.github.samthegamer39.quilt;

import io.github.samthegamer39.RailroadBlocks;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
public class RailroadBlocksQuilt implements ModInitializer {

	/**
	 * This function initializes the mod and registers all blocks and items to the game.
	 */
	@Override
	public void onInitialize() {
		// Run common setup.
		RailroadBlocks.init();
		RailroadBlocks.LOGGER.info("Railroad Blocks successfully loaded.");
	}
}
