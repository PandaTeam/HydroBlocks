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
	
	/*Furnace Recipes*/	
	FurnaceRecipes.smelting().addSmelting(Ids.unrockwoolBlock_default, new ItemStack(Blocks.rockwoolBlock), 0.1F);
	
	FurnaceRecipes.smelting().addSmelting(Ids.ironFragments_default, new ItemStack(Item.ingotIron), 0.1F);
	FurnaceRecipes.smelting().addSmelting(Ids.goldFragments_default, new ItemStack(Item.ingotGold), 0.1F);
	FurnaceRecipes.smelting().addSmelting(Ids.copperFragments_default, new ItemStack(Items.copperIngot), 0.1F);
	FurnaceRecipes.smelting().addSmelting(Ids.tinFragments_default, new ItemStack(Items.tinIngot), 0.1F);
	
	
	
}
}



