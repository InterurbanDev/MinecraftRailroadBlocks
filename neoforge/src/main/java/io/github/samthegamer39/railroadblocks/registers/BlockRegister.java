package io.github.samthegamer39.railroadblocks.registers;

import io.github.samthegamer39.railroadblocks.common.blocks.PoleBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.SignBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.SmallSignBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static io.github.samthegamer39.railroadblocks.RailroadBlocks.MOD_ID;
import static io.github.samthegamer39.railroadblocks.common.init.BlockInit.*;

public class BlockRegister {

	// List of blocks to register.
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

	// Block List
	public static final DeferredBlock<SignBlock> IRON_CROSSBUCK = BLOCKS.register("iron_crossbuck", () -> IRON_CROSSBUCK_BLOCK);
	public static final DeferredBlock<PoleBlock> IRON_POLE = BLOCKS.register("iron_pole", () -> IRON_POLE_BLOCK);
	public static final DeferredBlock<SignBlock> RXR_ADVANCE =  BLOCKS.register("rxr_advance_sign", () -> RXR_ADVANCE_SIGN_BLOCK);
	public static final DeferredBlock<SmallSignBlock> WHISTLE_SIGN = BLOCKS.register("whistle_sign", () -> WHISTLE_SIGN_BLOCK);
	public static final DeferredBlock<SignBlock> WOODEN_CROSSBUCK = BLOCKS.register("wooden_crossbuck", () -> WOODEN_CROSSBUCK_BLOCK);
	public static final DeferredBlock<PoleBlock> WOODEN_POLE = BLOCKS.register("wooden_pole", () -> WOODEN_POLE_BLOCK);
}
