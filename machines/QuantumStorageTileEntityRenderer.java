package rivendark.mods.quantumassembly.machines;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class QuantumStorageTileEntityRenderer extends TileEntitySpecialRenderer {
	
	private QuantumStorageModel quantumStorageModel;
	
	public QuantumStorageTileEntityRenderer(){
		quantumStorageModel = new QuantumStorageModel();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		renderAModelAt((TileQuantumStorage) tile, x, y, z, f);
	}
	
	public void renderAModelAt(TileQuantumStorage tile, double x, double y, double z, float f){
		bindTextureByName("../core/gfx/QuantumStorageTexture.png");
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)+x + 0.5F, (float)+y + 0.5F, (float)+z + 0.5F);
		GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		quantumStorageModel.renderModel(0.0625F);
		GL11.glPopMatrix();
	}

}
