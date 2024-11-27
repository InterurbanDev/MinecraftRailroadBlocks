package dev.interurban.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * This class is designed to be a smaller variant of the SignBlock class.
 */
public class SmallSignBlock extends SignBlock {

    /**
     * Constructor for blocks using the SmallSignBlock class. These blocks have two properties, HORIZONTAL_FACING and WATERLOGGED.
     * @param properties Properties
     */
    public SmallSignBlock(Properties properties) {
        super(properties);
    }

    /**
     * Controls the outline of blocks using this class.
     * @param state Current block's state
     * @param worldIn BlockGetter
     * @param pos Current position
     * @param context CollisionContext
     * @return Block outline shape
     */
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        if (direction == Direction.NORTH) {
            return Shapes.box(0.25, 0.0, 0.375, 0.75, 0.9375, 0.5625); //4, 0, 6, 12, 15, 9
        } else if (direction == Direction.SOUTH) {
            return Shapes.box(0.25, 0.0, 0.4375, 0.75, 0.9375, 0.625); //4, 0, 7, 12, 15, 10
        } else if (direction == Direction.EAST) {
            return Shapes.box(0.4375, 0.0, 0.25, 0.625, 0.9375, 0.75); //7, 0, 4, 10, 15, 12
        } else if (direction == Direction.WEST) {
            return Shapes.box(0.375, 0.0, 0.25, 0.5625, 0.9375, 0.75); //6, 0, 4, 9, 15, 12
        } else {
            return Shapes.block();
        }
    }
}
