package hydroblocks;

import hydroblocks.blocks.Blocks;
import hydroblocks.items.Items;
import hydroblocks.lib.LogHelper;
import hydroblocks.lib.ModInfo;
import hydroblocks.lib.Recipes;
import hydroblocks.lib.config.ConfigHandler;
import hydroblocks.lib.config.EventManager;
import hydroblocks.proxies.CommonProxy;
import hydroblocks.tab.hydroblockstab;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod ( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )
@NetworkMod ( channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = true )

public class hydroblocks {


@SidedProxy ( clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy", serverSide = ModInfo.PROXY_LOCATION + ".CommonProxy" )
public static CommonProxy proxy;

public static CreativeTabs hydroblocks = new hydroblockstab(CreativeTabs.getNextID(), ModInfo.NAME);

static EventManager eventmanager = new EventManager();

@EventHandler
public static void preInit (FMLPreInitializationEvent event ) {
	LogHelper.init();
	ConfigHandler.init(event.getSuggestedConfigurationFile());
	
	LogHelper.log(Level.INFO, "Preparing items");
	Items.init();
	Items.addNames();
	LogHelper.log(Level.INFO, "Items loaded");

	LogHelper.log(Level.INFO, "Preparing blocks");
	Blocks.init();
	Blocks.addNames();
	Blocks.registerTileEntities();
	LogHelper.log(Level.INFO, "Blocks loaded");

	LogHelper.log(Level.INFO, "Preparing recipes");
	Recipes.init();
	LogHelper.log(Level.INFO, "Recipes loaded");
	


}

@EventHandler
public static void init ( FMLInitializationEvent event ) {
	
	LanguageRegistry.instance().addStringLocalization("itemGroup." + ModInfo.NAME, "en_US", ModInfo.NAME);
	
	GameRegistry.registerWorldGenerator(eventmanager);
		
		}

@EventHandler
public static void postInit ( FMLPostInitializationEvent event ) {

}





}