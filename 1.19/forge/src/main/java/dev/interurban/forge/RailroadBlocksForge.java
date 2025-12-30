package dev.interurban.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.interurban.RailroadBlocks;
import dev.interurban.forge.datagen.DataGenerators;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
@Mod(RailroadBlocks.MOD_ID)
public final class RailroadBlocksForge {

    /**
     * This function initializes the mod and registers all blocks and items to the game.
     */
    @SuppressWarnings("removal")
    public RailroadBlocksForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		// Submit our event bus to let Architectury API register our content on the right time.
		EventBuses.registerModEventBus(RailroadBlocks.MOD_ID, modEventBus);

		// Run our common setup.
		RailroadBlocks.init();
        DataGenerators.register(modEventBus);
        RailroadBlocks.LOGGER.info("Railroad Blocks successfully loaded.");
    }
}
