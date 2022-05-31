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

package dk.magnusjensen.shulker_utilities.items;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.ShulkerBoxTileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.items.CapabilityItemHandler;

public class ShulkerDisassemblyToolkitItem extends Item {
  public ShulkerDisassemblyToolkitItem(Properties pProperties) {
    super(pProperties);
  }

  @Override
  public ActionResultType useOn(ItemUseContext pContext) {
    BlockState state = pContext.getLevel().getBlockState(pContext.getClickedPos());
    if (state.getBlock().is(BlockTags.SHULKER_BOXES)) {
      ShulkerBoxTileEntity shulkerTE =
          (ShulkerBoxTileEntity) pContext.getLevel().getBlockEntity(pContext.getClickedPos());
      List<ItemStack> stacks = new ArrayList<>();
      for (int i = 0; i < 27; i++) {
        stacks.add(shulkerTE.removeItem(i, 64));
      }

      pContext.getLevel().removeBlock(pContext.getClickedPos(), false);

      BlockState chestState = Blocks.CHEST.defaultBlockState();

      SoundType soundType =
          chestState.getSoundType(
              pContext.getLevel(), pContext.getClickedPos(), pContext.getPlayer());

      pContext
          .getLevel()
          .playSound(
              pContext.getPlayer(),
              pContext.getClickedPos(),
              soundType.getPlaceSound(),
              SoundCategory.BLOCKS,
              (soundType.getVolume() + 1.0F) / 2.0F,
              soundType.getPitch() * 0.8F);
      pContext.getLevel().setBlock(pContext.getClickedPos(), chestState, 3);
      ChestTileEntity chestTe =
          (ChestTileEntity) pContext.getLevel().getBlockEntity(pContext.getClickedPos());

      chestTe
          .getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
          .ifPresent(
              (handler) -> {
                for (int i = 0; i < 27; i++) {
                  handler.insertItem(i, stacks.get(i), false);
                }
              });

      pContext
          .getLevel()
          .addFreshEntity(
              new ItemEntity(
                  pContext.getLevel(),
                  pContext.getClickedPos().getX(),
                  pContext.getClickedPos().getY(),
                  pContext.getClickedPos().getZ(),
                  new ItemStack(Items.SHULKER_SHELL, 2)));

      return ActionResultType.CONSUME;
    }
    return super.useOn(pContext);
  }
}
