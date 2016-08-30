package io.github.kd8lvt.kdfoodmod.item;

import io.github.kd8lvt.kdfoodmod.block.ModBlocks;
import io.github.kd8lvt.kdfoodmod.main.main;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

/**
 * Created by kd8lvt on 8/30/2016.
 */
public class ItemCornSeed extends ItemSeeds implements ItemModelProvider {
    public ItemCornSeed() {
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("seedCorn");
        setRegistryName("seedCorn");
        setCreativeTab(main.creativeTab);
    }
    @Override
    public void registerItemModel(Item item) {
        main.proxy.registerItemRenderer(item, 0, "seedCorn");
    }
}
