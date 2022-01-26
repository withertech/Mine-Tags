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

package com.withertech.tags.fabric;

import com.withertech.tags.PlatformTags;
import dev.architectury.hooks.tags.TagHooks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;

public class PlatformTagsBlocksImpl
{
	static
	{
		PlatformTags.Blocks.BARRELS = tag("barrels");
		PlatformTags.Blocks.BARRELS_WOODEN = tag("barrels/wooden");
		PlatformTags.Blocks.CHESTS = tag("chests");
		PlatformTags.Blocks.CHESTS_ENDER = tag("chests/ender");
		PlatformTags.Blocks.CHESTS_TRAPPED = tag("chests/trapped");
		PlatformTags.Blocks.CHESTS_WOODEN = tag("chests/wooden");
		PlatformTags.Blocks.COBBLESTONE = tag("cobblestone");
		PlatformTags.Blocks.END_STONES = tag("end_stones");
		PlatformTags.Blocks.ENDERMAN_PLACE_ON_BLACKLIST = tag("enderman_place_on_blacklist");
		PlatformTags.Blocks.FENCE_GATES = tag("fence_gates");
		PlatformTags.Blocks.FENCE_GATES_WOODEN = tag("fence_gates/wooden");
		PlatformTags.Blocks.FENCES = tag("fences");
		PlatformTags.Blocks.FENCES_NETHER_BRICK = tag("fences/nether_brick");
		PlatformTags.Blocks.FENCES_WOODEN = tag("fences/wooden");
		PlatformTags.Blocks.GLASS = tag("glass");
		PlatformTags.Blocks.GLASS_BLACK = tag("glass/black");
		PlatformTags.Blocks.GLASS_BLUE = tag("glass/blue");
		PlatformTags.Blocks.GLASS_BROWN = tag("glass/brown");
		PlatformTags.Blocks.GLASS_COLORLESS = tag("glass/colorless");
		PlatformTags.Blocks.GLASS_CYAN = tag("glass/cyan");
		PlatformTags.Blocks.GLASS_GRAY = tag("glass/gray");
		PlatformTags.Blocks.GLASS_GREEN = tag("glass/green");
		PlatformTags.Blocks.GLASS_LIGHT_BLUE = tag("glass/light_blue");
		PlatformTags.Blocks.GLASS_LIGHT_GRAY = tag("glass/light_gray");
		PlatformTags.Blocks.GLASS_LIME = tag("glass/lime");
		PlatformTags.Blocks.GLASS_MAGENTA = tag("glass/magenta");
		PlatformTags.Blocks.GLASS_ORANGE = tag("glass/orange");
		PlatformTags.Blocks.GLASS_PINK = tag("glass/pink");
		PlatformTags.Blocks.GLASS_PURPLE = tag("glass/purple");
		PlatformTags.Blocks.GLASS_RED = tag("glass/red");
		PlatformTags.Blocks.GLASS_SILICA = tag("glass/silica");
		PlatformTags.Blocks.GLASS_TINTED = tag("glass/tinted");
		PlatformTags.Blocks.GLASS_WHITE = tag("glass/white");
		PlatformTags.Blocks.GLASS_YELLOW = tag("glass/yellow");
		PlatformTags.Blocks.GLASS_PANES = tag("glass_panes");
		PlatformTags.Blocks.GLASS_PANES_BLACK = tag("glass_panes/black");
		PlatformTags.Blocks.GLASS_PANES_BLUE = tag("glass_panes/blue");
		PlatformTags.Blocks.GLASS_PANES_BROWN = tag("glass_panes/brown");
		PlatformTags.Blocks.GLASS_PANES_COLORLESS = tag("glass_panes/colorless");
		PlatformTags.Blocks.GLASS_PANES_CYAN = tag("glass_panes/cyan");
		PlatformTags.Blocks.GLASS_PANES_GRAY = tag("glass_panes/gray");
		PlatformTags.Blocks.GLASS_PANES_GREEN = tag("glass_panes/green");
		PlatformTags.Blocks.GLASS_PANES_LIGHT_BLUE = tag("glass_panes/light_blue");
		PlatformTags.Blocks.GLASS_PANES_LIGHT_GRAY = tag("glass_panes/light_gray");
		PlatformTags.Blocks.GLASS_PANES_LIME = tag("glass_panes/lime");
		PlatformTags.Blocks.GLASS_PANES_MAGENTA = tag("glass_panes/magenta");
		PlatformTags.Blocks.GLASS_PANES_ORANGE = tag("glass_panes/orange");
		PlatformTags.Blocks.GLASS_PANES_PINK = tag("glass_panes/pink");
		PlatformTags.Blocks.GLASS_PANES_PURPLE = tag("glass_panes/purple");
		PlatformTags.Blocks.GLASS_PANES_RED = tag("glass_panes/red");
		PlatformTags.Blocks.GLASS_PANES_WHITE = tag("glass_panes/white");
		PlatformTags.Blocks.GLASS_PANES_YELLOW = tag("glass_panes/yellow");
		PlatformTags.Blocks.GRAVEL = tag("gravel");
		PlatformTags.Blocks.NETHERRACK = tag("netherrack");
		PlatformTags.Blocks.OBSIDIAN = tag("obsidian");
		PlatformTags.Blocks.ORE_BEARING_GROUND_DEEPSLATE = tag("ore_bearing_ground/deepslate");
		PlatformTags.Blocks.ORE_BEARING_GROUND_NETHERRACK = tag("ore_bearing_ground/netherrack");
		PlatformTags.Blocks.ORE_BEARING_GROUND_STONE = tag("ore_bearing_ground/stone");
		PlatformTags.Blocks.ORE_RATES_DENSE = tag("ore_rates/dense");
		PlatformTags.Blocks.ORE_RATES_SINGULAR = tag("ore_rates/singular");
		PlatformTags.Blocks.ORE_RATES_SPARSE = tag("ore_rates/sparse");
		PlatformTags.Blocks.ORES = tag("ores");
		PlatformTags.Blocks.ORES_COAL = tag("ores/coal");
		PlatformTags.Blocks.ORES_COPPER = tag("ores/copper");
		PlatformTags.Blocks.ORES_DIAMOND = tag("ores/diamond");
		PlatformTags.Blocks.ORES_EMERALD = tag("ores/emerald");
		PlatformTags.Blocks.ORES_GOLD = tag("ores/gold");
		PlatformTags.Blocks.ORES_IRON = tag("ores/iron");
		PlatformTags.Blocks.ORES_LAPIS = tag("ores/lapis");
		PlatformTags.Blocks.ORES_NETHERITE_SCRAP = tag("ores/netherite_scrap");
		PlatformTags.Blocks.ORES_QUARTZ = tag("ores/quartz");
		PlatformTags.Blocks.ORES_REDSTONE = tag("ores/redstone");
		PlatformTags.Blocks.ORES_IN_GROUND_DEEPSLATE = tag("ores_in_ground/deepslate");
		PlatformTags.Blocks.ORES_IN_GROUND_NETHERRACK = tag("ores_in_ground/netherrack");
		PlatformTags.Blocks.ORES_IN_GROUND_STONE = tag("ores_in_ground/stone");
		PlatformTags.Blocks.SAND = tag("sand");
		PlatformTags.Blocks.SAND_COLORLESS = tag("sand/colorless");
		PlatformTags.Blocks.SAND_RED = tag("sand/red");
		PlatformTags.Blocks.SANDSTONE = tag("sandstone");
		PlatformTags.Blocks.STAINED_GLASS = tag("stained_glass");
		PlatformTags.Blocks.STAINED_GLASS_PANES = tag("stained_glass_panes");
		PlatformTags.Blocks.STONE = tag("stone");
		PlatformTags.Blocks.STORAGE_BLOCKS = tag("storage_blocks");
		PlatformTags.Blocks.STORAGE_BLOCKS_AMETHYST = tag("storage_blocks/amethyst");
		PlatformTags.Blocks.STORAGE_BLOCKS_COAL = tag("storage_blocks/coal");
		PlatformTags.Blocks.STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
		PlatformTags.Blocks.STORAGE_BLOCKS_DIAMOND = tag("storage_blocks/diamond");
		PlatformTags.Blocks.STORAGE_BLOCKS_EMERALD = tag("storage_blocks/emerald");
		PlatformTags.Blocks.STORAGE_BLOCKS_GOLD = tag("storage_blocks/gold");
		PlatformTags.Blocks.STORAGE_BLOCKS_IRON = tag("storage_blocks/iron");
		PlatformTags.Blocks.STORAGE_BLOCKS_LAPIS = tag("storage_blocks/lapis");
		PlatformTags.Blocks.STORAGE_BLOCKS_NETHERITE = tag("storage_blocks/netherite");
		PlatformTags.Blocks.STORAGE_BLOCKS_QUARTZ = tag("storage_blocks/quartz");
		PlatformTags.Blocks.STORAGE_BLOCKS_RAW_COPPER = tag("storage_blocks/raw_copper");
		PlatformTags.Blocks.STORAGE_BLOCKS_RAW_GOLD = tag("storage_blocks/raw_gold");
		PlatformTags.Blocks.STORAGE_BLOCKS_RAW_IRON = tag("storage_blocks/raw_iron");
		PlatformTags.Blocks.STORAGE_BLOCKS_REDSTONE = tag("storage_blocks/redstone");
		PlatformTags.Blocks.NEEDS_WOOD_TOOL = tag("needs_wood_tool");
		PlatformTags.Blocks.NEEDS_GOLD_TOOL = tag("needs_gold_tool");
		PlatformTags.Blocks.NEEDS_NETHERITE_TOOL = tag("needs_netherite_tool");
	}

	public static void init()
	{
	}

	private static Tag.Named<Block> tag(String name)
	{
		return TagHooks.optionalBlock(new ResourceLocation("fabric", name));
	}
}
