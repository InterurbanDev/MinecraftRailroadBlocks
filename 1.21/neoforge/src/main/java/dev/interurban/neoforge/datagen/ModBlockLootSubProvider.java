package dev.interurban.neoforge.datagen;

import dev.interurban.registers.BlockRegister;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootSubProvider extends BlockLootSubProvider {
    // The constructor can be private if this class is an inner class of your loot table provider.
    // The parameter is provided by the lambda in the LootTableProvider's constructor.
    public ModBlockLootSubProvider(HolderLookup.Provider lookupProvider) {
        // The first parameter is a set of blocks we are creating loot tables for. Instead of hardcoding,
        // we use our block registry and just pass an empty set here.
        // The second parameter is the feature flag set, this will be the default flags
        // unless you are adding custom flags (which is beyond the scope of this article).
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }

    // The contents of this Iterable are used for validation.
    // We return an Iterable over our block registry's values here.
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        // The contents of our DeferredRegister.
        return BlockRegister.getBlockList();
    }

    // Actually add our loot tables.
    @Override
    protected void generate() {
        // Equivalent to calling add(MyBlocks.EXAMPLE_BLOCK.get(), createSingleItemTable(MyBlocks.EXAMPLE_BLOCK.get()));
        dropSelf(BlockRegister.CROSSING_LIGHT_DUAL.get());
        dropSelf(BlockRegister.POLE_IRON.get());
        dropSelf(BlockRegister.POLE_WOODEN.get());
        dropSelf(BlockRegister.SIGN_CROSSBUCK_IRON.get());
        dropSelf(BlockRegister.SIGN_CROSSBUCK_WOODEN.get());
        dropSelf(BlockRegister.SIGN_RXR_ADVANCE.get());
        dropSelf(BlockRegister.SIGN_WHISTLE.get());
        dropSelf(BlockRegister.SIGN_WHISTLE_OLD.get());
    }
}


