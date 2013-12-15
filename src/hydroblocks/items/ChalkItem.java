package hydroblocks.items;

import hydroblocks.hydroblocks;
import hydroblocks.lib.config.Names;
import net.minecraft.item.Item;

public class ChalkItem extends Item{

	public ChalkItem(int id) {
		super(id);
		setCreativeTab(hydroblocks.hydroblocks);
		setUnlocalizedName(Names.chalkItem_unlocalizedName);
	}

}
