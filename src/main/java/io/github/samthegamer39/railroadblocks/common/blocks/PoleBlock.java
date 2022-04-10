package io.github.samthegamer39.railroadblocks.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class PoleBlock extends Block implements IWaterLoggable {

    //Controls the shape of the collision/render block.
    private static final VoxelShape SHAPE = Block.box(7, 0, 7, 9, 16, 9);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public PoleBlock(Properties properties) {
        super(properties); //What is super()?
        this.registerDefaultState(this.defaultBlockState().getBlockState()
                .setValue(WATERLOGGED, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState()
                .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER); //.getOpposite() can be added to flip the model.
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(WATERLOGGED);
    }

    @SuppressWarnings("deprecation") //Why is getFluidState deprecated? Is there a better alternative?
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @SuppressWarnings("deprecation") //Why is getShape() deprecated?
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @SuppressWarnings("deprecation") //Why is updateShape deprecated? Is there a better alternative?
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, IWorld world, BlockPos position, BlockPos neighborPos){
        if (state.getValue(WATERLOGGED)) {
            world.getLiquidTicks().scheduleTick(position,Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, direction, neighborState, world, position, neighborPos);
    }
}
