package dev.interurban.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.registers.BlockRegister;
import dev.interurban.registers.ItemRegister;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.List;

/**
 * Defines lists of all item and block types for model generation
 */
public class ModelHandler {
    // List of all handheld items
    public static final List<Item>  handheldItemList = List.of(
            ItemRegister.FLAG_BLUE.get(),
            ItemRegister.FLAG_GREEN.get(),
            ItemRegister.FLAG_RED.get(),
            ItemRegister.FLAG_YELLOW.get()
    );

    // List of all horizontally rotatable blocks
    public static final List<RegistrySupplier<? extends Block>> horizontalBlockList = List.of(
            BlockRegister.CROSSING_LIGHT_DUAL,
            BlockRegister.SIGN_CROSSBUCK_IRON,
            BlockRegister.SIGN_CROSSBUCK_WOODEN,
            BlockRegister.SIGN_RXR_ADVANCE,
            BlockRegister.SIGN_WHISTLE,
            BlockRegister.SIGN_WHISTLE_OLD
    );

    // List of all normal (non-cube) blocks
    public static final List<RegistrySupplier<? extends Block>> nonCubeBlockList = List.of(
            BlockRegister.POLE_IRON,
            BlockRegister.POLE_WOODEN
    );
}
