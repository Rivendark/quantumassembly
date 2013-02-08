package rivendark.mods.quantumassembly.machines;

import net.minecraft.tileentity.TileEntity;

public class TileQuantumStorage extends TileEntity {
	
	private byte facing;
	
	public TileQuantumStorage(){
		
	}
	
	public void setFacing(byte chestFacing)
    {
        this.facing = chestFacing;
    }
	
	public byte getFacing(){
		return facing;
	}
}	
