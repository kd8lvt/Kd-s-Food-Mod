package io.github.kd8lvt.kdfoodmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ItemCorn foodCorn;
    public static ItemCookedCorn foodCookedCorn;
    public static ItemCookedSaltedCorn foodCookedSaltedCorn;
    public static ItemCookedSaltedButteredCorn foodCSBCorn;
    public static ItemCookedSaltedButteredGoldenCorn foodCSBGCorn;
    public static ItemButter foodButter;

    public static ItemBase dustSalt;
    public static ItemCornSeed seedCorn;

    public static void init() {
        foodCorn = register(new ItemCorn());
        dustSalt = register(new ItemOre("dustSalt","dustSalt"));
        seedCorn = register(new ItemCornSeed());
        foodCookedCorn = register(new ItemCookedCorn());
        foodCookedSaltedCorn = register(new ItemCookedSaltedCorn());
        foodCSBCorn = register(new ItemCookedSaltedButteredCorn());
        foodCSBGCorn = register(new ItemCookedSaltedButteredGoldenCorn());
        foodButter = register(new ItemButter());
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }
        if (item instanceof ItemOreDict) {
            ((ItemOreDict)item).initOreDict();
        }
        return item;
    }

}
