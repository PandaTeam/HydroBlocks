package hydroblocks.blocks.tileentities;

import hydroblocks.lib.config.Ids;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBomb extends TileEntity {
	
	private static final int SPREAD_TIME = 5;
	private static final int SPREAD_LEVELS = 30;

	private int timer;
	private int level;

	
	public TileEntityBomb() {
		timer = SPREAD_TIME;
		level = 0;
		}
	
	public boolean isIdle() {
		return timer < 0;
	}
	


	@Override
	public void updateEntity() {
		if (!worldObj.isRemote) {
		
			if (timer == 0 && level < SPREAD_LEVELS) {
				spread(xCoord + 1, yCoord, zCoord);
				spread(xCoord -1 , yCoord, zCoord);
				spread(xCoord , yCoord, zCoord + 1);
				spread(xCoord, yCoord, zCoord - 1);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 3);
			}else if (timer == SPREAD_TIME * (level - SPREAD_LEVELS)) {
				worldObj.createExplosion(null, xCoord + 0.5, yCoord + 0.5, zCoord + 0.5, 4, true);
			}
			
			timer--;
		}
	}

	private void spread(int x, int y, int z) {
		if (worldObj.isAirBlock(x,  y, z)) {
			worldObj.setBlock(x, y, z, Ids.bombBlock_default);
			
			TileEntity tile = worldObj.getBlockTileEntity(x, y, z);
			if (tile != null && tile instanceof TileEntityBomb) {
				TileEntityBomb bomb = (TileEntityBomb)tile;
				
				bomb.level = level + 1;
			}
			
		
			
		}
	}

@Override
public void writeToNBT (NBTTagCompound compound) {
	super.writeToNBT(compound);
	
	compound.setInteger("Timer", (short)timer);
	compound.setInteger("Level", (short)level);
}

@Override
public void readFromNBT (NBTTagCompound compound) {
	super.readFromNBT(compound);
	
	timer = compound.getInteger("Timer");
	level = compound.getInteger("Level");
	
	
	
}
}



