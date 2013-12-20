package hydroblocks.items;

import hydroblocks.items.tools.CobbleSledgeHammerTool;
import hydroblocks.items.tools.DiamondSledgeHammerTool;
import hydroblocks.items.tools.GoldSledgeHammerTool;
import hydroblocks.items.tools.IronSledgeHammerTool;
import hydroblocks.lib.config.Ids;
import hydroblocks.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
public static Item chalk;
public static Item rockfibre;
public static Item cobblesledgehammer;
public static Item ironsledgehammer;
public static Item goldsledgehammer;
public static Item diamondsledgehammer;

public static void init() {

	chalk = new ChalkItem(Ids.chalkItem_actual);

	rockfibre = new RockfibreItem(Ids.rockfibreItem_actual);
	
	cobblesledgehammer = new CobbleSledgeHammerTool(Ids.cobblesledgehammerTool_actual, EnumToolMaterial.STONE);
	ironsledgehammer = new IronSledgeHammerTool(Ids.ironsledgehammerTool_actual, EnumToolMaterial.IRON);
	goldsledgehammer = new GoldSledgeHammerTool(Ids.goldsledgehammerTool_actual, EnumToolMaterial.GOLD);
	diamondsledgehammer = new DiamondSledgeHammerTool(Ids.diamondsledgehammerTool_actual, EnumToolMaterial.EMERALD);
	
	
}

public static void addNames() {

	LanguageRegistry.addName(chalk, Names.chalkItem_name);
	LanguageRegistry.addName(rockfibre, Names.rockfibreItem_name);
	LanguageRegistry.addName(cobblesledgehammer, Names.cobblesledgehammerTool_name);
	LanguageRegistry.addName(ironsledgehammer, Names.ironsledgehammerTool_name);
	LanguageRegistry.addName(goldsledgehammer, Names.goldsledgehammerTool_name);
	LanguageRegistry.addName(diamondsledgehammer, Names.diamondsledgehammerTool_name);
	
	
}



}
