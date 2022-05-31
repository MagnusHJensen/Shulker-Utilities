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

package dk.magnusjensen.shulker_utilities;

import dk.magnusjensen.shulker_utilities.config.CommonConfig;
import dk.magnusjensen.shulker_utilities.registry.ModBlocks;
import dk.magnusjensen.shulker_utilities.registry.ModItems;
import dk.magnusjensen.shulker_utilities.registry.ModTileEntities;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("shulker_utilities")
public class ShulkerUtilities {

	// Directly reference a log4j logger.
	public static final String MOD_ID = "shulker_utilities";
	public static final Logger LOGGER = LogManager.getLogger();

	public ShulkerUtilities() {
		ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModTileEntities.TILE_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());

		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.GENERAL_SPEC, "shulker-utilities-common.toml");

		MinecraftForge.EVENT_BUS.register(this);
	}
}
