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

package com.withertech.mine_tags.util;

import com.google.common.collect.Streams;
import net.minecraft.tags.Tag;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TagUtil
{
	@Contract(value = "_, _ -> new", pure = true)
	public static <T> @NotNull Tag<T> or(Tag<T> a, Tag<T> b)
	{
		return new Tag<>()
		{
			@Override
			public boolean contains(T object)
			{
				return a.contains(object) || b.contains(object);
			}

			@Override
			public List<T> getValues()
			{
				return Streams.concat(a.getValues().stream(), b.getValues().stream()).parallel().toList();
			}
		};
	}

	@Contract(value = "_, _ -> new", pure = true)
	public static <T> @NotNull Tag<T> and(Tag<T> a, Tag<T> b)
	{
		return new Tag<>()
		{
			@Override
			public boolean contains(T object)
			{
				return a.contains(object) && b.contains(object);
			}

			@Override
			public List<T> getValues()
			{
				return a.getValues().stream().filter(e -> b.getValues().contains(e)).toList();
			}
		};
	}
}
