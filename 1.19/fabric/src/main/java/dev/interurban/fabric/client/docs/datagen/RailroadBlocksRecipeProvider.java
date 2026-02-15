package dev.interurban.fabric.client.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static dev.interurban.datagen.RecipeHandler.getCraftingRecipes;
/**
 * Provider of recipes (compatible with Fabric and NeoForge)
 */
public class RailroadBlocksRecipeProvider extends FabricRecipeProvider {
    public RailroadBlocksRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    /**
     * Defines all recipes for mod blocks and items
     * @param consumer recipes
     */
    @Override
    protected void generateRecipes(Consumer<FinishedRecipe> consumer) {
        getCraftingRecipes(consumer);
    }
}
