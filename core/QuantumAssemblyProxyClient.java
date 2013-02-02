package rivendark.mods.quantumassembly.core;

import net.minecraftforge.client.MinecraftForgeClient;

public class QuantumAssemblyProxyClient extends QuantumAssemblyProxy {
	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture("/pathtotexture"); //To Do.
	}
}
