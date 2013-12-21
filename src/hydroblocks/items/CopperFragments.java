package hydroblocks.items;

import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CopperFragments extends Item{

	public CopperFragments(int id) {
		super(id);
		setCreativeTab(hydroblocks.hydroblocks);
		setUnlocalizedName(Names.copperFragments_unlocalizedName);
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.copperFragments_unlocalizedName);

		}
}