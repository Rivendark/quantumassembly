package rivendark.mods.quantumassembly.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockQuantumStorageBlock extends Block {

	public BlockQuantumStorageBlock(int id, int texture, Material material) {
		super(id, texture, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
}
