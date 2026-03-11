package dev.interurban.forge.datagen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.HashCache;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.IGeneratedBlockstate;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.Function;

import static dev.interurban.datagen.ModelHandler.horizontalBlockList;
import static dev.interurban.datagen.ModelHandler.nonCubeBlockList;

/**
 * Generates blockstates for the mod's custom blocks
 */
public class ModBlockStateProvider extends BlockStateProvider {

    // Contains variables for overriding the run() function of BlockStateProvider
    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .disableHtmlEscaping() // Prevents an issue with special characters in the JSON files
            .create();
    private final DataGenerator generator;

    /**
     * Starts the blockstate provider with overrides and saves the data generator
     *
     * @param generator          the data generator
     * @param existingFileHelper checks if other data files exist
     */
    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, RailroadBlocks.MOD_ID, existingFileHelper);

        this.generator = generator;
    }

    /**
     * Overrides the run() function of BlockStateProvider to allow us to change the order of block variants for Forgix
     * merge
     *
     * @param cache HashCache
     * @throws IOException IOException
     */
    @Override
    public void run(HashCache cache) throws IOException {
        super.run(cache);

        Path outputFolder = generator.getOutputFolder(); // Gets the original output from datagen

        // For each registered block state
        for (Map.Entry<Block, IGeneratedBlockstate> entry : registeredBlocks.entrySet()) {
            // Gets path to target blockstate files
            ResourceLocation blockId = ForgeRegistries.BLOCKS.getKey(entry.getKey());
            assert blockId != null;
            Path target = outputFolder.resolve("assets/" + blockId.getNamespace() + "/blockstates/" + blockId.getPath() + ".json");

            JsonObject original = entry.getValue().toJson(); // Gets original generated JSON file
            JsonObject sorted = sortBlockStateJson(original); // Sorts JSON file data
            DataProvider.save(GSON, cache, sorted, target); // Saves modified JSON file
        }
    }

    /**
     * Registers all blocks
     */
    @Override
    protected void registerStatesAndModels() {
        for (RegistrySupplier<? extends Block> block : horizontalBlockList) {
            betterHorizontalBlock(block.get(), getModel(block));
        }
        for (RegistrySupplier<? extends Block> block : nonCubeBlockList) {
            simpleBlock(block.get(), getModel(block));
        }
    }

    /**
     * Generates a horizontal blockstate for a block with an existing model
     *
     * @param block the block to generate a horizontal blockstate for
     * @param model the block's model
     */
    private void betterHorizontalBlock(Block block, ModelFile model) {
        betterHorizontalBlock(block, $ -> model);
    }

    /**
     * Finds and returns the existing model for a block
     *
     * @param block the block to find the model for
     * @return the model for the given block
     */
    private ModelFile getModel(RegistrySupplier<? extends Block> block) {
        ResourceLocation id = block.getId();

        return models().getExistingFile(modLoc("block/" + id.getPath()));
    }

    /**
     * Generates a horizontal blockstate for a block with an existing model
     * @param block the block to generate a horizontal blockstate for
     * @param modelFunc the block's existing model and blockstate
     */
    private void betterHorizontalBlock(Block block, Function<BlockState, ModelFile> modelFunc) {
        getVariantBuilder(block)
                .forAllStatesExcept(state -> ConfiguredModel.builder()
                                .modelFile(modelFunc.apply(state))
                                .rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                                .build(),
                        BlockStateProperties.WATERLOGGED
                );
    }

    /**
     * Sorts the data values in a JSON file to match other mod loaders
     *
     * @param original the original generated JSON data
     * @return the sorted version of the generated JSON data
     */
    private JsonObject sortBlockStateJson(JsonObject original) {
        JsonObject result = new JsonObject();

        // Sorts variants alphabetically to match other mod loaders formatting for data generation
        if (original.has("variants")) {
            JsonObject variants = original.getAsJsonObject("variants");
            JsonObject sortedVariants = new JsonObject();
            variants.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(e -> sortedVariants.add(e.getKey(), e.getValue()));
            result.add("variants", sortedVariants);
        }

        return result;
    }
}
