package rivendark.mods.quantumassembly.core;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.MinecraftForgeClient;
import rivendark.mods.quantumassembly.QuantumAssembly;
import rivendark.mods.quantumassembly.machines.QuantumAssemblyTileEntityRenderer;
import rivendark.mods.quantumassembly.machines.TileQuantumStorage;
import cpw.mods.fml.client.registry.ClientRegistry;

public class QuantumAssemblyProxyClient extends QuantumAssemblyProxy {
	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture(QuantumAssembly.blockTextureFile); //To Do.
		
	}
	
	@Override
	public void registerTileEntitySpecialRenderer(TileEntity te) {
		ClientRegistry.bindTileEntitySpecialRenderer(TileQuantumStorage.class, new QuantumAssemblyTileEntityRenderer());
	}
}
