package dev.interurban.datagen;

import com.google.common.collect.ImmutableList;
import dev.interurban.registers.BlockRegister;
import dev.interurban.registers.ItemRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.List;

/**
 * Defines lists of all item and block types for model generation
 */
public class ModelHandler {
    // List of all handheld items
    public static final List<RegistrySupplier<Item>> handheldItemList = ImmutableList.of(
            ItemRegister.FLAG_BLUE,
            ItemRegister.FLAG_GREEN,
            ItemRegister.FLAG_RED,
            ItemRegister.FLAG_YELLOW
    );

    // List of all horizontally rotatable blocks
    public static final List<RegistrySupplier<? extends Block>> horizontalBlockList = ImmutableList.of(
            BlockRegister.CROSSING_LIGHT_DUAL,
            BlockRegister.SIGN_CROSSBUCK_IRON,
            BlockRegister.SIGN_CROSSBUCK_WOODEN,
            BlockRegister.SIGN_RXR_ADVANCE,
            BlockRegister.SIGN_WHISTLE,
            BlockRegister.SIGN_WHISTLE_OLD
    );

    // List of all normal (non-cube) blocks
    public static final List<RegistrySupplier<? extends Block>> nonCubeBlockList = ImmutableList.of(
            BlockRegister.POLE_IRON,
            BlockRegister.POLE_WOODEN
    );
}
