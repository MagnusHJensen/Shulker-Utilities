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

package dk.magnusjensen.shulker_utilities.client.util;

import dk.magnusjensen.shulker_utilities.ShulkerUtilities;
import dk.magnusjensen.shulker_utilities.registry.ModTileEntities;
import net.minecraft.client.renderer.entity.model.ShulkerModel;
import net.minecraft.client.renderer.tileentity.ShulkerBoxTileEntityRenderer;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ShulkerUtilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler {

  @SubscribeEvent
  public static void onClientSetup(FMLClientSetupEvent event) {
    event.enqueueWork(
        () -> {
          ClientRegistry.bindTileEntityRenderer(
              ModTileEntities.SHULKER_BOX_CACTUS.get(),
              (dispatcher) -> new ShulkerBoxTileEntityRenderer(new ShulkerModel<>(), dispatcher));
        });
  }
}
