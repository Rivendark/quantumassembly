package rivendark.mods.quantumassembly.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import rivendark.mods.quantumassembly.QuantumAssembly;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockQuantumStorage extends Block {

	public BlockQuantumStorage(int id, Material material) {
		super(id, material);
		this.setTextureFile(QuantumAssembly.blockTextureFile);
		this.setBlockName("Rivendark_BlockQuantumStorage");
		this.setHardness(5.0F);
		this.setResistance(150.0F);
		this.setStepSound(super.soundMetalFootstep);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@SideOnly(Side.CLIENT)
	public int getBlockTextureFromSide(int i){
		return QuantumAssembly.QuantumStorageBlock_TID;
	}
}
