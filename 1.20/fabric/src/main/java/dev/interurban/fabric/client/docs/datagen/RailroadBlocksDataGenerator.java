package dev.interurban.fabric.client.docs.datagen;

import dev.interurban.datagen.RecipeHandler;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import java.io.IOException;

import static dev.interurban.RailroadBlocks.LOGGER;

public class RailroadBlocksDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(RailroadBlocksBlockLootTableProvider::new);
        pack.addProvider(RailroadBlocksBlockTagProvider::new);
        pack.addProvider(RailroadBlocksItemTagProvider::new);
        pack.addProvider(RailroadBlocksModelProvider::new);
        pack.addProvider((FabricDataGenerator.Pack.Factory<RecipeHandler>) RecipeHandler::new);

        // Waits for data generation to finish, then automatically terminates.
        try {
            fabricDataGenerator.run();
        } catch (IOException e) {
            LOGGER.error("Data Generation Failed!");
            throw new RuntimeException(e);
        }

        LOGGER.info("Data Generation Complete!");
        System.exit(0);
    }
}