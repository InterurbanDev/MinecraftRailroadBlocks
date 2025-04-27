package dev.interurban.RailroadBlocks.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * This class is designed to be a smaller variant of the SignBlock class.
 */
public class OldSignBlock extends SignBlock {

    public OldSignBlock(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
    }

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		if (((EnumFacing)state.getValue(FACING)) == EnumFacing.NORTH || ((EnumFacing)state.getValue(FACING)) == EnumFacing.SOUTH) {
			return new AxisAlignedBB(0.25, 0., 0.3125, 0.75, 0.9375, 0.6875); //4, 0, 5, 12, 15, 11
		} else if (((EnumFacing)state.getValue(FACING)) == EnumFacing.EAST || ((EnumFacing)state.getValue(FACING)) == EnumFacing.WEST) {
			return new AxisAlignedBB(0.3125, 0.0, 0.25, 0.6875, 0.9375, 0.75); //5, 0, 4, 11, 15, 12
		} else {
			return new AxisAlignedBB(1,1,1,1,1,1);
		}
	}
}
