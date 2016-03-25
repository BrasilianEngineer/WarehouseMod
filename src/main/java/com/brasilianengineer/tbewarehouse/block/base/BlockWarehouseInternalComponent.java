package com.brasilianengineer.tbewarehouse.block.base;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockWarehouseInternalComponent extends BlockTWM {

    public BlockWarehouseInternalComponent() {
        super(Material.iron);
        setHardness(5.0f);
        setResistance(25.0f);
        setHardness(1f);
        setStepSound(SoundType.METAL);
    }
}
