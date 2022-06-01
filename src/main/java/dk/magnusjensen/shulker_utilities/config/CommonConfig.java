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

package dk.magnusjensen.shulker_utilities.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
  public static final ForgeConfigSpec GENERAL_SPEC;

  static {
    ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
    setupConfig(configBuilder);
    GENERAL_SPEC = configBuilder.build();
  }

  public static ForgeConfigSpec.BooleanValue rainbowShulkers;

  private static void setupConfig(ForgeConfigSpec.Builder builder) {
    rainbowShulkers =
        builder
            .comment(
                "Wether or not a random coloured shulker should appear when using the assembly"
                    + " kit.")
            .define("rainbowShulkers", true);
  }
}
