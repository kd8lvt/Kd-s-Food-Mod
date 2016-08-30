package io.github.kd8lvt.kdfoodmod.recipe;

import io.github.kd8lvt.kdfoodmod.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by kd8lvt on 8/30/2016.
 */
public class ModRecipes {
    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.seedCorn), ModItems.foodCorn);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foodButter), new ItemStack(ModItems.dustSalt,3), Items.MILK_BUCKET);
        GameRegistry.addSmelting(new ItemStack(ModItems.foodCorn),new ItemStack(ModItems.foodCookedCorn),0f);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foodCookedSaltedCorn),new ItemStack(ModItems.dustSalt,2), ModItems.foodCookedCorn);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foodCSBCorn),ModItems.foodButter,ModItems.foodCookedSaltedCorn);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dustSalt), Items.WATER_BUCKET);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.foodCorn), Items.CARROT, new ItemStack(Items.DYE,1,11));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.foodCSBGCorn),"GGG","GCG","GGG",'G', Blocks.GOLD_BLOCK,'C',ModItems.foodCSBCorn);
    }
}
