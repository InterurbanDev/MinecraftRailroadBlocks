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

import dev.interurban.RailroadBlocks;
import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static dev.interurban.datagen.ModelHandler.horizontalBlockList;
import static dev.interurban.datagen.ModelHandler.nonCubeBlockList;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (RegistrySupplier<? extends Block> block : horizontalBlockList) {
            horizontalBlock(block.get(), getModel(block));
        }
        for (RegistrySupplier<? extends Block> block : nonCubeBlockList) {
            simpleBlock(block.get(), getModel(block));
        }
    }

    private ModelFile getModel(RegistrySupplier<? extends Block> block) {
        ResourceLocation id = block.getId();

        return models().getExistingFile(modLoc("block/" + id.getPath()));
    }
}
