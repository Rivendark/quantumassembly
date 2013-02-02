package rivendark.mods.quantumassembly.core;

import rivendark.mods.quantumassembly.QuantumAssembly;
import net.minecraft.creativetab.CreativeTabs;

public class QuantumAssemblyMachineTab extends CreativeTabs {

	public QuantumAssemblyMachineTab(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	public int getTabIconItemIndex(){
		return QuantumAssembly.QuantumStorageBlock_ID;
	}
	
	public String getTranslatedTabLabel(){
		return "Quantum Assembly:Machines";
	}
	
}
