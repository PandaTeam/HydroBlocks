package hydroblocks.blocks.tileentities;

import java.util.EnumSet;

import universalelectricity.compatibility.TileEntityUniversalElectrical;
import universalelectricity.core.block.IElectrical;
import ic2.api.energy.event.EnergyTileLoadEvent;
import ic2.api.energy.event.EnergyTileUnloadEvent;
import ic2.api.energy.tile.IEnergySink;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.MinecraftForge;

public class TileEntityBattery extends TileEntityUniversalElectrical implements IElectrical{
	
	@Override
	public EnumSet<ForgeDirection> getOutputDirections()
	{
		return EnumSet.of(ForgeDirection.UP);
	}

	@Override
	public float getRequest(ForgeDirection direction) {
		 return (float) Math.min((this.getMaxEnergyStored() - this.getEnergyStored()), 200);
	}

	@Override
	public float getProvide(ForgeDirection direction) {
		return 0;
	}

	@Override
	public float getMaxEnergyStored() {
		// TODO Auto-generated method stub
		return 10000;
	}
	
}
