package hydroblocks.items;

import hydroblocks.lib.config.Booleans;
import hydroblocks.lib.config.Ids;
import hydroblocks.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
public static Item item;
public static Item tool;

public static void init() {
	item = new TutItem(Ids.tutItem_actual);
	if(Booleans.enableTool) {
	tool = new TutTool(Ids.tutTool_actual, EnumToolMaterial.EMERALD);
	}
}

public static void addNames() {
	LanguageRegistry.addName(item, Names.tutItem_name);
	LanguageRegistry.addName(tool, Names.tutTool_name);
	
}


}
