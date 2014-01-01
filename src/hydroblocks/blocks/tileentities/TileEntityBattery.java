package hydroblocks.blocks.tileentities;

import java.util.EnumSet;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.ForgeDirection;
import universalelectricity.compatibility.TileEntityUniversalElectrical;
import universalelectricity.core.block.IElectrical;

public class TileEntityBattery extends TileEntityUniversalElectrical implements IElectrical{
	
	


	
	
	
	
	
	@Override
	public EnumSet<ForgeDirection> getOutputDirections()
	{
		return EnumSet.of(ForgeDirection.UP, ForgeDirection.DOWN);
	}

	@Override
	public float getRequest(ForgeDirection direction) {
		 return (float) Math.min((this.getMaxEnergyStored() - this.getEnergyStored()), 200);
	}

	@Override
	public float getProvide(ForgeDirection direction) {
		if (energyStored >= 1){
			return 1;
		} else
		return 0;
		
	}

	@Override
	public float getMaxEnergyStored() {
		// TODO Auto-generated method stub
		return 10000;
	}
	
	@Override
	public void updateEntity()
	{
		super.updateEntity();
		this.produce();
		//this.receiveElectricity(5000,true);
		
		
		
		//1 to 10 %
		if (energyStored >= 0 && energyStored <= 100) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 0, 3);
			
		}
		//10 % to 20%
		if (energyStored >= 1000 && energyStored <= 1999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 3);
		}
		//20% - 30%
		if (energyStored >= 2000 && energyStored <= 2999 ) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 2, 3);
		}
		//30% - 40%
		if (energyStored >= 3000 && energyStored <= 3999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 3, 3);
		}
		//40% - 50%
		if (energyStored >= 4000 && energyStored <= 4999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 4, 3);
		}
		// 50% - 60%
		if (energyStored >= 5000 && energyStored <= 5999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 5, 3);
		}
		//60% - 70%
		if (energyStored >= 6000 && energyStored <= 6999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 6, 3);
		}
		//70% - 80%
		if (energyStored >= 7000 && energyStored <= 7999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 7, 3);
		}
		//80% - 90%
		if (energyStored >= 8000 && energyStored <= 8999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 8, 3);
		}
		//90 % - 100%
		if (energyStored >= 9000 && energyStored <= 9999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 9, 3);
		}
		
		//100%
		if (energyStored > 9999) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 10, 3);
		}
				
		
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		compound.setShort("Energy", (short)energyStored);
				
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		
		energyStored = compound.getShort("Energy");
				
	}
	

	

	

	

	
}
