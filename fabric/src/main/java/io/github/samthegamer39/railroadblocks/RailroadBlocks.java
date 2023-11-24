package io.github.samthegamer39.railroadblocks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.samthegamer39.railroadblocks.registers.BlockRegister.RegisterBlocks;
import static io.github.samthegamer39.railroadblocks.registers.ItemRegister.RegisterItems;
import static io.github.samthegamer39.railroadblocks.init.CreativeTabInit.RAILROAD_BLOCKS_TAB;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
public class RailroadBlocks implements ModInitializer {

	// Global Variables
	public static final Logger LOGGER = LoggerFactory.getLogger("railroadblockaddon"); // Debugging logger
	public static final String MOD_ID = "railroadblocksaddon";

	/**
	 * This function initializes the mod and registers all blocks and items to the game.
	 */
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		RegisterBlocks();
		RegisterItems();
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "railroad_blocks_tab"), RAILROAD_BLOCKS_TAB);
		LOGGER.info("Railroad Blocks successfully loaded.");
	}
}
