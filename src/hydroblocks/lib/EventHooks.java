package hydroblocks.lib;

import java.util.Random;

import hydroblocks.items.Items;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;


public class EventHooks {
Random random = new Random();

@ForgeSubscribe
public void onHarvestDrops(HarvestDropsEvent event) {
	
// cobble sledgehammer
if (event.harvester != null && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().itemID == Items.cobblesledgehammer.itemID) {


if (event.block.blockID == Block.oreIron.blockID) {
	event.drops.clear();
	event.dropChance = 1.0F;
	event.drops.add(new ItemStack(Items.ironfragments, random.nextInt(2) + 1));
}

if (event.block.blockID == Block.oreGold.blockID) {
	event.drops.clear();
	event.dropChance = 1.0F;
	event.drops.add(new ItemStack(Items.goldfragments, random.nextInt(2) + 1));
}
}

// Iron sledgehammer
if (event.harvester != null && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().itemID == Items.ironsledgehammer.itemID) {


if (event.block.blockID == Block.oreIron.blockID) {
	event.drops.clear();
	event.dropChance = 1.0F;
	event.drops.add(new ItemStack(Items.ironfragments, random.nextInt(2) + 1));
}

if (event.block.blockID == Block.oreGold.blockID) {
	event.drops.clear();
	event.dropChance = 1.0F;
event.drops.add(new ItemStack(Items.goldfragments, random.nextInt(2) + 1));
}
}

// Gold Sledgehammer
if (event.harvester != null && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().itemID == Items.goldsledgehammer.itemID) {

if (event.block.blockID == Block.oreIron.blockID) {
	event.drops.clear();
	event.dropChance = 1.0F;
	event.drops.add(new ItemStack(Items.ironfragments, random.nextInt(2) + 1));
}

if (event.block.blockID == Block.oreGold.blockID) {
	event.drops.clear();
	event.dropChance = 1.0F;
	event.drops.add(new ItemStack(Items.goldfragments, random.nextInt(2) + 1));
}
}

// Diamond sledgehammer
if (event.harvester != null && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().itemID == Items.diamondsledgehammer.itemID) {


if (event.block.blockID == Block.oreIron.blockID) {
	event.drops.clear();
	event.dropChance = 1.0F;
	event.drops.add(new ItemStack(Items.ironfragments, random.nextInt(2) + 1));
}

if (event.block.blockID == Block.oreGold.blockID) {
	event.drops.clear();
	event.dropChance = 1.0F;
	event.drops.add(new ItemStack(Items.goldfragments, random.nextInt(2) + 1));
}






}
}
}





