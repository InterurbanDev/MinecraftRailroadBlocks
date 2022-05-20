package io.github.samthegamer39.railroadblocks;

import io.github.samthegamer39.railroadblocks.init.BlockInit;
import io.github.samthegamer39.railroadblocks.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RailroadBlocks.MOD_ID)

public class RailroadBlocks {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "railroadblocksaddon";
    public static final ItemGroup RAILROAD_BLOCKS_TAB = new RailroadBlocksGroup("railroadblockstab");

    public RailroadBlocks() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener((this::setup));

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    public static class RailroadBlocksGroup extends ItemGroup {

        public RailroadBlocksGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.WOODEN_CROSSBUCK.get().getDefaultInstance();
        }

    }
}
