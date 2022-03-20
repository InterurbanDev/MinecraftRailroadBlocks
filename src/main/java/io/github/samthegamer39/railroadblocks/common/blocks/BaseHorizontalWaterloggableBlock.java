package io.github.samthegamer39.railroadblocks.common.blocks;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

//WARNING: I have no idea what half of this code does.
public class BaseHorizontalWaterloggableBlock extends Block implements IWaterLoggable {

    protected static final Map<Block, Map<Direction, VoxelShape>> SHAPES = new HashMap<>();
    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public BaseHorizontalWaterloggableBlock(Properties properties) {
        super(properties); //What is super()
        this.registerDefaultState(this.defaultBlockState().getBlockState()
                .setValue(HORIZONTAL_FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false));
    }

    @SuppressWarnings("deprecation") //Why is mirror deprecated? Also, what is mirror?
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(HORIZONTAL_FACING)));
    }

    @Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.setValue(HORIZONTAL_FACING, direction.rotate(state.getValue(HORIZONTAL_FACING)));
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState()
                .setValue(HORIZONTAL_FACING, context.getHorizontalDirection())
                .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER); //.getOpposite() can be added to flip the model.
    }

    @Override
    protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(HORIZONTAL_FACING, WATERLOGGED);
    }

    protected static VoxelShape calculateShapes(Direction to, VoxelShape shape) {
        VoxelShape[] buffer = new VoxelShape[] { shape, VoxelShapes.empty() };

        int times = (to.getStepX() - Direction.NORTH.getStepX() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.or(buffer[1],
                    VoxelShapes.box(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }

        return buffer[0];
    }

    protected void runCalculation(VoxelShape shape) {
        SHAPES.put(this, new HashMap<>());
        Map<Direction, VoxelShape> facingMap = SHAPES.get(this);
        for (Direction direction : Direction.values()) {
            facingMap.put(direction, calculateShapes(direction, shape));
        }
    }

    @SuppressWarnings("deprecation") //Why is getFluidState deprecated? Is there a better alternative?
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    //What is the proper function to override here?
    @SuppressWarnings("deprecation") //Why is updateShape deprecated? Is there a better alternative?
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, IWorld world, BlockPos position, BlockPos neighborPos){
        if (state.getValue(WATERLOGGED)) {
            world.getLiquidTicks().scheduleTick(position,Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, direction, neighborState, world, position, neighborPos);
    }
}
