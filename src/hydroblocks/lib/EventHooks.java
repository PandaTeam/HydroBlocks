package hydroblocks.lib;

import hydroblocks.items.Items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.oredict.OreDictionary;



public class EventHooks {
		Random random = new Random();

		@ForgeSubscribe
		public void onHarvestDrops(HarvestDropsEvent event) {
		if (event.harvester != null && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().itemID == Items.ironsledgehammer.itemID 
		|| event.harvester.getHeldItem().itemID == Items.goldsledgehammer.itemID || event.harvester.getHeldItem().itemID == Items.diamondsledgehammer.itemID
		|| event.harvester.getHeldItem().itemID == Items.cobblesledgehammer.itemID) {
		event.drops.clear();
		event.dropChance = 1.0F;

		if (event.block.blockID == Block.oreIron.blockID) {
		event.drops.add(new ItemStack(Items.ironfragments, random.nextInt(2) + 1));
		}
		if (event.block.blockID == Block.oreGold.blockID) {
		event.drops.add(new ItemStack(Items.goldfragments, random.nextInt(2) + 1));
		}
		if (event.block.blockID == OreDictionary.getOreID("oreTin")) {
		event.drops.add(new ItemStack(Items.tinfragments, random.nextInt(2) + 1));
		}
		if (event.block.blockID == OreDictionary.getOreID("oreCopper")) {
		event.drops.add(new ItemStack(Items.copperfragments, random.nextInt(2) + 1));
		}
		}
		}
}



		

 

                        		
                        
                                        
                
