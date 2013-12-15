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
	
	
}
}



