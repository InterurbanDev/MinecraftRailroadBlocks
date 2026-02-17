package dev.interurban.forge.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static dev.interurban.datagen.RecipeHandler.getCraftingRecipes;

/**
 * Provider of recipes (compatible with Fabric and NeoForge)
 */
public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    /**
     * Defines all recipes for mod blocks and items
     *
     * @param consumer recipes
     */
    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        getCraftingRecipes(consumer);
    }
}

