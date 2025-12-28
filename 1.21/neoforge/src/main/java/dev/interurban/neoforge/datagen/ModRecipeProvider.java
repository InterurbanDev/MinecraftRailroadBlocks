package dev.interurban.neoforge.datagen;

import dev.interurban.registers.ItemRegister;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static dev.interurban.neoforge.datagen.ModItemTagsProvider.*;
import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;
import static net.minecraft.data.recipes.ShapelessRecipeBuilder.shapeless;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        // Register your recipes here.
        shaped(RecipeCategory.TRANSPORTATION, ItemRegister.CROSSING_LIGHT_DUAL.get(), 1)
                .pattern(" I ")
                .pattern("RIR")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .define('R', Items.REDSTONE_LAMP)
                .unlockedBy(getHasName(ItemRegister.CROSSING_LIGHT_DUAL.get()), has(ItemRegister.CROSSING_LIGHT_DUAL.get()))
                .save(output);
        shaped(RecipeCategory.TOOLS, ItemRegister.FLAG_BLUE.get(), 3)
                .pattern("SW")
                .pattern("S ")
                .define('S', Items.STICK)
                .define('W', Items.BLUE_WOOL)
                .group("flags") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(ItemRegister.FLAG_BLUE.get()), has(FLAGS))
                .save(output);
        shaped(RecipeCategory.TOOLS, ItemRegister.FLAG_GREEN.get(), 3)
                .pattern("SW")
                .pattern("S ")
                .define('S', Items.STICK)
                .define('W', Items.GREEN_WOOL)
                .group("flags") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(ItemRegister.FLAG_GREEN.get()), has(FLAGS))
                .save(output);
        shaped(RecipeCategory.TOOLS, ItemRegister.FLAG_RED.get(), 3)
                .pattern("SW")
                .pattern("S ")
                .define('S', Items.STICK)
                .define('W', Items.RED_WOOL)
                .group("flags") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(ItemRegister.FLAG_RED.get()), has(FLAGS))
                .save(output);
        shaped(RecipeCategory.TOOLS, ItemRegister.FLAG_YELLOW.get(), 3)
                .pattern("SW")
                .pattern("S ")
                .define('S', Items.STICK)
                .define('W', Items.YELLOW_WOOL)
                .group("flags") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(ItemRegister.FLAG_YELLOW.get()), has(FLAGS))
                .save(output);
        shaped(RecipeCategory.TRANSPORTATION, ItemRegister.POLE_IRON.get(), 3)
                .pattern("I")
                .pattern("I")
                .pattern("I")
                .define('I', Items.IRON_INGOT)
                .group("poles") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(ItemRegister.POLE_IRON.get()), has(POLES))
                .save(output);
        shaped(RecipeCategory.TRANSPORTATION, ItemRegister.POLE_WOODEN.get(), 3)
                .pattern("S")
                .pattern("S")
                .pattern("S")
                .define('S', Items.STICK)
                .group("poles") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(ItemRegister.POLE_WOODEN.get()), has(POLES))
                .save(output);
        shaped(RecipeCategory.TRANSPORTATION, ItemRegister.SIGN_CROSSBUCK_IRON.get(), 3)
                .pattern("I I")
                .pattern(" I ")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .group("crossbucks") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(ItemRegister.SIGN_CROSSBUCK_IRON.get()), has(SIGNS))
                .save(output);
        shaped(RecipeCategory.TRANSPORTATION, ItemRegister.SIGN_CROSSBUCK_WOODEN.get(), 3)
                .pattern("I I")
                .pattern(" I ")
                .pattern("ISI")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .group("crossbucks") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(ItemRegister.SIGN_CROSSBUCK_WOODEN.get()), has(SIGNS))
                .save(output);
        shaped(RecipeCategory.TRANSPORTATION, ItemRegister.SIGN_RXR_ADVANCE.get(), 3)
                .pattern(" I ")
                .pattern("IYI")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy(getHasName(ItemRegister.SIGN_RXR_ADVANCE.get()), has(SIGNS))
                .save(output);
        shapeless(RecipeCategory.TRANSPORTATION, ItemRegister.SIGN_WHISTLE.get(), 3)
                .requires(Items.WHITE_DYE)
                .requires(Items.IRON_INGOT)
                .unlockedBy(getHasName(ItemRegister.SIGN_WHISTLE.get()), has(SIGNS))
                .save(output);
        shapeless(RecipeCategory.TRANSPORTATION, ItemRegister.SIGN_WHISTLE_OLD.get(), 2)
                .requires(Items.BLACK_DYE)
                .requires(Items.LIGHT_GRAY_CONCRETE)
                .unlockedBy(getHasName(ItemRegister.SIGN_WHISTLE_OLD.get()), has(SIGNS))
                .save(output);
    }
}
