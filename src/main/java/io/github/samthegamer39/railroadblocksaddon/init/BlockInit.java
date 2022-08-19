package io.github.samthegamer39.railroadblocksaddon.init;

import io.github.samthegamer39.railroadblocksaddon.RailroadBlocksAddon;
import io.github.samthegamer39.railroadblocksaddon.common.blocks.SignBlock;
import io.github.samthegamer39.railroadblocksaddon.common.blocks.PoleBlock;

import io.github.samthegamer39.railroadblocksaddon.common.blocks.SmallSignBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RailroadBlocksAddon.MOD_ID);

    public static final RegistryObject<SignBlock> IRON_CROSSBUCK = BLOCKS.register("iron_crossbuck",
            () -> new SignBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
            .strength(2f)
            .requiresCorrectToolForDrops()
            // .harvestLevel(1)
            // .harvestTool(ToolType.AXE)
            .sound(SoundType.METAL)
            .noOcclusion()
    ));

    public static final RegistryObject<PoleBlock> IRON_POLE = BLOCKS.register("iron_pole",
            () -> new PoleBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
            .strength(2f)
            .requiresCorrectToolForDrops()
            //.harvestLevel(1)
            //.harvestTool(ToolType.AXE)
            .sound(SoundType.METAL)
            .noOcclusion()
    ));

    public static final RegistryObject<SignBlock> RXR_ADVANCE =  BLOCKS.register("rxr_advance_sign",
            () -> new SignBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
            .strength(2f)
            .requiresCorrectToolForDrops()
            // .harvestLevel(1)
            // .harvestTool(ToolType.AXE)
            .sound(SoundType.METAL)
            .noOcclusion()
    ));

    public static final RegistryObject<SmallSignBlock> WHISTLE_SIGN = BLOCKS.register("whistle_sign",
            () -> new SmallSignBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
            .strength(2f)
            .requiresCorrectToolForDrops()
            // .harvestLevel(1)
            // .harvestTool(ToolType.AXE)
            .sound(SoundType.METAL)
            .noOcclusion()
    ));

    public static final RegistryObject<SignBlock> WOODEN_CROSSBUCK = BLOCKS.register("wooden_crossbuck",
            () -> new SignBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
            .strength(1f)
            .requiresCorrectToolForDrops()
            // .harvestLevel(1)
            // .harvestTool(ToolType.AXE)
            .sound(SoundType.WOOD)
            .noOcclusion()
    ));

    public static final RegistryObject<PoleBlock> WOODEN_POLE = BLOCKS.register("wooden_pole",
            () -> new PoleBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
            .strength(1f)
            .requiresCorrectToolForDrops()
            // .harvestLevel(1)
            // .harvestTool(ToolType.AXE)
            .sound(SoundType.WOOD)
            .noOcclusion()
    ));
}
