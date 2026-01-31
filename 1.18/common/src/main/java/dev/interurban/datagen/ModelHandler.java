/*
 * MIT License
 *
 * Copyright (c) 2026. Interurban Dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
    public static final List<RegistrySupplier<Item>> handheldItemList = List.of(
            ItemRegister.FLAG_BLUE,
            ItemRegister.FLAG_GREEN,
            ItemRegister.FLAG_RED,
            ItemRegister.FLAG_YELLOW
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
