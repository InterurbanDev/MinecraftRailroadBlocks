package io.github.samthegamer39.railroadblocks.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static io.github.samthegamer39.railroadblocks.common.init.BlockInit.WOODEN_CROSSBUCK_BLOCK;
import static io.github.samthegamer39.railroadblocks.common.init.ItemInit.RAILROAD_BLOCKS_ITEMS;

/**
 * Initializes the creative mode tab with all items.
 */
public class CreativeTabInit {

	// Creates the creative mode tab
	public static final CreativeModeTab RAILROAD_BLOCKS_TAB = FabricItemGroup.builder() // Creates an ItemGroup for the mod.
			.title(Component.translatable("itemGroup.railroadblocksaddon.general"))
			.icon(() -> new ItemStack(WOODEN_CROSSBUCK_BLOCK))
			.displayItems((context, output) -> {
				RAILROAD_BLOCKS_ITEMS.forEach(output::accept);
			})
			.build();
}
