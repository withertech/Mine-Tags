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
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class PlatformTagsItemsImpl
{
	static
	{
		PlatformTags.Items.BARRELS = tag("barrels");
		PlatformTags.Items.BARRELS_WOODEN = tag("barrels/wooden");
		PlatformTags.Items.BONES = tag("bones");
		PlatformTags.Items.BOOKSHELVES = tag("bookshelves");
		PlatformTags.Items.CHESTS = tag("chests");
		PlatformTags.Items.CHESTS_ENDER = tag("chests/ender");
		PlatformTags.Items.CHESTS_TRAPPED = tag("chests/trapped");
		PlatformTags.Items.CHESTS_WOODEN = tag("chests/wooden");
		PlatformTags.Items.COBBLESTONE = tag("cobblestone");
		PlatformTags.Items.CROPS = tag("crops");
		PlatformTags.Items.CROPS_BEETROOT = tag("crops/beetroot");
		PlatformTags.Items.CROPS_CARROT = tag("crops/carrot");
		PlatformTags.Items.CROPS_NETHER_WART = tag("crops/nether_wart");
		PlatformTags.Items.CROPS_POTATO = tag("crops/potato");
		PlatformTags.Items.CROPS_WHEAT = tag("crops/wheat");
		PlatformTags.Items.DUSTS = tag("dusts");
		PlatformTags.Items.DUSTS_PRISMARINE = tag("dusts/prismarine");
		PlatformTags.Items.DUSTS_REDSTONE = tag("dusts/redstone");
		PlatformTags.Items.DUSTS_GLOWSTONE = tag("dusts/glowstone");
		PlatformTags.Items.DYES = tag("dyes");
		PlatformTags.Items.DYES_BLACK = tag("dyes/" + DyeColor.BLACK.getName());
		PlatformTags.Items.DYES_RED = tag("dyes/" + DyeColor.RED.getName());
		PlatformTags.Items.DYES_GREEN = tag("dyes/" + DyeColor.GREEN.getName());
		PlatformTags.Items.DYES_BROWN = tag("dyes/" + DyeColor.BROWN.getName());
		PlatformTags.Items.DYES_BLUE = tag("dyes/" + DyeColor.BLUE.getName());
		PlatformTags.Items.DYES_PURPLE = tag("dyes/" + DyeColor.PURPLE.getName());
		PlatformTags.Items.DYES_CYAN = tag("dyes/" + DyeColor.CYAN.getName());
		PlatformTags.Items.DYES_LIGHT_GRAY = tag("dyes/" + DyeColor.LIGHT_GRAY.getName());
		PlatformTags.Items.DYES_GRAY = tag("dyes/" + DyeColor.GRAY.getName());
		PlatformTags.Items.DYES_PINK = tag("dyes/" + DyeColor.PINK.getName());
		PlatformTags.Items.DYES_LIME = tag("dyes/" + DyeColor.LIME.getName());
		PlatformTags.Items.DYES_YELLOW = tag("dyes/" + DyeColor.YELLOW.getName());
		PlatformTags.Items.DYES_LIGHT_BLUE = tag("dyes/" + DyeColor.LIGHT_BLUE.getName());
		PlatformTags.Items.DYES_MAGENTA = tag("dyes/" + DyeColor.MAGENTA.getName());
		PlatformTags.Items.DYES_ORANGE = tag("dyes/" + DyeColor.ORANGE.getName());
		PlatformTags.Items.DYES_WHITE = tag("dyes/" + DyeColor.WHITE.getName());
		PlatformTags.Items.EGGS = tag("eggs");
		PlatformTags.Items.ENCHANTING_FUELS = tag("enchanting_fuels");
		PlatformTags.Items.END_STONES = tag("end_stones");
		PlatformTags.Items.ENDER_PEARLS = tag("ender_pearls");
		PlatformTags.Items.FEATHERS = tag("feathers");
		PlatformTags.Items.FENCE_GATES = tag("fence_gates");
		PlatformTags.Items.FENCE_GATES_WOODEN = tag("fence_gates/wooden");
		PlatformTags.Items.FENCES = tag("fences");
		PlatformTags.Items.FENCES_NETHER_BRICK = tag("fences/nether_brick");
		PlatformTags.Items.FENCES_WOODEN = tag("fences/wooden");
		PlatformTags.Items.GEMS = tag("gems");
		PlatformTags.Items.GEMS_DIAMOND = tag("gems/diamond");
		PlatformTags.Items.GEMS_EMERALD = tag("gems/emerald");
		PlatformTags.Items.GEMS_AMETHYST = tag("gems/amethyst");
		PlatformTags.Items.GEMS_LAPIS = tag("gems/lapis");
		PlatformTags.Items.GEMS_PRISMARINE = tag("gems/prismarine");
		PlatformTags.Items.GEMS_QUARTZ = tag("gems/quartz");
		PlatformTags.Items.GLASS = tag("glass");
		PlatformTags.Items.GLASS_BLACK = tag("glass/black");
		PlatformTags.Items.GLASS_BLUE = tag("glass/blue");
		PlatformTags.Items.GLASS_BROWN = tag("glass/brown");
		PlatformTags.Items.GLASS_COLORLESS = tag("glass/colorless");
		PlatformTags.Items.GLASS_CYAN = tag("glass/cyan");
		PlatformTags.Items.GLASS_GRAY = tag("glass/gray");
		PlatformTags.Items.GLASS_GREEN = tag("glass/green");
		PlatformTags.Items.GLASS_LIGHT_BLUE = tag("glass/light_blue");
		PlatformTags.Items.GLASS_LIGHT_GRAY = tag("glass/light_gray");
		PlatformTags.Items.GLASS_LIME = tag("glass/lime");
		PlatformTags.Items.GLASS_MAGENTA = tag("glass/magenta");
		PlatformTags.Items.GLASS_ORANGE = tag("glass/orange");
		PlatformTags.Items.GLASS_PINK = tag("glass/pink");
		PlatformTags.Items.GLASS_PURPLE = tag("glass/purple");
		PlatformTags.Items.GLASS_RED = tag("glass/red");
		PlatformTags.Items.GLASS_SILICA = tag("glass/silica");
		PlatformTags.Items.GLASS_TINTED = tag("glass/tinted");
		PlatformTags.Items.GLASS_WHITE = tag("glass/white");
		PlatformTags.Items.GLASS_YELLOW = tag("glass/yellow");
		PlatformTags.Items.GLASS_PANES = tag("glass_panes");
		PlatformTags.Items.GLASS_PANES_BLACK = tag("glass_panes/black");
		PlatformTags.Items.GLASS_PANES_BLUE = tag("glass_panes/blue");
		PlatformTags.Items.GLASS_PANES_BROWN = tag("glass_panes/brown");
		PlatformTags.Items.GLASS_PANES_COLORLESS = tag("glass_panes/colorless");
		PlatformTags.Items.GLASS_PANES_CYAN = tag("glass_panes/cyan");
		PlatformTags.Items.GLASS_PANES_GRAY = tag("glass_panes/gray");
		PlatformTags.Items.GLASS_PANES_GREEN = tag("glass_panes/green");
		PlatformTags.Items.GLASS_PANES_LIGHT_BLUE = tag("glass_panes/light_blue");
		PlatformTags.Items.GLASS_PANES_LIGHT_GRAY = tag("glass_panes/light_gray");
		PlatformTags.Items.GLASS_PANES_LIME = tag("glass_panes/lime");
		PlatformTags.Items.GLASS_PANES_MAGENTA = tag("glass_panes/magenta");
		PlatformTags.Items.GLASS_PANES_ORANGE = tag("glass_panes/orange");
		PlatformTags.Items.GLASS_PANES_PINK = tag("glass_panes/pink");
		PlatformTags.Items.GLASS_PANES_PURPLE = tag("glass_panes/purple");
		PlatformTags.Items.GLASS_PANES_RED = tag("glass_panes/red");
		PlatformTags.Items.GLASS_PANES_WHITE = tag("glass_panes/white");
		PlatformTags.Items.GLASS_PANES_YELLOW = tag("glass_panes/yellow");
		PlatformTags.Items.GRAVEL = tag("gravel");
		PlatformTags.Items.GUNPOWDER = tag("gunpowder");
		PlatformTags.Items.HEADS = tag("heads");
		PlatformTags.Items.INGOTS = tag("ingots");
		PlatformTags.Items.INGOTS_BRICK = tag("ingots/brick");
		PlatformTags.Items.INGOTS_COPPER = tag("ingots/copper");
		PlatformTags.Items.INGOTS_GOLD = tag("ingots/gold");
		PlatformTags.Items.INGOTS_IRON = tag("ingots/iron");
		PlatformTags.Items.INGOTS_NETHERITE = tag("ingots/netherite");
		PlatformTags.Items.INGOTS_NETHER_BRICK = tag("ingots/nether_brick");
		PlatformTags.Items.LEATHER = tag("leather");
		PlatformTags.Items.MUSHROOMS = tag("mushrooms");
		PlatformTags.Items.NETHER_STARS = tag("nether_stars");
		PlatformTags.Items.NETHERRACK = tag("netherrack");
		PlatformTags.Items.NUGGETS = tag("nuggets");
		PlatformTags.Items.NUGGETS_GOLD = tag("nuggets/gold");
		PlatformTags.Items.NUGGETS_IRON = tag("nuggets/iron");
		PlatformTags.Items.OBSIDIAN = tag("obsidian");
		PlatformTags.Items.ORE_BEARING_GROUND_DEEPSLATE = tag("ore_bearing_ground/deepslate");
		PlatformTags.Items.ORE_BEARING_GROUND_NETHERRACK = tag("ore_bearing_ground/netherrack");
		PlatformTags.Items.ORE_BEARING_GROUND_STONE = tag("ore_bearing_ground/stone");
		PlatformTags.Items.ORE_RATES_DENSE = tag("ore_rates/dense");
		PlatformTags.Items.ORE_RATES_SINGULAR = tag("ore_rates/singular");
		PlatformTags.Items.ORE_RATES_SPARSE = tag("ore_rates/sparse");
		PlatformTags.Items.ORES = tag("ores");
		PlatformTags.Items.ORES_COAL = tag("ores/coal");
		PlatformTags.Items.ORES_COPPER = tag("ores/copper");
		PlatformTags.Items.ORES_DIAMOND = tag("ores/diamond");
		PlatformTags.Items.ORES_EMERALD = tag("ores/emerald");
		PlatformTags.Items.ORES_GOLD = tag("ores/gold");
		PlatformTags.Items.ORES_IRON = tag("ores/iron");
		PlatformTags.Items.ORES_LAPIS = tag("ores/lapis");
		PlatformTags.Items.ORES_NETHERITE_SCRAP = tag("ores/netherite_scrap");
		PlatformTags.Items.ORES_QUARTZ = tag("ores/quartz");
		PlatformTags.Items.ORES_REDSTONE = tag("ores/redstone");
		PlatformTags.Items.ORES_IN_GROUND_DEEPSLATE = tag("ores_in_ground/deepslate");
		PlatformTags.Items.ORES_IN_GROUND_NETHERRACK = tag("ores_in_ground/netherrack");
		PlatformTags.Items.ORES_IN_GROUND_STONE = tag("ores_in_ground/stone");
		PlatformTags.Items.RAW_MATERIALS = tag("raw_materials");
		PlatformTags.Items.RAW_MATERIALS_COPPER = tag("raw_materials/copper");
		PlatformTags.Items.RAW_MATERIALS_GOLD = tag("raw_materials/gold");
		PlatformTags.Items.RAW_MATERIALS_IRON = tag("raw_materials/iron");
		PlatformTags.Items.RODS = tag("rods");
		PlatformTags.Items.RODS_BLAZE = tag("rods/blaze");
		PlatformTags.Items.RODS_WOODEN = tag("rods/wooden");
		PlatformTags.Items.SAND = tag("sand");
		PlatformTags.Items.SAND_COLORLESS = tag("sand/colorless");
		PlatformTags.Items.SAND_RED = tag("sand/red");
		PlatformTags.Items.SANDSTONE = tag("sandstone");
		PlatformTags.Items.SEEDS = tag("seeds");
		PlatformTags.Items.SEEDS_BEETROOT = tag("seeds/beetroot");
		PlatformTags.Items.SEEDS_MELON = tag("seeds/melon");
		PlatformTags.Items.SEEDS_PUMPKIN = tag("seeds/pumpkin");
		PlatformTags.Items.SEEDS_WHEAT = tag("seeds/wheat");
		PlatformTags.Items.SHEARS = tag("shears");
		PlatformTags.Items.SLIMEBALLS = tag("slimeballs");
		PlatformTags.Items.STAINED_GLASS = tag("stained_glass");
		PlatformTags.Items.STAINED_GLASS_PANES = tag("stained_glass_panes");
		PlatformTags.Items.STONE = tag("stone");
		PlatformTags.Items.STORAGE_BLOCKS = tag("storage_blocks");
		PlatformTags.Items.STORAGE_BLOCKS_AMETHYST = tag("storage_blocks/amethyst");
		PlatformTags.Items.STORAGE_BLOCKS_COAL = tag("storage_blocks/coal");
		PlatformTags.Items.STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
		PlatformTags.Items.STORAGE_BLOCKS_DIAMOND = tag("storage_blocks/diamond");
		PlatformTags.Items.STORAGE_BLOCKS_EMERALD = tag("storage_blocks/emerald");
		PlatformTags.Items.STORAGE_BLOCKS_GOLD = tag("storage_blocks/gold");
		PlatformTags.Items.STORAGE_BLOCKS_IRON = tag("storage_blocks/iron");
		PlatformTags.Items.STORAGE_BLOCKS_LAPIS = tag("storage_blocks/lapis");
		PlatformTags.Items.STORAGE_BLOCKS_NETHERITE = tag("storage_blocks/netherite");
		PlatformTags.Items.STORAGE_BLOCKS_QUARTZ = tag("storage_blocks/quartz");
		PlatformTags.Items.STORAGE_BLOCKS_RAW_COPPER = tag("storage_blocks/raw_copper");
		PlatformTags.Items.STORAGE_BLOCKS_RAW_GOLD = tag("storage_blocks/raw_gold");
		PlatformTags.Items.STORAGE_BLOCKS_RAW_IRON = tag("storage_blocks/raw_iron");
		PlatformTags.Items.STORAGE_BLOCKS_REDSTONE = tag("storage_blocks/redstone");
		PlatformTags.Items.STRING = tag("string");
	}

	public static void init()
	{
	}

	private static Tag.Named<Item> tag(String name)
	{
		return TagHooks.optionalItem(new ResourceLocation("fabric", name));
	}
}
