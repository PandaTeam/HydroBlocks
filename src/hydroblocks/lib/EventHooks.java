package hydroblocks.lib;

import java.util.Random;

import hydroblocks.items.Items;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.BlockEvent;



public class EventHooks {

	Random random;

        @ForgeSubscribe
        public void onHarvestDrops(BlockEvent.HarvestDropsEvent event)
        {
            random = new Random();
        	Block block = event.block;
        	
            EntityPlayer player = event.harvester;
            if(player!=null)
            {
                    ItemStack heldItemStack = player.getCurrentEquippedItem();
                    if(heldItemStack != null && player != null)
                    {
                            int heldItem = heldItemStack.itemID;
                    
                                    if(heldItem == Items.ironsledgehammer.itemID)
                                    {
                                    	if(block.blockID == Block.oreIron.blockID);
                                    	{                               	
                                            event.drops.clear();
                                            event.drops.add(new ItemStack(Block.blockGold, random.nextInt(2) + 1));
                                            event.dropChance = 1.0F;
                                    	}
                                    }
                    }               
            }
        }
        
}
 

                        		
                        
                                        
                
