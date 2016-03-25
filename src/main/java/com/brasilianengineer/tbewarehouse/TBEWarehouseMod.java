package com.brasilianengineer.tbewarehouse;

import com.brasilianengineer.tbewarehouse.block.ModBlocks;
import com.brasilianengineer.tbewarehouse.item.ModItems;
import com.brasilianengineer.tbewarehouse.proxy.IProxy;
import com.brasilianengineer.tbewarehouse.reference.Reference;
import com.brasilianengineer.tbewarehouse.util.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION)
public class TBEWarehouseMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static TBEWarehouseMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
            serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.registerKeybindings();

        proxy.registerItems();

        LogHelper.info("Pre Initialization Complete");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerTileEntities();
        proxy.initRenderingAndTextures();
        proxy.registerEventHandlers();

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Complete");
    }
}
