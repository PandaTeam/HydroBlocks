package hydroblocks.blocks;

import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class RockwoolBlock extends Block {
	
	public RockwoolBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Names.rockwoolBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(1.5F);
		this.setResistance(10F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setLightValue(0F);
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.rockwoolBlock_unlocalizedName);
}

}
