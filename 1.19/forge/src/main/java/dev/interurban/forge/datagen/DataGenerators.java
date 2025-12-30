package dev.interurban.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import java.io.IOException;

import static dev.interurban.RailroadBlocks.LOGGER;

public class DataGenerators {
    public static void register(IEventBus modBus) {
        modBus.addListener(DataGenerators::gatherData);
    }

    public static void gatherData(GatherDataEvent event) {
        LOGGER.info("Beginning Data Generation (NeoForge)");
        if (event.includeClient()) {
            LOGGER.info("Data Generation running in Client Environment!");
        }
        if (event.includeServer()) {
            LOGGER.info("Data Generation running in Server Environment!");
        }

        // Data generators may require some of these as constructor parameters..
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, existingFileHelper);

        // Register the providers.
        generator.addProvider(
                event.includeClient(),
                new ModBlockStateProvider(generator, existingFileHelper)
        );

        generator.addProvider(
                event.includeClient(),
                new ModItemModelProvider(generator, existingFileHelper)
        );


        generator.addProvider(
                event.includeServer(), // A boolean that determines whether the data should actually be generated.
                blockTags // Our provider
        );

        generator.addProvider(
                event.includeServer(),
                new ModItemTagsProvider(generator, blockTags, existingFileHelper)
        );

        generator.addProvider(
                event.includeServer(),
                new ModRecipeProvider(generator)
        );


        generator.addProvider(
                event.includeServer(),
                new ModLootTableProvider(generator)
        );

        // Waits for data generation to finish, then automatically terminates.
        try {
            generator.run();
        } catch (IOException e) {
            LOGGER.error("Data Generation Failed!");
            throw new RuntimeException("Data Generation Failed!", e);
        }

        LOGGER.info("Data Generation Complete!");
        System.exit(0);
    }
}
