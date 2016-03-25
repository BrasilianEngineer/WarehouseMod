package com.brasilianengineer.tbewarehouse.client.render;

import com.brasilianengineer.tbewarehouse.item.ModItems;
import com.brasilianengineer.tbewarehouse.reference.Reference;
import com.brasilianengineer.tbewarehouse.util.LogHelper;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by tbe on 3/24/2016.
 */
public final class ItemRenderRegister {

    public static void init() {

        registerItem(ModItems.multiTool);

        LogHelper.info("Item Render Registry Init Complete");
    }

    private static void registerItem(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.RESOURCE_PREFIX + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
