package hydroblocks.items;

import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IronFragments extends Item{

	public IronFragments(int id) {
		super(id);
		setCreativeTab(hydroblocks.hydroblocks);
		setUnlocalizedName(Names.ironFragments_unlocalizedName);
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.ironFragments_unlocalizedName);

		}
}