package dev.interurban.RailroadBlocks.objects.blocks;


import dev.interurban.RailroadBlocks.util.interfaces.IHasModel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * This class is designed for use with blocks which have a sign facing in one direction.
 */
public class CrossingLightBlock extends BlockBase implements IHasModel {

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    {
        this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public CrossingLightBlock(String name, Material material, float hardness, float resistance, SoundType soundType) {
        super(name, material);
        setHardness(hardness);
        setResistance(resistance);
        //setLightLevel(0.0f);
        setLightOpacity(1);
        //setDefaultSlipperiness(0.0f);
        //setHarvestLevel("axe", 0);
        setSoundType(soundType);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.getFront(meta);

        if(facing.getAxis() == EnumFacing.Axis.Y) {
            facing = EnumFacing.NORTH;
        }

        return getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing)state.getValue(FACING)).getIndex();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
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
        if (((EnumFacing)state.getValue(FACING)) == EnumFacing.NORTH || ((EnumFacing)state.getValue(FACING)) == EnumFacing.SOUTH) {
            return new AxisAlignedBB(0, 0, 0.1875, 1, 1, 0.8125); //0, 0, 3, 16, 16, 13
        } else if (((EnumFacing)state.getValue(FACING)) == EnumFacing.EAST || ((EnumFacing)state.getValue(FACING)) == EnumFacing.WEST) {
            return new AxisAlignedBB(0.1875, 0, 0, 0.8125, 1, 1); //3, 0, 0, 13, 16, 16
        } else {
            return new AxisAlignedBB(1,1,1,1,1,1);
        }
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
