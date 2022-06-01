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

package dk.magnusjensen.shulker_utilities.tileentity;

import dk.magnusjensen.shulker_utilities.registry.ModTileEntities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.ShulkerBoxTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ShulkerBoxCactusTileEntity extends ShulkerBoxTileEntity {

	public ShulkerBoxCactusTileEntity(@Nullable DyeColor p_i47242_1_) {
		super(p_i47242_1_);
	}

	public ShulkerBoxCactusTileEntity() {
		this(null);
	}

	@Override
	public TileEntityType<?> getType() {
		return ModTileEntities.SHULKER_BOX_CACTUS.get();
	}

	@Override
	public void startOpen(PlayerEntity pPlayer) {
		super.startOpen(pPlayer);
	}




	@Override
	protected IItemHandler createUnSidedHandler() {
		return new SidedInvWrapper(this, Direction.UP) {
			@Nonnull
			@Override
			public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
				if (!this.inv.canPlaceItemThroughFace(slot, stack, Direction.UP) || !this.inv.canPlaceItem(slot, stack)) {
					return stack;
				}
				return ItemStack.EMPTY;
			}
		};
	}


}
