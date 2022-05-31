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

package dk.magnusjensen.shulker_utilities.block;

import dk.magnusjensen.shulker_utilities.tileentity.ShulkerBoxCactusTileEntity;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.entity.monster.piglin.PiglinTasks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.ShulkerBoxTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class ShulkerBoxCactusBlock extends ShulkerBoxBlock {
  private DyeColor color;

  public ShulkerBoxCactusBlock(@Nullable DyeColor pColor, Properties pProperties) {
    super(pColor, pProperties);
    this.color = pColor;
  }

  @Override
  public TileEntity newBlockEntity(IBlockReader p_196283_1_) {
    return new ShulkerBoxCactusTileEntity(this.color);
  }

  @Override
  public ActionResultType use(
      BlockState pState,
      World pLevel,
      BlockPos pPos,
      PlayerEntity pPlayer,
      Hand pHand,
      BlockRayTraceResult pHit) {
    if (pLevel.isClientSide) {
      return ActionResultType.SUCCESS;
    } else if (pPlayer.isSpectator()) {
      return ActionResultType.CONSUME;
    } else {
      TileEntity tileentity = pLevel.getBlockEntity(pPos);
      if (tileentity instanceof ShulkerBoxTileEntity) {
        ShulkerBoxTileEntity shulkerboxtileentity = (ShulkerBoxTileEntity) tileentity;
        boolean flag;
        if (shulkerboxtileentity.getAnimationStatus()
            == ShulkerBoxTileEntity.AnimationStatus.CLOSED) {
          Direction direction = pState.getValue(FACING);
          flag = pLevel.noCollision(ShulkerAABBHelper.openBoundingBox(pPos, direction));
        } else {
          flag = true;
        }

        if (flag) {
          shulkerboxtileentity.startOpen(pPlayer);
          pPlayer.hurt(DamageSource.CACTUS, 2);
          pPlayer.awardStat(Stats.OPEN_SHULKER_BOX);
          PiglinTasks.angerNearbyPiglins(pPlayer, true);
          shulkerboxtileentity.stopOpen(pPlayer);
        }

        return ActionResultType.CONSUME;
      } else {
        return ActionResultType.PASS;
      }
    }
  }
}
