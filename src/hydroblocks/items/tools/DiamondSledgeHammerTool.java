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



public class DiamondSledgeHammerTool extends ItemTool {
	
	public static final Block[] blocksEffectiveAgainst = {Block.blockDiamond, Block.blockEmerald, Block.blockGold,
		Block.blockIron, Block.blockNetherQuartz, Block.obsidian, Block.oreCoal, Block.oreDiamond, Block.oreEmerald,
		Block.oreGold, Block.oreIron, Block.oreLapis, Block.oreNetherQuartz, Block.oreRedstone, Block.oreRedstoneGlowing};
	
	public DiamondSledgeHammerTool(int id, EnumToolMaterial material) {
		super(id, 2F, material, blocksEffectiveAgainst);
		setCreativeTab(hydroblocks.hydroblocks);
		setUnlocalizedName(Names.cobblesledgehammerTool_unlocalizedName);
		setMaxStackSize(1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.diamondsledgehammerTool_unlocalizedName);

		}
}
