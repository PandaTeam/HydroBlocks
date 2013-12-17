package hydroblocks.lib;

import hydroblocks.blocks.Blocks;
import hydroblocks.items.Items;
import hydroblocks.lib.config.Ids;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;



public class Recipes {
public static void init() {

/*
	GameRegistry.addRecipe(new ItemStack(Blocks.block, 1),
			new Object[] {
			"DDD",
			"DDD",
			"DDD",
			'D', Block.dirt
			});
	
	CraftingManager.getInstance().addRecipe(new ItemStack(Items.item, 1),
			"CCC",
			"CCC",
			"CCC",
			Character.valueOf('C'), Block.cobblestone);
	
	if(!Booleans.hardRecipe) {
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.tool, 1),
		"DDD",
		"DSD",
		" S ",
		'D', Block.dirt,
		'S', Item.stick);
		} else {
		CraftingManager.getInstance().addRecipe(new ItemStack(Items.tool, 1),
		"DDD",
		"DSD",
		" S ",
		'D', Item.diamond,
		'S', Item.stick);

}

*/

/*Rockfibre*/
	GameRegistry.addRecipe(new ItemStack(Items.rockfibre, 4),
			new Object[] {
			"GSC",
			"GSC",
			"GSC",
			'G', Block.gravel,
			'S', Item.silk,
			'C', Items.chalk,
			});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.rockfibre, 1), new Object[]{
		new ItemStack(Block.gravel), new ItemStack(Item.silk), new ItemStack(Items.chalk) 
	});

/*Unrefined Rockwool*/	
	GameRegistry.addRecipe(new ItemStack(Blocks.unrockwoolBlock, 1),
			new Object[] {
			"RR",
			"RR",
			'R', Items.rockfibre,
			});
	
/*Rockwool*/	
	FurnaceRecipes.smelting().addSmelting(Ids.unrockwoolBlock_default, new ItemStack(Blocks.rockwoolBlock), 0.1F);
	
	
	
	/* Stone Sledge Hammer*/
	GameRegistry.addRecipe(new ItemStack(Items.cobblesledgehammer, 1),
		new Object[] {
		"CSC",
		"CSC",
		" S ", //the space = blank slot
		'C', Block.cobblestone,
		'S', Item.stick,
		}); 
	
	/* Iron Sledge Hammer*/
	GameRegistry.addRecipe(new ItemStack(Items.ironsledgehammer, 1),
			new Object[] {
		"ISI",
		"ISI",
		" S ", //the space = blank slot
		'I', Item.ingotIron,
		'S', Item.stick,
		});
	
	/* Gold Sledge Hammer*/
	GameRegistry.addRecipe(new ItemStack(Items.goldsledgehammer, 1),
			new Object[] {
		"GSG",
		"GSG",
		" S ", //the space = blank slot
		'I', Item.ingotGold,
		'S', Item.stick,
		});
	
	
	/* Diamond Sledge Hammer*/
	GameRegistry.addRecipe(new ItemStack(Items.diamondsledgehammer, 1),
			new Object[] {
		"DSD",
		"DSD",
		" S ", //the space = blank slot
		'I', Item.diamond,
		'S', Item.stick,
		});
	
	
	
}
}



