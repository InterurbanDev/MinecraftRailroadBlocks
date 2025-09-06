package dev.interurban.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.interurban.RailroadBlocks;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
@Mod(RailroadBlocks.MOD_ID)
public final class RailroadBlocksForge {

    /**
     * This function initializes the mod and registers all blocks and items to the game.
     */
    public RailroadBlocksForge() {
		// Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(RailroadBlocks.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

		// Run our common setup.
		RailroadBlocks.init();
        RailroadBlocks.LOGGER.info("Railroad Blocks successfully loaded.");
    }
}
