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

package dk.magnusjensen.shulker_utilities.items;

import dk.magnusjensen.shulker_utilities.config.CommonConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.SoundType;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.ShulkerBoxTileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.Tags;
import net.minecraftforge.items.CapabilityItemHandler;

public class ShulkerAssemblyKitItem extends Item {
  public ShulkerAssemblyKitItem(Properties pProperties) {
    super(pProperties);
  }

  /**
   * Called when this item is used when targetting a Block
   *
   * @param pContext
   */
  @Override
  public ActionResultType useOn(ItemUseContext pContext) {
    BlockState state = pContext.getLevel().getBlockState(pContext.getClickedPos());
    if (state.getBlock().is(Tags.Blocks.CHESTS_WOODEN)) {
      ChestTileEntity chesTe =
          (ChestTileEntity) pContext.getLevel().getBlockEntity(pContext.getClickedPos());
      List<ItemStack> stacks = new ArrayList<>();
      chesTe
          .getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
          .ifPresent(
              (handler) -> {
                for (int i = 0; i < 27; i++) {
                  stacks.add(handler.extractItem(i, 64, false));
                }
              });

      pContext.getLevel().removeBlock(pContext.getClickedPos(), false);

      DyeColor color = null;
      if (CommonConfig.rainbowShulkers.get()) {
        color = DyeColor.byId(MathHelper.nextInt(new Random(), 0, 15));
      }

      BlockState shulkerState = ShulkerBoxBlock.getBlockByColor(color).defaultBlockState();

      SoundType soundType =
          shulkerState.getSoundType(
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
      pContext.getLevel().setBlock(pContext.getClickedPos(), shulkerState, 3);
      ShulkerBoxTileEntity shulkerTe =
          (ShulkerBoxTileEntity) pContext.getLevel().getBlockEntity(pContext.getClickedPos());
      for (int i = 0; i < 27; i++) {
        shulkerTe.setItem(i, stacks.get(i));
      }

      if (!pContext.getPlayer().isCreative()) {
        pContext.getItemInHand().shrink(1);
      }

      return ActionResultType.CONSUME;
    }
    return super.useOn(pContext);
  }
}
