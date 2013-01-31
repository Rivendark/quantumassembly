package rivendark.mods.quantumassembly.proxy;

import cpw.mods.fml.common.SidedProxy;

public class QuantumAssemblyProxy {
	
	@SidedProxy(clientSide = "rivendark.mods.quantumassembly.proxy.QuantumAssemblyProxyClient",
			serverSide = "rivendark.mods.quantumassembly.proxy.QuantumAssemblyProxy")
	public static QuantumAssemblyProxy proxy;
	
}
