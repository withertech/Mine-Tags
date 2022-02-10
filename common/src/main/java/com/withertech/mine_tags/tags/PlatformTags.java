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

package com.withertech.mine_tags.tags;

import com.withertech.mine_tags.MineTags;
import com.withertech.mine_tags.util.TagUtil;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.DyeColor;
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
		public static final Tag.Named<Block> BARRELS = TagUtil.makeBlock("barrels");
		public static final Tag.Named<Block> BARRELS_WOODEN = TagUtil.makeBlock("barrels/wooden");
		public static final Tag.Named<Block> CHESTS = TagUtil.makeBlock("chests");
		public static final Tag.Named<Block> CHESTS_ENDER = TagUtil.makeBlock("chests/ender");
		public static final Tag.Named<Block> CHESTS_TRAPPED = TagUtil.makeBlock("chests/trapped");
		public static final Tag.Named<Block> CHESTS_WOODEN = TagUtil.makeBlock("chests/wooden");
		public static final Tag.Named<Block> COBBLESTONE = TagUtil.makeBlock("cobblestone");
		public static final Tag.Named<Block> END_STONES = TagUtil.makeBlock("end_stones");
		public static final Tag.Named<Block> ENDERMAN_PLACE_ON_BLACKLIST = TagUtil.makeBlock("enderman_place_on_blacklist");
		public static final Tag.Named<Block> FENCE_GATES = TagUtil.makeBlock("fence_gates");
		public static final Tag.Named<Block> FENCE_GATES_WOODEN = TagUtil.makeBlock("fence_gates/wooden");
		public static final Tag.Named<Block> FENCES = TagUtil.makeBlock("fences");
		public static final Tag.Named<Block> FENCES_NETHER_BRICK = TagUtil.makeBlock("fences/nether_brick");
		public static final Tag.Named<Block> FENCES_WOODEN = TagUtil.makeBlock("fences/wooden");
		public static final Tag.Named<Block> GLASS = TagUtil.makeBlock("glass");
		public static final Tag.Named<Block> GLASS_BLACK = TagUtil.makeBlock("glass/black");
		public static final Tag.Named<Block> GLASS_BLUE = TagUtil.makeBlock("glass/blue");
		public static final Tag.Named<Block> GLASS_BROWN = TagUtil.makeBlock("glass/brown");
		public static final Tag.Named<Block> GLASS_COLORLESS = TagUtil.makeBlock("glass/colorless");
		public static final Tag.Named<Block> GLASS_CYAN = TagUtil.makeBlock("glass/cyan");
		public static final Tag.Named<Block> GLASS_GRAY = TagUtil.makeBlock("glass/gray");
		public static final Tag.Named<Block> GLASS_GREEN = TagUtil.makeBlock("glass/green");
		public static final Tag.Named<Block> GLASS_LIGHT_BLUE = TagUtil.makeBlock("glass/light_blue");
		public static final Tag.Named<Block> GLASS_LIGHT_GRAY = TagUtil.makeBlock("glass/light_gray");
		public static final Tag.Named<Block> GLASS_LIME = TagUtil.makeBlock("glass/lime");
		public static final Tag.Named<Block> GLASS_MAGENTA = TagUtil.makeBlock("glass/magenta");
		public static final Tag.Named<Block> GLASS_ORANGE = TagUtil.makeBlock("glass/orange");
		public static final Tag.Named<Block> GLASS_PINK = TagUtil.makeBlock("glass/pink");
		public static final Tag.Named<Block> GLASS_PURPLE = TagUtil.makeBlock("glass/purple");
		public static final Tag.Named<Block> GLASS_RED = TagUtil.makeBlock("glass/red");
		public static final Tag.Named<Block> GLASS_SILICA = TagUtil.makeBlock("glass/silica");
		public static final Tag.Named<Block> GLASS_TINTED = TagUtil.makeBlock("glass/tinted");
		public static final Tag.Named<Block> GLASS_WHITE = TagUtil.makeBlock("glass/white");
		public static final Tag.Named<Block> GLASS_YELLOW = TagUtil.makeBlock("glass/yellow");
		public static final Tag.Named<Block> GLASS_PANES = TagUtil.makeBlock("glass_panes");
		public static final Tag.Named<Block> GLASS_PANES_BLACK = TagUtil.makeBlock("glass_panes/black");
		public static final Tag.Named<Block> GLASS_PANES_BLUE = TagUtil.makeBlock("glass_panes/blue");
		public static final Tag.Named<Block> GLASS_PANES_BROWN = TagUtil.makeBlock("glass_panes/brown");
		public static final Tag.Named<Block> GLASS_PANES_COLORLESS = TagUtil.makeBlock("glass_panes/colorless");
		public static final Tag.Named<Block> GLASS_PANES_CYAN = TagUtil.makeBlock("glass_panes/cyan");
		public static final Tag.Named<Block> GLASS_PANES_GRAY = TagUtil.makeBlock("glass_panes/gray");
		public static final Tag.Named<Block> GLASS_PANES_GREEN = TagUtil.makeBlock("glass_panes/green");
		public static final Tag.Named<Block> GLASS_PANES_LIGHT_BLUE = TagUtil.makeBlock("glass_panes/light_blue");
		public static final Tag.Named<Block> GLASS_PANES_LIGHT_GRAY = TagUtil.makeBlock("glass_panes/light_gray");
		public static final Tag.Named<Block> GLASS_PANES_LIME = TagUtil.makeBlock("glass_panes/lime");
		public static final Tag.Named<Block> GLASS_PANES_MAGENTA = TagUtil.makeBlock("glass_panes/magenta");
		public static final Tag.Named<Block> GLASS_PANES_ORANGE = TagUtil.makeBlock("glass_panes/orange");
		public static final Tag.Named<Block> GLASS_PANES_PINK = TagUtil.makeBlock("glass_panes/pink");
		public static final Tag.Named<Block> GLASS_PANES_PURPLE = TagUtil.makeBlock("glass_panes/purple");
		public static final Tag.Named<Block> GLASS_PANES_RED = TagUtil.makeBlock("glass_panes/red");
		public static final Tag.Named<Block> GLASS_PANES_WHITE = TagUtil.makeBlock("glass_panes/white");
		public static final Tag.Named<Block> GLASS_PANES_YELLOW = TagUtil.makeBlock("glass_panes/yellow");
		public static final Tag.Named<Block> GRAVEL = TagUtil.makeBlock("gravel");
		public static final Tag.Named<Block> NETHERRACK = TagUtil.makeBlock("netherrack");
		public static final Tag.Named<Block> OBSIDIAN = TagUtil.makeBlock("obsidian");
		public static final Tag.Named<Block> ORE_BEARING_GROUND_DEEPSLATE = TagUtil.makeBlock("ore_bearing_ground/deepslate");
		public static final Tag.Named<Block> ORE_BEARING_GROUND_NETHERRACK = TagUtil.makeBlock("ore_bearing_ground/netherrack");
		public static final Tag.Named<Block> ORE_BEARING_GROUND_STONE = TagUtil.makeBlock("ore_bearing_ground/stone");
		public static final Tag.Named<Block> ORE_RATES_DENSE = TagUtil.makeBlock("ore_rates/dense");
		public static final Tag.Named<Block> ORE_RATES_SINGULAR = TagUtil.makeBlock("ore_rates/singular");
		public static final Tag.Named<Block> ORE_RATES_SPARSE = TagUtil.makeBlock("ore_rates/sparse");
		public static final Tag.Named<Block> ORES = TagUtil.makeBlock("ores");
		public static final Tag.Named<Block> ORES_COAL = TagUtil.makeBlock("ores/coal");
		public static final Tag.Named<Block> ORES_COPPER = TagUtil.makeBlock("ores/copper");
		public static final Tag.Named<Block> ORES_DIAMOND = TagUtil.makeBlock("ores/diamond");
		public static final Tag.Named<Block> ORES_EMERALD = TagUtil.makeBlock("ores/emerald");
		public static final Tag.Named<Block> ORES_GOLD = TagUtil.makeBlock("ores/gold");
		public static final Tag.Named<Block> ORES_IRON = TagUtil.makeBlock("ores/iron");
		public static final Tag.Named<Block> ORES_LAPIS = TagUtil.makeBlock("ores/lapis");
		public static final Tag.Named<Block> ORES_NETHERITE_SCRAP = TagUtil.makeBlock("ores/netherite_scrap");
		public static final Tag.Named<Block> ORES_QUARTZ = TagUtil.makeBlock("ores/quartz");
		public static final Tag.Named<Block> ORES_REDSTONE = TagUtil.makeBlock("ores/redstone");
		public static final Tag.Named<Block> ORES_IN_GROUND_DEEPSLATE = TagUtil.makeBlock("ores_in_ground/deepslate");
		public static final Tag.Named<Block> ORES_IN_GROUND_NETHERRACK = TagUtil.makeBlock("ores_in_ground/netherrack");
		public static final Tag.Named<Block> ORES_IN_GROUND_STONE = TagUtil.makeBlock("ores_in_ground/stone");
		public static final Tag.Named<Block> SAND = TagUtil.makeBlock("sand");
		public static final Tag.Named<Block> SAND_COLORLESS = TagUtil.makeBlock("sand/colorless");
		public static final Tag.Named<Block> SAND_RED = TagUtil.makeBlock("sand/red");
		public static final Tag.Named<Block> SANDSTONE = TagUtil.makeBlock("sandstone");
		public static final Tag.Named<Block> STAINED_GLASS = TagUtil.makeBlock("stained_glass");
		public static final Tag.Named<Block> STAINED_GLASS_PANES = TagUtil.makeBlock("stained_glass_panes");
		public static final Tag.Named<Block> STONE = TagUtil.makeBlock("stone");
		public static final Tag.Named<Block> STORAGE_BLOCKS = TagUtil.makeBlock("storage_blocks");
		public static final Tag.Named<Block> STORAGE_BLOCKS_AMETHYST = TagUtil.makeBlock("storage_blocks/amethyst");
		public static final Tag.Named<Block> STORAGE_BLOCKS_COAL = TagUtil.makeBlock("storage_blocks/coal");
		public static final Tag.Named<Block> STORAGE_BLOCKS_COPPER = TagUtil.makeBlock("storage_blocks/copper");
		public static final Tag.Named<Block> STORAGE_BLOCKS_DIAMOND = TagUtil.makeBlock("storage_blocks/diamond");
		public static final Tag.Named<Block> STORAGE_BLOCKS_EMERALD = TagUtil.makeBlock("storage_blocks/emerald");
		public static final Tag.Named<Block> STORAGE_BLOCKS_GOLD = TagUtil.makeBlock("storage_blocks/gold");
		public static final Tag.Named<Block> STORAGE_BLOCKS_IRON = TagUtil.makeBlock("storage_blocks/iron");
		public static final Tag.Named<Block> STORAGE_BLOCKS_LAPIS = TagUtil.makeBlock("storage_blocks/lapis");
		public static final Tag.Named<Block> STORAGE_BLOCKS_NETHERITE = TagUtil.makeBlock("storage_blocks/netherite");
		public static final Tag.Named<Block> STORAGE_BLOCKS_QUARTZ = TagUtil.makeBlock("storage_blocks/quartz");
		public static final Tag.Named<Block> STORAGE_BLOCKS_RAW_COPPER = TagUtil.makeBlock("storage_blocks/raw_copper");
		public static final Tag.Named<Block> STORAGE_BLOCKS_RAW_GOLD = TagUtil.makeBlock("storage_blocks/raw_gold");
		public static final Tag.Named<Block> STORAGE_BLOCKS_RAW_IRON = TagUtil.makeBlock("storage_blocks/raw_iron");
		public static final Tag.Named<Block> STORAGE_BLOCKS_REDSTONE = TagUtil.makeBlock("storage_blocks/redstone");
		public static final Tag.Named<Block> NEEDS_WOOD_TOOL = TagUtil.makeBlock("needs_wood_tool");
		public static final Tag.Named<Block> NEEDS_GOLD_TOOL = TagUtil.makeBlock("needs_gold_tool");
		public static final Tag.Named<Block> NEEDS_NETHERITE_TOOL = TagUtil.makeBlock("needs_netherite_tool");

		private static void init()
		{
		}
	}

	public static class Items
	{
		public static final Tag.Named<Item> BARRELS = TagUtil.makeItem("barrels");
		public static final Tag.Named<Item> BARRELS_WOODEN = TagUtil.makeItem("barrels/wooden");
		public static final Tag.Named<Item> BONES = TagUtil.makeItem("bones");
		public static final Tag.Named<Item> BOOKSHELVES = TagUtil.makeItem("bookshelves");
		public static final Tag.Named<Item> CHESTS = TagUtil.makeItem("chests");
		public static final Tag.Named<Item> CHESTS_ENDER = TagUtil.makeItem("chests/ender");
		public static final Tag.Named<Item> CHESTS_TRAPPED = TagUtil.makeItem("chests/trapped");
		public static final Tag.Named<Item> CHESTS_WOODEN = TagUtil.makeItem("chests/wooden");
		public static final Tag.Named<Item> COBBLESTONE = TagUtil.makeItem("cobblestone");
		public static final Tag.Named<Item> CROPS = TagUtil.makeItem("crops");
		public static final Tag.Named<Item> CROPS_BEETROOT = TagUtil.makeItem("crops/beetroot");
		public static final Tag.Named<Item> CROPS_CARROT = TagUtil.makeItem("crops/carrot");
		public static final Tag.Named<Item> CROPS_NETHER_WART = TagUtil.makeItem("crops/nether_wart");
		public static final Tag.Named<Item> CROPS_POTATO = TagUtil.makeItem("crops/potato");
		public static final Tag.Named<Item> CROPS_WHEAT = TagUtil.makeItem("crops/wheat");
		public static final Tag.Named<Item> DUSTS = TagUtil.makeItem("dusts");
		public static final Tag.Named<Item> DUSTS_PRISMARINE = TagUtil.makeItem("dusts/prismarine");
		public static final Tag.Named<Item> DUSTS_REDSTONE = TagUtil.makeItem("dusts/redstone");
		public static final Tag.Named<Item> DUSTS_GLOWSTONE = TagUtil.makeItem("dusts/glowstone");
		public static final Tag.Named<Item> DYES = TagUtil.makeItem("dyes");
		public static final Tag.Named<Item> DYES_BLACK = TagUtil.makeItem("dyes/" + DyeColor.BLACK.getName());
		public static final Tag.Named<Item> DYES_RED = TagUtil.makeItem("dyes/" + DyeColor.RED.getName());
		public static final Tag.Named<Item> DYES_GREEN = TagUtil.makeItem("dyes/" + DyeColor.GREEN.getName());
		public static final Tag.Named<Item> DYES_BROWN = TagUtil.makeItem("dyes/" + DyeColor.BROWN.getName());
		public static final Tag.Named<Item> DYES_BLUE = TagUtil.makeItem("dyes/" + DyeColor.BLUE.getName());
		public static final Tag.Named<Item> DYES_PURPLE = TagUtil.makeItem("dyes/" + DyeColor.PURPLE.getName());
		public static final Tag.Named<Item> DYES_CYAN = TagUtil.makeItem("dyes/" + DyeColor.CYAN.getName());
		public static final Tag.Named<Item> DYES_LIGHT_GRAY = TagUtil.makeItem("dyes/" + DyeColor.LIGHT_GRAY.getName());
		public static final Tag.Named<Item> DYES_GRAY = TagUtil.makeItem("dyes/" + DyeColor.GRAY.getName());
		public static final Tag.Named<Item> DYES_PINK = TagUtil.makeItem("dyes/" + DyeColor.PINK.getName());
		public static final Tag.Named<Item> DYES_LIME = TagUtil.makeItem("dyes/" + DyeColor.LIME.getName());
		public static final Tag.Named<Item> DYES_YELLOW = TagUtil.makeItem("dyes/" + DyeColor.YELLOW.getName());
		public static final Tag.Named<Item> DYES_LIGHT_BLUE = TagUtil.makeItem("dyes/" + DyeColor.LIGHT_BLUE.getName());
		public static final Tag.Named<Item> DYES_MAGENTA = TagUtil.makeItem("dyes/" + DyeColor.MAGENTA.getName());
		public static final Tag.Named<Item> DYES_ORANGE = TagUtil.makeItem("dyes/" + DyeColor.ORANGE.getName());
		public static final Tag.Named<Item> DYES_WHITE = TagUtil.makeItem("dyes/" + DyeColor.WHITE.getName());
		public static final Tag.Named<Item> EGGS = TagUtil.makeItem("eggs");
		public static final Tag.Named<Item> ENCHANTING_FUELS = TagUtil.makeItem("enchanting_fuels");
		public static final Tag.Named<Item> END_STONES = TagUtil.makeItem("end_stones");
		public static final Tag.Named<Item> ENDER_PEARLS = TagUtil.makeItem("ender_pearls");
		public static final Tag.Named<Item> FEATHERS = TagUtil.makeItem("feathers");
		public static final Tag.Named<Item> FENCE_GATES = TagUtil.makeItem("fence_gates");
		public static final Tag.Named<Item> FENCE_GATES_WOODEN = TagUtil.makeItem("fence_gates/wooden");
		public static final Tag.Named<Item> FENCES = TagUtil.makeItem("fences");
		public static final Tag.Named<Item> FENCES_NETHER_BRICK = TagUtil.makeItem("fences/nether_brick");
		public static final Tag.Named<Item> FENCES_WOODEN = TagUtil.makeItem("fences/wooden");
		public static final Tag.Named<Item> GEMS = TagUtil.makeItem("gems");
		public static final Tag.Named<Item> GEMS_COAL = TagUtil.makeItem("gems/coal");
		public static final Tag.Named<Item> GEMS_DIAMOND = TagUtil.makeItem("gems/diamond");
		public static final Tag.Named<Item> GEMS_EMERALD = TagUtil.makeItem("gems/emerald");
		public static final Tag.Named<Item> GEMS_AMETHYST = TagUtil.makeItem("gems/amethyst");
		public static final Tag.Named<Item> GEMS_LAPIS = TagUtil.makeItem("gems/lapis");
		public static final Tag.Named<Item> GEMS_PRISMARINE = TagUtil.makeItem("gems/prismarine");
		public static final Tag.Named<Item> GEMS_QUARTZ = TagUtil.makeItem("gems/quartz");
		public static final Tag.Named<Item> GLASS = TagUtil.makeItem("glass");
		public static final Tag.Named<Item> GLASS_BLACK = TagUtil.makeItem("glass/black");
		public static final Tag.Named<Item> GLASS_BLUE = TagUtil.makeItem("glass/blue");
		public static final Tag.Named<Item> GLASS_BROWN = TagUtil.makeItem("glass/brown");
		public static final Tag.Named<Item> GLASS_COLORLESS = TagUtil.makeItem("glass/colorless");
		public static final Tag.Named<Item> GLASS_CYAN = TagUtil.makeItem("glass/cyan");
		public static final Tag.Named<Item> GLASS_GRAY = TagUtil.makeItem("glass/gray");
		public static final Tag.Named<Item> GLASS_GREEN = TagUtil.makeItem("glass/green");
		public static final Tag.Named<Item> GLASS_LIGHT_BLUE = TagUtil.makeItem("glass/light_blue");
		public static final Tag.Named<Item> GLASS_LIGHT_GRAY = TagUtil.makeItem("glass/light_gray");
		public static final Tag.Named<Item> GLASS_LIME = TagUtil.makeItem("glass/lime");
		public static final Tag.Named<Item> GLASS_MAGENTA = TagUtil.makeItem("glass/magenta");
		public static final Tag.Named<Item> GLASS_ORANGE = TagUtil.makeItem("glass/orange");
		public static final Tag.Named<Item> GLASS_PINK = TagUtil.makeItem("glass/pink");
		public static final Tag.Named<Item> GLASS_PURPLE = TagUtil.makeItem("glass/purple");
		public static final Tag.Named<Item> GLASS_RED = TagUtil.makeItem("glass/red");
		public static final Tag.Named<Item> GLASS_SILICA = TagUtil.makeItem("glass/silica");
		public static final Tag.Named<Item> GLASS_TINTED = TagUtil.makeItem("glass/tinted");
		public static final Tag.Named<Item> GLASS_WHITE = TagUtil.makeItem("glass/white");
		public static final Tag.Named<Item> GLASS_YELLOW = TagUtil.makeItem("glass/yellow");
		public static final Tag.Named<Item> GLASS_PANES = TagUtil.makeItem("glass_panes");
		public static final Tag.Named<Item> GLASS_PANES_BLACK = TagUtil.makeItem("glass_panes/black");
		public static final Tag.Named<Item> GLASS_PANES_BLUE = TagUtil.makeItem("glass_panes/blue");
		public static final Tag.Named<Item> GLASS_PANES_BROWN = TagUtil.makeItem("glass_panes/brown");
		public static final Tag.Named<Item> GLASS_PANES_COLORLESS = TagUtil.makeItem("glass_panes/colorless");
		public static final Tag.Named<Item> GLASS_PANES_CYAN = TagUtil.makeItem("glass_panes/cyan");
		public static final Tag.Named<Item> GLASS_PANES_GRAY = TagUtil.makeItem("glass_panes/gray");
		public static final Tag.Named<Item> GLASS_PANES_GREEN = TagUtil.makeItem("glass_panes/green");
		public static final Tag.Named<Item> GLASS_PANES_LIGHT_BLUE = TagUtil.makeItem("glass_panes/light_blue");
		public static final Tag.Named<Item> GLASS_PANES_LIGHT_GRAY = TagUtil.makeItem("glass_panes/light_gray");
		public static final Tag.Named<Item> GLASS_PANES_LIME = TagUtil.makeItem("glass_panes/lime");
		public static final Tag.Named<Item> GLASS_PANES_MAGENTA = TagUtil.makeItem("glass_panes/magenta");
		public static final Tag.Named<Item> GLASS_PANES_ORANGE = TagUtil.makeItem("glass_panes/orange");
		public static final Tag.Named<Item> GLASS_PANES_PINK = TagUtil.makeItem("glass_panes/pink");
		public static final Tag.Named<Item> GLASS_PANES_PURPLE = TagUtil.makeItem("glass_panes/purple");
		public static final Tag.Named<Item> GLASS_PANES_RED = TagUtil.makeItem("glass_panes/red");
		public static final Tag.Named<Item> GLASS_PANES_WHITE = TagUtil.makeItem("glass_panes/white");
		public static final Tag.Named<Item> GLASS_PANES_YELLOW = TagUtil.makeItem("glass_panes/yellow");
		public static final Tag.Named<Item> GRAVEL = TagUtil.makeItem("gravel");
		public static final Tag.Named<Item> GUNPOWDER = TagUtil.makeItem("gunpowder");
		public static final Tag.Named<Item> HEADS = TagUtil.makeItem("heads");
		public static final Tag.Named<Item> INGOTS = TagUtil.makeItem("ingots");
		public static final Tag.Named<Item> INGOTS_BRICK = TagUtil.makeItem("ingots/brick");
		public static final Tag.Named<Item> INGOTS_COPPER = TagUtil.makeItem("ingots/copper");
		public static final Tag.Named<Item> INGOTS_GOLD = TagUtil.makeItem("ingots/gold");
		public static final Tag.Named<Item> INGOTS_IRON = TagUtil.makeItem("ingots/iron");
		public static final Tag.Named<Item> INGOTS_NETHERITE = TagUtil.makeItem("ingots/netherite");
		public static final Tag.Named<Item> INGOTS_NETHER_BRICK = TagUtil.makeItem("ingots/nether_brick");
		public static final Tag.Named<Item> LEATHER = TagUtil.makeItem("leather");
		public static final Tag.Named<Item> MUSHROOMS = TagUtil.makeItem("mushrooms");
		public static final Tag.Named<Item> NETHER_STARS = TagUtil.makeItem("nether_stars");
		public static final Tag.Named<Item> NETHERRACK = TagUtil.makeItem("netherrack");
		public static final Tag.Named<Item> NUGGETS = TagUtil.makeItem("nuggets");
		public static final Tag.Named<Item> NUGGETS_GOLD = TagUtil.makeItem("nuggets/gold");
		public static final Tag.Named<Item> NUGGETS_IRON = TagUtil.makeItem("nuggets/iron");
		public static final Tag.Named<Item> OBSIDIAN = TagUtil.makeItem("obsidian");
		public static final Tag.Named<Item> ORE_BEARING_GROUND_DEEPSLATE = TagUtil.makeItem("ore_bearing_ground/deepslate");
		public static final Tag.Named<Item> ORE_BEARING_GROUND_NETHERRACK = TagUtil.makeItem("ore_bearing_ground/netherrack");
		public static final Tag.Named<Item> ORE_BEARING_GROUND_STONE = TagUtil.makeItem("ore_bearing_ground/stone");
		public static final Tag.Named<Item> ORE_RATES_DENSE = TagUtil.makeItem("ore_rates/dense");
		public static final Tag.Named<Item> ORE_RATES_SINGULAR = TagUtil.makeItem("ore_rates/singular");
		public static final Tag.Named<Item> ORE_RATES_SPARSE = TagUtil.makeItem("ore_rates/sparse");
		public static final Tag.Named<Item> ORES = TagUtil.makeItem("ores");
		public static final Tag.Named<Item> ORES_COAL = TagUtil.makeItem("ores/coal");
		public static final Tag.Named<Item> ORES_COPPER = TagUtil.makeItem("ores/copper");
		public static final Tag.Named<Item> ORES_DIAMOND = TagUtil.makeItem("ores/diamond");
		public static final Tag.Named<Item> ORES_EMERALD = TagUtil.makeItem("ores/emerald");
		public static final Tag.Named<Item> ORES_GOLD = TagUtil.makeItem("ores/gold");
		public static final Tag.Named<Item> ORES_IRON = TagUtil.makeItem("ores/iron");
		public static final Tag.Named<Item> ORES_LAPIS = TagUtil.makeItem("ores/lapis");
		public static final Tag.Named<Item> ORES_NETHERITE_SCRAP = TagUtil.makeItem("ores/netherite_scrap");
		public static final Tag.Named<Item> ORES_QUARTZ = TagUtil.makeItem("ores/quartz");
		public static final Tag.Named<Item> ORES_REDSTONE = TagUtil.makeItem("ores/redstone");
		public static final Tag.Named<Item> ORES_IN_GROUND_DEEPSLATE = TagUtil.makeItem("ores_in_ground/deepslate");
		public static final Tag.Named<Item> ORES_IN_GROUND_NETHERRACK = TagUtil.makeItem("ores_in_ground/netherrack");
		public static final Tag.Named<Item> ORES_IN_GROUND_STONE = TagUtil.makeItem("ores_in_ground/stone");
		public static final Tag.Named<Item> RAW_MATERIALS = TagUtil.makeItem("raw_materials");
		public static final Tag.Named<Item> RAW_MATERIALS_COPPER = TagUtil.makeItem("raw_materials/copper");
		public static final Tag.Named<Item> RAW_MATERIALS_GOLD = TagUtil.makeItem("raw_materials/gold");
		public static final Tag.Named<Item> RAW_MATERIALS_IRON = TagUtil.makeItem("raw_materials/iron");
		public static final Tag.Named<Item> RODS = TagUtil.makeItem("rods");
		public static final Tag.Named<Item> RODS_BLAZE = TagUtil.makeItem("rods/blaze");
		public static final Tag.Named<Item> RODS_WOODEN = TagUtil.makeItem("rods/wooden");
		public static final Tag.Named<Item> SAND = TagUtil.makeItem("sand");
		public static final Tag.Named<Item> SAND_COLORLESS = TagUtil.makeItem("sand/colorless");
		public static final Tag.Named<Item> SAND_RED = TagUtil.makeItem("sand/red");
		public static final Tag.Named<Item> SANDSTONE = TagUtil.makeItem("sandstone");
		public static final Tag.Named<Item> SEEDS = TagUtil.makeItem("seeds");
		public static final Tag.Named<Item> SEEDS_BEETROOT = TagUtil.makeItem("seeds/beetroot");
		public static final Tag.Named<Item> SEEDS_MELON = TagUtil.makeItem("seeds/melon");
		public static final Tag.Named<Item> SEEDS_PUMPKIN = TagUtil.makeItem("seeds/pumpkin");
		public static final Tag.Named<Item> SEEDS_WHEAT = TagUtil.makeItem("seeds/wheat");
		public static final Tag.Named<Item> SHEARS = TagUtil.makeItem("shears");
		public static final Tag.Named<Item> SLIMEBALLS = TagUtil.makeItem("slimeballs");
		public static final Tag.Named<Item> STAINED_GLASS = TagUtil.makeItem("stained_glass");
		public static final Tag.Named<Item> STAINED_GLASS_PANES = TagUtil.makeItem("stained_glass_panes");
		public static final Tag.Named<Item> STONE = TagUtil.makeItem("stone");
		public static final Tag.Named<Item> STORAGE_BLOCKS = TagUtil.makeItem("storage_blocks");
		public static final Tag.Named<Item> STORAGE_BLOCKS_AMETHYST = TagUtil.makeItem("storage_blocks/amethyst");
		public static final Tag.Named<Item> STORAGE_BLOCKS_COAL = TagUtil.makeItem("storage_blocks/coal");
		public static final Tag.Named<Item> STORAGE_BLOCKS_COPPER = TagUtil.makeItem("storage_blocks/copper");
		public static final Tag.Named<Item> STORAGE_BLOCKS_DIAMOND = TagUtil.makeItem("storage_blocks/diamond");
		public static final Tag.Named<Item> STORAGE_BLOCKS_EMERALD = TagUtil.makeItem("storage_blocks/emerald");
		public static final Tag.Named<Item> STORAGE_BLOCKS_GOLD = TagUtil.makeItem("storage_blocks/gold");
		public static final Tag.Named<Item> STORAGE_BLOCKS_IRON = TagUtil.makeItem("storage_blocks/iron");
		public static final Tag.Named<Item> STORAGE_BLOCKS_LAPIS = TagUtil.makeItem("storage_blocks/lapis");
		public static final Tag.Named<Item> STORAGE_BLOCKS_NETHERITE = TagUtil.makeItem("storage_blocks/netherite");
		public static final Tag.Named<Item> STORAGE_BLOCKS_QUARTZ = TagUtil.makeItem("storage_blocks/quartz");
		public static final Tag.Named<Item> STORAGE_BLOCKS_RAW_COPPER = TagUtil.makeItem("storage_blocks/raw_copper");
		public static final Tag.Named<Item> STORAGE_BLOCKS_RAW_GOLD = TagUtil.makeItem("storage_blocks/raw_gold");
		public static final Tag.Named<Item> STORAGE_BLOCKS_RAW_IRON = TagUtil.makeItem("storage_blocks/raw_iron");
		public static final Tag.Named<Item> STORAGE_BLOCKS_REDSTONE = TagUtil.makeItem("storage_blocks/redstone");
		public static final Tag.Named<Item> STRING = TagUtil.makeItem("string");

		private static void init()
		{
		}
	}

	public static class Fluids
	{
		public static final Tag.Named<Fluid> MILK = TagUtil.makeFluid("milk");

		private static void init()
		{
		}
	}
}
