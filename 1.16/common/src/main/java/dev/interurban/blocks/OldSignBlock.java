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
public class OldSignBlock extends SignBlock {

    /**
     * Constructor for blocks using the SmallSignBlock class. These blocks have two properties, HORIZONTAL_FACING and WATERLOGGED.
     * @param properties Properties
     */
    public OldSignBlock(Properties properties) {
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
            return Shapes.box(0.25, 0., 0.3125, 0.75, 0.9375, 0.6875); //4, 0, 5, 12, 15, 11
        } else if (direction == Direction.SOUTH) {
            return Shapes.box(0.25, 0.0, 0.3125, 0.75, 0.9375, 0.6875); //4, 0, 5, 12, 15, 11
        } else if (direction == Direction.EAST) {
            return Shapes.box(0.3125, 0.0, 0.25, 0.6875, 0.9375, 0.75); //5, 0, 4, 11, 15, 12
        } else if (direction == Direction.WEST) {
            return Shapes.box(0.3125, 0.0, 0.25, 0.6875, 0.9375, 0.75); //5, 0, 4, 11 15, 12
        } else {
            return Shapes.block();
        }
    }
}
