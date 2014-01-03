// instead of having the code in a update have it sent in a packet.

package hydroblocks.blocks.tileentities;

import java.util.EnumSet;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
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

	
	// three different outputs 100, 1000, 10000
	@Override
	public float getProvide(ForgeDirection direction) {
		if (energyStored >= 100){
			return 100;
		} else
		return energyStored;
		
	}
// three different power storage levels 50000, 500000, 5000000.
	
	int MaxEnergyStored = 50000;
	@Override
	public float getMaxEnergyStored() {
		return MaxEnergyStored;
	}
	
	@Override
	public void updateEntity()
	{
		super.updateEntity();
		this.produce();
		//this.receiveElectricity(5000,true);
		
		
		
		//1 to 10 %
		if (energyStored >= 0.00 && energyStored <= 5000.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 0, 3);
			
		}
		//10 % to 20%
		if (energyStored >= 5000.00 && energyStored <= 10000.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 3);
		}
		//20% - 30%
		if (energyStored >= 10000.00 && energyStored <= 15000.00 ) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 2, 3);
		}
		//30% - 40%
		if (energyStored >= 15000.00 && energyStored <= 20000.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 3, 3);
		}
		//40% - 50%
		if (energyStored >= 20000.00 && energyStored <= 25000.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 4, 3);
		}
		// 50% - 60%
		if (energyStored >= 25000.00 && energyStored <= 30000.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 5, 3);
		}
		//60% - 70%
		if (energyStored >= 30000.00 && energyStored <= 35000.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 6, 3);
		}
		//70% - 80%
		if (energyStored >= 35000.00 && energyStored <= 40000.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 7, 3);
		}
		//80% - 90%
		if (energyStored >= 40000.00 && energyStored <= 45000.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 8, 3);
		}
		//90 % - 100%
		if (energyStored >= 45000.00 && energyStored <= 49999.00) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 9, 3);
		}
		
		//100%
		if (energyStored > 50000.00) {
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
	

	
    public Packet getDescriptionPacket() {
        NBTTagCompound nbtTag = new NBTTagCompound();
        this.writeToNBT(nbtTag);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
}

public void onDataPacket(INetworkManager net, Packet132TileEntityData packet) {
        readFromNBT(packet.data);
}
	

	

	
}
