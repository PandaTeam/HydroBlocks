package hydroblocks.lib.config;

import java.util.Random;

import hydroblocks.items.Items;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.BlockEvent;

/**
* Name and cast of this class are irrelevant
*/

public class EventHooks {
	

	@ForgeSubscribe
	public void onHarvestDrops(BlockEvent.HarvestDropsEvent event)
	
		{

			EntityPlayer player = event.harvester;
			ItemStack heldItem = player.inventory.getCurrentItem();
			Block block = event.block;
			
			if(heldItem.itemID == Items.cobblesledgehammer.itemID || heldItem.itemID == Items.ironsledgehammer.itemID
					|| heldItem.itemID == Items.goldsledgehammer.itemID || heldItem.itemID == Items.diamondsledgehammer.itemID)

			{	
			
			if(block == Block.oreIron);	
			{
				if(new Random().nextInt(1)==0)
				{
				event.drops.clear();				
				event.drops.add(new ItemStack(Block.blockLapis));
				event.dropChance = 1F;
				} else 
				{
					event.drops.clear();				
					event.drops.add(new ItemStack(Block.blockGold));
					event.dropChance = 1F;
				}
			}
			}
			
					
		
	}







		}
