package hydroblocks.blocks;

import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PerliteBlock extends Block {

	public PerliteBlock(int id) {
		super(id, Material.sand);
		this.setUnlocalizedName(Names.perliteBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(0.6F);
		this.setResistance(3F);
		this.setStepSound(Block.soundGravelFootstep);
		this.setLightValue(0F);
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.perliteBlock_unlocalizedName);
}
	
}
	