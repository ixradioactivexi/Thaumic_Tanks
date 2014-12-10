package com.ixradioactivexi.thaumictanks;

import net.minecraft.util.ResourceLocation;

import com.ixradioactivexi.thaumictanks.handler.ConfigurationHandler;
import com.ixradioactivexi.thaumictanks.init.ModBlocks;
import com.ixradioactivexi.thaumictanks.init.ModItems;
import com.ixradioactivexi.thaumictanks.init.TankRecipes;
import com.ixradioactivexi.thaumictanks.proxy.IProxy;
import com.ixradioactivexi.thaumictanks.reference.Reference;
import com.ixradioactivexi.thaumictanks.research.TanksResearch;
import com.ixradioactivexi.thaumictanks.util.LogHelper;

import thaumcraft.api.ThaumcraftApi;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VER, dependencies = Reference.MOD_DEP ,guiFactory = Reference.GUI_FACTORY_CLASS)
public class ThaumicTanks 
{

	@Mod.Instance(Reference.MOD_ID)
	public static ThaumicTanks instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Pre Initialization Complete!");
		
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		TankRecipes.init();
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		TanksResearch.init();
		LogHelper.info("Post Initialization Complete!");
	}
}
