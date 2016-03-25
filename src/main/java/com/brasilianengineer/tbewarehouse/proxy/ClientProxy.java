package com.brasilianengineer.tbewarehouse.proxy;

import com.brasilianengineer.tbewarehouse.client.render.BlockRenderRegister;
import com.brasilianengineer.tbewarehouse.client.render.ItemRenderRegister;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override // on init
    public void initRenderingAndTextures() {

        BlockRenderRegister.init();
        ItemRenderRegister.init();
    }

    @Override // on init
    public void registerEventHandlers() {
        super.registerEventHandlers();
    }

    @Override // on pre init
    public void registerKeybindings() {

    }
}
