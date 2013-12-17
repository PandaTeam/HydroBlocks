package hydroblocks.ore;

import hydroblocks.hydroblocks;
import hydroblocks.blocks.Blocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class PerliteoreBlock extends Block {

	private int perliteBlock;


	public PerliteoreBlock(int id) {
		super(id, Material.sand);
		this.setUnlocalizedName(Names.perliteoreBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(0.6F);
		this.setResistance(3F);
		this.setStepSound(Block.soundGravelFootstep);
		this.setLightValue(0F);
	}
	
	/**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        return MathHelper.clamp_int(this.quantityDropped(par2Random) + par2Random.nextInt(par1 + 1), 1, 4);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 2 + par1Random.nextInt(3);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random random, int par2)  {
        return Blocks.perliteBlock.blockID;
       }
    
 	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.perliteoreBlock_unlocalizedName);
}

	public int getPerliteBlock() {
		return perliteBlock;
	}

	public void setPerliteBlock(int perliteBlock) {
		this.perliteBlock = perliteBlock;
	}
	
}
	