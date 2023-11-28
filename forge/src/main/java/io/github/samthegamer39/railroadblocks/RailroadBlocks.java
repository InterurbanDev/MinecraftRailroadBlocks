package io.github.samthegamer39.railroadblocks;

import com.mojang.logging.LogUtils;
import io.github.samthegamer39.railroadblocks.registers.BlockRegister;
import io.github.samthegamer39.railroadblocks.registers.CreativeTabRegister;
import io.github.samthegamer39.railroadblocks.registers.ItemRegister;
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

        BlockRegister.BLOCKS.register(bus);
        ItemRegister.ITEMS.register(bus);
        CreativeTabRegister.TABS.register(bus);
        LOGGER.atInfo().log("Registered Tabs");

        //MinecraftForge.EVENT_BUS.register(this);
    }
}
