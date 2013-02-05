package rivendark.mods.quantumassembly.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import rivendark.mods.quantumassembly.QuantumAssembly;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class QuantumAssemblyProxy implements IGuiHandler {
	
	@SidedProxy(clientSide = "rivendark.mods.quantumassembly.core.QuantumAssemblyProxyClient",
			serverSide = "rivendark.mods.quantumassembly.core.QuantumAssemblyProxy")
	public static QuantumAssemblyProxy proxy;

	public void registerRenderThings() {
		
		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void registerTiles(){
		
	}
	
	public void registerBlocks(){
		GameRegistry.registerBlock(QuantumAssembly.QuantumStorageBlock, "rivendark_QuantumStorageBlock");
	}
	
	public void addNames(){
		LanguageRegistry.addName(QuantumAssembly.QuantumStorageBlock, "Quantum Storage Unit");
	}
	
	public void addRecipes(){
		
	}
	
}
