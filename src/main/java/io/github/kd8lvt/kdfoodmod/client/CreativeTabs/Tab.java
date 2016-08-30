package io.github.kd8lvt.kdfoodmod.client.CreativeTabs;

import io.github.kd8lvt.kdfoodmod.item.ModItems;
import io.github.kd8lvt.kdfoodmod.main.main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by kd8lvt on 8/30/2016.
 */
public class Tab extends CreativeTabs {
    public Tab() {
        super(main.name);
    }
    @Override
    public Item getTabIconItem() {
        return ModItems.dustSalt;
    }
}
