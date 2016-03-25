package com.brasilianengineer.tbewarehouse.block.base;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class BlockWarehouseFrameComponent extends BlockTWM {

    //public static final PropertyBool PROPERTY_ACTIVE = PropertyBool.create("active");
    public static final PropertyEnum PROPERTY_TYPE = PropertyEnum.create("type", BlockWarehouseFrameComponent.EnumType.class);
//    public static final IUnlistedProperty<Boolean> UPROPERTY_LINK_SOUTH = new Properties.PropertyAdapter<Boolean>(PropertyBool.create("link_south"));
//    public static final IUnlistedProperty<Boolean> UPROPERTY_LINK_DOWN = new Properties.PropertyAdapter<Boolean>(PropertyBool.create("link_down"));
//    public static final IUnlistedProperty<Boolean> UPROPERTY_LINK_WEST = new Properties.PropertyAdapter<Boolean>(PropertyBool.create("link_west"));
//    public static final IUnlistedProperty<Boolean> UPROPERTY_LINK_EAST = new Properties.PropertyAdapter<Boolean>(PropertyBool.create("link_east"));
//    public static final IUnlistedProperty<Boolean> UPROPERTY_LINK_NORTH = new Properties.PropertyAdapter<Boolean>(PropertyBool.create("link_north"));
//    public static final IUnlistedProperty<Boolean> UPROPERTY_LINK_UP = new Properties.PropertyAdapter<Boolean>(PropertyBool.create("link_up"));


    public BlockWarehouseFrameComponent() {
        super(Material.iron);
        setHardness(5.0f);
        setResistance(25.0f);
        setHardness(1f);
        setStepSound(SoundType.METAL);
    }

    @Override
    public int damageDropped(IBlockState state) {
        EnumType enumType = (EnumType)state.getValue(PROPERTY_TYPE);
        return enumType.getMetadata();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
        for (EnumType type : EnumType.values()) {
            list.add(new ItemStack(itemIn, 1, type.getMetadata()));
        }
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        EnumType type = EnumType.byMetadata(meta);
        //return this.getDefaultState().withProperty(PROPERTY_TYPE, type).withProperty(PROPERTY_ACTIVE, false);
        return this.getDefaultState().withProperty(PROPERTY_TYPE, type);
    }

    @Override
    protected BlockStateContainer createBlockState() {

        //IProperty [] listedProperties = new IProperty[] { PROPERTY_ACTIVE, PROPERTY_TYPE };
        IProperty [] listedProperties = new IProperty[] { PROPERTY_TYPE };
        //IUnlistedProperty [] unlistedProperties = new IUnlistedProperty[] { UPROPERTY_LINK_UP, UPROPERTY_LINK_DOWN, UPROPERTY_LINK_NORTH, UPROPERTY_LINK_SOUTH, UPROPERTY_LINK_EAST, UPROPERTY_LINK_WEST };
        return new BlockStateContainer(this, listedProperties);
        //return new ExtendedBlockState(this, listedProperties, unlistedProperties);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        // 0 through 7 is inactive,
        // 8 through 16 is active
        boolean active = false;
        if (meta > 7)
        {
            active = true;
            meta -= 8;
        }

        EnumType type = EnumType.byMetadata(meta);

        //return this.getDefaultState().withProperty(PROPERTY_ACTIVE, active).withProperty(PROPERTY_TYPE, type);
        return this.getDefaultState().withProperty(PROPERTY_TYPE, type);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        //boolean active = state.getValue(PROPERTY_ACTIVE);
        EnumType type = (EnumType) state.getValue(PROPERTY_TYPE);

        //return type.getMetadata() + (active ? 8 : 0);
        return type.getMetadata();
    }

//    @Override
//    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
//        if (heldItem.getItem().getClass().isInstance(ItemMultiTool.class)) {
//            if (worldIn.isRemote) {
//                boolean active = state.getValue(PROPERTY_ACTIVE);
//
//                // change active status but keep meta type.
//                worldIn.setBlockState(pos, state.getBlock().getDefaultState().withProperty(PROPERTY_ACTIVE, !active).withProperty(PROPERTY_TYPE, state.getValue(PROPERTY_TYPE)));
//            }
//
//            return true;
//        }
//        return false;
//    }

//    @Override
//    public IBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos) {
//        if (state instanceof IExtendedBlockState) {
//            IExtendedBlockState retval = (IExtendedBlockState)state;
//            EnumFacing[] adjacentFaces = NeighborFinder.getSurroundingBlocksOfType(world, pos, BlockTWMMachineComponent.class);
//
//            retval = retval.withProperty(UPROPERTY_LINK_UP, isAdjacentTo(world, pos.up()));
//            retval = retval.withProperty(UPROPERTY_LINK_DOWN, isAdjacentTo(world, pos.down()));
//            retval = retval.withProperty(UPROPERTY_LINK_EAST, isAdjacentTo(world, pos.east()));
//            retval = retval.withProperty(UPROPERTY_LINK_WEST, isAdjacentTo(world, pos.west()));
//            retval = retval.withProperty(UPROPERTY_LINK_NORTH, isAdjacentTo(world, pos.north()));
//            retval = retval.withProperty(UPROPERTY_LINK_SOUTH, isAdjacentTo(world, pos.south()));
//            return retval;
//        }
//        return state;
//    }

//    @Override
//    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
//        return state;
//    }






    private boolean isAdjacentTo(IBlockAccess world, BlockPos pos){
        Block block = world.getBlockState(pos).getBlock();
        return block.getClass().isInstance(BlockWarehouseFrameComponent.class);
    }

    public enum EnumType implements IStringSerializable {
        WOOD(0, "wood"),
        IRON(1, "iron");

        public int getMetadata()
        {
            return this.meta;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return getName();
        }

        public static EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        private final int meta;
        private final String name;
        private static final EnumType[] META_LOOKUP = new EnumType[values().length];

        private EnumType(int i_meta, String i_name)
        {
            this.meta = i_meta;
            this.name = i_name;
        }

        static
        {
            for (EnumType type : values()) {
                META_LOOKUP[type.getMetadata()] = type;
            }
        }
    }
}
