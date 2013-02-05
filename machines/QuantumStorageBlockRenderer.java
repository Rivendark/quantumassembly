package rivendark.mods.quantumassembly.machines;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import rivendark.mods.quantumassembly.QuantumAssembly;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.relauncher.SideOnly;

public class QuantumStorageBlockRenderer implements ISimpleBlockRenderingHandler {
	
	private QuantumStorageModel quantumStorageModel;
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		if(modelId == QuantumAssembly.QuantumStorageBlock_RID){
			return RenderQuantumStorageBlockModel(block, x, y, z, renderer);
		}
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		//return QuantumAssembly.QuantumStorageBlock_RID;
		return 0;
	}
	
	@SideOnly(CLIENT)
	private boolean RenderQuantumStorageBlockModel(Block block, int x, int y, int z, RenderBlocks renderblocks){
		quantumStorageModel = new QuantumStorageModel();
		//bindTextureByName("/gfx/QuantumStorageTexture.png");
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)+x + 0.5F, (float)+y + 0.5F, (float)+z + 0.5F);
		GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		quantumStorageModel.renderModel(0.0625F);
		GL11.glPopMatrix();
		
		return true;
	}

}
