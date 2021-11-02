package io.github.samthegamer39.railroadblocks.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class PoleBlock extends BaseHorizontalBlock {

    //Controls the shape of the collision/render block.
    private static final VoxelShape SHAPE = Block.box(7, 0, 7, 9, 16, 9);

    public PoleBlock(Properties properties) {
        super(properties); //What is super()?
        runCalculation(SHAPE);
    }

    @SuppressWarnings("deprecation") //Why is getShape() deprecated?
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(this).get(state.getValue(HORIZONTAL_FACING));
    }
}
