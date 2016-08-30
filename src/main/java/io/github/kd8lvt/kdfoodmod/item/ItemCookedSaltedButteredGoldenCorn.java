package io.github.kd8lvt.kdfoodmod.item;

import io.github.kd8lvt.kdfoodmod.main.main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by kd8lvt on 8/30/2016.
 */
public class ItemCookedSaltedButteredGoldenCorn extends ItemFood implements ItemModelProvider {
    public ItemCookedSaltedButteredGoldenCorn() {
        super(20, 20f, false);
        setUnlocalizedName("foodCSBGCorn");
        setRegistryName("foodCSBGCorn");
        setPotionEffect(new PotionEffect(Potion.getPotionById(10),150,20),50f);
        setCreativeTab(main.creativeTab);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack){
        return true;
    }
    @Override
    public void registerItemModel(Item item) {
        main.proxy.registerItemRenderer(this, 0, "foodCSBGCorn");
    }
}
