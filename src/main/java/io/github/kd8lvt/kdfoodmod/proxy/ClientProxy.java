package io.github.kd8lvt.kdfoodmod.proxy;

import io.github.kd8lvt.kdfoodmod.main.main;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by kd8lvt on 8/29/2016.
 */


public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(main.modId + ":" + id, "inventory"));
    }
}
