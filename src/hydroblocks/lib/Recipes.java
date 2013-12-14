package hydroblocks.lib;

import hydroblocks.blocks.Blocks;
import hydroblocks.items.Items;
import hydroblocks.lib.config.Booleans;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;


public class Recipes {
public static void init() {


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
}
}



