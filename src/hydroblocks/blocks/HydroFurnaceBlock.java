package hydroblocks.blocks;

import hydroblocks.hydroblocks;
import hydroblocks.blocks.tileentities.TileEntityBattery;
import hydroblocks.blocks.tileentities.TileEntityHydroFurnace;
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

public class HydroFurnaceBlock extends BlockContainer {

	protected HydroFurnaceBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName(Names.hydrofurnaceBlock_unlocalizedName);
		this.setCreativeTab(hydroblocks.hydroblocks);
		this.setHardness(2F);
		this.setResistance(15F);
		this.setStepSound(Block.soundMetalFootstep);
					
		}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		
		if(world.isRemote) return true;
		
		TileEntityHydroFurnace furnaceTE = (TileEntityHydroFurnace) world.getBlockTileEntity(x, y, z);
			
		if (furnaceTE != null) {
			if (player.isSneaking()) furnaceTE.energyStored = 100;
			player.addChatMessage("Current Energy:" + furnaceTE.energyStored);
			
			
			
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
		blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.hydrofurnaceBlock_unlocalizedName);
}
	
}
