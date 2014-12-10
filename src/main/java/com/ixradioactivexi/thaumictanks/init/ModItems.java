package com.ixradioactivexi.thaumictanks.init;

import com.ixradioactivexi.thaumictanks.item.ItemHardAmber;
import com.ixradioactivexi.thaumictanks.item.ItemTT;
import com.ixradioactivexi.thaumictanks.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemTT HardAmber = new ItemHardAmber();
	
	public static void init()
	{
		GameRegistry.registerItem(HardAmber, "HardAmber");
	}
}
