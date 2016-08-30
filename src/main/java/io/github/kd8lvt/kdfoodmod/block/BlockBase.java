package io.github.kd8lvt.kdfoodmod.block;

import io.github.kd8lvt.kdfoodmod.item.ItemModelProvider;
import io.github.kd8lvt.kdfoodmod.main.main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class BlockBase extends Block implements ItemModelProvider {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.creativeTab);
    }
    @Override
    public void registerItemModel(Item itemBlock) {
        main.proxy.registerItemRenderer(itemBlock,0,name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
