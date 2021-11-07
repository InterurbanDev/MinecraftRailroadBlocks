package io.github.samthegamer39.railroadblocks.core.init;

import io.github.samthegamer39.railroadblocks.RailroadBlocks;
import io.github.samthegamer39.railroadblocks.common.blocks.SignBlock;
import io.github.samthegamer39.railroadblocks.common.blocks.PoleBlock;

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

    public static final SignBlock WOODEN_CROSSBUCK_BLOCK = new SignBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestTool(ToolType.AXE)
            .harvestLevel(1)
            .sound(SoundType.WOOD)
            .noOcclusion()
    );

    public static final SignBlock IRON_CROSSBUCK_BLOCK = new SignBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestLevel(1)
            .sound(SoundType.METAL)
            .noOcclusion()
    );

    public static final SignBlock RXR_ADVANCE_BLOCK = new SignBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestLevel(1)
            .sound(SoundType.METAL)
            .noOcclusion()
    );

    public static final PoleBlock WOODEN_POLE_BLOCK = new PoleBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestTool(ToolType.AXE)
            .harvestLevel(1)
            .sound(SoundType.WOOD)
            .noOcclusion()
    );

    public static final PoleBlock IRON_POLE_BLOCK = new PoleBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL) //AbstractBlock.Properties.of() is the mojmap version of .create()
            .strength(0f)
            .harvestLevel(1)
            .sound(SoundType.METAL)
            .noOcclusion()
    );

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RailroadBlocks.MOD_ID);

    public static final RegistryObject<SignBlock> WOODEN_CROSSBUCK = BLOCKS.register("wooden_crossbuck", () -> WOODEN_CROSSBUCK_BLOCK);
    public static final RegistryObject<SignBlock> IRON_CROSSBUCK = BLOCKS.register("iron_crossbuck", () -> IRON_CROSSBUCK_BLOCK);
    public static final RegistryObject<SignBlock> RXR_ADVANCE =  BLOCKS.register("rxr_advance_sign", () -> RXR_ADVANCE_BLOCK);
    public static final RegistryObject<PoleBlock> WOODEN_POLE = BLOCKS.register("wooden_pole", () -> WOODEN_POLE_BLOCK);
    public static final RegistryObject<PoleBlock> IRON_POLE = BLOCKS.register("iron_pole", () -> IRON_POLE_BLOCK);
}
