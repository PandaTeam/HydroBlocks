package hydroblocks.ore;

import hydroblocks.hydroblocks;
import hydroblocks.blocks.Blocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import hydroblocks.items.Items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ChalkoreBlock extends Block {

	private int perliteBlock;


	public ChalkoreBlock(int id) {
		super(id, Material.clay);
		this.setUnlocalizedName(Names.chalkoreBlock_unlocalizedName);
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
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Items.chalk.itemID;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 4;
    }


	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.chalkoreBlock_unlocalizedName);
}
	
}