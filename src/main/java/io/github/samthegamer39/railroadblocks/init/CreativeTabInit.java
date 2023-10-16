package io.github.samthegamer39.railroadblocks.init;

import io.github.samthegamer39.railroadblocks.RailroadBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Creates a tab in the creative inventory and adds the mod's blocks to that tab.
 */
public class CreativeTabInit {
    // Tabs to register for creative inventory.
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RailroadBlocks.MOD_ID);
    // List of items to add to the creative mode tab.
    public static final List<Supplier<? extends ItemLike>> RAILROAD_BLOCKS_TAB_ITEMS = new ArrayList<>();
    // Creates a creative mode inventory tab.
    public static final RegistryObject<CreativeModeTab> RAILROAD_BLOCKS_TAB = TABS.register("railroad_blocks_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.railroad_blocks_tab"))
                    .icon(ItemInit.WOODEN_CROSSBUCK.get()::getDefaultInstance)
                    .displayItems((displayParameters, output) ->
                        RAILROAD_BLOCKS_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    /**
     * Adds items to the list of items for the creative mode tab.
     * @param itemLike
     * @return itemLike
     * @param <T>
     */
    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        RAILROAD_BLOCKS_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    //TODO: Consider adding blocks to vanilla tabs.
}
