package io.github.kd8lvt.kdfoodmod.item;

import io.github.kd8lvt.kdfoodmod.main.main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

/**
 * Created by kd8lvt on 8/30/2016.
 */
public class ItemCookedSaltedCorn extends ItemFood implements ItemModelProvider {
    public ItemCookedSaltedCorn() {
        super(6, 0.5f, false);
        setUnlocalizedName("foodCookedSaltedCorn");
        setRegistryName("foodCookedSaltedCorn");
        setCreativeTab(main.creativeTab);
    }
    @Override
    public void registerItemModel(Item item){
        main.proxy.registerItemRenderer(this, 0, "foodCookedSaltedCorn");
    }
}
