package dev.interurban.RailroadBlocks.objects.blocks;


import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * This class is designed for use with blocks which have a sign facing in one direction.
 */
public class DualCrossingLightBlock extends CrossingLightBlock {

    public DualCrossingLightBlock(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material, hardness, resistance, soundType);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        if (state.getValue(FACING) == EnumFacing.NORTH || state.getValue(FACING) == EnumFacing.SOUTH) {
            return new AxisAlignedBB(0, 0, 0.1875, 1, 1, 0.8125); //0, 0, 3, 16, 16, 13
        } else if (state.getValue(FACING) == EnumFacing.EAST || state.getValue(FACING) == EnumFacing.WEST) {
            return new AxisAlignedBB(0.1875, 0, 0, 0.8125, 1, 1); //3, 0, 0, 13, 16, 16
        } else {
            return new AxisAlignedBB(1, 1, 1, 1, 1, 1);
        }
    }
}
