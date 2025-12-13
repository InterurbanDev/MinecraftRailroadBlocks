package dev.interurban.RailroadBlocks;

import dev.interurban.RailroadBlocks.proxy.CommonProxy;
import dev.interurban.RailroadBlocks.tabs.RailroadBlocksTab;
import dev.interurban.RailroadBlocks.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = RailroadBlocks.MODID, name = RailroadBlocks.NAME, version = RailroadBlocks.VERSION)
public class RailroadBlocks
{
    public static final String MODID = "railroadblocksaddon";
    public static final String NAME = "Railroad Blocks";
    public static final String VERSION = "0.6.5";
    public static final String CLIENT_PROXY_CLASS = "dev.interurban.RailroadBlocks.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "dev.interurban.RailroadBlocks.proxy.CommonProxy";

    private static Logger logger;

    @Mod.Instance
    public static RailroadBlocks instance;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs RAILROAD_BLOCKS_TAB = new RailroadBlocksTab("railroadblockstab");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries();
    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event) {

    }
}
