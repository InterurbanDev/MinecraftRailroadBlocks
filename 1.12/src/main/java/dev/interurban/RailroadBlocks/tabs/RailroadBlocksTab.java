package dev.interurban.RailroadBlocks.tabs;

import dev.interurban.RailroadBlocks.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RailroadBlocksTab extends CreativeTabs {
	public RailroadBlocksTab(String label) {
		super("railroadblockstab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(BlockInit.SIGN_CROSSBUCK_WOODEN);
	}
}
