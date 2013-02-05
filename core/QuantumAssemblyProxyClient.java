package rivendark.mods.quantumassembly.core;

import rivendark.mods.quantumassembly.QuantumAssembly;
import net.minecraftforge.client.MinecraftForgeClient;

public class QuantumAssemblyProxyClient extends QuantumAssemblyProxy {
	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture(QuantumAssembly.blockTextureFile); //To Do.
	}
}
