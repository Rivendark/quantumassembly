package rivendark.mods.quantumassembly.machines;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.world.IBlockAccess;
import rivendark.mods.quantumassembly.QuantumAssembly;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class QuantumAssemblyBlockRenderer implements ISimpleBlockRenderingHandler {

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {
		
		if(block == QuantumAssembly.QuantumStorageBlock){
			TileEntityRenderer.instance.renderTileEntityAt(new TileQuantumStorage(), 0.0D, 0.0D, 0.0D, 0.0F);
		}
		else{
			renderInventoryBlock(block, metadata, modelID, renderer);
		}
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
			if(block == QuantumAssembly.QuantumStorageBlock){
				return RenderQuantumStorageBlock(block, x, y, z, renderer);
			}
			else{
				//renderWorldBlock(world, x, y, z, block, modelId, renderer);
				return false;
			}
	}

	@Override
	public boolean shouldRender3DInInventory() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		return QuantumAssembly.QuantumAssembly_RID;
	}
	
	@SideOnly(Side.CLIENT)
	private boolean RenderQuantumStorageBlock(Block block, int x, int y, int z, RenderBlocks renderblocks){
		TileEntityRenderer.instance.renderTileEntityAt(new TileQuantumStorage(), x, y, z, 0.0F);
		return true;
	}
	
	
}
