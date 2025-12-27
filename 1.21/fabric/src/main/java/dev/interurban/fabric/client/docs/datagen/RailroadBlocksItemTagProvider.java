package dev.interurban.fabric.client.docs.datagen;

import dev.interurban.RailroadBlocks;
import dev.interurban.registers.ItemRegister;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class RailroadBlocksItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public RailroadBlocksItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Item> FLAGS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(RailroadBlocks.MOD_ID, "flags"));
    public static final TagKey<Item> POLES = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(RailroadBlocks.MOD_ID, "poles"));
    public static final TagKey<Item> SIGNS = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(RailroadBlocks.MOD_ID, "signs"));

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(FLAGS)
                .add(ItemRegister.FLAG_BLUE.get())
                .add(ItemRegister.FLAG_GREEN.get())
                .add(ItemRegister.FLAG_RED.get())
                .add(ItemRegister.FLAG_YELLOW.get())
                .setReplace(true);
        getOrCreateTagBuilder(POLES)
                .add(ItemRegister.POLE_IRON.get())
                .add(ItemRegister.POLE_WOODEN.get())
                .setReplace(true);
        getOrCreateTagBuilder(SIGNS)
                .add(ItemRegister.SIGN_CROSSBUCK_IRON.get())
                .add(ItemRegister.SIGN_CROSSBUCK_WOODEN.get())
                .add(ItemRegister.SIGN_RXR_ADVANCE.get())
                .add(ItemRegister.SIGN_WHISTLE.get())
                .add(ItemRegister.SIGN_WHISTLE_OLD.get())
                .setReplace(true);
    }
}
