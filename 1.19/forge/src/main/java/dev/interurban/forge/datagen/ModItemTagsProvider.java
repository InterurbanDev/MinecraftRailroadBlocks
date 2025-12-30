package dev.interurban.forge.datagen;

import dev.interurban.RailroadBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import static dev.interurban.datagen.ItemTagHandler.ITEM_TAG_LIST;
import static dev.interurban.datagen.ItemTagHandler.getItemsToTag;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, blockTags, RailroadBlocks.MOD_ID, existingFileHelper);
    }

    // Add your tag entries here.
    @Override
    protected void addTags() {
        for (TagKey<Item> tag : ITEM_TAG_LIST) {
            for (Item item : getItemsToTag(tag)) {
                tag(tag).add(item);
            }
        }
    }
}
