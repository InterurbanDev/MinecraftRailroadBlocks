package dev.interurban.neoforge.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

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

        // Data generators may require some of these as constructor parameters.
        // See below for more details on each of these.
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(output, lookupProvider, existingFileHelper);

        // Register the providers.
        generator.addProvider(
                event.includeClient(),
                new ModBlockStateProvider(output, existingFileHelper)
        );

        generator.addProvider(
                event.includeClient(),
                new ModItemModelProvider(output, existingFileHelper)
        );


        generator.addProvider(
                event.includeServer(), // A boolean that determines whether the data should actually be generated.
                blockTags // Our provider
        );

        generator.addProvider(
                event.includeServer(),
                new ModItemTagsProvider(output, lookupProvider, blockTags.contentsGetter(), existingFileHelper)
        );

        generator.addProvider(
                event.includeServer(),
                new ModRecipeProvider(output, lookupProvider)
        );

        generator.addProvider(
                event.includeServer(),
                new LootTableProvider(
                        output,
                        Set.of(),
                        List.of(
                                new LootTableProvider.SubProviderEntry(
                                        ModBlockLootSubProvider::new,
                                        LootContextParamSets.BLOCK
                                )
                        )
                )
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
