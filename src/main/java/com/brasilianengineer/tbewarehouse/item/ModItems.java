package com.brasilianengineer.tbewarehouse.item;

import com.brasilianengineer.tbewarehouse.reference.Names;
import com.brasilianengineer.tbewarehouse.reference.Reference;
import com.brasilianengineer.tbewarehouse.util.LogHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemTWM multiTool = new ItemMultiTool();

    public static void init(){

        GameRegistry.registerItem(multiTool, Names.Tools.ITEM_MULTI_TOOL);

        LogHelper.info("Item Registry Init Complete");
    }
}
