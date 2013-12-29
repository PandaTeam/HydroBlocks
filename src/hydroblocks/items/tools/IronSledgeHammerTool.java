
package hydroblocks.items.tools;

import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class IronSledgeHammerTool extends ItemTool {
	
	public static final Block[] blocksEffectiveAgainst = {Block.blockDiamond, Block.blockEmerald, Block.blockGold,
		Block.blockIron, Block.blockNetherQuartz, Block.obsidian, Block.oreCoal, Block.oreDiamond, Block.oreEmerald,
		Block.oreGold, Block.oreIron, Block.oreLapis, Block.oreNetherQuartz, Block.oreRedstone, Block.oreRedstoneGlowing};
	
	public IronSledgeHammerTool(int id, EnumToolMaterial material) {
		super(id, 2F, material, blocksEffectiveAgainst);
		setCreativeTab(hydroblocks.hydroblocks);
		setUnlocalizedName(Names.ironsledgehammerTool_unlocalizedName);
		setMaxStackSize(1);
		setMaxDamage(333);
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
		 
		 
		
		
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.ironsledgehammerTool_unlocalizedName);

		}
}
