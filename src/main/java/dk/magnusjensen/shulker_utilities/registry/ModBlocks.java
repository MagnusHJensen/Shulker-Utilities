/*
 * Copyright (C) 2022  legenden
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
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
import dk.magnusjensen.shulker_utilities.block.ShulkerBoxCactusBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.ShulkerBoxTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ShulkerUtilities.MOD_ID);

	public static final RegistryObject<ShulkerBoxCactusBlock> SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("shulker_box_cactus", null, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> WHITE_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("white_shulker_box_cactus", DyeColor.WHITE, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> ORANGE_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("orange_shulker_box_cactus", DyeColor.ORANGE, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> MAGENTA_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("magenta_shulker_box_cactus", DyeColor.MAGENTA, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> LIGHT_BLUE_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("light_blue_shulker_box_cactus", DyeColor.LIGHT_BLUE, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> YELLOW_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("yellow_shulker_box_cactus", DyeColor.YELLOW, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> LIME_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("lime_shulker_box_cactus", DyeColor.LIME, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> PINK_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("pink_shulker_box_cactus", DyeColor.PINK, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> GRAY_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("gray_shulker_box_cactus", DyeColor.GRAY, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> LIGHT_GRAY_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("light_gray_shulker_box_cactus", DyeColor.LIGHT_GRAY, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> CYAN_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("cyan_shulker_box_cactus", DyeColor.CYAN, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> PURPLE_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("purple_shulker_box_cactus", DyeColor.PURPLE, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> BLUE_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("blue_shulker_box_cactus", DyeColor.BLUE, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> BROWN_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("brown_shulker_box_cactus", DyeColor.BROWN, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> GREEN_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("green_shulker_box_cactus", DyeColor.GREEN, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> RED_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("red_shulker_box_cactus", DyeColor.RED, AbstractBlock.Properties.of(Material.SHULKER_SHELL));
	public static final RegistryObject<ShulkerBoxCactusBlock> BLACK_SHULKER_BOX_CACTUS_BLOCK = shulkerBoxCactus("black_shulker_box_cactus", DyeColor.BLACK, AbstractBlock.Properties.of(Material.SHULKER_SHELL));



	private static RegistryObject<ShulkerBoxCactusBlock> shulkerBoxCactus(String registryName, DyeColor pColor, AbstractBlock.Properties pProperties) {
		AbstractBlock.IPositionPredicate positionPredicate = (p_235444_0_, p_235444_1_, p_235444_2_) -> {
			TileEntity tileentity = p_235444_1_.getBlockEntity(p_235444_2_);
			if (!(tileentity instanceof ShulkerBoxTileEntity)) {
				return true;
			} else {
				ShulkerBoxTileEntity shulkerboxtileentity = (ShulkerBoxTileEntity)tileentity;
				return shulkerboxtileentity.isClosed();
			}
		};
		return BLOCKS.register(registryName, () -> new ShulkerBoxCactusBlock(pColor, pProperties.strength(2.0F).dynamicShape().noOcclusion().isViewBlocking(positionPredicate)));
	}
}
