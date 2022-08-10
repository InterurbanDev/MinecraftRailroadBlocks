package io.github.samthegamer39.railroadblocksaddon;

import io.github.samthegamer39.railroadblocksaddon.init.BlockInit;
import io.github.samthegamer39.railroadblocksaddon.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RailroadBlocksAddon.MOD_ID)

public class RailroadBlocksAddon {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "railroadblocksaddon";
    public static final CreativeModeTab RAILROAD_BLOCKS_TAB = new RailroadBlocksGroup("railroadblockstab");

    public RailroadBlocksAddon() {
        LOGGER.debug("Starting Registry");
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        LOGGER.debug("Bus Identified");
        bus.addListener((this::setup));
        LOGGER.debug("Listener Added");

        ItemInit.ITEMS.register(bus);
        LOGGER.debug("Items added to bus!");
        BlockInit.BLOCKS.register(bus);
        LOGGER.debug("Blocks added to bus!");

        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.debug("Registry Finished");
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.debug("Startup Running");
    }

    public static class RailroadBlocksGroup extends CreativeModeTab {

        public RailroadBlocksGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.WOODEN_CROSSBUCK.get().getDefaultInstance();
        }

    }
}
