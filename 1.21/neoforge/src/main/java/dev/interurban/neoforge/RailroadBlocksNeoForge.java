package dev.interurban.neoforge;

import dev.interurban.RailroadBlocks;
import net.neoforged.fml.common.Mod;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
@Mod(RailroadBlocks.MOD_ID) // The value here should match an entry in the META-INF/neoforge.mods.toml file
public class RailroadBlocksNeoForge {

    /**
     * This function initializes the mod and registers all blocks and items to the game.
     */
    public RailroadBlocksNeoForge() {
        // Run our common setup.
        RailroadBlocks.init();
        RailroadBlocks.LOGGER.info("Railroad Blocks successfully loaded.");
    }

}
