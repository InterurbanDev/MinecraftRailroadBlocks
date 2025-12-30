package dev.interurban.forge.datagen;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import static dev.interurban.registers.BlockRegister.getBlockList;

public class ModBlockLootTable extends BlockLoot {

    @Override
    protected void addTables() {
        for (Block block: getBlockList()) {
            dropSelf(block);
        }
    }

    // The contents of this Iterable are used for validation.
    // We return an Iterable over our block registry's values here.
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        // The contents of our DeferredRegister.
        return getBlockList();
    }
}


