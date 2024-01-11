package io.github.samthegamer39.railroadblocks.common;

import io.github.samthegamer39.railroadblocks.common.init.TabInit;
import net.minecraft.world.item.CreativeModeTab;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A list of global constants to be used by other files.
 */
public class Constants {
	// Global Constants
	public static final CreativeModeTab RAILROAD_BLOCKS_TAB = new TabInit.RailroadBlocksTab(0, "railroadblockstab");
	public static final Logger LOGGER = LoggerFactory.getLogger("railroadblockaddon");
	public static final String MOD_ID = "railroadblocksaddon";

}
