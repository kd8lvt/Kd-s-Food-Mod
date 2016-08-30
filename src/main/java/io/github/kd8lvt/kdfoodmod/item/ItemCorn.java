package io.github.kd8lvt.kdfoodmod.item;

import io.github.kd8lvt.kdfoodmod.main.main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by kd8lvt on 8/30/2016.
 */
public class ItemCorn extends ItemFood implements ItemModelProvider, ItemOreDict {
    public ItemCorn() {
        super(1, 0.5f, false);
        setUnlocalizedName("foodCorn");
        setRegistryName("foodCorn");
        setCreativeTab(main.creativeTab);
    }
    @Override
    public void registerItemModel(Item item){
        main.proxy.registerItemRenderer(this, 0, "foodCorn");
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre("cropCorn",this);
    }
}