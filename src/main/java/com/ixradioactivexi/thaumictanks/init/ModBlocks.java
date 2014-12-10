package com.ixradioactivexi.thaumictanks.init;

import com.ixradioactivexi.thaumictanks.block.BlockBrace;
import com.ixradioactivexi.thaumictanks.block.BlockTT;
import com.ixradioactivexi.thaumictanks.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final BlockTT BraceBlock = new BlockBrace();
	
	public static void init()
	{
		GameRegistry.registerBlock(BraceBlock, "BraceBlock");
	}
}
