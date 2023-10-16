package io.github.samthegamer39.railroadblocks.init;

import io.github.samthegamer39.railroadblocks.RailroadBlocks;
import io.github.samthegamer39.railroadblocks.common.blocks.SignBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.PoleBlock;

import io.github.samthegamer39.railroadblocks.common.blocks.SmallSignBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * A list of all mod blocks and stores them for registry with Minecraft.
 */
public class BlockInit {

    // List of blocks to register.
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RailroadBlocks.MOD_ID);

    // Block List
    public static final RegistryObject<SignBlock> IRON_CROSSBUCK = BLOCKS.register("iron_crossbuck",
            () -> new SignBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY)
    ));

    public static final RegistryObject<PoleBlock> IRON_POLE = BLOCKS.register("iron_pole",
            () -> new PoleBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .noOcclusion()
    ));

    public static final RegistryObject<SignBlock> RXR_ADVANCE =  BLOCKS.register("rxr_advance_sign",
            () -> new SignBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .noOcclusion()
    ));

    public static final RegistryObject<SmallSignBlock> WHISTLE_SIGN = BLOCKS.register("whistle_sign",
            () -> new SmallSignBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .noOcclusion()
    ));

    public static final RegistryObject<SignBlock> WOODEN_CROSSBUCK = BLOCKS.register("wooden_crossbuck",
            () -> new SignBlock(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)
                    .noOcclusion()
    ));

    public static final RegistryObject<PoleBlock> WOODEN_POLE = BLOCKS.register("wooden_pole",
            () -> new PoleBlock(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)
                    .noOcclusion()
    ));
}
