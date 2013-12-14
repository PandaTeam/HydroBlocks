package hydroblocks.blocks.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBattery extends TileEntity {
	
	public static final int MIN_CAPACITY = 0;
	public static final int MAX_CAPACITY = 100;
	

	private int min;
	private int max;
	private int current;

	public TileEntityBattery() {
		min = MIN_CAPACITY;
		max = MAX_CAPACITY;
		current = 0;
	}

	public int isIdle() {
		return current = 100;
		}
	

	
	@Override
	public void updateEntity() {
		if (!worldObj.isRemote) {
		
			if (current <= 100 ) {
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 3);
			}
			}
			
			current++;
		}
	
	
	@Override
	public void writeToNBT (NBTTagCompound compound) {
		super.writeToNBT(compound);
		
		compound.setInteger("Min", (short)min);
		compound.setInteger("Max", (short)max);
		compound.setInteger("Current", (short)current);
	}

	@Override
	public void readFromNBT (NBTTagCompound compound) {
		super.readFromNBT(compound);
		
		min = compound.getInteger("Min");
		max = compound.getInteger("Max");
		current = compound.getInteger("Current");
	
	}
	
}


