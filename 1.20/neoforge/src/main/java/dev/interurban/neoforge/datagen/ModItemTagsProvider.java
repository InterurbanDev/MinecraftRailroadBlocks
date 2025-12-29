package dev.interurban.neoforge.datagen;

import dev.interurban.RailroadBlocks;
import dev.interurban.registers.ItemRegister;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    // Get parameters from GatherDataEvent.
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    public static final TagKey<Item> FLAGS = TagKey.create(
            // The registry key. The type of the registry must match the generic type of the tag.
            Registries.ITEM,
            // The location of the tag. This example will put our tag at data/examplemod/tags/items/example_tag.json.
            new ResourceLocation(RailroadBlocks.MOD_ID, "flags")
    );

    public static final TagKey<Item> POLES = TagKey.create(
            // The registry key. The type of the registry must match the generic type of the tag.
            Registries.ITEM,
            // The location of the tag. This example will put our tag at data/examplemod/tags/items/example_tag.json.
            new ResourceLocation(RailroadBlocks.MOD_ID, "poles")
    );

    public static final TagKey<Item> SIGNS = TagKey.create(
            // The registry key. The type of the registry must match the generic type of the tag.
            Registries.ITEM,
            // The location of the tag. This example will put our tag at data/examplemod/tags/items/example_tag.json.
            new ResourceLocation(RailroadBlocks.MOD_ID, "signs")
    );

    // Add your tag entries here.
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        // In an ItemTagsProvider's #addTags method, assuming types TagKey<Block> and TagKey<Item> for the two parameters.
        //copy(EXAMPLE_BLOCK_TAG, EXAMPLE_ITEM_TAG);
        // Create a tag builder for our tag. This could also be e.g. a vanilla or NeoForge tag.
        tag(FLAGS)
                // Add entries. This is a vararg parameter.
                // Non-intrinsic providers must provide ResourceKeys here instead of the actual objects.
                .add(ItemRegister.FLAG_BLUE.get())
                .add(ItemRegister.FLAG_GREEN.get())
                .add(ItemRegister.FLAG_RED.get())
                .add(ItemRegister.FLAG_YELLOW.get());
        tag(POLES)
                .add(ItemRegister.POLE_IRON.get())
                .add(ItemRegister.POLE_WOODEN.get());
        tag(SIGNS)
                .add(ItemRegister.SIGN_CROSSBUCK_IRON.get())
                .add(ItemRegister.SIGN_CROSSBUCK_WOODEN.get())
                .add(ItemRegister.SIGN_RXR_ADVANCE.get())
                .add(ItemRegister.SIGN_WHISTLE.get())
                .add(ItemRegister.SIGN_WHISTLE_OLD.get());
    }
}
