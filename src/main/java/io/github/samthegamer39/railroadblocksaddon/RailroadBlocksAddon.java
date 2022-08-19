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
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener((this::setup));

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

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
