package com.brasilianengineer.tbewarehouse.proxy;


import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.SERVER)
public class ServerProxy extends CommonProxy {

    @Override // on init
    public void initRenderingAndTextures()
    {

    }

    @Override // on pre init
    public void registerKeybindings() {

    }
}
