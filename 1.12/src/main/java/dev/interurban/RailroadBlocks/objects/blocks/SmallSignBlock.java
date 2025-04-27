package dev.interurban.RailroadBlocks.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;

/**
 * This class is designed to be a smaller variant of the SignBlock class.
 */
public class SmallSignBlock extends SignBlock {

	public SmallSignBlock(String name, Material material, float hardness, float resistance, SoundType soundType) {
		super(name, material, hardness, resistance, soundType);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, net.minecraft.util.math.BlockPos pos) {
		if (((EnumFacing)state.getValue(FACING)) == EnumFacing.NORTH) {
			return new AxisAlignedBB(0.25, 0.0, 0.375, 0.75, 0.9375, 0.5625); //4, 0, 6, 12, 15, 9
		} else if (((EnumFacing)state.getValue(FACING)) == EnumFacing.SOUTH) {
			return new AxisAlignedBB(0.25, 0.0, 0.4375, 0.75, 0.9375, 0.625); //4, 0, 7, 12, 15, 10
		} else if (((EnumFacing)state.getValue(FACING)) == EnumFacing.EAST) {
			return new AxisAlignedBB(0.4375, 0.0, 0.25, 0.625, 0.9375, 0.75); //7, 0, 4, 10, 15, 12
		} else if (((EnumFacing)state.getValue(FACING)) == EnumFacing.WEST) {
			return new AxisAlignedBB(0.375, 0.0, 0.25, 0.5625, 0.9375, 0.75); //6, 0, 4, 9, 15, 12
		} else {
			return new AxisAlignedBB(1,1,1,1,1,1);
		}
	}
}
