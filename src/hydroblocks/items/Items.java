package hydroblocks.items;

import hydroblocks.lib.config.Ids;
import hydroblocks.lib.config.Names;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
public static Item chalk;
public static Item rockfibre;

public static void init() {

	chalk = new ChalkItem(Ids.chalkItem_actual);

	rockfibre = new RockfibreItem(Ids.rockfibreItem_actual);
}

public static void addNames() {

	LanguageRegistry.addName(chalk, Names.chalkItem_name);
	LanguageRegistry.addName(rockfibre, Names.rockfibreItem_name);
	
	
}



}
