package rivendark.mods.quantumassembly.machines;

// Date: 2/7/2013 3:06:14 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelQuantumStorage extends ModelBase
{
  //fields
    ModelRenderer Back;
    ModelRenderer Top;
    ModelRenderer Canister;
    ModelRenderer FrontPanel;
    ModelRenderer LeftSupport;
    ModelRenderer RightSupport;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
  
  public ModelQuantumStorage()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Back = new ModelRenderer(this, 0, 64);
      Back.addBox(-8F, -12F, 6F, 16, 13, 2);
      Back.setRotationPoint(0F, 23F, 0F);
      Back.setTextureSize(64, 32);
      Back.mirror = true;
      setRotation(Back, 0F, 0F, 0F);
      
      Top = new ModelRenderer(this, 0, 18);
      Top.addBox(-8F, -15F, -8F, 16, 3, 16);
      Top.setRotationPoint(0F, 23F, 0F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      
      Canister = new ModelRenderer(this, 0, 38);
      Canister.addBox(-6F, -12F, -6F, 12, 13, 12);
      Canister.setRotationPoint(0F, 23F, 0F);
      Canister.setTextureSize(64, 32);
      Canister.mirror = true;
      setRotation(Canister, 0F, 0F, 0F);
      
      FrontPanel = new ModelRenderer(this, 0, 80);
      FrontPanel.addBox(-7F, -12F, -8F, 14, 6, 1);
      FrontPanel.setRotationPoint(0F, 23F, 0F);
      FrontPanel.setTextureSize(64, 32);
      FrontPanel.mirror = true;
      setRotation(FrontPanel, 0F, 0F, 0F);
      
      LeftSupport = new ModelRenderer(this, 49, 38);
      LeftSupport.addBox(-8F, -12F, -8F, 1, 12, 1);
      LeftSupport.setRotationPoint(0F, 23F, 0F);
      LeftSupport.setTextureSize(64, 32);
      LeftSupport.mirror = true;
      setRotation(LeftSupport, 0F, 0F, 0F);
      
      RightSupport = new ModelRenderer(this, 54, 38);
      RightSupport.addBox(7F, -12F, -8F, 1, 12, 1);
      RightSupport.setRotationPoint(0F, 23F, 0F);
      RightSupport.setTextureSize(64, 32);
      RightSupport.mirror = true;
      setRotation(RightSupport, 0F, 0F, 0F);
      
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(-8F, 0F, -8F, 1, 1, 14);
      Shape1.setRotationPoint(0F, 23F, 0F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 31, 0);
      Shape2.addBox(7F, 0F, -8F, 1, 1, 14);
      Shape2.setRotationPoint(0F, 23F, 0F);
      Shape2.setTextureSize(64, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(-7F, 0F, -8F, 14, 1, 1);
      Shape3.setRotationPoint(0F, 23F, 0F);
      Shape3.setTextureSize(64, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Back.render(f5);
    Top.render(f5);
    Canister.render(f5);
    FrontPanel.render(f5);
    LeftSupport.render(f5);
    RightSupport.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
  }
  
  public void renderModel(float f5)
  {
    Back.render(f5);
    Top.render(f5);
    Canister.render(f5);
    FrontPanel.render(f5);
    LeftSupport.render(f5);
    RightSupport.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
