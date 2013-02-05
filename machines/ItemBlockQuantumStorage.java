package rivendark.mods.quantumassembly.machines;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockQuantumStorage extends ItemBlock {
	public ItemBlockQuantumStorage(int meta, Block block){
		super(meta);
		setHasSubtypes(false);
	}
	
	public String getItemNameIS(ItemStack is){
		return "QuantumStorageItemBlock";
	}
	
	public int getMetadata(int par1){
		return par1;
	}
}
