package io.github.samthegamer39.registers;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.samthegamer39.RailroadBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabRegister {
	public static final DeferredRegister<CreativeModeTab> TABS =
			DeferredRegister.create(RailroadBlocks.MOD_ID, Registries.CREATIVE_MODE_TAB);

	public static final RegistrySupplier<CreativeModeTab> RAILROAD_BLOCKS_TAB = TABS.register(
			"railroad_blocks_tab",
			() -> CreativeTabRegistry.create(
					Component.translatable("itemGroup.railroadblocksaddon.general"),
					() -> new ItemStack(ItemRegister.SIGN_CROSSBUCK_WOODEN.get())
			)
	);
}
