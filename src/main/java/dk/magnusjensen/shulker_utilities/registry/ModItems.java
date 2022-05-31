/*
 * Copyright (C) 2022  legenden
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package dk.magnusjensen.shulker_utilities.registry;

import dk.magnusjensen.shulker_utilities.ShulkerUtilities;
import dk.magnusjensen.shulker_utilities.items.ShulkerAssemblyKitItem;
import dk.magnusjensen.shulker_utilities.items.ShulkerDisassemblyToolkitItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShulkerUtilities.MOD_ID);


	public static final RegistryObject<Item> SHULKER_ASSEMBLY_KIT = ITEMS.register("shulker_assembly_kit", () -> new ShulkerAssemblyKitItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> SHULKER_DISASSEMBLY_TOOLKIT = ITEMS.register("shulker_disassembly_toolkit", () -> new ShulkerDisassemblyToolkitItem(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1)));
}
