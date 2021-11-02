package io.github.samthegamer39.railroadblocks.core.init;

import io.github.samthegamer39.railroadblocks.RailroadBlocks;
import io.github.samthegamer39.railroadblocks.common.blocks.WoodenCrossbuckBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.WoodenPoleBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final WoodenCrossbuckBlock WOODEN_CROSSBUCK_BLOCK = new WoodenCrossbuckBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestTool(ToolType.AXE)
            .harvestLevel(1)
            .sound(SoundType.WOOD)
            .noOcclusion()
    );

    public static final WoodenPoleBlock WOODEN_POLE_BLOCK = new WoodenPoleBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestTool(ToolType.AXE)
            .harvestLevel(1)
            .sound(SoundType.WOOD)
            .noOcclusion()
    );

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RailroadBlocks.MOD_ID);

    public static final RegistryObject<WoodenCrossbuckBlock> WOODEN_CROSSBUCK = BLOCKS.register("wooden_crossbuck", () -> WOODEN_CROSSBUCK_BLOCK);

    public static final RegistryObject<WoodenPoleBlock> WOODEN_POLE = BLOCKS.register("wooden_pole",
            () -> WOODEN_POLE_BLOCK);
}
