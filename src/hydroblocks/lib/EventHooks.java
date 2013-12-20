package hydroblocks.lib;

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

Random random;


        /**
        * The key is the @ForgeSubscribe annotation and the cast of the Event you put in as argument.
        * The method name you pick does not matter. Method signature is public void, always.
        */
        @ForgeSubscribe
        public void onHarvestDrops(BlockEvent.HarvestDropsEvent event)
  
                {
            random = new Random();
                        /*
                        * You can then proceed to read and change the Event's fields where possible
                        */
                        EntityPlayer player = event.harvester;
                        ItemStack heldItem = player.inventory.getCurrentItem();
                        Block block = event.block;        
                        
                        if(heldItem.itemID == Items.ironsledgehammer.itemID)
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