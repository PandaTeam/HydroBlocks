package hydroblocks.blocks.tileentities;

import java.util.EnumSet;

import net.minecraftforge.common.ForgeDirection;
import universalelectricity.compatibility.TileEntityUniversalElectrical;
import universalelectricity.core.block.IElectrical;

public class TileEntityHydroFurnace extends TileEntityUniversalElectrical implements IElectrical{
	
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
	}
	
}
