package dev.interurban.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static dev.interurban.datagen.ItemTagHandler.*;
import static dev.interurban.registers.ItemRegister.*;
import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;
import static net.minecraft.data.recipes.ShapelessRecipeBuilder.shapeless;

/**
 * Provider of recipes (compatible with Fabric and NeoForge)
 */
public class RecipeHandler extends RecipeProvider {

    public RecipeHandler(PackOutput output) {
        super(output);
    }

    /**
     * Defines all recipes for mod blocks and items
     * @param writer recipes
     */
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        shaped(RecipeCategory.TRANSPORTATION, CROSSING_LIGHT_DUAL.get(), 1)
                .pattern(" I ")
                .pattern("RIR")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .define('R', Items.REDSTONE_LAMP)
                .unlockedBy(getHasName(CROSSING_LIGHT_DUAL.get()), has(CROSSING_LIGHT_DUAL.get()))
                .save(writer);
        shaped(RecipeCategory.TOOLS, FLAG_BLUE.get(), 3)
                .pattern("SW")
                .pattern("S ")
                .define('S', Items.STICK)
                .define('W', Items.BLUE_WOOL)
                .group("flags") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(FLAG_BLUE.get()), has(FLAGS))
                .save(writer);
        shaped(RecipeCategory.TOOLS, FLAG_GREEN.get(), 3)
                .pattern("SW")
                .pattern("S ")
                .define('S', Items.STICK)
                .define('W', Items.GREEN_WOOL)
                .group("flags") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(FLAG_GREEN.get()), has(FLAGS))
                .save(writer);
        shaped(RecipeCategory.TOOLS, FLAG_RED.get(), 3)
                .pattern("SW")
                .pattern("S ")
                .define('S', Items.STICK)
                .define('W', Items.RED_WOOL)
                .group("flags") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(FLAG_RED.get()), has(FLAGS))
                .save(writer);
        shaped(RecipeCategory.TOOLS, FLAG_YELLOW.get(), 3)
                .pattern("SW")
                .pattern("S ")
                .define('S', Items.STICK)
                .define('W', Items.YELLOW_WOOL)
                .group("flags") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(FLAG_YELLOW.get()), has(FLAGS))
                .save(writer);
        shaped(RecipeCategory.TRANSPORTATION, POLE_IRON.get(), 3)
                .pattern("I")
                .pattern("I")
                .pattern("I")
                .define('I', Items.IRON_INGOT)
                .group("poles") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(POLE_IRON.get()), has(POLES))
                .save(writer);
        shaped(RecipeCategory.TRANSPORTATION, POLE_WOODEN.get(), 3)
                .pattern("S")
                .pattern("S")
                .pattern("S")
                .define('S', Items.STICK)
                .group("poles") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(POLE_WOODEN.get()), has(POLES))
                .save(writer);
        shaped(RecipeCategory.TRANSPORTATION, SIGN_CROSSBUCK_IRON.get(), 3)
                .pattern("I I")
                .pattern(" I ")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .group("crossbucks") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(SIGN_CROSSBUCK_IRON.get()), has(SIGNS))
                .save(writer);
        shaped(RecipeCategory.TRANSPORTATION, SIGN_CROSSBUCK_WOODEN.get(), 3)
                .pattern("I I")
                .pattern(" I ")
                .pattern("ISI")
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .group("crossbucks") // Groups are shown in one slot in the recipe book
                .unlockedBy(getHasName(SIGN_CROSSBUCK_WOODEN.get()), has(SIGNS))
                .save(writer);
        shaped(RecipeCategory.TRANSPORTATION, SIGN_RXR_ADVANCE.get(), 3)
                .pattern(" I ")
                .pattern("IYI")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy(getHasName(SIGN_RXR_ADVANCE.get()), has(SIGNS))
                .save(writer);
        shapeless(RecipeCategory.TRANSPORTATION, SIGN_WHISTLE.get(), 3)
                .requires(Items.WHITE_DYE)
                .requires(Items.IRON_INGOT)
                .unlockedBy(getHasName(SIGN_WHISTLE.get()), has(SIGNS))
                .save(writer);
        shapeless(RecipeCategory.TRANSPORTATION, SIGN_WHISTLE_OLD.get(), 2)
                .requires(Items.BLACK_DYE)
                .requires(Items.LIGHT_GRAY_CONCRETE)
                .unlockedBy(getHasName(SIGN_WHISTLE_OLD.get()), has(SIGNS))
                .save(writer);
    }
}

