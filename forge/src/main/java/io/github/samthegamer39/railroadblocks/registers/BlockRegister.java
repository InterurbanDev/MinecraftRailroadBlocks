package io.github.samthegamer39.railroadblocks.registers;

import io.github.samthegamer39.railroadblocks.common.blocks.PoleBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.SignBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.SmallSignBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.github.samthegamer39.railroadblocks.common.init.BlockInit.*;
import static io.github.samthegamer39.railroadblocks.RailroadBlocks.MOD_ID;

public class BlockRegister {

	// List of blocks to register.
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

	// Block List
	public static final RegistryObject<SignBlock> IRON_CROSSBUCK = BLOCKS.register("iron_crossbuck", () -> IRON_CROSSBUCK_BLOCK);
	public static final RegistryObject<PoleBlock> IRON_POLE = BLOCKS.register("iron_pole", () -> IRON_POLE_BLOCK);
	public static final RegistryObject<SignBlock> RXR_ADVANCE =  BLOCKS.register("rxr_advance_sign", () -> RXR_ADVANCE_SIGN_BLOCK);
	public static final RegistryObject<SmallSignBlock> WHISTLE_SIGN = BLOCKS.register("whistle_sign", () -> WHISTLE_SIGN_BLOCK);
	public static final RegistryObject<SignBlock> WOODEN_CROSSBUCK = BLOCKS.register("wooden_crossbuck", () -> WOODEN_CROSSBUCK_BLOCK);
	public static final RegistryObject<PoleBlock> WOODEN_POLE = BLOCKS.register("wooden_pole", () -> WOODEN_POLE_BLOCK);
}
