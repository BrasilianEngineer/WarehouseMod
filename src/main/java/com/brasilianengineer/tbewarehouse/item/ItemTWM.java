package com.brasilianengineer.tbewarehouse.item;

import com.brasilianengineer.tbewarehouse.other.CreativeTabTWM;
import net.minecraft.item.Item;

public class ItemTWM extends Item {

    public ItemTWM(String unlocalizedName) {
        super();

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabTWM.TWM_TAB);
    }
}
