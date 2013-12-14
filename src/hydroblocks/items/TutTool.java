package hydroblocks.items;

import net.minecraft.client.renderer.texture.IconRegister;
//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutTool extends ItemOmniTool {
public TutTool(int id, EnumToolMaterial material) {
	super(id, material);
	this.setUnlocalizedName(Names.tutTool_unlocalizedName);
	this.setCreativeTab(hydroblocks.hydroblocks);
	setMaxStackSize(1);
	}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister icon) {
	itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.tutTool_unlocalizedName);

	}

}
