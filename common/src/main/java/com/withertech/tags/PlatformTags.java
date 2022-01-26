/*
 * Mine Tags
 * Copyright (C) 2022 WitherTech
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
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.withertech.tags;

import com.withertech.MineTags;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class PlatformTags
{
	public static void init()
	{
		PlatformTags.Blocks.init();
		PlatformTags.Items.init();
		PlatformTags.Fluids.init();
		MineTags.LOGGER.info("Initialized Tags!");
	}

	public static class Blocks
	{
		public static Tag.Named<Block> BARRELS;
		public static Tag.Named<Block> BARRELS_WOODEN;
		public static Tag.Named<Block> CHESTS;
		public static Tag.Named<Block> CHESTS_ENDER;
		public static Tag.Named<Block> CHESTS_TRAPPED;
		public static Tag.Named<Block> CHESTS_WOODEN;
		public static Tag.Named<Block> COBBLESTONE;
		public static Tag.Named<Block> END_STONES;
		public static Tag.Named<Block> ENDERMAN_PLACE_ON_BLACKLIST;
		public static Tag.Named<Block> FENCE_GATES;
		public static Tag.Named<Block> FENCE_GATES_WOODEN;
		public static Tag.Named<Block> FENCES;
		public static Tag.Named<Block> FENCES_NETHER_BRICK;
		public static Tag.Named<Block> FENCES_WOODEN;
		public static Tag.Named<Block> GLASS;
		public static Tag.Named<Block> GLASS_BLACK;
		public static Tag.Named<Block> GLASS_BLUE;
		public static Tag.Named<Block> GLASS_BROWN;
		public static Tag.Named<Block> GLASS_COLORLESS;
		public static Tag.Named<Block> GLASS_CYAN;
		public static Tag.Named<Block> GLASS_GRAY;
		public static Tag.Named<Block> GLASS_GREEN;
		public static Tag.Named<Block> GLASS_LIGHT_BLUE;
		public static Tag.Named<Block> GLASS_LIGHT_GRAY;
		public static Tag.Named<Block> GLASS_LIME;
		public static Tag.Named<Block> GLASS_MAGENTA;
		public static Tag.Named<Block> GLASS_ORANGE;
		public static Tag.Named<Block> GLASS_PINK;
		public static Tag.Named<Block> GLASS_PURPLE;
		public static Tag.Named<Block> GLASS_RED;
		public static Tag.Named<Block> GLASS_SILICA;
		public static Tag.Named<Block> GLASS_TINTED;
		public static Tag.Named<Block> GLASS_WHITE;
		public static Tag.Named<Block> GLASS_YELLOW;
		public static Tag.Named<Block> GLASS_PANES;
		public static Tag.Named<Block> GLASS_PANES_BLACK;
		public static Tag.Named<Block> GLASS_PANES_BLUE;
		public static Tag.Named<Block> GLASS_PANES_BROWN;
		public static Tag.Named<Block> GLASS_PANES_COLORLESS;
		public static Tag.Named<Block> GLASS_PANES_CYAN;
		public static Tag.Named<Block> GLASS_PANES_GRAY;
		public static Tag.Named<Block> GLASS_PANES_GREEN;
		public static Tag.Named<Block> GLASS_PANES_LIGHT_BLUE;
		public static Tag.Named<Block> GLASS_PANES_LIGHT_GRAY;
		public static Tag.Named<Block> GLASS_PANES_LIME;
		public static Tag.Named<Block> GLASS_PANES_MAGENTA;
		public static Tag.Named<Block> GLASS_PANES_ORANGE;
		public static Tag.Named<Block> GLASS_PANES_PINK;
		public static Tag.Named<Block> GLASS_PANES_PURPLE;
		public static Tag.Named<Block> GLASS_PANES_RED;
		public static Tag.Named<Block> GLASS_PANES_WHITE;
		public static Tag.Named<Block> GLASS_PANES_YELLOW;
		public static Tag.Named<Block> GRAVEL;
		public static Tag.Named<Block> NETHERRACK;
		public static Tag.Named<Block> OBSIDIAN;
		public static Tag.Named<Block> ORE_BEARING_GROUND_DEEPSLATE;
		public static Tag.Named<Block> ORE_BEARING_GROUND_NETHERRACK;
		public static Tag.Named<Block> ORE_BEARING_GROUND_STONE;
		public static Tag.Named<Block> ORE_RATES_DENSE;
		public static Tag.Named<Block> ORE_RATES_SINGULAR;
		public static Tag.Named<Block> ORE_RATES_SPARSE;
		public static Tag.Named<Block> ORES;
		public static Tag.Named<Block> ORES_COAL;
		public static Tag.Named<Block> ORES_COPPER;
		public static Tag.Named<Block> ORES_DIAMOND;
		public static Tag.Named<Block> ORES_EMERALD;
		public static Tag.Named<Block> ORES_GOLD;
		public static Tag.Named<Block> ORES_IRON;
		public static Tag.Named<Block> ORES_LAPIS;
		public static Tag.Named<Block> ORES_NETHERITE_SCRAP;
		public static Tag.Named<Block> ORES_QUARTZ;
		public static Tag.Named<Block> ORES_REDSTONE;
		public static Tag.Named<Block> ORES_IN_GROUND_DEEPSLATE;
		public static Tag.Named<Block> ORES_IN_GROUND_NETHERRACK;
		public static Tag.Named<Block> ORES_IN_GROUND_STONE;
		public static Tag.Named<Block> SAND;
		public static Tag.Named<Block> SAND_COLORLESS;
		public static Tag.Named<Block> SAND_RED;
		public static Tag.Named<Block> SANDSTONE;
		public static Tag.Named<Block> STAINED_GLASS;
		public static Tag.Named<Block> STAINED_GLASS_PANES;
		public static Tag.Named<Block> STONE;
		public static Tag.Named<Block> STORAGE_BLOCKS;
		public static Tag.Named<Block> STORAGE_BLOCKS_AMETHYST;
		public static Tag.Named<Block> STORAGE_BLOCKS_COAL;
		public static Tag.Named<Block> STORAGE_BLOCKS_COPPER;
		public static Tag.Named<Block> STORAGE_BLOCKS_DIAMOND;
		public static Tag.Named<Block> STORAGE_BLOCKS_EMERALD;
		public static Tag.Named<Block> STORAGE_BLOCKS_GOLD;
		public static Tag.Named<Block> STORAGE_BLOCKS_IRON;
		public static Tag.Named<Block> STORAGE_BLOCKS_LAPIS;
		public static Tag.Named<Block> STORAGE_BLOCKS_NETHERITE;
		public static Tag.Named<Block> STORAGE_BLOCKS_QUARTZ;
		public static Tag.Named<Block> STORAGE_BLOCKS_RAW_COPPER;
		public static Tag.Named<Block> STORAGE_BLOCKS_RAW_GOLD;
		public static Tag.Named<Block> STORAGE_BLOCKS_RAW_IRON;
		public static Tag.Named<Block> STORAGE_BLOCKS_REDSTONE;
		public static Tag.Named<Block> NEEDS_WOOD_TOOL;
		public static Tag.Named<Block> NEEDS_GOLD_TOOL;
		public static Tag.Named<Block> NEEDS_NETHERITE_TOOL;

		@ExpectPlatform
		private static void init()
		{
		}
	}

	public static class Items
	{
		public static Tag.Named<Item> BARRELS;
		public static Tag.Named<Item> BARRELS_WOODEN;
		public static Tag.Named<Item> BONES;
		public static Tag.Named<Item> BOOKSHELVES;
		public static Tag.Named<Item> CHESTS;
		public static Tag.Named<Item> CHESTS_ENDER;
		public static Tag.Named<Item> CHESTS_TRAPPED;
		public static Tag.Named<Item> CHESTS_WOODEN;
		public static Tag.Named<Item> COBBLESTONE;
		public static Tag.Named<Item> CROPS;
		public static Tag.Named<Item> CROPS_BEETROOT;
		public static Tag.Named<Item> CROPS_CARROT;
		public static Tag.Named<Item> CROPS_NETHER_WART;
		public static Tag.Named<Item> CROPS_POTATO;
		public static Tag.Named<Item> CROPS_WHEAT;
		public static Tag.Named<Item> DUSTS;
		public static Tag.Named<Item> DUSTS_PRISMARINE;
		public static Tag.Named<Item> DUSTS_REDSTONE;
		public static Tag.Named<Item> DUSTS_GLOWSTONE;
		public static Tag.Named<Item> DYES;
		public static Tag.Named<Item> DYES_BLACK;
		public static Tag.Named<Item> DYES_RED;
		public static Tag.Named<Item> DYES_GREEN;
		public static Tag.Named<Item> DYES_BROWN;
		public static Tag.Named<Item> DYES_BLUE;
		public static Tag.Named<Item> DYES_PURPLE;
		public static Tag.Named<Item> DYES_CYAN;
		public static Tag.Named<Item> DYES_LIGHT_GRAY;
		public static Tag.Named<Item> DYES_GRAY;
		public static Tag.Named<Item> DYES_PINK;
		public static Tag.Named<Item> DYES_LIME;
		public static Tag.Named<Item> DYES_YELLOW;
		public static Tag.Named<Item> DYES_LIGHT_BLUE;
		public static Tag.Named<Item> DYES_MAGENTA;
		public static Tag.Named<Item> DYES_ORANGE;
		public static Tag.Named<Item> DYES_WHITE;
		public static Tag.Named<Item> EGGS;
		public static Tag.Named<Item> ENCHANTING_FUELS;
		public static Tag.Named<Item> END_STONES;
		public static Tag.Named<Item> ENDER_PEARLS;
		public static Tag.Named<Item> FEATHERS;
		public static Tag.Named<Item> FENCE_GATES;
		public static Tag.Named<Item> FENCE_GATES_WOODEN;
		public static Tag.Named<Item> FENCES;
		public static Tag.Named<Item> FENCES_NETHER_BRICK;
		public static Tag.Named<Item> FENCES_WOODEN;
		public static Tag.Named<Item> GEMS;
		public static Tag.Named<Item> GEMS_DIAMOND;
		public static Tag.Named<Item> GEMS_EMERALD;
		public static Tag.Named<Item> GEMS_AMETHYST;
		public static Tag.Named<Item> GEMS_LAPIS;
		public static Tag.Named<Item> GEMS_PRISMARINE;
		public static Tag.Named<Item> GEMS_QUARTZ;
		public static Tag.Named<Item> GLASS;
		public static Tag.Named<Item> GLASS_BLACK;
		public static Tag.Named<Item> GLASS_BLUE;
		public static Tag.Named<Item> GLASS_BROWN;
		public static Tag.Named<Item> GLASS_COLORLESS;
		public static Tag.Named<Item> GLASS_CYAN;
		public static Tag.Named<Item> GLASS_GRAY;
		public static Tag.Named<Item> GLASS_GREEN;
		public static Tag.Named<Item> GLASS_LIGHT_BLUE;
		public static Tag.Named<Item> GLASS_LIGHT_GRAY;
		public static Tag.Named<Item> GLASS_LIME;
		public static Tag.Named<Item> GLASS_MAGENTA;
		public static Tag.Named<Item> GLASS_ORANGE;
		public static Tag.Named<Item> GLASS_PINK;
		public static Tag.Named<Item> GLASS_PURPLE;
		public static Tag.Named<Item> GLASS_RED;
		public static Tag.Named<Item> GLASS_SILICA;
		public static Tag.Named<Item> GLASS_TINTED;
		public static Tag.Named<Item> GLASS_WHITE;
		public static Tag.Named<Item> GLASS_YELLOW;
		public static Tag.Named<Item> GLASS_PANES;
		public static Tag.Named<Item> GLASS_PANES_BLACK;
		public static Tag.Named<Item> GLASS_PANES_BLUE;
		public static Tag.Named<Item> GLASS_PANES_BROWN;
		public static Tag.Named<Item> GLASS_PANES_COLORLESS;
		public static Tag.Named<Item> GLASS_PANES_CYAN;
		public static Tag.Named<Item> GLASS_PANES_GRAY;
		public static Tag.Named<Item> GLASS_PANES_GREEN;
		public static Tag.Named<Item> GLASS_PANES_LIGHT_BLUE;
		public static Tag.Named<Item> GLASS_PANES_LIGHT_GRAY;
		public static Tag.Named<Item> GLASS_PANES_LIME;
		public static Tag.Named<Item> GLASS_PANES_MAGENTA;
		public static Tag.Named<Item> GLASS_PANES_ORANGE;
		public static Tag.Named<Item> GLASS_PANES_PINK;
		public static Tag.Named<Item> GLASS_PANES_PURPLE;
		public static Tag.Named<Item> GLASS_PANES_RED;
		public static Tag.Named<Item> GLASS_PANES_WHITE;
		public static Tag.Named<Item> GLASS_PANES_YELLOW;
		public static Tag.Named<Item> GRAVEL;
		public static Tag.Named<Item> GUNPOWDER;
		public static Tag.Named<Item> HEADS;
		public static Tag.Named<Item> INGOTS;
		public static Tag.Named<Item> INGOTS_BRICK;
		public static Tag.Named<Item> INGOTS_COPPER;
		public static Tag.Named<Item> INGOTS_GOLD;
		public static Tag.Named<Item> INGOTS_IRON;
		public static Tag.Named<Item> INGOTS_NETHERITE;
		public static Tag.Named<Item> INGOTS_NETHER_BRICK;
		public static Tag.Named<Item> LEATHER;
		public static Tag.Named<Item> MUSHROOMS;
		public static Tag.Named<Item> NETHER_STARS;
		public static Tag.Named<Item> NETHERRACK;
		public static Tag.Named<Item> NUGGETS;
		public static Tag.Named<Item> NUGGETS_GOLD;
		public static Tag.Named<Item> NUGGETS_IRON;
		public static Tag.Named<Item> OBSIDIAN;
		public static Tag.Named<Item> ORE_BEARING_GROUND_DEEPSLATE;
		public static Tag.Named<Item> ORE_BEARING_GROUND_NETHERRACK;
		public static Tag.Named<Item> ORE_BEARING_GROUND_STONE;
		public static Tag.Named<Item> ORE_RATES_DENSE;
		public static Tag.Named<Item> ORE_RATES_SINGULAR;
		public static Tag.Named<Item> ORE_RATES_SPARSE;
		public static Tag.Named<Item> ORES;
		public static Tag.Named<Item> ORES_COAL;
		public static Tag.Named<Item> ORES_COPPER;
		public static Tag.Named<Item> ORES_DIAMOND;
		public static Tag.Named<Item> ORES_EMERALD;
		public static Tag.Named<Item> ORES_GOLD;
		public static Tag.Named<Item> ORES_IRON;
		public static Tag.Named<Item> ORES_LAPIS;
		public static Tag.Named<Item> ORES_NETHERITE_SCRAP;
		public static Tag.Named<Item> ORES_QUARTZ;
		public static Tag.Named<Item> ORES_REDSTONE;
		public static Tag.Named<Item> ORES_IN_GROUND_DEEPSLATE;
		public static Tag.Named<Item> ORES_IN_GROUND_NETHERRACK;
		public static Tag.Named<Item> ORES_IN_GROUND_STONE;
		public static Tag.Named<Item> RAW_MATERIALS;
		public static Tag.Named<Item> RAW_MATERIALS_COPPER;
		public static Tag.Named<Item> RAW_MATERIALS_GOLD;
		public static Tag.Named<Item> RAW_MATERIALS_IRON;
		public static Tag.Named<Item> RODS;
		public static Tag.Named<Item> RODS_BLAZE;
		public static Tag.Named<Item> RODS_WOODEN;
		public static Tag.Named<Item> SAND;
		public static Tag.Named<Item> SAND_COLORLESS;
		public static Tag.Named<Item> SAND_RED;
		public static Tag.Named<Item> SANDSTONE;
		public static Tag.Named<Item> SEEDS;
		public static Tag.Named<Item> SEEDS_BEETROOT;
		public static Tag.Named<Item> SEEDS_MELON;
		public static Tag.Named<Item> SEEDS_PUMPKIN;
		public static Tag.Named<Item> SEEDS_WHEAT;
		public static Tag.Named<Item> SHEARS;
		public static Tag.Named<Item> SLIMEBALLS;
		public static Tag.Named<Item> STAINED_GLASS;
		public static Tag.Named<Item> STAINED_GLASS_PANES;
		public static Tag.Named<Item> STONE;
		public static Tag.Named<Item> STORAGE_BLOCKS;
		public static Tag.Named<Item> STORAGE_BLOCKS_AMETHYST;
		public static Tag.Named<Item> STORAGE_BLOCKS_COAL;
		public static Tag.Named<Item> STORAGE_BLOCKS_COPPER;
		public static Tag.Named<Item> STORAGE_BLOCKS_DIAMOND;
		public static Tag.Named<Item> STORAGE_BLOCKS_EMERALD;
		public static Tag.Named<Item> STORAGE_BLOCKS_GOLD;
		public static Tag.Named<Item> STORAGE_BLOCKS_IRON;
		public static Tag.Named<Item> STORAGE_BLOCKS_LAPIS;
		public static Tag.Named<Item> STORAGE_BLOCKS_NETHERITE;
		public static Tag.Named<Item> STORAGE_BLOCKS_QUARTZ;
		public static Tag.Named<Item> STORAGE_BLOCKS_RAW_COPPER;
		public static Tag.Named<Item> STORAGE_BLOCKS_RAW_GOLD;
		public static Tag.Named<Item> STORAGE_BLOCKS_RAW_IRON;
		public static Tag.Named<Item> STORAGE_BLOCKS_REDSTONE;
		public static Tag.Named<Item> STRING;

		@ExpectPlatform
		private static void init()
		{
		}
	}

	public static class Fluids
	{
		public static Tag.Named<Fluid> MILK;

		@ExpectPlatform
		private static void init()
		{
		}
	}
}
