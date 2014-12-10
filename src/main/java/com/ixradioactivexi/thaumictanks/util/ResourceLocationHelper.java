package com.ixradioactivexi.thaumictanks.util;

import com.ixradioactivexi.thaumictanks.reference.Reference;
import net.minecraft.util.ResourceLocation;


public class ResourceLocationHelper 
{
	public static ResourceLocation getResourceLocation(String modID, String path)
	{
		return new ResourceLocation(modID, path);
	}
	public static ResourceLocation getResourceLocation(String path)
	{
		return new ResourceLocation(Reference.MOD_ID.toLowerCase(), path);
	}
}
