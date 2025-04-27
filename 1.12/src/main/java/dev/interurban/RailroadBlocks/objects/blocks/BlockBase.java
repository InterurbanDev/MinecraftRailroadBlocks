package dev.interurban.RailroadBlocks.objects.blocks;

import dev.interurban.RailroadBlocks.RailroadBlocks;
import dev.interurban.RailroadBlocks.init.BlockInit;
import dev.interurban.RailroadBlocks.init.ItemInit;
import dev.interurban.RailroadBlocks.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RailroadBlocks.RAILROAD_BLOCKS_TAB);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		RailroadBlocks.proxy.registerItemRenderer(ItemBlock.getItemFromBlock(this), 0, "inventory");
	}
}
