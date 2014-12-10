package com.ixradioactivexi.thaumictanks.block;

import com.ixradioactivexi.thaumictanks.creativetab.CreativeTabTT;

public class BlockBrace extends BlockTT
{
	public BlockBrace()
	{
		super();
		this.setBlockName("BraceBlock");
		this.setBlockTextureName("BraceBlock");
		this.setBlockBounds(-1.5F, 0.0F, -1.5F, 1.5F, 3.0F, 1.5F);
		this.setBlockBoundsForItemRender();
	}
	public boolean isOpaqueCube()
	{
		return false;
	}
}
