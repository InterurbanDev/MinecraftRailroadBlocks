package dev.interurban.RailroadBlocks.objects.items;

import dev.interurban.RailroadBlocks.RailroadBlocks;
import dev.interurban.RailroadBlocks.init.ItemInit;
import dev.interurban.RailroadBlocks.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RailroadBlocks.RAILROAD_BLOCKS_TAB);

		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		RailroadBlocks.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
