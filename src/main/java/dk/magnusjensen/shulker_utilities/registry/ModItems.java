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
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShulkerUtilities.MOD_ID);


	public static final RegistryObject<Item> SHULKER_ASSEMBLY_KIT = ITEMS.register("shulker_assembly_kit", () -> new ShulkerAssemblyKitItem(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> SHULKER_DISASSEMBLY_TOOLKIT = ITEMS.register("shulker_disassembly_toolkit", () -> new ShulkerDisassemblyToolkitItem(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1)));

	public static final RegistryObject<BlockItem> SHULKER_BOX_CACTUS = ITEMS.register("shulker_box_cactus", () -> new BlockItem(ModBlocks.SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> WHITE_SHULKER_BOX_CACTUS = ITEMS.register("white_shulker_box_cactus", () -> new BlockItem(ModBlocks.WHITE_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> ORANGE_SHULKER_BOX_CACTUS = ITEMS.register("orange_shulker_box_cactus", () -> new BlockItem(ModBlocks.ORANGE_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> MAGENTA_SHULKER_BOX_CACTUS = ITEMS.register("magenta_shulker_box_cactus", () -> new BlockItem(ModBlocks.MAGENTA_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_SHULKER_BOX_CACTUS = ITEMS.register("light_blue_shulker_box_cactus", () -> new BlockItem(ModBlocks.LIGHT_BLUE_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> YELLOW_SHULKER_BOX_CACTUS = ITEMS.register("yellow_shulker_box_cactus", () -> new BlockItem(ModBlocks.YELLOW_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> LIME_SHULKER_BOX_CACTUS = ITEMS.register("lime_shulker_box_cactus", () -> new BlockItem(ModBlocks.LIME_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> PINK_SHULKER_BOX_CACTUS = ITEMS.register("pink_shulker_box_cactus", () -> new BlockItem(ModBlocks.PINK_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> GRAY_SHULKER_BOX_CACTUS = ITEMS.register("gray_shulker_box_cactus", () -> new BlockItem(ModBlocks.GRAY_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> LIGHT_GRAY_SHULKER_BOX_CACTUS = ITEMS.register("light_gray_shulker_box_cactus", () -> new BlockItem(ModBlocks.LIGHT_GRAY_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> CYAN_SHULKER_BOX_CACTUS = ITEMS.register("cyan_shulker_box_cactus", () -> new BlockItem(ModBlocks.CYAN_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> PURPLE_SHULKER_BOX_CACTUS = ITEMS.register("purple_shulker_box_cactus", () -> new BlockItem(ModBlocks.PURPLE_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> BLUE_SHULKER_BOX_CACTUS = ITEMS.register("blue_shulker_box_cactus", () -> new BlockItem(ModBlocks.BLUE_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> BROWN_SHULKER_BOX_CACTUS = ITEMS.register("brown_shulker_box_cactus", () -> new BlockItem(ModBlocks.BROWN_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> GREEN_SHULKER_BOX_CACTUS = ITEMS.register("green_shulker_box_cactus", () -> new BlockItem(ModBlocks.GREEN_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> RED_SHULKER_BOX_CACTUS = ITEMS.register("red_shulker_box_cactus", () -> new BlockItem(ModBlocks.RED_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	public static final RegistryObject<BlockItem> BLACK_SHULKER_BOX_CACTUS = ITEMS.register("black_shulker_box_cactus", () -> new BlockItem(ModBlocks.BLACK_SHULKER_BOX_CACTUS_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
}
