package dev.interurban.registers;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import static dev.interurban.RailroadBlocks.MOD_ID;
import static dev.interurban.registers.CreativeTabRegister.RAILROAD_BLOCKS_TAB;

/**
 * A list of all mod items and stores them for registry with Minecraft.
 */
public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static RegistrySupplier<BlockItem> CROSSING_LIGHT_DUAL = ITEMS.register("crossing_light_dual", () ->
            new BlockItem(BlockRegister.CROSSING_LIGHT_DUAL.get(), new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<Item> FLAG_BLUE = ITEMS.register("flag_blue", () ->
            new Item(new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<Item> FLAG_GREEN = ITEMS.register("flag_green", () ->
            new Item(new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<Item> FLAG_RED = ITEMS.register("flag_red", () ->
            new Item(new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<Item> FLAG_YELLOW = ITEMS.register("flag_yellow", () ->
            new Item(new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<BlockItem> POLE_IRON = ITEMS.register("iron_pole", () ->
            new BlockItem(BlockRegister.POLE_IRON.get(), new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<BlockItem> POLE_WOODEN = ITEMS.register("wooden_pole", () ->
            new BlockItem(BlockRegister.POLE_WOODEN.get(), new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static final RegistrySupplier<BlockItem> SIGN_CROSSBUCK_IRON = ITEMS.register("iron_crossbuck", () ->
            new BlockItem(BlockRegister.SIGN_CROSSBUCK_IRON.get(), new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<BlockItem> SIGN_CROSSBUCK_WOODEN = ITEMS.register("wooden_crossbuck", () ->
            new BlockItem(BlockRegister.SIGN_CROSSBUCK_WOODEN.get(), new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<BlockItem> SIGN_RXR_ADVANCE = ITEMS.register("rxr_advance_sign", () ->
            new BlockItem(BlockRegister.SIGN_RXR_ADVANCE.get(), new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<BlockItem> SIGN_WHISTLE = ITEMS.register("whistle_sign", () ->
            new BlockItem(BlockRegister.SIGN_WHISTLE.get(), new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));

    public static RegistrySupplier<BlockItem> SIGN_WHISTLE_OLD = ITEMS.register("old_whistle_sign", () ->
            new BlockItem(BlockRegister.SIGN_WHISTLE_OLD.get(), new Item.Properties()
                    .arch$tab(RAILROAD_BLOCKS_TAB)
            ));
}
