package hydroblocks.blocks;

import hydroblocks.hydroblocks;
import hydroblocks.blocks.tileentities.TileEntityBattery;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BatteryBlock extends BlockContainer {

	protected BatteryBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Names.batteryBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundMetalFootstep);
					
		}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		
		if(world.isRemote) return true;
		
		TileEntityBattery te = (TileEntityBattery) world.getBlockTileEntity(x, y, z);
			
		if (te != null) {
			if (player.isSneaking()) te.energyStored = 0;
			player.addChatMessage("Current Energy:" + te.energyStored);
			
			
			
		}
		
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityBattery();
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName);
}
	
}
