package dev.interurban.quilt;

import dev.interurban.RailroadBlocks;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
public class RailroadBlocksQuilt implements ModInitializer {

	/**
	 * This function initializes the mod and registers all blocks and items to the game.
	 */
	@Override
	public void onInitialize(ModContainer mod) {
		// Run our common setup.
		ExampleMod.init();
		RailroadBlocks.LOGGER.info("Railroad Blocks successfully loaded.");
	}
}
