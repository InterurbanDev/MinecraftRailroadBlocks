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