package io.github.samthegamer39.railroadblocks.core.init;

import io.github.samthegamer39.railroadblocks.RailroadBlocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RailroadBlocks.MOD_ID);

    public static final RegistryObject<BlockItem> WOODEN_CROSSBUCK = ITEMS.register("wooden_crossbuck",
            () -> new BlockItem(BlockInit.WOODEN_CROSSBUCK.get(), new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<BlockItem> IRON_CROSSBUCK = ITEMS.register("iron_crossbuck",
            () -> new BlockItem(BlockInit.IRON_CROSSBUCK.get(), new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<BlockItem> RXR_ADVANCE = ITEMS.register("rxr_advance_sign",
            () -> new BlockItem(BlockInit.RXR_ADVANCE.get(), new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<BlockItem> WOODEN_POLE = ITEMS.register("wooden_pole",
            () -> new BlockItem(BlockInit.WOODEN_POLE.get(), new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

    public static final RegistryObject<BlockItem> IRON_POLE = ITEMS.register("iron_pole",
            () -> new BlockItem(BlockInit.IRON_POLE.get(), new Item.Properties().tab(ItemGroup.TAB_TRANSPORTATION)));

}
