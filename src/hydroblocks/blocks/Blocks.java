package hydroblocks.blocks;

import hydroblocks.blocks.tileentities.TileEntityBattery;
import hydroblocks.blocks.tileentities.TileEntityBomb;
import hydroblocks.blocks.tileentities.TileEntityHydroFurnace;
import hydroblocks.lib.config.Ids;
import hydroblocks.lib.config.Names;
import hydroblocks.ore.ChalkoreBlock;
import hydroblocks.ore.PerliteoreBlock;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class  Blocks {
public static Block block;
public static Block bombBlock;
public static PerliteBlock perliteBlock;
public static Block perliteoreBlock;
public static Block chalkoreBlock;
public static Block unrockwoolBlock;
public static Block rockwoolBlock;
public static Block batteryBlock;
public static Block furnaceBlock;



public static void init() {
block = new TutBlock(Ids.tutBlock_actual);
GameRegistry.registerBlock(block, Names.tutBlock_name);

bombBlock = new BombBlock(Ids.bombBlock_actual);
GameRegistry.registerBlock(bombBlock, Names.bombBlock_name);

perliteBlock = new PerliteBlock(Ids.perliteBlock_actual);
GameRegistry.registerBlock(perliteBlock, Names.perliteBlock_name);

perliteoreBlock = new PerliteoreBlock(Ids.perliteoreBlock_actual);
GameRegistry.registerBlock(perliteoreBlock, Names.perliteoreBlock_name);

chalkoreBlock = new ChalkoreBlock(Ids.chalkoreBlock_actual);
GameRegistry.registerBlock(chalkoreBlock, Names.chalkoreBlock_name);

unrockwoolBlock = new UnrockwoolBlock(Ids.unrockwoolBlock_actual);
GameRegistry.registerBlock(unrockwoolBlock, Names.unrockwoolBlock_name);

rockwoolBlock = new RockwoolBlock(Ids.rockwoolBlock_actual);
GameRegistry.registerBlock(rockwoolBlock, Names.rockwoolBlock_name);

batteryBlock = new BatteryBlock(Ids.batteryBlock_actual);
GameRegistry.registerBlock(batteryBlock, Names.batteryBlock_name);

furnaceBlock = new HydroFurnaceBlock(Ids.hydrofurnaceBlock_actual);
GameRegistry.registerBlock(furnaceBlock, Names.hydrofurnaceBlock_name);


}

public static void registerTileEntities() {
    GameRegistry.registerTileEntity(TileEntityBomb.class, Names.bombTile);
    GameRegistry.registerTileEntity(TileEntityBattery.class, Names.batteryTile);
    GameRegistry.registerTileEntity(TileEntityHydroFurnace.class, Names.hydrofurnaceTile);
}

public static void addNames() {
LanguageRegistry.addName(block, Names.tutBlock_name);
LanguageRegistry.addName(bombBlock, Names.bombBlock_name);
LanguageRegistry.addName(perliteBlock, Names.perliteBlock_name);
LanguageRegistry.addName(perliteoreBlock, Names.perliteoreBlock_name);
LanguageRegistry.addName(chalkoreBlock, Names.chalkoreBlock_name);
LanguageRegistry.addName(unrockwoolBlock, Names.unrockwoolBlock_name);
LanguageRegistry.addName(rockwoolBlock, Names.rockwoolBlock_name);
LanguageRegistry.addName(batteryBlock, Names.batteryBlock_name);
LanguageRegistry.addName(furnaceBlock, Names.hydrofurnaceBlock_name);
}



}



