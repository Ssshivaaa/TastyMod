package com.bros.tastymod.blocks;

import com.bros.tastymod.core.TastyModCore;
import com.bros.tastymod.rendering.entities.tiles.TieleEntityTable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class BlockTable extends BlockContainer {

    public BlockTable() {
        super(Material.iron);
        setBlockName("table");
        setHardness(5f);
        setStepSound(soundTypeMetal);
        setResistance(10f);
        setBlockTextureName("tastymod:Meat");
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
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return TastyModCore.meatGrinderItem;
    }

    @Override
    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, this, p_149749_6_);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        System.out.println(entityPlayer.inventory.getCurrentItem());
        if (world.isRemote)
        {
            return true;
        }
        else
        {
            ItemStack itemstack = entityPlayer.inventory.getCurrentItem();

            if (itemstack == null)
            {
                int i1 = world.getBlockMetadata(x, y, z);
                int j1 = func_150027_b(i1);
                if (j1 >= 4)
                {
                    if (!entityPlayer.capabilities.isCreativeMode)
                    {
                        ItemStack itemstack1 = new ItemStack(TastyModCore.mince, 1, 0);

                        if (!entityPlayer.inventory.addItemStackToInventory(itemstack1)) {
                            world.spawnEntityInWorld(new EntityItem(world, (double) x + 0.5D, (double) y + 1.5D, (double) z + 0.5D, itemstack1));
                        } else if (entityPlayer instanceof EntityPlayerMP) {
                            ((EntityPlayerMP) entityPlayer).sendContainerToPlayer(entityPlayer.inventoryContainer);
                        }
                    }

                    this.setVolume(world, x, y, z, 0);
                }
                return true;
            }
            else
            {
               int i1 = world.getBlockMetadata(x, y, z);
               int j1 = func_150027_b(i1);

               if (itemstack.getItem() == Items.rotten_flesh) {
                   if (j1 < 4) {
                       if (!entityPlayer.capabilities.isCreativeMode) {
                           --itemstack.stackSize;

                           if (itemstack.stackSize <= 0) {
                               entityPlayer.inventory.setInventorySlotContents(entityPlayer.inventory.currentItem, (ItemStack) null);
                           }
                       }

                       this.setVolume(world, x, y, z, j1 + 1);
                   }

                   return true;
               } else {
                   /*if (itemstack == null)
                   {
                       System.out.println("Torvald");
                       if (j1 >= 4)
                       {
                           if (!entityPlayer.capabilities.isCreativeMode)
                           {
                               ItemStack itemstack1 = new ItemStack(TastyModCore.mince, 1, 0);

                               if (!entityPlayer.inventory.addItemStackToInventory(itemstack1)) {
                                   world.spawnEntityInWorld(new EntityItem(world, (double) x + 0.5D, (double) y + 1.5D, (double) z + 0.5D, itemstack1));
                               } else if (entityPlayer instanceof EntityPlayerMP) {
                                   ((EntityPlayerMP) entityPlayer).sendContainerToPlayer(entityPlayer.inventoryContainer);
                               }

                               --itemstack.stackSize;

                               if (itemstack.stackSize <= 0)
                               {
                                   entityPlayer.inventory.setInventorySlotContents(entityPlayer.inventory.currentItem, (ItemStack) null);
                               }
                           }

                           this.setVolume(world, x, y, z, 0);
                       }
                   }*/
                   return false;
               }
            }
        }
    }



    public static int func_150027_b(int p_150027_0_)
    {
        return p_150027_0_;
    }
    public void setVolume(World world, int p_150024_2_, int p_150024_3_, int p_150024_4_, int volume)
    {
        world.setBlockMetadataWithNotify(p_150024_2_, p_150024_3_, p_150024_4_, MathHelper.clamp_int(volume, 0, 4), 2);
        world.func_147453_f(p_150024_2_, p_150024_3_, p_150024_4_, this);
    }
}
