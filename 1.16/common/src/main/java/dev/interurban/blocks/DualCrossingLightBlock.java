package dev.interurban.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class DualCrossingLightBlock extends CrossingLightBlock {
    /**
     * Constructor for blocks using the SignBlock class. These blocks have two properties, HORIZONTAL_FACING and WATERLOGGED.
     *
     * @param properties Properties
     */
    public DualCrossingLightBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        if (direction == Direction.NORTH || direction == Direction.SOUTH) {
            return Shapes.box(0, 0.0, 0.1875, 1, 1, 0.8125); // 0, 0, 3, 16, 16, 13
        } else if (direction == Direction.EAST || direction == Direction.WEST) {
            return Shapes.box(0.1875, 0.0, 0, 0.8125, 1, 1); // 3, 0, 0, 13, 16, 16
        } else {
            return Shapes.block();
        }
    }
}
