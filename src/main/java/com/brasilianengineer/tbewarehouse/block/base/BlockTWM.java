package com.brasilianengineer.tbewarehouse.block.base;

import com.brasilianengineer.tbewarehouse.other.CreativeTabTWM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockTWM extends Block {

    public BlockTWM(Material material) {
        super(material);

        setCreativeTab(CreativeTabTWM.TWM_TAB);
    }

    public BlockTWM() {
        this(Material.iron);
    }

//    protected void dropInventory(World world, BlockPos pos)
//    {
//        TileEntity tileEntity = world.getTileEntity(pos);
//
//        if (!(tileEntity instanceof IInventory))
//        {
//            return;
//        }
//
//        IInventory inventory = (IInventory) tileEntity;
//
//        for (int i = 0; i < inventory.getSizeInventory(); i++)
//        {
//            ItemStack itemStack = inventory.getStackInSlot(i);
//
//            if (itemStack != null && itemStack.stackSize > 0)
//            {
//                Random rand = new Random();
//
//                float dX = rand.nextFloat() * 0.8F + 0.1F;
//                float dY = rand.nextFloat() * 0.8F + 0.1F;
//                float dZ = rand.nextFloat() * 0.8F + 0.1F;
//
//                EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ, itemStack.copy());
//
//                if (itemStack.hasTagCompound())
//                {
//                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());
//                }
//
//                float factor = 0.05F;
//                entityItem.motionX = rand.nextGaussian() * factor;
//                entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
//                entityItem.motionZ = rand.nextGaussian() * factor;
//                world.spawnEntityInWorld(entityItem);
//                itemStack.stackSize = 0;
//            }
//        }
//    }
}
