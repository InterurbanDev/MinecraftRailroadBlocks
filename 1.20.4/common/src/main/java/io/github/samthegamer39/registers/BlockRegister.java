package io.github.samthegamer39.registers;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.samthegamer39.blocks.PoleBlock;
import io.github.samthegamer39.blocks.SignBlock;
import io.github.samthegamer39.blocks.SmallSignBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static io.github.samthegamer39.RailroadBlocks.MOD_ID;

/**
 * A list of all mod blocks and stores them for registry with Minecraft.
 */
public class BlockRegister {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    // Block List
    public static final RegistrySupplier<PoleBlock> POLE_IRON = BLOCKS.register("iron_pole", () ->
            new PoleBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));

    public static final RegistrySupplier<PoleBlock> POLE_WOODEN = BLOCKS.register("wooden_pole", () ->
            new PoleBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(1f)
            ));

    public static final RegistrySupplier<SignBlock> SIGN_CROSSBUCK_IRON = BLOCKS.register("iron_crossbuck", () ->
            new SignBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));

    public static final RegistrySupplier<SignBlock> SIGN_CROSSBUCK_WOODEN = BLOCKS.register("wooden_crossbuck", () ->
            new SignBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.WOOD)
                    .strength(1f)
            ));

    public static final RegistrySupplier<SignBlock> SIGN_RXR_ADVANCE = BLOCKS.register("rxr_advance_sign", () ->
            new SignBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));

    public static final RegistrySupplier<SmallSignBlock> SIGN_WHISTLE = BLOCKS.register("whistle_sign", () ->
            new SmallSignBlock(BlockBehaviour.Properties.of()
                    .sound(SoundType.METAL)
                    .strength(2f)
            ));
}
