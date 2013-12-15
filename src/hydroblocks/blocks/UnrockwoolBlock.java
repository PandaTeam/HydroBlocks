package hydroblocks.blocks;

import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class UnrockwoolBlock extends Block {
	
	public UnrockwoolBlock(int id) {
		super(id, Material.sponge);
		this.setUnlocalizedName(Names.unrockwoolBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(0.8F);
		this.setResistance(0.6F);
		this.setStepSound(Block.soundClothFootstep);
		this.setLightValue(0F);
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.unrockwoolBlock_unlocalizedName);
}

}
