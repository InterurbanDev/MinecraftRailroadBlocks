package dev.interurban.fabric.client.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

import static dev.interurban.datagen.ItemTagHandler.ITEM_TAG_LIST;
import static dev.interurban.datagen.ItemTagHandler.getItemsToTag;

public class RailroadBlocksItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public RailroadBlocksItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        for (TagKey<Item> tag : ITEM_TAG_LIST) {
            for (Item item : getItemsToTag(tag)) {
                getOrCreateTagBuilder(tag).add(item);
            }
        }
    }
}
