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

package dev.interurban.registers;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.blocks.*;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static dev.interurban.RailroadBlocks.MOD_ID;

/**
 * A list of all mod blocks and stores them for registry with Minecraft.
 */
public class BlockRegister {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);

    // The following is to enable Forge/NeoForge to access the list of all blocks.
    private static final List<RegistrySupplier<Block>> BLOCK_LIST = new ArrayList<>();
    // Block List
    public static final RegistrySupplier<CrossingLightBlock> CROSSING_LIGHT_DUAL = register("crossing_light_dual", () ->
            new CrossingLightBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));
    public static final RegistrySupplier<PoleBlock> POLE_IRON = register("iron_pole", () ->
            new PoleBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));
    public static final RegistrySupplier<PoleBlock> POLE_WOODEN = register("wooden_pole", () ->
            new PoleBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(1f)
            ));
    public static final RegistrySupplier<SignBlock> SIGN_CROSSBUCK_IRON = register("iron_crossbuck", () ->
            new SignBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));
    public static final RegistrySupplier<SignBlock> SIGN_CROSSBUCK_WOODEN = register("wooden_crossbuck", () ->
            new SignBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(1f)
            ));
    public static final RegistrySupplier<SignBlock> SIGN_RXR_ADVANCE = register("rxr_advance_sign", () ->
            new SignBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));
    public static final RegistrySupplier<SmallSignBlock> SIGN_WHISTLE = register("whistle_sign", () ->
            new SmallSignBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));
    public static final RegistrySupplier<OldSignBlock> SIGN_WHISTLE_OLD = register("old_whistle_sign", () ->
            new OldSignBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .sound(SoundType.STONE)
                    .strength(2f)
            ));

    private static <T extends Block> RegistrySupplier<T> register(
            String name, Supplier<T> supplier
    ) {
        RegistrySupplier<T> entry = BLOCKS.register(name, supplier);
        BLOCK_LIST.add((RegistrySupplier<Block>) entry);
        return entry;
    }

    public static Iterable<Block> getBlockList() {
        return BLOCK_LIST.stream()
                .map(RegistrySupplier::get)
                .toList();
    }
}
