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
public static Item copperfragments;
public static Item goldfragments;
public static Item ironfragments;
public static Item tinfragments;

public static void init() {

	chalk = new ChalkItem(Ids.chalkItem_actual);

	rockfibre = new RockfibreItem(Ids.rockfibreItem_actual);
	
	cobblesledgehammer = new CobbleSledgeHammerTool(Ids.cobblesledgehammerTool_actual, EnumToolMaterial.STONE);
	ironsledgehammer = new IronSledgeHammerTool(Ids.ironsledgehammerTool_actual, EnumToolMaterial.IRON);
	goldsledgehammer = new GoldSledgeHammerTool(Ids.goldsledgehammerTool_actual, EnumToolMaterial.GOLD);
	diamondsledgehammer = new DiamondSledgeHammerTool(Ids.diamondsledgehammerTool_actual, EnumToolMaterial.EMERALD);
	
	copperfragments = new CopperFragments(Ids.copperFragments_actual);
	goldfragments = new GoldFragments(Ids.goldFragments_actual);
	ironfragments = new IronFragments(Ids.ironFragments_actual);
	tinfragments = new TinFragments(Ids.tinFragments_actual);
	
	
}

public static void addNames() {

	LanguageRegistry.addName(chalk, Names.chalkItem_name);
	
	LanguageRegistry.addName(rockfibre, Names.rockfibreItem_name);
	
	LanguageRegistry.addName(cobblesledgehammer, Names.cobblesledgehammerTool_name);
	LanguageRegistry.addName(ironsledgehammer, Names.ironsledgehammerTool_name);
	LanguageRegistry.addName(goldsledgehammer, Names.goldsledgehammerTool_name);
	LanguageRegistry.addName(diamondsledgehammer, Names.diamondsledgehammerTool_name);
	
	LanguageRegistry.addName(copperfragments, Names.copperFragments_name);
	LanguageRegistry.addName(goldfragments, Names.goldFragments_name);
	LanguageRegistry.addName(ironfragments, Names.ironFragments_name);
	LanguageRegistry.addName(tinfragments, Names.tinFragments_name);
	
	
}



}
