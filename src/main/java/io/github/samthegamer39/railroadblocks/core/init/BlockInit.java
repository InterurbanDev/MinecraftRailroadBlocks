package io.github.samthegamer39.railroadblocks.core.init;

import io.github.samthegamer39.railroadblocks.RailroadBlocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.windows.WINDOWPLACEMENT;

public class BlockInit {

    public static final Block WOODEN_CROSSBUCK_BLOCK = new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestTool(ToolType.AXE)
            .harvestLevel(1)
            .sound(SoundType.WOOD)
            .noOcclusion()
    );

    public static final Block WOODEN_POLE_BLOCK = new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestTool(ToolType.AXE)
            .harvestLevel(1)
            .sound(SoundType.WOOD)
            .noOcclusion()
    );

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RailroadBlocks.MOD_ID);

    public static final RegistryObject<Block> WOODEN_CROSSBUCK = BLOCKS.register("wooden_crossbuck", () -> WOODEN_CROSSBUCK_BLOCK);

    public static final RegistryObject<Block> WOODEN_POLE = BLOCKS.register("wooden_pole",
            () -> WOODEN_POLE_BLOCK);
}
