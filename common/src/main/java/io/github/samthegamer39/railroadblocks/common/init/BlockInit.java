package io.github.samthegamer39.railroadblocks.common.init;

import io.github.samthegamer39.railroadblocks.common.blocks.PoleBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.SignBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.SmallSignBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * A list of all mod blocks and stores them for registry with Minecraft.
 */
public class BlockInit {

    // Block List
    public static final SignBlock IRON_CROSSBUCK_BLOCK = new SignBlock(BlockBehaviour.Properties.of()
            .sound(SoundType.METAL)
            .strength(2f)
    );

    public static final PoleBlock IRON_POLE_BLOCK = new PoleBlock(BlockBehaviour.Properties.of()
            .sound(SoundType.METAL)
            .strength(2f)
    );

    public static final SignBlock RXR_ADVANCE_SIGN_BLOCK = new SignBlock(BlockBehaviour.Properties.of()
            .sound(SoundType.METAL)
            .strength(2f)
    );

    public static final SmallSignBlock WHISTLE_SIGN_BLOCK = new SmallSignBlock(BlockBehaviour.Properties.of()
            .sound(SoundType.METAL)
            .strength(2f)
    );

    public static final SignBlock WOODEN_CROSSBUCK_BLOCK = new SignBlock(BlockBehaviour.Properties.of()
            .sound(SoundType.WOOD)
            .strength(1f)
    );

    public static final PoleBlock WOODEN_POLE_BLOCK = new PoleBlock(BlockBehaviour.Properties.of()
            .sound(SoundType.WOOD)
            .strength(1f)
    );

}
