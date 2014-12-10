package com.ixradioactivexi.thaumictanks.block.multi;

import thaumcraft.api.TileThaumcraft;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.IAspectSource;
import thaumcraft.api.aspects.IEssentiaTransport;
import thaumcraft.api.wands.IWandable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;

public class Tank extends TileThaumcraft 
	implements IAspectSource, IEssentiaTransport, IWandable
{

	@Override
	public AspectList getAspects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAspects(AspectList aspects) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean doesContainerAccept(Aspect tag) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addToContainer(Aspect tag, int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean takeFromContainer(Aspect tag, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean takeFromContainer(AspectList ot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesContainerContainAmount(Aspect tag, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doesContainerContain(AspectList ot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int containerContains(Aspect tag) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isConnectable(ForgeDirection face) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canInputFrom(ForgeDirection face) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canOutputTo(ForgeDirection face) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSuction(Aspect aspect, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aspect getSuctionType(ForgeDirection face) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSuctionAmount(ForgeDirection face) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int takeEssentia(Aspect aspect, int amount, ForgeDirection face) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addEssentia(Aspect aspect, int amount, ForgeDirection face) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Aspect getEssentiaType(ForgeDirection face) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEssentiaAmount(ForgeDirection face) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinimumSuction() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean renderExtendedTube() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int onWandRightClick(World world, ItemStack wandstack,
			EntityPlayer player, int x, int y, int z, int side, int md) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack onWandRightClick(World world, ItemStack wandstack,
			EntityPlayer player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onUsingWandTick(ItemStack wandstack, EntityPlayer player,
			int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onWandStoppedUsing(ItemStack wandstack, World world,
			EntityPlayer player, int count) {
		// TODO Auto-generated method stub
		
	}

}
