package rivendark.mods.quantumassembly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.creativetab.CreativeTabs;
import rivendark.mods.quantumassembly.core.QuantumAssemblyMachineTab;
import rivendark.mods.quantumassembly.core.QuantumAssemblyProxy;
import rivendark.mods.quantumassembly.machines.BlockQuantumStorage;
import rivendark.mods.quantumassembly.machines.QuantumAssemblyBlockRenderer;
import rivendark.mods.quantumassembly.machines.QuantumAssemblyTileEntityRenderer;
import rivendark.mods.quantumassembly.machines.TileQuantumStorage;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
	modid = "rivendark_quantumassembly",
	name = "Quantum Assembly",
	version = "0.0.002A"
)
@NetworkMod(
	clientSideRequired = true, 
	serverSideRequired = false/*,
	clientPacketHandlerSpec = @SidedPacketHandler(
		channels = {"QuantumAssemblyGeneral"},
		packetHandler = QuantumAssemblyPacketHandlerClient.class
	),
	serverPacketHandlerSpec = @SidedPacketHandler(
		channels = {},
		packetHandler = QuantumAssemblyPacketHandler.class
	)*/
)

public class QuantumAssembly {
	@SidedProxy(
		clientSide = "rivendark.mods.quantumassembly.core.QuantumAssemblyProxyClient",
		serverSide = "rivendark.mods.quantumassembly.core.QuantumAssemblyProxy"
	)
	public static QuantumAssemblyProxy proxy;
	
	@Instance("quantumassembly")
	public static QuantumAssembly instance;
	
	public static CreativeTabs tabMachine = new QuantumAssemblyMachineTab(CreativeTabs.getNextID(), 
			"Rivendark_QuantumAssemblyMachineTab");
	
	public static String blockTextureFile = "/gfx/BlankSheet.png";
	
	public static int QuantumStorageBlock_ID = 250;
	
	public static int QuantumStorageBlock_IID = -6;
		
	public static int QuantumStorageBlock_TID = 0;
	
	public static int QuantumAssembly_RID;
	
	public static Material QuantumStorageBlock_Material = Material.iron;
	
	public static Block QuantumStorageBlock = new BlockQuantumStorage(
			QuantumStorageBlock_ID,
			QuantumAssembly_RID,
			TileQuantumStorage.class
			)
		.setBlockName("QuantumStorageBlock")
		.setRequiresSelfNotify()
		.setCreativeTab(tabMachine)
		.setHardness(4.5F)
		.setResistance(150F);
	
	@Init
	public void load(FMLInitializationEvent event){
		RenderingRegistry.registerBlockHandler(new QuantumAssemblyBlockRenderer());
		QuantumAssembly_RID = RenderingRegistry.getNextAvailableRenderId();
		//proxy.registerRenderThings();
		
		proxy.registerTileEntitySpecialRenderer(new TileQuantumStorage());
		
		GameRegistry.registerBlock(QuantumStorageBlock, "BlockQuantumStorageUnit");
		GameRegistry.registerTileEntity(TileQuantumStorage.class, "TileQuantumStorageUnit");
		
		LanguageRegistry.addName(QuantumStorageBlock, "Quantum Storage Unit");
		
	}
	
	public void renderInvBlock(RenderBlocks var1, Block var2, int var3, int var4)
	{
		renderInvBlock(var1, var2, var3, var4);

		if (var2 == QuantumStorageBlock)
		{
			TileEntityRenderer.instance.renderTileEntityAt(new TileQuantumStorage(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
	}
}
/* Note to self, Block IDs 2200 - 2300, Item IDs 6200, 6400 */

/* Hello, my name is Inego Montoya, you killed my father, prepare to die!*/