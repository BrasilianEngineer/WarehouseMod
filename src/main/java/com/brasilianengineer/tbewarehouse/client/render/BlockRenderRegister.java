package com.brasilianengineer.tbewarehouse.client.render;

import com.brasilianengineer.tbewarehouse.block.base.BlockWarehouseFrameComponent;
import com.brasilianengineer.tbewarehouse.block.ModBlocks;
import com.brasilianengineer.tbewarehouse.reference.Reference;
import com.brasilianengineer.tbewarehouse.util.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by tbe on 3/24/2016.
 */
public final class BlockRenderRegister {

    public static void init() {

        registerBlockVariant(ModBlocks.warehouseFrame);
        registerBlockVariant(ModBlocks.warehouseWall);
        registerBlock(ModBlocks.warehouseBuffer);

        LogHelper.info("Block Render Registry Init Complete");
    }

    private static void registerBlock(Block block) {
        Item item = GameRegistry.findItem(Reference.MOD_ID, block.getUnlocalizedName().substring(5));
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.RESOURCE_PREFIX + block.getUnlocalizedName().substring(5), "inventory"));

    }

    private static void registerBlock(Block block, int meta, String file) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.RESOURCE_PREFIX + file, "inventory"));
    }

    private static void registerBlockVariant(Block block) {
        String baseName = block.getUnlocalizedName().substring(5);
        Item item = GameRegistry.findItem(Reference.MOD_ID, baseName);

        for(BlockWarehouseFrameComponent.EnumType type : BlockWarehouseFrameComponent.EnumType.values()) {
            ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(Reference.RESOURCE_PREFIX + baseName + "_" + type.getName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(item, type.getMetadata(), itemModelResourceLocation);
        }
    }
}

