package hydroblocks.lib;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CrushRecipes {

    private static final CrushRecipes crushingBase = new CrushRecipes();

    /** The list of crushing results. */
    private Map crushingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaCrushingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addCrushing and getCrushingResult.
     */
    public static final CrushRecipes crushing()
    {
        return crushingBase;
    }

    private CrushRecipes()
    {

    }


	/**
     * Adds a crushing recipe.
     */
    public void addCrushing(int par1, ItemStack par2ItemStack, float par3)
    {
        this.crushingList.put(Integer.valueOf(par1), par2ItemStack);
        this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
    }

    /**
     * Returns the crushing result of an item.
     * Deprecated in favor of a metadata sensitive version
     */
    @Deprecated
    public ItemStack getCrushingResult(int par1)
    {
        return (ItemStack)this.crushingList.get(Integer.valueOf(par1));
    }

    public Map getCrushingList()
    {
        return this.crushingList;
    }

    /**
     * A metadata sensitive version of adding a furnace recipe.
     */
    public void addCrushing(int itemID, int metadata, ItemStack itemstack, float experience)
    {
        metaCrushingList.put(Arrays.asList(itemID, metadata), itemstack);
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * @param item The Source ItemStack
     * @return The result ItemStack
     */
    public ItemStack getCrushingResult(ItemStack item) 
    {
        if (item == null)
        {
            return null;
        }
        ItemStack ret = (ItemStack)metaCrushingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)crushingList.get(Integer.valueOf(item.itemID));
    }

   

    public Map<List<Integer>, ItemStack> getMetaCrushingList()
    {
        return metaCrushingList;
    }
}
