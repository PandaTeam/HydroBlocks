package hydroblocks.blocks;

import hydroblocks.hydroblocks;
import hydroblocks.blocks.tileentities.TileEntityBomb;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BombBlock extends BlockContainer {

	public BombBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Names.bombBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundMetalFootstep);
					
		}
	
	@SideOnly(Side.CLIENT)
		private Icon idleIcon;
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.bombBlock_unlocalizedName);
		idleIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.bombBlock_unlocalizedName + "_idle");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return meta == 0 ? blockIcon :idleIcon;
		
		
	}

	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBomb();
	}
	
}
	



