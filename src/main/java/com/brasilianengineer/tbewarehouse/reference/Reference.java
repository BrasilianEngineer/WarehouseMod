package com.brasilianengineer.tbewarehouse.reference;

/**
 * Created by tbe on 7/16/2014.
 */
public class Reference {
    public static final String MOD_ID = "tbewarehouse";
    public static final String MOD_NAME = "TBE's Warehouse Mod";
    public static final String FINGERPRINT = "@FINGERPRINT";
    //public static final String VERSION = "@VERSION";
    public static final String VERSION = "1.9.0-0.1";
    public static final String PACKAGE_BASE = "com.brasilianengineer.tbewarehouse";
    public static final String SERVER_PROXY_CLASS = PACKAGE_BASE + ".proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = PACKAGE_BASE + ".proxy.ClientProxy";
    public static final String GUI_FACTORY_CLASS = PACKAGE_BASE + ".client.gui.GuiFactory";
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
}
