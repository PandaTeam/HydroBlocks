
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
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
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


TileEntityBattery batteryte = (TileEntityBattery) world.getBlockTileEntity(x, y, z);


if (batteryte != null) {
if (player.isSneaking()) batteryte.energyStored = 100;
player.addChatMessage("Current Energy:" + batteryte.energyStored);



}

return true;

}


	


@Override
public TileEntity createTileEntity(World world, int meta) {
return new TileEntityBattery();
}



@SideOnly(Side.CLIENT)
private Icon emptyIcon;
private	Icon tenIcon;
private	Icon twentyIcon;
private	Icon thirtyIcon;
private	Icon fourtyIcon;
private	Icon fiftyIcon;
private	Icon sixtyIcon;
private	Icon seventyIcon;
private	Icon eightyIcon;
private	Icon nintyIcon;
private	Icon hunderedIcon;



@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister register) {
blockIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName);
emptyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_0");
tenIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_10");
twentyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_20");
thirtyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_30");
fourtyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_40");
fiftyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_50");
sixtyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_60");
seventyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_70");
eightyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_80");
nintyIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_90");
hunderedIcon = register.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.batteryBlock_unlocalizedName + "_100");

}



@Override
@SideOnly(Side.CLIENT)
public Icon getIcon(int side, int meta) {
	
	//1 to 10 %
	if (meta == 0) {
		return  emptyIcon;
	} 
	
	//10 % to 20%
	if (meta == 1) {
		return tenIcon;
	} 
	
	//20% - 30%
	if (meta == 2) {
		return  twentyIcon;
	} 
	
	//30% - 40%
	if (meta == 3) {
		return thirtyIcon;
	}
	
	//40% - 50%
	if (meta == 4) {
		return  fourtyIcon;
	} 

	// 50% - 60%
	if (meta == 5) {
		return fiftyIcon;
	} 
	
	//60% - 70%
	if (meta == 6) {
		return  sixtyIcon;
	} 
	
	//70% - 80%
	if (meta == 7) {
		return seventyIcon;
	} 
	
	//80% - 90%
	if (meta == 8) {
		return  eightyIcon;
	} 
	
	//90 % - 100%
	if (meta == 9) {
		return nintyIcon;
	} 	
	
	//100%
	if (meta == 10) {
		return  hunderedIcon;
	} 
		
	return blockIcon;
	

}







@Override
public TileEntity createNewTileEntity(World world) {
	return null;
}



}