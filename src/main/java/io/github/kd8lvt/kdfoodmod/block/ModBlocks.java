package io.github.kd8lvt.kdfoodmod.block;

import io.github.kd8lvt.kdfoodmod.item.ItemModelProvider;
import io.github.kd8lvt.kdfoodmod.item.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks {
    public static BlockOre oreSalt;
    public static BlockCropCorn cropCorn;
    public static BlockBase loamySoil;

    public static void init() {
        cropCorn = register(new BlockCropCorn(), null);
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if (itemBlock == null) {
            //Notin. It didn't work the other way, OK?
        } else {
            GameRegistry.register(itemBlock);
            if (block instanceof ItemModelProvider) {
                ((BlockBase)block).registerItemModel(itemBlock);
            }
            if (block instanceof ItemOreDict) {
                ((ItemOreDict)block).initOreDict();
            }
            if (itemBlock instanceof ItemOreDict) {
                ((ItemOreDict)itemBlock).initOreDict();
            }
        }

        return block;
    }
    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
