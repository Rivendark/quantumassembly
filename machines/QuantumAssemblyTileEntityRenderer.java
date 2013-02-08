package rivendark.mods.quantumassembly.machines;

import static org.lwjgl.opengl.GL11.GL_COMPILE_AND_EXECUTE;
import static org.lwjgl.opengl.GL11.glCallList;
import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glEndList;
import static org.lwjgl.opengl.GL11.glGenLists;
import static org.lwjgl.opengl.GL11.glNewList;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glScalef;
import static org.lwjgl.opengl.GL11.glTranslatef;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import rivendark.mods.quantumassembly.machines.ModelQuantumStorage;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class QuantumAssemblyTileEntityRenderer extends TileEntitySpecialRenderer {
	
	private RenderBlocks renderBlocks;
	private ModelQuantumStorage quantumStorageModel;
	
	public QuantumAssemblyTileEntityRenderer(){
		quantumStorageModel = new ModelQuantumStorage();
		renderBlocks = new RenderBlocks();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((TileQuantumStorage) tile, x, y, z, f);
	}
	
	public void render(TileQuantumStorage tile, double x, double y, double z, float f){
		int k = 0;
		
		bindTextureByName("/gfx/TextureQuantumStorage.png");
		
		if(tile != null && tile.worldObj != null){
			int facing = 3;
			    facing = tile.getFacing();
			
			if (facing == 2) {
			    k = 180;
			}
			if (facing == 3) {
			    k = 0;
			}
			if (facing == 4) {
			    k = -90;
			}
			if (facing == 5) {
			    k = 90;
			}
		}
		glPushMatrix();
		glDisable(GL11.GL_LIGHTING);
        glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		glTranslatef((float)+x + 0.5F, (float)+y + 1.5F, (float)+z + 0.5F);
		glRotatef(k, 0.0F, 1.0F, 0.0F);
		glScalef(1.0F, -1F, -1F);
		quantumStorageModel.renderModel(0.0625F);
		glEnable(GL11.GL_LIGHTING);
		glPopMatrix();
	}
	
	
}
