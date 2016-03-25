package com.brasilianengineer.tbewarehouse.proxy;

public interface IProxy {

    public abstract void registerItems();

    public abstract void registerTileEntities();

    public abstract void initRenderingAndTextures();

    public abstract void registerEventHandlers();

    public abstract void registerKeybindings();
}
