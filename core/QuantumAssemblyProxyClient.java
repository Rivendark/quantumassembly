package rivendark.mods.quantumassembly.core;

import net.minecraftforge.client.MinecraftForgeClient;
import rivendark.mods.quantumassembly.QuantumAssembly;
import rivendark.mods.quantumassembly.machines.QuantumStorageBlockRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class QuantumAssemblyProxyClient extends QuantumAssemblyProxy {
	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture(QuantumAssembly.blockTextureFile); //To Do.
		QuantumAssembly.QuantumStorageBlock_RID = RenderingRegistry.instance().getNextAvailableRenderId();
		RenderingRegistry.instance().registerBlockHandler(
				QuantumAssembly.QuantumStorageBlock_RID,new QuantumStorageBlockRenderer());
	}
}
