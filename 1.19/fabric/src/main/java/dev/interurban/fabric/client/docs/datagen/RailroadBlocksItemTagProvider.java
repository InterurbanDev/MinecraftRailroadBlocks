package dev.interurban.fabric.client.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static dev.interurban.datagen.ItemTagHandler.ITEM_TAG_LIST;
import static dev.interurban.datagen.ItemTagHandler.getItemsToTag;

public class RailroadBlocksItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public RailroadBlocksItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        for (TagKey<Item> tag : ITEM_TAG_LIST) {
            for (Item item : getItemsToTag(tag)) {
                getOrCreateTagBuilder(tag).add(item);
            }
        }
    }
}
