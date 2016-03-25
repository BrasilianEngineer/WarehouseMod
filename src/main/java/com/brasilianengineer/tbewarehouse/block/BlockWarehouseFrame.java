package com.brasilianengineer.tbewarehouse.block;

import com.brasilianengineer.tbewarehouse.block.base.BlockWarehouseFrameComponent;
import com.brasilianengineer.tbewarehouse.reference.Names;

public class BlockWarehouseFrame extends BlockWarehouseFrameComponent {

    public BlockWarehouseFrame() {
        super();
        this.setUnlocalizedName(Names.Blocks.BLOCK_WAREHOUSE_FRAME);
        setLightLevel(0.2F);
    }
}
