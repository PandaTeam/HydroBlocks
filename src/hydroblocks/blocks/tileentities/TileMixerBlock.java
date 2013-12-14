package hydroblocks.blocks.tileentities;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import hydroblocks.blocks.tileentities.TileMixerBlock;
import plugins.buildcraft.api.BuildCraftFactory;
import plugins.buildcraft.api.IAction;
import plugins.buildcraft.api.IMachine;
import plugins.buildcraft.api.IPipeTile;
import plugins.buildcraft.api.IPowerReceptor;
import plugins.buildcraft.api.PowerHandler;
import plugins.buildcraft.api.IPipeConnection.ConnectOverride;
import plugins.buildcraft.api.PowerHandler.PowerReceiver;
import plugins.buildcraft.api.PowerHandler.Type;
import plugins.buildcraft.api.IPipeConnection;


public class TileMixerBlock extends TileEntity implements IMachine, IPowerReceptor {
	
	private PowerHandler powerHandler;
	
	public TileMixerBlock() {
		powerHandler = new PowerHandler(this, Type.MACHINE);
		
		float mj = BuildCraftFactory.MINING_MJ_COST_PER_BLOCK * BuildCraftFactory.miningMultiplier;
		powerHandler.configure(100 * BuildCraftFactory.miningMultiplier, 100 * BuildCraftFactory.miningMultiplier, mj, 1000 * BuildCraftFactory.miningMultiplier);
		powerHandler.configurePowerPerdition(1, 1);
	

		}
	

		@Override
		public PowerReceiver getPowerReceiver(ForgeDirection side) {
			return powerHandler.getPowerReceiver();
		}

		@Override
		public boolean manageFluids() {
			return false;
		}

		@Override
		public boolean manageSolids() {
			return false;
		}

		@Override
		public boolean allowAction(IAction action) {
			return false;
			
		
	}



		@Override
		public void doWork(PowerHandler workProvider) {
			// TODO Auto-generated method stub
			
		}



		@Override
		public World getWorld() {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public boolean isActive() {
			// TODO Auto-generated method stub
			return true;
		}
	
		public ConnectOverride overridePipeConnection(IPipeTile.PipeType type, ForgeDirection with)
		{
			return IPipeConnection.ConnectOverride.CONNECT;
		}
		
		}


