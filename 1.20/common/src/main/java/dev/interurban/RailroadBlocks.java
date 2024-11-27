package dev.interurban;

import dev.interurban.registers.BlockRegister;
import dev.interurban.registers.CreativeTabRegister;
import dev.interurban.registers.ItemRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RailroadBlocks {
	public static final String MOD_ID = "railroadblocksaddon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void init() {
		BlockRegister.BLOCKS.register();
		ItemRegister.ITEMS.register();
		CreativeTabRegister.TABS.register();
	}
}
