package com.brasilianengineer.tbewarehouse.block;

import com.brasilianengineer.tbewarehouse.block.base.BlockTWM;
import com.brasilianengineer.tbewarehouse.reference.Names;
import com.brasilianengineer.tbewarehouse.reference.Reference;
import com.brasilianengineer.tbewarehouse.util.LogHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockTWM warehouseFrame = new BlockWarehouseFrame();
    public static final BlockTWM warehouseWall = new BlockWarehouseWall();
    public static final BlockTWM warehouseBuffer = new BlockWarehouseBuffer();

    public static void init() {

        GameRegistry.registerBlock(warehouseFrame, ItemBlockWarehouseFrameVariants.class, Names.Blocks.BLOCK_WAREHOUSE_FRAME);
        GameRegistry.registerBlock(warehouseWall, ItemBlockWarehouseFrameVariants.class, Names.Blocks.BLOCK_WAREHOUSE_WALL);
        GameRegistry.registerBlock(warehouseBuffer, Names.Blocks.BLOCK_WAREHOUSE_BUFFER);

        LogHelper.info("Block Registry Init Complete");
    }
}
