package io.github.kd8lvt.kdfoodmod.item;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by kd8lvt on 8/30/2016.
 */
public class ItemOre extends ItemBase implements ItemOreDict {
    private String oreName;

    public ItemOre(String name, String oreName) {
        super(name);
        this.oreName = oreName;
    }
    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }
}
