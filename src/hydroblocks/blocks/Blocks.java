package hydroblocks.blocks;

import hydroblocks.blocks.tileentities.TileEntityBomb;
import hydroblocks.lib.config.Ids;
import hydroblocks.lib.config.Names;
import hydroblocks.ore.PerliteoreBlock;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class  Blocks {
public static Block block;
public static Block bombBlock;
public static PerliteBlock perliteBlock;
public static Block perliteoreBlock;

public static void init() {
block = new TutBlock(Ids.tutBlock_actual);
GameRegistry.registerBlock(block, Names.tutBlock_name);

bombBlock = new BombBlock(Ids.bombBlock_actual);
GameRegistry.registerBlock(bombBlock, Names.bombBlock_name);

perliteBlock = new PerliteBlock(Ids.perliteBlock_actual);
GameRegistry.registerBlock(perliteBlock, Names.perliteBlock_name);

perliteoreBlock = new PerliteoreBlock(Ids.perliteoreBlock_actual);
GameRegistry.registerBlock(perliteoreBlock, Names.perliteoreBlock_name);


}

public static void registerTileEntities() {
    GameRegistry.registerTileEntity(TileEntityBomb.class, Names.bombTile);
}

public static void addNames() {
LanguageRegistry.addName(block, Names.tutBlock_name);
LanguageRegistry.addName(bombBlock, Names.bombBlock_name);
LanguageRegistry.addName(perliteBlock, Names.perliteBlock_name);
LanguageRegistry.addName(perliteoreBlock, Names.perliteoreBlock_name);
}



}



