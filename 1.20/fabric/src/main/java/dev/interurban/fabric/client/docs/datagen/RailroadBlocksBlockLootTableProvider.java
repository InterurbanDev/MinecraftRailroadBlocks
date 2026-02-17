package dev.interurban.fabric.client.docs.datagen;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import static dev.interurban.registers.BlockRegister.getBlockRegistries;

public class RailroadBlocksBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected RailroadBlocksBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (RegistrySupplier<? extends Block> registryEntry : getBlockRegistries()) {
            Block block = registryEntry.get();
            String path = registryEntry.getId().getPath();
            betterDropSelf(block, path);
        }
    }

    private void betterDropSelf(Block block, String path) {
        this.betterDropOther(block, block, path);
    }

    private void betterDropOther(Block block, ItemLike item, String path) {
        this.add(block, this.betterCreateSingleItemTable(item, path));
    }

    private LootTable.Builder betterCreateSingleItemTable(ItemLike item, String path) {
        return LootTable.lootTable()
                .withPool(
                        this.applyExplosionCondition(
                                item,
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(1.0F))
                                        .add(LootItem.lootTableItem(item)))
                )
                .setRandomSequence(ResourceLocation.tryBuild(RailroadBlocks.MOD_ID, "blocks/" + path))
                ;
    }
}