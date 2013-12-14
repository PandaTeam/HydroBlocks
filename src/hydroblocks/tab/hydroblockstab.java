package hydroblocks.tab;

import hydroblocks.blocks.Blocks;
import net.minecraft.creativetab.CreativeTabs;

public class hydroblockstab extends CreativeTabs {
public hydroblockstab(int id, String name) {
super(id, name);
}

@Override
public int getTabIconItemIndex() {
return Blocks.block.blockID;


}
}
