package rivendark.mods.quantumassembly.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockQuantumStorage extends Block {

	public BlockQuantumStorage(int id, int texture, Material material) {
		super(id, texture, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
}
