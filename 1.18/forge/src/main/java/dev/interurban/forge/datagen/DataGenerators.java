/*
 * MIT License
 *
 * Copyright (c) 2026. Interurban Dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.interurban.forge.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import java.io.IOException;

import static dev.interurban.RailroadBlocks.LOGGER;

public class DataGenerators {
    public static void register(IEventBus modBus) {
        modBus.addListener(DataGenerators::gatherData);
    }

    public static void gatherData(GatherDataEvent event) {
        LOGGER.info("Beginning Data Generation (Forge)");
        if (event.includeClient()) {
            LOGGER.info("Data Generation running in Client Environment!");
        }
        if (event.includeServer()) {
            LOGGER.info("Data Generation running in Server Environment!");
        }

        // Data generators may require some of these as constructor parameters.
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, existingFileHelper);

        // Register the providers.
        generator.addProvider(
                //event.includeClient(),
                new ModBlockStateProvider(generator, existingFileHelper)
        );

        generator.addProvider(
                //event.includeClient(),
                new ModItemModelProvider(generator, existingFileHelper)
        );


        generator.addProvider(
                //event.includeServer(), // A boolean that determines whether the data should actually be generated.
                blockTags // Our provider
        );

        generator.addProvider(
                //event.includeServer(),
                new ModItemTagsProvider(generator, blockTags, existingFileHelper)
        );

        generator.addProvider(
                //event.includeServer(),
                new ModRecipeProvider(generator)
        );


        generator.addProvider(
                //event.includeServer(),
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
