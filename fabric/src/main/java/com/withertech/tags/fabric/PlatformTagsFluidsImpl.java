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
import net.minecraft.world.level.material.Fluid;

public class PlatformTagsFluidsImpl
{
	static
	{
		PlatformTags.Fluids.MILK = tag("milk");
	}

	public static void init()
	{
	}

	private static Tag.Named<Fluid> tag(String name)
	{
		return TagHooks.optionalFluid(new ResourceLocation("fabric", name));
	}
}
