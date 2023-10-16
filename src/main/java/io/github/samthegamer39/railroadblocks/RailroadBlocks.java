package io.github.samthegamer39.railroadblocks;

import io.github.samthegamer39.railroadblocks.init.BlockInit;
import io.github.samthegamer39.railroadblocks.init.CreativeTabInit;
import io.github.samthegamer39.railroadblocks.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * Main class for the RailroadBlocks mod. Initializes the mod and adds all associated blocks and items to Minecraft.
 */
@Mod(RailroadBlocks.MOD_ID)
public class RailroadBlocks {

    // Global Variables
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "railroadblocksaddon";

    /**
     * This function initializes the mod and registers all blocks and items to the game.
     */
    public RailroadBlocks() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);

        //MinecraftForge.EVENT_BUS.register(this);
    }
}