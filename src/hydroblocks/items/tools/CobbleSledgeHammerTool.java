package hydroblocks.items.tools;

import hydroblocks.hydroblocks;
import hydroblocks.items.Items;
import hydroblocks.lib.CrushRecipes;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class CobbleSledgeHammerTool extends ItemTool {
	
	public static final Block[] blocksEffectiveAgainst = {Block.blockDiamond, Block.blockEmerald, Block.blockGold,
		Block.blockIron, Block.blockNetherQuartz, Block.obsidian, Block.oreCoal, Block.oreDiamond, Block.oreEmerald,
		Block.oreGold, Block.oreIron, Block.oreLapis, Block.oreNetherQuartz, Block.oreRedstone, Block.oreRedstoneGlowing};
	
	public CobbleSledgeHammerTool(int id, EnumToolMaterial material) {
		super(id, 2F, material, blocksEffectiveAgainst);
		setCreativeTab(hydroblocks.hydroblocks);
		setUnlocalizedName(Names.cobblesledgehammerTool_unlocalizedName);
		setMaxStackSize(1);
	}
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
		return false;
		}
		
		return false;
		}
	
	 public boolean canHarvestBlock(Block par1Block, ItemStack itemStack) {
		  if (itemStack.itemID == this.itemID) {
		   return this.canHarvestBlockA(par1Block);
		  } else {
		   return canHarvestBlock(par1Block, itemStack);
		  }
		 }
		 public boolean canHarvestBlockA(Block par1Block) {
		  return true;
		 }
		 public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		  float dmg = 1.0F;
		  for (int i = 0; i < CobbleSledgeHammerTool.blocksEffectiveAgainst.length; ++i) {
		   if (CobbleSledgeHammerTool.blocksEffectiveAgainst[i] == par2Block) {
		        return this.efficiencyOnProperMaterial;
		   }
		  }
		  if (par1ItemStack.itemID == this.itemID)
		   dmg = 8.0F;
		  return dmg;
		  }
		 
		 //
		 
	        /**
	         * Code that makes the Cobble Sledgehammer drop the smelted item rather than the normal drop.
	         * Only affects the Cobble Sledgehammer.
	         */
	        @Override
	        public boolean onBlockStartBreak(ItemStack itemstack, int i, int j, int k, EntityPlayer player)
	        {
	                if(itemID == Items.cobblesledgehammer.itemID)
	                {
	                        Boolean flag = false;
	                        World world = player.worldObj;
	                        int blockID = world.getBlockId(i, j, k);
	                        int meta = world.getBlockMetadata(i, j, k);

	                        NBTTagList ench = itemstack.getEnchantmentTagList();
	                        int level = 0;
	                        if(ench != null)
	                        {
	                                for (int x = 0; x < ench.tagCount(); x++)
	                                {
	                                        NBTTagCompound nbt = (NBTTagCompound) ench.tagAt(x);
	                                        int id = nbt.getInteger("id");
	                                        if (id == Enchantment.fortune.effectId)
	                                        {
	                                                level = nbt.getInteger("lvl");
	                                        }
	                                }
	                        }
	                        ArrayList<ItemStack> items = Block.blocksList[blockID].getBlockDropped(world, i, j, k, meta, level);
	                        if(items == null || items.size() == 0)
	                        {
	                                return false;
	                        }
	                        if(Block.blocksList[blockID] != null && getStrVsBlock(itemstack, Block.blocksList[blockID], meta) > 1.0F)
	                        {
	                                for (ItemStack item : items)
	                                {
	                                        if (CrushRecipes.crushing().getCrushingResult(item) == null)
	                                        {
	                                                return false;
	                                        }
	                                        ItemStack crushed = CrushRecipes.crushing().getCrushingResult(item).copy();

	                                        world.playSoundEffect(i + 0.5F, j + 0.5F, k + 0.5F,
	                                                        Block.blocksList[blockID].stepSound.getBreakSound(),
	                                                        (Block.blocksList[blockID].stepSound.getVolume() + 1.0F) / 2.0F,
	                                                        Block.blocksList[blockID].stepSound.getPitch() * 0.8F);

	                                        world.setBlock(i, j, k, 0);
	                                        if(!world.isRemote)
	                                        {
	                                                float var6 = 0.7F;
	                                                double var7 = world.rand.nextFloat() * var6 + 1.0F - var6 * 0.5D;
	                                                double var9 = world.rand.nextFloat() * var6 + 1.0F - var6 * 0.5D;
	                                                double var11 = world.rand.nextFloat() * var6 + 1.0F - var6 * 0.5D;
	                                                EntityItem entityitem = new EntityItem(world, i + 0.5D /*+ var7*/, j + 0.5D /*+ var9*/, k + 0.D /*+ var11*/, crushed);
	                                                world.spawnEntityInWorld(entityitem);
	                                        }
	                                        itemstack.damageItem(1, player);
	                                        
	                                        flag = true;
	                                }
	                        }

	                        return flag;
	                }
	                else return false;
	        }
	        
	        //
		
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.cobblesledgehammerTool_unlocalizedName);

		}
}
