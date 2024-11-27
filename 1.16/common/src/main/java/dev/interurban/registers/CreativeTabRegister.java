package dev.interurban.registers;

import me.shedaniel.architectury.registry.CreativeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static dev.interurban.RailroadBlocks.MOD_ID;

public class CreativeTabRegister {
	public static final CreativeModeTab RAILROAD_BLOCKS_TAB = CreativeTabs.create(
			new ResourceLocation(MOD_ID, "general"), // Tab ID
			() -> new ItemStack(ItemRegister.SIGN_CROSSBUCK_WOODEN.get()) // Icon
	);
}
