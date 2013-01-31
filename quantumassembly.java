package rivendark.mods.quantumassembly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rivendark.mods.quantumassembly.block.BlockQuantumStorageBlock;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "rivendark_quantumassembly", name = "Quantum Assembly", version = "0.0.001A")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class quantumassembly {
	@Instance("quantumassembly")
	public static quantumassembly instance;
	
	public static Block QuantumStorageBlock;
	
	public static int QuantumStorageBlock_ID = 2200;
	
	public static int QuantumStorageBlock_TID = 0;
	
	public static Material QuantumStorageBlock_Material = Material.iron;
	
	@Init
	public void load(FMLInitializationEvent event){
		QuantumStorageBlock = new BlockQuantumStorageBlock
				(QuantumStorageBlock_ID, QuantumStorageBlock_TID, QuantumStorageBlock_Material)
				.setBlockName("QuantumAssemblyBlock");
		
		GameRegistry.registerBlock(QuantumStorageBlock, "rivendark_QuantumStorageBlock");
		LanguageRegistry.addName(QuantumStorageBlock, "Quantum Storage Unit");
	}
}
/* Note to self, Block IDs 2200 - 2300, Item IDs 6200, 6400 */

/* Hello, my name is Inego Montoya, you killed my father, prepare to die!*/