// Date: 2013/06/25 19:04:21
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package thKaguyaMod.client.model.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import thKaguyaMod.entity.living.EntityDanmakuMob;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelCirno extends ModelBase
{
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer rightArm;
    ModelRenderer leftArm;
    ModelRenderer rightLeg;
    ModelRenderer leftLeg;
    ModelRenderer skirt;
    ModelRenderer skirt2;
    ModelRenderer rightWing;
    ModelRenderer leftWing;
    ModelRenderer rightWing2;
    ModelRenderer leftWing2;
    ModelRenderer rightWing3;
    ModelRenderer leftWing3;
    //ModelRenderer base;
    ModelRenderer longHair;
    ModelRenderer ribbonCenter;
    ModelRenderer ribbonRight;
    ModelRenderer ribbonLeft;
    //ModelRenderer leftArm;
  
  public ModelCirno()
  {  
	    textureWidth = 64;
	    textureHeight = 64;
	    
	      head = new ModelRenderer(this, 0, 0);
	      head.addBox(-4F, -8F, -4F, 8, 8, 8);
	      head.setRotationPoint(0F, 5F, 0F);
	      head.setTextureSize(64, 64);
	      head.mirror = true;
	      //setRotation(head, 0F, 0F, 0F);
	      longHair = new ModelRenderer(this, 24, 0);
	      longHair.addBox(-4F, 0F, -3F, 8, 5, 3);
	      longHair.setRotationPoint(0F, 0F, 4F);
	      //longHair.setTextureSize(64, 64);
	      //longHair.mirror = true;
	      //setRotation(longHair, 0F, 0F, 0F);
	      head.addChild(this.longHair);
	  	  //リボン
	  	  ribbonCenter = new ModelRenderer(this, 0, 32);
	      ribbonCenter.addBox(-1F, -1F, 0F, 2, 2, 1);
	      ribbonCenter.setRotationPoint(0F, -8F, 4F);
	      //ribbonCenter.setTextureSize(64, 64);
	      //ribbonCenter.mirror = true;
	      head.addChild(this.ribbonCenter);
	      setRotation(ribbonCenter, 0.2443461F, 0F, 0F);
	  	  ribbonLeft = new ModelRenderer(this, 6, 32);
	      ribbonLeft.addBox(0F, -2F, 0F, 5, 4, 1);
	      ribbonLeft.setRotationPoint(1F, -8F, 4F);
	      //ribbonLeft.setTextureSize(64, 64);
	      //ribbonLeft.mirror = true;
	  	  head.addChild(this.ribbonLeft);
	      setRotation(ribbonLeft, 0.418879F, 0F, 0F);
	      ribbonRight = new ModelRenderer(this, 6, 32);
	      ribbonRight.addBox(-5F, -2F, 0F, 5, 4, 1);
	      ribbonRight.setRotationPoint(-1F, -8F, 4F);
	      //ribbonRight.setTextureSize(64, 64);
	      //ribbonRight.mirror = true;
	      //setRotation(ribbonRight, 0.418879F, 0F, 0F);
	  	  head.addChild(this.ribbonRight);
	      
	      body = new ModelRenderer(this, 32, 8);
	      body.addBox(-3F, 0F, -2F, 6, 7, 4);
	      body.setRotationPoint(0F, 5F, 0F);
	      body.setTextureSize(64, 64);
	      body.mirror = true;
	      setRotation(body, 0F, 0F, 0F);
	      
	      skirt = new ModelRenderer(this, 0, 16);
	      skirt.addBox(-4F, 0F, -4F, 8, 5, 8);
	      skirt.setRotationPoint(0F, 10F, 0F);
	      //skirt.setTextureSize(64, 64);
	      //skirt.mirror = true;
	      setRotation(skirt, 0F, 0F, 0F);
	      skirt2 = new ModelRenderer(this, 24, 32);
	      skirt2.addBox(-5F, 0F, -5F, 10, 6, 10);
	      skirt2.setRotationPoint(0F, 4F, 0F);
	      //skirt2.setTextureSize(64, 64);
	      //skirt2.mirror = true;
	      skirt.addChild(skirt2);
	      setRotation(skirt2, 0F, 0F, 0F);
	      
	      rightArm = new ModelRenderer(this, 48, 0);
	      rightArm.addBox(-1F, -1F, -1F, 2, 8, 2);
	      rightArm.setRotationPoint(-4F, 6F, 0F);
	      rightArm.setTextureSize(64, 64);
	      rightArm.mirror = true;
	      setRotation(rightArm, -0.7679449F, 0F, -0.6457718F);
	      
	      /*rightArm = new ModelRenderer(this, 48, 3);
	      rightArm.addBox(-1F, -1F, -1F, 2, 8, 2);
	      rightArm.setRotationPoint(4F, 1F, 0F);
	      //rightArm.setTextureSize(64, 64);
	      //rightArm.mirror = true;
	      //setRotation(rightArm, -1.291544F, -1.375609F, 0F);
	      setRotation(rightArm,  0.7679449F, 0F, 0.6457718F);*/
	      leftArm = new ModelRenderer(this, 56, 0);
	      leftArm.addBox(-1F, -1F, -1F, 2, 8, 2);
	      leftArm.setRotationPoint(4F, 6F, 0F);
	      //leftArm.setTextureSize(64, 64);
	      //leftArm.mirror = true;
	      setRotation(leftArm, -0.7679449F, 0F, 0.6457718F);
	      rightLeg = new ModelRenderer(this, 50, 16);
	      rightLeg.addBox(-1F, 0F, -2F, 3, 12, 4);
	      rightLeg.setRotationPoint(-2F, 12F, 0F);
	      //rightLeg.setTextureSize(64, 64);
	      //rightLeg.mirror = true;
	      setRotation(rightLeg, 0F, 0F, 0F);
	      leftLeg = new ModelRenderer(this, 50, 16);
	      leftLeg.addBox(-2F, 0F, -2F, 3, 12, 4);
	      leftLeg.setRotationPoint(2F, 12F, 0F);
	      //leftLeg.setTextureSize(64, 64);
	      //leftLeg.mirror = true;
	      setRotation(leftLeg, 0F, 0F, 0F);
	      


	      //rightWing.mirror = true;
	      rightWing = new ModelRenderer(this, 0, 48);
	      rightWing.addBox(-14F, 0F, 0F, 14, 3, 3);
	      rightWing.setRotationPoint(-1F, 3F, 2F);
	      //rightWing.setTextureSize(64, 64);
	      //rightWing.mirror = true;
	      setRotation(rightWing, 0F, 0.4886922F, 0.3141593F);
	      //rightWing.mirror = false;
	      leftWing = new ModelRenderer(this, 0, 48);
	      leftWing.addBox(0F, 0F, 0F, 14, 3, 3);
	      leftWing.setRotationPoint(0F, 3F, 2F);
	      //leftWing.setTextureSize(64, 64);
	      //leftWing.mirror = true;
	      setRotation(leftWing, 0F, -0.4886922F, -0.3141593F);
	      //rightWing2.mirror = true;
	      rightWing2 = new ModelRenderer(this, 0, 48);
	      rightWing2.addBox(-14F, 0F, 0F, 14, 3, 3);
	      rightWing2.setRotationPoint(-1F, 6F, 2F);
	      //rightWing2.setTextureSize(64, 64);
	      //rightWing2.mirror = true;
	      setRotation(rightWing2, 0F, 0.4886922F, -0.3141593F);
	      //rightWing2.mirror = false;
	      leftWing2 = new ModelRenderer(this, 0, 48);
	      leftWing2.addBox(0F, 0F, 0F, 14, 3, 3);
	      leftWing2.setRotationPoint(1F, 6F, 2F);
	      //leftWing2.setTextureSize(64, 64);
	      //leftWing2.mirror = true;
	      setRotation(leftWing2, 0F, -0.4886922F, 0.3141593F);
	      rightWing3 = new ModelRenderer(this, 0, 48);
	      rightWing3.addBox(-14F, 0F, 0F, 14, 3, 3);
	      rightWing3.setRotationPoint(-1F, 5F, 2F);
	      //rightWing3.setTextureSize(64, 64);
	      //rightWing3.mirror = true;
	      setRotation(rightWing3, 0F, 0.4886922F, 0F);
	      leftWing3 = new ModelRenderer(this, 0, 48);
	      leftWing3.addBox(0F, 0F, 0F, 14, 3, 3);
	      leftWing3.setRotationPoint(1F, 5F, 2F);
	      //leftWing3.setTextureSize(64, 64);
	      //leftWing3.mirror = true;
	      setRotation(leftWing3, 0F, -0.4886922F, 0F);



  }
  
  @Override
  public void render(Entity entity, float movement, float far, float tick, float yaw, float pitch, float size)
  {
    super.render(entity, movement, far, tick, yaw, pitch, size);
    setRotationAngles(movement, far, tick, yaw, pitch, size, entity);
    head.render(size);
    body.render(size);
    skirt.render(size);
    rightArm.render(size);
    rightLeg.render(size);
    leftArm.render(size);
    leftLeg.render(size);
  	
    rightWing.render(size);
  	rightWing2.render(size);
  	rightWing3.render(size);
    leftWing.render(size);
  	leftWing2.render(size);
  	leftWing3.render(size);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  @Override
  public void setRotationAngles(float movement, float far, float tick, float yaw, float pitch, float size, Entity entity)
  {
    super.setRotationAngles(movement, far, tick, yaw, pitch, size, entity);
    EntityDanmakuMob thFairy = (EntityDanmakuMob)entity;
    
  	this.head.rotateAngleY = yaw / (180F / (float)Math.PI);
    this.head.rotateAngleX = pitch / (180F / (float)Math.PI);
  	this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(onGround) * (float)Math.PI * 2.0F) * 0.2F;
  	this.skirt.rotateAngleX = 0F;

  	//スペルカードの宣言をする
  	if(thFairy.getSpellCardMotion() < -15)
  	{
  		rightArm.rotateAngleX = -0.7F - MathHelper.sin(tick  / 10F) * 0.1F - MathHelper.sin((float)(30F + thFairy.getSpellCardMotion()) / 180F * 3.141593F) * 4F;
  	}
  	else if(thFairy.getSpellCardMotion() < 0)
  	{
  		rightArm.rotateAngleX = -0.7F - MathHelper.sin(tick  / 10F) * 0.1F - MathHelper.sin((float)(-thFairy.getSpellCardMotion()) / 180F * 3.141593F) * 4F;
  	}
  	else
  	{
  		rightArm.rotateAngleX = -0.7F - MathHelper.sin(tick / 10F) * 0.1F;
  	  	leftArm.rotateAngleX = rightArm.rotateAngleX;
  	}
  	
    if (this.isRiding)
    {
        this.rightArm.rotateAngleX = -((float)Math.PI / 5F);
        this.leftArm.rotateAngleX = -((float)Math.PI / 5F);
        this.rightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.leftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.rightLeg.rotateAngleY = ((float)Math.PI / 14F);
        this.leftLeg.rotateAngleY = -((float)Math.PI / 14F);
        this.rightLeg.rotateAngleZ = ((float)Math.PI / 14F);
        this.leftLeg.rotateAngleZ = -((float)Math.PI / 14F);
        
        this.skirt.rotateAngleX += -((float)Math.PI / 5F);
    }
    else
    {
  	
	  	if(thFairy.getFlyingHeight() == 0)
	  	{
	  		rightLeg.rotateAngleX = MathHelper.cos(movement) * 0.7F * far;
	  		leftLeg.rotateAngleX = MathHelper.cos(movement + (float)Math.PI) * 0.7F * far;
		  	rightLeg.rotateAngleZ = 0F; 
		  	leftLeg.rotateAngleZ = 0F;
		  	
		  	if(movement > 0F)
		  	{
		        this.rightArm.rotateAngleX = MathHelper.cos(movement + (float)Math.PI) * 2.0F * far * 0.5F;
		        this.leftArm.rotateAngleX = MathHelper.cos(movement) * 2.0F * far * 0.5F;
		        rightArm.rotateAngleY = -10F / 180F * (float)Math.PI;
		        rightArm.rotateAngleZ = 20F / 180F * (float)Math.PI;
		        leftArm.rotateAngleY = -rightArm.rotateAngleY;
		        leftArm.rotateAngleZ = -rightArm.rotateAngleZ;
		  	}
		  	else
		  	{
		  	  	rightArm.rotateAngleX = -0.7F - MathHelper.sin(tick  / 10F) * 0.1F;
		  	  	rightArm.rotateAngleY = 0.0F;
		  	  	rightArm.rotateAngleZ = -0.6457718F;
		  	  	leftArm.rotateAngleX = rightArm.rotateAngleX;
		  	  	leftArm.rotateAngleY = 0.0F;
		  	  	leftArm.rotateAngleZ = 0.6457718F;
	
		  	}
	  	}
	  	else
	  	{
	  		
	  	  	rightLeg.rotateAngleZ = Math.abs(MathHelper.sin(tick  / 10F) * 0.1F); 
	  	  	leftLeg.rotateAngleZ = -rightLeg.rotateAngleZ;
	  	  	rightLeg.rotateAngleX = Math.abs(MathHelper.sin(tick  / 10F) * 0.2F); 
	  	  	leftLeg.rotateAngleX = rightLeg.rotateAngleZ;
	  	  	
	  	  	rightArm.rotateAngleX = -0.7F - MathHelper.sin(tick  / 10F) * 0.1F;
	  	  	rightArm.rotateAngleY = 0.0F;
		  	rightArm.rotateAngleZ = -0.6457718F;
	  	  	leftArm.rotateAngleX = rightArm.rotateAngleX;
	  	  	leftArm.rotateAngleY = 0.0F;
		  	leftArm.rotateAngleZ = 0.6457718F;
	  	}
    }
  	
  	
  	

    	this.body.rotateAngleX = 0F;
    	if(thFairy.getFlyingHeight() > 0)
    	{
	        this.rightWing.rotateAngleY = MathHelper.cos(tick * 0.4F) * (float)Math.PI * 0.25F;
	        this.leftWing.rotateAngleY = -this.rightWing.rotateAngleY;
	    	this.rightWing2.rotateAngleY = MathHelper.cos(tick * 0.4F) * (float)Math.PI * 0.25F;
	        this.leftWing2.rotateAngleY = -this.rightWing2.rotateAngleY;
	        this.rightWing3.rotateAngleY = MathHelper.cos(tick * 0.4F) * (float)Math.PI * 0.25F;
	        this.leftWing3.rotateAngleY = -this.rightWing2.rotateAngleY;
    	}
    	else
    	{
	        this.rightWing.rotateAngleY = MathHelper.cos(tick * 0.1F) * (float)Math.PI * 0.1F + (float)Math.PI * 0.15F;
	        this.leftWing.rotateAngleY = -this.rightWing.rotateAngleY;
	    	this.rightWing2.rotateAngleY = MathHelper.cos(tick * 0.1F) * (float)Math.PI * 0.1F + (float)Math.PI * 0.15F;
	        this.leftWing2.rotateAngleY = -this.rightWing2.rotateAngleY;
	        this.rightWing3.rotateAngleY = MathHelper.cos(tick * 0.1F) * (float)Math.PI * 0.1F + (float)Math.PI * 0.15F;
	        this.leftWing3.rotateAngleY = -this.rightWing2.rotateAngleY;
    	}
  }

}