/*
 * MIT License
 *
 * Copyright (c) 2026. Interurban Dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.interurban.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

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
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        return switch (direction) {
            case NORTH -> Shapes.box(0.25, 0., 0.3125, 0.75, 0.9375, 0.6875); //4, 0, 5, 12, 15, 11
            case SOUTH -> Shapes.box(0.25, 0.0, 0.3125, 0.75, 0.9375, 0.6875); //4, 0, 5, 12, 15, 11
            case EAST -> Shapes.box(0.3125, 0.0, 0.25, 0.6875, 0.9375, 0.75); //5, 0, 4, 11, 15, 12
            case WEST -> Shapes.box(0.3125, 0.0, 0.25, 0.6875, 0.9375, 0.75); //5, 0, 4, 11 15, 12
            default -> Shapes.block();
        };
    }
}
