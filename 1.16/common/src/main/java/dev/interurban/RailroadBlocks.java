package dev.interurban;

import dev.interurban.registers.BlockRegister;
import dev.interurban.registers.ItemRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RailroadBlocks {
	public static final String MOD_ID = "railroadblocksaddon";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static void init() {
		BlockRegister.BLOCKS.register();
		ItemRegister.ITEMS.register();
	}
}
