package hydroblocks.lib;

import java.util.Random;

import hydroblocks.items.Items;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.BlockEvent;

public class EventHooks {
	Random random = new Random();


@ForgeSubscribe
public void onHarvestDrops(BlockEvent.HarvestDropsEvent event)

{

EntityPlayer player = event.harvester;
ItemStack heldItem = player.inventory.getCurrentItem();
Block block = event.block;

if(heldItem.itemID == Items.cobblesledgehammer.itemID || heldItem.itemID == Items.ironsledgehammer.itemID
|| heldItem.itemID == Items.goldsledgehammer.itemID || heldItem.itemID == Items.diamondsledgehammer.itemID)

{

	if (event.harvester != null && event.harvester.getHeldItem() != null &&event.block.blockID == Block.oreIron.blockID) {
		event.drops.clear();
        event.drops.add(new ItemStack(Items.ironfragments, random.nextInt(2) + 1));
        event.dropChance = 1.0F;
        }
        if (event.block.blockID == Block.oreGold.blockID) {
    	event.drops.clear();
        event.drops.add(new ItemStack(Items.goldfragments, random.nextInt(2) + 1));
        event.dropChance = 1.0F;
        }
       // if (event.block.blockID == OreDictionary.getOreID("oreTin")) {
		//event.drops.clear();
       // event.drops.add(new ItemStack(Items.tinfragments, random.nextInt(2) + 1));
        //event.dropChance = 1.0F;
      //  }
        //if (event.block.blockID == OreDictionary.getOreID("oreCopper")) {
		//event.drops.clear();
       // event.drops.add(new ItemStack(Items.copperfragments, random.nextInt(2) + 1));
        //event.dropChance = 1.0F;
       // }
        }
        }
}