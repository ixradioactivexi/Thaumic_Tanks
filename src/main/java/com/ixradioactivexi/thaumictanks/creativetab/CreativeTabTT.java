package com.ixradioactivexi.thaumictanks.creativetab;

import com.ixradioactivexi.thaumictanks.init.ModBlocks;
import com.ixradioactivexi.thaumictanks.init.ModItems;
import com.ixradioactivexi.thaumictanks.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTT
{
	public static final CreativeTabs TT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(ModBlocks.BraceBlock);
		}
	};
}
