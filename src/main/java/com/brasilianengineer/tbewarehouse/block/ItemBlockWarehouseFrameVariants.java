package com.brasilianengineer.tbewarehouse.block;

import com.brasilianengineer.tbewarehouse.block.base.BlockWarehouseFrameComponent;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by tbe on 3/25/2016.
 */
public class ItemBlockWarehouseFrameVariants extends ItemBlock {

    public ItemBlockWarehouseFrameVariants(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {

        BlockWarehouseFrameComponent.EnumType type = BlockWarehouseFrameComponent.EnumType.byMetadata(stack.getMetadata());
        return super.getUnlocalizedName() + "." + type.toString();
    }
}
