package hydroblocks.items;

import hydroblocks.hydroblocks;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class RockfibreItem extends Item {
	
	public RockfibreItem(int id) {
		super(id);
		setCreativeTab(hydroblocks.hydroblocks);
		setUnlocalizedName(Names.rockfibreItem_unlocalizedName);
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.rockfibreItem_unlocalizedName);

		}

}
