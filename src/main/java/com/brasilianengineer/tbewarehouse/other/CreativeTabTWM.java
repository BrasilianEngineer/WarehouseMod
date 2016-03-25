package com.brasilianengineer.tbewarehouse.other;

import com.brasilianengineer.tbewarehouse.item.ModItems;
import com.brasilianengineer.tbewarehouse.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by tbe on 7/17/2014.
 */
public class CreativeTabTWM  {

    public static final CreativeTabs TWM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ModItems.multiTool;
        }
    };

}
