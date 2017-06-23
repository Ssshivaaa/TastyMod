package com.bros.tastymod.blocks;

import com.bros.tastymod.rendering.entities.tiles.TieleEntityTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
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

    @Override
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
    }

}
