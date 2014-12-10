package com.ixradioactivexi.thaumictanks.research;

import java.util.HashMap;

import com.ixradioactivexi.thaumictanks.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class TanksResearch
{
	public static HashMap<String, Object> recipes = new HashMap();
	
	public static void init()
	{
		initTanksCat();
		initTanksResearch();
	}
	
	private static void initTanksCat()
	{
		ResearchCategories.registerCategory("Tanks", new ResourceLocation("thaumictanks", "textures/items/HardAmber.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));

	}
	
	private static void initTanksResearch()
	{
	//    new ResearchItem("HardAmber", "Tanks", new AspectList(), 0, 1, 0, new ItemStack(ModItems.HardAmber)).setPages(new ResearchPage[] {new ResearchPage("tc.research_page.Tanks.1"), new ResearchPage((IRecipe)recipes.get("HardAmber")) }).setStub().setAutoUnlock().setRound().registerResearchItem();
	}

	
}