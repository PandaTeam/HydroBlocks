package hydroblocks.lib.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		
		Configuration config = new Configuration(configFile);
		
		final String BOOLEANS = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "booleans";
		
		config.load();
		
		//Enables and disables
		Booleans.enableTool = config.get(BOOLEANS, Booleans.enableTool_name, 
		Booleans.enableTool_default).getBoolean(Booleans.enableTool_default);
		
		Booleans.hardRecipe = config.get(BOOLEANS, Booleans.hardRecipe_name, 
		Booleans.hardRecipe_default).getBoolean(Booleans.hardRecipe_default);
		
		
		//Items
		
		Ids.chalkItem_actual = config.getItem(config.CATEGORY_ITEM, Names.chalkItem_name, 
		Ids.chalkItem_default).getInt() - 256;
		
		Ids.rockfibreItem_actual = config.getItem(config.CATEGORY_ITEM, Names.rockfibreItem_name, 
		Ids.rockfibreItem_default).getInt() - 256;
		
		Ids.cobblesledgehammerTool_actual = config.getItem(config.CATEGORY_ITEM, Names.cobblesledgehammerTool_name,
		Ids.cobblesledgehammerTool_default).getInt() - 256;
		
		Ids.ironsledgehammerTool_actual = config.getItem(config.CATEGORY_ITEM, Names.ironsledgehammerTool_name,
		Ids.ironsledgehammerTool_default).getInt() - 256;
		
		Ids.goldsledgehammerTool_actual = config.getItem(config.CATEGORY_ITEM, Names.goldsledgehammerTool_name,
		Ids.goldsledgehammerTool_default).getInt() - 256;
		
		Ids.diamondsledgehammerTool_actual = config.getItem(config.CATEGORY_ITEM, Names.diamondsledgehammerTool_name,
		Ids.diamondsledgehammerTool_default).getInt() - 256;
		
				
		//Blocks
		Ids.tutBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.tutBlock_name, 
		Ids.tutBlock_default).getInt();
		
	
		Ids.bombBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.bombBlock_name,
		Ids.bombBlock_default).getInt();
		
		Ids.perliteBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.perliteBlock_name,
		Ids.perliteBlock_default).getInt();
		
		Ids.perliteoreBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.perliteoreBlock_name,
		Ids.perliteoreBlock_default).getInt();
		
		Ids.chalkoreBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.chalkoreBlock_name,
		Ids.chalkoreBlock_default).getInt();
		
		Ids.unrockwoolBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.unrockwoolBlock_name,
		Ids.unrockwoolBlock_default).getInt();
		
		Ids.rockwoolBlock_actual = config.getBlock(config.CATEGORY_BLOCK, Names.rockwoolBlock_name,
		Ids.rockwoolBlock_default).getInt();

		

		config.save();
		
		

}
}