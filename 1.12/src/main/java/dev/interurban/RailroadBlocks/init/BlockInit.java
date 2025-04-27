package dev.interurban.RailroadBlocks.init;

import java.util.ArrayList;
import java.util.List;

import dev.interurban.RailroadBlocks.objects.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block CROSSING_LIGHT_DUAL = new CrossingLightBlock(
			"crossing_light_dual", Material.IRON, 2.0f, 4.8f, SoundType.METAL
	);
	public static final Block POLE_IRON = new PoleBlock(
			"iron_pole", Material.IRON, 2.0f, 4.8f, SoundType.METAL
	);
	public static final Block POLE_WOOD = new PoleBlock(
			"wooden_pole", Material.WOOD, 1.0f, 3.0f, SoundType.WOOD
	);
	public static final Block SIGN_CROSSBUCK_IRON = new SignBlock(
			"iron_crossbuck", Material.IRON, 2.0f, 4.8f, SoundType.METAL
	);
	public static final Block SIGN_CROSSBUCK_WOODEN = new SignBlock(
			"wooden_crossbuck", Material.IRON, 2.0f, 3.0f, SoundType.METAL
	);
	public static final Block SIGN_RXR_ADVANCE = new SignBlock(
			"rxr_advance_sign", Material.IRON, 1.0f, 4.8f, SoundType.METAL
	);
	public static final Block SIGN_WHISTLE = new SmallSignBlock(
			"whistle_sign", Material.IRON, 2.0f, 4.8f, SoundType.METAL
	);
	public static final Block SIGN_WHISTLE_OLD = new OldSignBlock(
			"old_whistle_sign", Material.ROCK, 2.0f, 1.8f, SoundType.STONE
	);
}
