package caseofgames.extreme_machines.common.item;

import caseofgames.extreme_machines.common.Main;
import caseofgames.extreme_machines.common.init.ItemInit;
import caseofgames.extreme_machines.common.util.IModelObject;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IModelObject {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
