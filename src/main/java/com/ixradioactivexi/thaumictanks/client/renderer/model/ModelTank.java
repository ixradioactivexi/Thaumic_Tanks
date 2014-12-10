package com.ixradioactivexi.thaumictanks.client.renderer.model;

import com.ixradioactivexi.thaumictanks.reference.Models;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

@SideOnly(Side.CLIENT)
public class ModelTank
{
	private IModelCustom modelTank;
	
	public ModelTank()
	{
		modelTank = AdvancedModelLoader.loadModel(Models.TANK);
	}
	
	public void render()
	{
		modelTank.renderPart("Base");
	}
}
