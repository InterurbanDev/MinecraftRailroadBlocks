package io.github.samthegamer39.railroadblocks.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * This class is designed for use with blocks which have a sign facing in one direction.
 */
public class SignBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {

    // Global Variables
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;

    /**
     * Constructor for blocks using the SignBlock class. These blocks have two properties, HORIZONTAL_FACING and WATERLOGGED.
     * @param properties Properties
     */
    public SignBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(HORIZONTAL_FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false));
    }

    /**
     * Adds the block's properties.
     * @param builder StateDefinition.Builder
     */
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, WATERLOGGED);
    }

    /**
     * Controls the outline of blocks using this class.
     * @param state Current block's state
     * @param worldIn BlockGetter
     * @param pos Current position
     * @param context CollisionContext
     * @return Block outline shape
     */
    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        if (direction == Direction.NORTH) {
            return Shapes.box(0.0625, 0.0, 0.375, 0.9375, 0.9375, 0.5625); //1, 0, 6, 15, 15, 9
        } else if (direction == Direction.SOUTH) {
            return Shapes.box(0.0625, 0.0, 0.4375, 0.9375, 0.9375, 0.625); //1, 0, 7, 15, 15, 10
        } else if (direction == Direction.EAST) {
            return Shapes.box(0.4375, 0.0, 0.0625, 0.625, 0.9375, 0.9375); //7, 0, 1, 10, 15, 15
        } else if (direction == Direction.WEST) {
            return Shapes.box(0.375, 0.0, 0.0625, 0.5625, 0.9375, 0.9375); //6, 0, 1, 9, 15, 15
        } else {
            return Shapes.block();
        }
    }

    /**
     * Controls the state of the block when placed.
     * @param context ItemPlacementContext
     * @return Returns the state of the block as it should be when placed.
     */
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(HORIZONTAL_FACING, context.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER);
    }

    /**
     * Gets the current WATERLOGGED state, presumably.
     * @param state Current block's state
     * @return Returns the current WATERLOGGED state, presumably.
     */
    @SuppressWarnings("deprecation") //Why is getFluidState() deprecated? Is there a better alternative?
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state); //Displays water when waterlogged.
    }

    /**
     * I don't know what this does exactly. It's probably important.
     * @param state Current block's state
     * @param direction Direction
     * @param neighborState Neighboring block's state
     * @param world WorldAccess
     * @param position Current position
     * @param neighborPos Neighboring block's position
     * @return
     */
    @SuppressWarnings("deprecation") //Why is updateShape deprecated? Is there a better alternative?
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos position, BlockPos neighborPos){
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(position,Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, direction, neighborState, world, position, neighborPos);
    }
}
