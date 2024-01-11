package io.github.samthegamer39.railroadblocks.common.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static io.github.samthegamer39.railroadblocks.common.init.ItemInit.WOODEN_CROSSBUCK_ITEM;

/**
 * Creates a tab in the creative inventory and adds the mod's blocks to that tab.
 */
public class TabInit {

	/**
	 * Creates a creative mode inventory tab.
	 */
	public static class RailroadBlocksTab extends CreativeModeTab {

		public RailroadBlocksTab(int length, String label) {
			super(length, label);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(WOODEN_CROSSBUCK_ITEM);
		}
	}
}
