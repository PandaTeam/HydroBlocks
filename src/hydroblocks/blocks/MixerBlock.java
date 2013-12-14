package hydroblocks.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;



public class MixerBlock extends Block {

	public MixerBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Names.mixerBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setLightValue(1F);
	}
	
@SideOnly(Side.CLIENT)
	public static Icon topIcon;
@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
@SideOnly(Side.CLIENT)
	public static Icon sideIcon;

@Override
@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
	topIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.mixerBlock_unlocalizedName + "_top");
	bottomIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.mixerBlock_unlocalizedName + "_bottom");
	sideIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.mixerBlock_unlocalizedName + "_side");
	}

@Override
@SideOnly(Side.CLIENT)
public Icon getIcon(int side, int metadata) {
	if(side == 0) {
		return bottomIcon;
	}	
	
	else if(side == 1) {
		return topIcon;
	}
	
	else {
		return sideIcon;
	}
}


}


