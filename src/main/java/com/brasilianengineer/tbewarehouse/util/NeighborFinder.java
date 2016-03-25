package com.brasilianengineer.tbewarehouse.util;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by tbe on 3/25/2016.
 */
public class NeighborFinder {

    public static EnumFacing[] getSurroundingBlocksOfType(IBlockAccess world, BlockPos pos, Class<?> blockType)
    {
        ArrayList<EnumFacing> adjacentFaces = new ArrayList<EnumFacing>();
        TreeMap<EnumFacing, IBlockState> adjacentBlocks = new TreeMap<EnumFacing, IBlockState>();


        for (EnumFacing facing : EnumFacing.values()) {
            BlockPos adjacentPosition = pos.add(
                    facing.getFrontOffsetX(),
                    facing.getFrontOffsetY(),
                    facing.getFrontOffsetZ());

            IBlockState adjacentState = world.getBlockState(adjacentPosition);
            Block adjacentBlock = adjacentState.getBlock();

            if (adjacentBlock.getClass().isInstance(blockType)) {
                adjacentBlocks.put(facing, adjacentState);
                adjacentFaces.add(facing);
            }
        }

        EnumFacing[] returnArray = new EnumFacing[adjacentFaces.size()];
        return adjacentFaces.toArray(returnArray);
    }
}
