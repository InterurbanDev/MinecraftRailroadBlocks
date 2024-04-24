package io.github.samthegamer39.railroadblocks;

import com.mojang.logging.LogUtils;
import io.github.samthegamer39.railroadblocks.registers.BlockRegister;
import io.github.samthegamer39.railroadblocks.registers.CreativeTabRegister;
import io.github.samthegamer39.railroadblocks.registers.ItemRegister;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
@Mod(RailroadBlocks.MOD_ID) // The value here should match an entry in the META-INF/neoforge.mods.toml file
public class RailroadBlocks {

    // Global Variables
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "railroadblocksaddon";

    /**
     * This function initializes the mod and registers all blocks and items to the game.
     */
    public RailroadBlocks(IEventBus modEventBus) {
        BlockRegister.BLOCKS.register(modEventBus);
        ItemRegister.ITEMS.register(modEventBus);
        CreativeTabRegister.TABS.register(modEventBus);
        LOGGER.atInfo().log("Registered Tabs");
    }
}
