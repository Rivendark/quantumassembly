package rivendark.mods.quantumassembly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import rivendark.mods.quantumassembly.core.QuantumAssemblyMachineTab;
import rivendark.mods.quantumassembly.core.QuantumAssemblyPacketHandler;
import rivendark.mods.quantumassembly.core.QuantumAssemblyPacketHandlerClient;
import rivendark.mods.quantumassembly.core.QuantumAssemblyProxy;
import rivendark.mods.quantumassembly.machines.BlockQuantumStorage;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(
	modid = "rivendark_quantumassembly",
	name = "Quantum Assembly",
	version = "0.0.002A"
)
@NetworkMod(
	clientSideRequired = true, 
	serverSideRequired = false,
	clientPacketHandlerSpec = @SidedPacketHandler(
		channels = {"QuantumAssemblyGeneral"},
		packetHandler = QuantumAssemblyPacketHandlerClient.class
	),
	serverPacketHandlerSpec = @SidedPacketHandler(
		channels = {},
		packetHandler = QuantumAssemblyPacketHandler.class
	)
)

public class QuantumAssembly {
	@Instance("quantumassembly")
	public static QuantumAssembly instance;
	
	public static CreativeTabs tabMachine = new QuantumAssemblyMachineTab(CreativeTabs.getNextID(), 
			"Rivendark_QuantumAssemblyMachineTab");
	
	public static String blockTextureFile = "/gfx/BlankSheet.png";
	
	public static Block QuantumStorageBlock;
	
	public static int QuantumStorageBlock_ID = 2200;
		
	public static int QuantumStorageBlock_TID = 0;
	
	public static Material QuantumStorageBlock_Material = Material.iron;
	
	public static QuantumAssemblyProxy proxy;
	
	@Init
	public void load(FMLInitializationEvent event){
		NetworkRegistry.instance().registerGuiHandler(this, proxy);
		proxy.registerBlocks();
		proxy.addNames();
		proxy.addRecipes();
		proxy.registerRenderThings();
		
		QuantumStorageBlock = new BlockQuantumStorage(QuantumStorageBlock_ID, QuantumStorageBlock_Material);
		QuantumStorageBlock.getBlockTextureFromSide(0);
		
	}
}
/* Note to self, Block IDs 2200 - 2300, Item IDs 6200, 6400 */

/* Hello, my name is Inego Montoya, you killed my father, prepare to die!*/