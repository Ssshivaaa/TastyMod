package com.bros.tastymod.blocks;

import com.bros.tastymod.rendering.entities.tiles.TieleEntityTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTable extends BlockContainer {
    public BlockTable() {
        super(Material.iron);
        setBlockName("table");
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    public boolean isNormalCube(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int id) {
        return new TieleEntityTable();
    }
}
