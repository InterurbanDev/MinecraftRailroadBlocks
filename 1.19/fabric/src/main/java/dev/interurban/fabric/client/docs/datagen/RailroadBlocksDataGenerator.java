package dev.interurban.fabric.client.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import java.io.IOException;

import static dev.interurban.RailroadBlocks.LOGGER;

public class RailroadBlocksDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        //DataGenerator.PathProvider path = fabricDataGenerator.;
        fabricDataGenerator.addProvider(RailroadBlocksBlockLootTableProvider::new);
        fabricDataGenerator.addProvider(RailroadBlocksBlockTagProvider::new);
        fabricDataGenerator.addProvider(RailroadBlocksItemTagProvider::new);
        fabricDataGenerator.addProvider(RailroadBlocksModelProvider::new);
        fabricDataGenerator.addProvider(RailroadBlocksRecipeProvider::new);

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