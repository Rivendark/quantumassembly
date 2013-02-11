package rivendark.mods.quantumassembly.machines;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import rivendark.mods.quantumassembly.QuantumAssembly;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockQuantumStorage extends BlockContainer {

	public BlockQuantumStorage(int ID, int RID, Class class1) {
		super(ID, RID, Material.iron);
		this.setTextureFile(QuantumAssembly.blockTextureFile);
		this.setBlockName("Rivendark_BlockQuantumStorage");
		this.setHardness(5.0F);
		this.setResistance(150.0F);
		this.setStepSound(super.soundMetalFootstep);
		this.setCreativeTab(QuantumAssembly.tabMachine);
		this.setRequiresSelfNotify();
		this.setLightOpacity(1);
		//this.setBlockBounds(0.0625F, 0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int idk, float what, float these, float are){
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if(tileEntity == null || player.isSneaking()){
			return false;
		}
		//player.openGui(QuantumAssembly.instance, 0, world, x, y, z);
		return true;
	}
	
	@Override
	 public void breakBlock(World world, int x, int y, int z, int par5, int par6) {
       // dropItems(world, x, y, z);
        super.breakBlock(world, x, y, z, par5, par6);
	}
	
	private void dropItems(World world, int x, int y, int z) {
		Random rand = new Random();
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if(!(tileEntity instanceof IInventory)){
			return;
		}
		IInventory inv = (IInventory) tileEntity;
		
		for(int i = 0; i < inv.getSizeInventory(); i++){
			ItemStack item = inv.getStackInSlot(i);
			if(item != null && item.stackSize > 0){
				float rx = rand.nextFloat() * 0.8F + 0.1F;
				float ry = rand.nextFloat() * 0.8F + 0.1F;
				float rz = rand.nextFloat() * 0.8F + 0.1F;
				
				EntityItem entityItem = new EntityItem(world, x + rx, y + ry, z + rz,
						new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));
				if(item.hasTagCompound()){
					entityItem.func_92014_d().setTagCompound((NBTTagCompound) item.getTagCompound().copy());
				}
				
				float factor = 0.05F;
				entityItem.motionX = rand.nextGaussian() * factor;
				entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
				entityItem.motionZ = rand.nextGaussian() * factor;
				world.spawnEntityInWorld(entityItem);
				item.stackSize = 0;
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public int getBlockTextureFromSide(int i){
		return QuantumAssembly.QuantumStorageBlock_TID;
	}
	
	@Override
    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
		int var6 = world.getBlockId(i, j, k - 1);
	    int var7 = world.getBlockId(i, j, k + 1);
	    int var8 = world.getBlockId(i - 1, j, k);
	    int var9 = world.getBlockId(i + 1, j, k);
        byte chestFacing = 0;
        
        int facing = MathHelper.floor_double((double) ((entityliving.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        if (facing == 0)
        {
            chestFacing = 2;
        }
        if (facing == 1)
        {
            chestFacing = 5;
        }
        if (facing == 2)
        {
            chestFacing = 3;
        }
        if (facing == 3)
        {
            chestFacing = 4;
        }
        TileEntity te = world.getBlockTileEntity(i, j, k);
        if (te != null && te instanceof TileQuantumStorage)
        {
            ((TileQuantumStorage) te).setFacing(chestFacing);
            world.markBlockForUpdate(i, j, k);
        }
    }

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileQuantumStorage();
	}
	
	public TileEntity getBlockEntity(){
		return new TileQuantumStorage();
	}
	
	@Override
	public int getRenderType(){
		return QuantumAssembly.QuantumAssembly_RID;
	}
	
	public boolean isOpaqueCube(){
        return false;
    }
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	public boolean isNormalCube(boolean par1){
		return false;
	}
}
