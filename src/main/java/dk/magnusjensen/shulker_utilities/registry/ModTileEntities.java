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
import dk.magnusjensen.shulker_utilities.tileentity.ShulkerBoxCactusTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {
  public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
      DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ShulkerUtilities.MOD_ID);

  public static final RegistryObject<TileEntityType<ShulkerBoxCactusTileEntity>>
      SHULKER_BOX_CACTUS =
          TILE_ENTITIES.register(
              "shulker_box_cactus",
              () ->
                  TileEntityType.Builder.of(
                          ShulkerBoxCactusTileEntity::new,
                          ModBlocks.SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.WHITE_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.ORANGE_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.MAGENTA_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.LIGHT_BLUE_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.YELLOW_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.LIME_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.PINK_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.GRAY_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.LIGHT_GRAY_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.CYAN_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.PURPLE_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.BLUE_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.BROWN_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.GREEN_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.RED_SHULKER_BOX_CACTUS_BLOCK.get(),
                          ModBlocks.BLACK_SHULKER_BOX_CACTUS_BLOCK.get())
                      .build(null));
}
