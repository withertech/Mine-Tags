package com.withertech.mine_tags.util.fabric;

import dev.architectury.hooks.tags.TagHooks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagCollection;

import java.util.function.Supplier;

public class TagUtilImpl
{
	public static <T> Tag.Named<T> make(String name, Supplier<TagCollection<T>> collection)
	{
		return TagHooks.optional(new ResourceLocation("fabric", name), collection);
	}
}
