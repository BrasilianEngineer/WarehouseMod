package com.brasilianengineer.tbewarehouse.proxy;


import com.brasilianengineer.tbewarehouse.block.ModBlocks;
import com.brasilianengineer.tbewarehouse.item.ModItems;

public abstract class CommonProxy implements IProxy {

    public void registerItems() {
        ModBlocks.init();
        ModItems.init();
    }

    // on init
    public void registerEventHandlers() {

    }

    // on init
    public void registerTileEntities() {

    }
}
