package com.ixradioactivexi.thaumictanks.block;

import com.ixradioactivexi.thaumictanks.creativetab.CreativeTabTT;
import com.ixradioactivexi.thaumictanks.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister; 

public class BlockTT extends Block
{

	public BlockTT(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabTT.TT_TAB);
	}
	
	public BlockTT()
	{
		this (Material.rock);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocaizedName(super.getUnlocalizedName()));
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocaizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocaizedName (String unlocaizedName)
	{
		return unlocaizedName.substring(unlocaizedName.indexOf(".") + 1);
	}
}
