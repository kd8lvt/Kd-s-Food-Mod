package io.github.kd8lvt.kdfoodmod.block;

import io.github.kd8lvt.kdfoodmod.item.ModItems;
import io.github.kd8lvt.kdfoodmod.main.main;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by kd8lvt on 8/30/2016.
 */
public class BlockCropCorn extends BlockCrops {
    public BlockCropCorn() {
        setUnlocalizedName("cropCorn");
        setRegistryName("cropCorn");
        setCreativeTab(main.creativeTab);
    }
    @Override
    protected Item getSeed() {
        return ModItems.seedCorn;
    }
    @Override
    protected Item getCrop() { return ModItems.foodCorn; }
}
