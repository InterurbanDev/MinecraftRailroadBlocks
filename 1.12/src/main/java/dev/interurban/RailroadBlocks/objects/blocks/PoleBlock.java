package dev.interurban.RailroadBlocks.objects.blocks;

import dev.interurban.RailroadBlocks.util.interfaces.IHasModel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * This class is designed for the mod's pole blocks.
 */
public class PoleBlock extends BlockBase implements IHasModel {

    public static final AxisAlignedBB SHAPE = new AxisAlignedBB(0.4375, 0, 0.4375, 0.5625, 1, 0.5625);

    public PoleBlock(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material);
        setHardness(hardness);
        setResistance(resistance);
        //setLightLevel(0.0f);
        setLightOpacity(0);
        //setDefaultSlipperiness(0.0f);
        //setHarvestLevel("axe", 0);
        setSoundType(soundType);
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SHAPE;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        return true;
    }
}
