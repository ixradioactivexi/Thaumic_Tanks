package com.ixradioactivexi.thaumictanks.init;

import com.ixradioactivexi.thaumictanks.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.ThaumcraftApiHelper;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.research.ResearchCategories;
//import thaumcraft.common.config.ConfigItems;
public class TankRecipes 
{
	public static void init()
	{
		ThaumcraftApi.addArcaneCraftingRecipe("thaumtanks", (new ItemStack(ModItems.HardAmber)), new AspectList().add(Aspect.EARTH, 8), new Object[]{"aaa", "aaa", "aaa", Character.valueOf('a'), new ItemStack(Blocks.stone)});
		//ThaumcraftApi.addArcaneCraftingRecipe(ResearchCategories.getCategoryName(Reference.CATEGORY_THAUMICTANKS), new ItemStack(ModBlocks.BraceBlock), Aspect.EARTH,  "sss", "sss", "sss", 's', new ItemStack(ModItems.HardAmber));
	}
}