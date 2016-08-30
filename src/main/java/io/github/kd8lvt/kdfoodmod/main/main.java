package io.github.kd8lvt.kdfoodmod.main;

import io.github.kd8lvt.kdfoodmod.block.ModBlocks;
import io.github.kd8lvt.kdfoodmod.client.CreativeTabs.Tab;
import io.github.kd8lvt.kdfoodmod.item.ModItems;
import io.github.kd8lvt.kdfoodmod.proxy.CommonProxy;
import io.github.kd8lvt.kdfoodmod.recipe.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= main.modId, name= main.name, version= main.version, acceptedMinecraftVersions = "[1.10.2]")
public class main {

    public static final Tab creativeTab = new Tab();
    public static final String modId = "kdfoodmod";
    public static final String name = "Kd's Food Mod";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static main instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("Hello? Is this thing on? [Pre Init]");
        ModBlocks.init();
        ModItems.init();

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Hello? Is this thing on? I think it is... [Init]");
        ModRecipes.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("Hello? Is this thing on? Ok, it is for sure. [Post Init]");
    }
    @SidedProxy(serverSide = "io.github.kd8lvt.kdfoodmod.proxy.CommonProxy", clientSide = "io.github.kd8lvt.kdfoodmod.proxy.ClientProxy")
    public static CommonProxy proxy;
}
