package dev.interurban.registers;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.interurban.RailroadBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

/**
 * Defines all creative mode tabs and stores them for registry with Minecraft.
 */
public class CreativeTabRegister {
	// Creates a deferred register which each tab will be stored into until it is time to register the tabs.
	public static final DeferredRegister<CreativeModeTab> TABS =
			DeferredRegister.create(RailroadBlocks.MOD_ID, Registries.CREATIVE_MODE_TAB);

	// Creates a creative mode tab for all the items in our mod.
	public static final RegistrySupplier<CreativeModeTab> RAILROAD_BLOCKS_TAB = TABS.register(
			"railroad_blocks_tab", // Tab ID
			() -> CreativeTabRegistry.create(
					Component.translatable("itemGroup.railroadblocksaddon.general"),
					() -> new ItemStack(ItemRegister.SIGN_CROSSBUCK_WOODEN.get())
			)
	);
}
