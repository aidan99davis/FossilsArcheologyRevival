package com.github.revival.client.model.prehistoric;

import com.github.revival.client.model.prehistoric.test.ModelNewPrehistoric;
import com.github.revival.server.entity.mob.EntityAnkylosaurus;
import com.github.revival.server.entity.mob.test.EntityNewPrehistoric;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

public class ModelMammoth extends ModelNewPrehistoric {
    public AdvancedModelRenderer leftFrontLeg;
    public AdvancedModelRenderer rightFrontLeg;
    public AdvancedModelRenderer rightHindLeg;
    public AdvancedModelRenderer leftHindLeg;
    public AdvancedModelRenderer middleBody;
    public AdvancedModelRenderer middleBodyFur;
    public AdvancedModelRenderer lowerBody;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer lowerBodyFur;
    public AdvancedModelRenderer Tail;
    public AdvancedModelRenderer upperBodyFur;
    public AdvancedModelRenderer bodyHump;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer headFur;
    public AdvancedModelRenderer nose1;
    public AdvancedModelRenderer headHump;
    public AdvancedModelRenderer bottomjaw;
    public AdvancedModelRenderer EarL;
    public AdvancedModelRenderer EarR;
    public AdvancedModelRenderer TuskL1;
    public AdvancedModelRenderer TuskR1;
    public AdvancedModelRenderer nose2;
    public AdvancedModelRenderer nose3;
    public AdvancedModelRenderer nose4;
    public AdvancedModelRenderer TuskL2;
    public AdvancedModelRenderer TuskL3;
    public AdvancedModelRenderer TuskR2;
    public AdvancedModelRenderer TuskR3;
    private ModelAnimator animator;

    public ModelMammoth() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.leftFrontLeg = new AdvancedModelRenderer(this, 48, 0);
        this.leftFrontLeg.mirror = true;
        this.leftFrontLeg.setRotationPoint(1.5F, 17.0F, -1.0F);
        this.leftFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 48, 11);
        this.neck.setRotationPoint(0.0F, -0.2F, -1.0F);
        this.neck.addBox(-1.5F, -2.0F, -3.8F, 3, 6, 3, 0.0F);
        this.setRotateAngle(neck, -0.18203784098300857F, -0.0F, 0.0F);
        this.lowerBody = new AdvancedModelRenderer(this, 30, 33);
        this.lowerBody.setRotationPoint(0.0F, 2.2F, 4.7F);
        this.lowerBody.addBox(-2.5F, -2.0F, 0.0F, 5, 6, 3, 0.0F);
        this.setRotateAngle(lowerBody, 0.08726646259971647F, -0.0F, 0.0F);
        this.bottomjaw = new AdvancedModelRenderer(this, 9, 27);
        this.bottomjaw.setRotationPoint(0.0F, 1.5F, 0.03F);
        this.bottomjaw.addBox(-1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(bottomjaw, -1.3491395117916165F, -0.0F, 0.0F);
        this.rightFrontLeg = new AdvancedModelRenderer(this, 48, 0);
        this.rightFrontLeg.mirror = true;
        this.rightFrontLeg.setRotationPoint(-1.5F, 17.0F, -1.0F);
        this.rightFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.rightHindLeg = new AdvancedModelRenderer(this, 48, 0);
        this.rightHindLeg.mirror = true;
        this.rightHindLeg.setRotationPoint(-1.3F, 17.0F, 6.5F);
        this.rightHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.lowerBodyFur = new AdvancedModelRenderer(this, 46, 40);
        this.lowerBodyFur.setRotationPoint(0.5F, 3.95F, 1.55F);
        this.lowerBodyFur.addBox(-3.0F, 0.0F, -1.5F, 5, 2, 3, 0.0F);
        this.nose2 = new AdvancedModelRenderer(this, 0, 21);
        this.nose2.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.nose2.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(nose2, 0.3164281933865719F, -0.0F, 0.0F);
        this.headFur = new AdvancedModelRenderer(this, 44, 53);
        this.headFur.setRotationPoint(0.0F, 0.7F, 1.0F);
        this.headFur.addBox(-2.5F, -4.0F, -5.0F, 5, 6, 5, 0.0F);
        this.TuskL2 = new AdvancedModelRenderer(this, 0, 42);
        this.TuskL2.setRotationPoint(0.2F, 2.7F, 0.0F);
        this.TuskL2.addBox(-0.5F, -0.5F, -0.1F, 1, 4, 1, 0.0F);
        this.setRotateAngle(TuskL2, -0.7853981633974483F, -0.3141592653589793F, 0.08726646259971647F);
        this.middleBody = new AdvancedModelRenderer(this, 20, 14);
        this.middleBody.setRotationPoint(0.0F, 11.9F, 1.2F);
        this.middleBody.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 5, 0.0F);
        this.setRotateAngle(middleBody, -0.12217304763960307F, -0.0F, 0.0F);
        this.upperBodyFur = new AdvancedModelRenderer(this, 0, 0);
        this.upperBodyFur.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.upperBodyFur.addBox(-3.5F, -2.5F, 0.5F, 7, 10, 5, 0.0F);
        this.setRotateAngle(upperBodyFur, -0.03490658503988659F, -0.0F, 0.0F);
        this.leftHindLeg = new AdvancedModelRenderer(this, 48, 0);
        this.leftHindLeg.mirror = true;
        this.leftHindLeg.setRotationPoint(1.3F, 17.0F, 6.5F);
        this.leftHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.EarR = new AdvancedModelRenderer(this, 24, 9);
        this.EarR.setRotationPoint(-1.5F, 0.2F, -0.3F);
        this.EarR.addBox(-0.5F, -1.4F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(EarR, 0.08726646259971647F, -0.5235987755982988F, 0.0F);
        this.Tail = new AdvancedModelRenderer(this, 26, 19);
        this.Tail.setRotationPoint(0.0F, -1.0F, 2.1F);
        this.Tail.addBox(-0.5F, 0.3F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Tail, 0.18203784098300857F, -0.0F, 0.0F);
        this.TuskR2 = new AdvancedModelRenderer(this, 0, 42);
        this.TuskR2.setRotationPoint(-0.2F, 2.7F, 0.0F);
        this.TuskR2.addBox(-0.5F, -0.5F, -0.1F, 1, 4, 1, 0.0F);
        this.setRotateAngle(TuskR2, -0.7853981633974483F, 0.3141592653589793F, -0.08726646259971647F);
        this.upperBody = new AdvancedModelRenderer(this, 20, 15);
        this.upperBody.mirror = true;
        this.upperBody.setRotationPoint(0.0F, 2.0F, -0.3F);
        this.upperBody.addBox(-3.0F, -2.0F, -3.0F, 6, 7, 4, 0.0F);
        this.setRotateAngle(upperBody, 0.08726646259971647F, -0.0F, 0.0F);
        this.TuskR3 = new AdvancedModelRenderer(this, 4, 42);
        this.TuskR3.setRotationPoint(-0.1F, 3.0F, -0.2F);
        this.TuskR3.addBox(-0.5F, -0.5F, 0.1F, 1, 5, 1, 0.0F);
        this.setRotateAngle(TuskR3, -0.8726646259971648F, 0.3490658503988659F, -0.03490658503988659F);
        this.head = new AdvancedModelRenderer(this, 48, 25);
        this.head.mirror = true;
        this.head.setRotationPoint(0.0F, 0.9F, -4.0F);
        this.head.addBox(-2.0F, -3.0F, -3.5F, 4, 6, 4, 0.0F);
        this.setRotateAngle(head, 0.22759093446006054F, -0.0F, 0.0F);
        this.nose3 = new AdvancedModelRenderer(this, 0, 27);
        this.nose3.setRotationPoint(0.0F, 3.9F, 0.5F);
        this.nose3.addBox(-1.0F, 0.0F, -0.5F, 2, 3, 2, 0.0F);
        this.setRotateAngle(nose3, 0.2565634000431664F, -0.0F, 0.0F);
        this.TuskL3 = new AdvancedModelRenderer(this, 4, 42);
        this.TuskL3.setRotationPoint(0.1F, 3.0F, -0.2F);
        this.TuskL3.addBox(-0.5F, -0.5F, 0.1F, 1, 5, 1, 0.0F);
        this.setRotateAngle(TuskL3, -0.8726646259971648F, -0.3490658503988659F, 0.03490658503988659F);
        this.TuskR1 = new AdvancedModelRenderer(this, 0, 42);
        this.TuskR1.setRotationPoint(-1.2F, 2.3F, -2.6F);
        this.TuskR1.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(TuskR1, -0.5235987755982988F, -0.4363323129985824F, 0.8726646259971648F);
        this.nose4 = new AdvancedModelRenderer(this, 0, 33);
        this.nose4.setRotationPoint(0.0F, 2.5F, -0.3F);
        this.nose4.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(nose4, 0.2565634000431664F, -0.0F, 0.0F);
        this.TuskL1 = new AdvancedModelRenderer(this, 0, 42);
        this.TuskL1.setRotationPoint(1.2F, 2.3F, -2.6F);
        this.TuskL1.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(TuskL1, -0.5235987755982988F, 0.4363323129985824F, -0.8726646259971648F);
        this.nose1 = new AdvancedModelRenderer(this, 0, 21);
        this.nose1.setRotationPoint(0.0F, 0.6F, -0.8F);
        this.nose1.addBox(-1.0F, -1.0F, -3.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(nose1, -0.5736897251305361F, -0.0F, 0.0F);
        this.middleBodyFur = new AdvancedModelRenderer(this, 0, 50);
        this.middleBodyFur.setRotationPoint(-0.1F, -0.1F, 1.2F);
        this.middleBodyFur.addBox(-3.0F, 0.0F, 0.0F, 6, 9, 4, 0.0F);
        this.bodyHump = new AdvancedModelRenderer(this, 2, 37);
        this.bodyHump.setRotationPoint(0.0F, -2.2F, -0.5F);
        this.bodyHump.addBox(-3.0F, -1.0F, -2.0F, 6, 1, 4, 0.0F);
        this.headHump = new AdvancedModelRenderer(this, 29, 56);
        this.headHump.setRotationPoint(0.0F, -3.0F, -1.5F);
        this.headHump.addBox(-2.0F, -1.0F, -1.5F, 4, 1, 3, 0.0F);
        this.EarL = new AdvancedModelRenderer(this, 24, 9);
        this.EarL.mirror = true;
        this.EarL.setRotationPoint(1.5F, 0.2F, -0.3F);
        this.EarL.addBox(-0.5F, -1.4F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(EarL, 0.08726646259971647F, 0.5235987755982988F, 0.0F);
        this.upperBody.addChild(this.neck);
        this.middleBody.addChild(this.lowerBody);
        this.head.addChild(this.bottomjaw);
        this.lowerBody.addChild(this.lowerBodyFur);
        this.nose1.addChild(this.nose2);
        this.head.addChild(this.headFur);
        this.TuskL1.addChild(this.TuskL2);
        this.upperBody.addChild(this.upperBodyFur);
        this.head.addChild(this.EarR);
        this.lowerBody.addChild(this.Tail);
        this.TuskR1.addChild(this.TuskR2);
        this.middleBody.addChild(this.upperBody);
        this.TuskR2.addChild(this.TuskR3);
        this.neck.addChild(this.head);
        this.nose2.addChild(this.nose3);
        this.TuskL2.addChild(this.TuskL3);
        this.head.addChild(this.TuskR1);
        this.nose3.addChild(this.nose4);
        this.head.addChild(this.TuskL1);
        this.head.addChild(this.nose1);
        this.middleBody.addChild(this.middleBodyFur);
        this.upperBody.addChild(this.bodyHump);
        this.head.addChild(this.headHump);
        this.head.addChild(this.EarL);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.leftFrontLeg.render(f5);
        this.rightFrontLeg.render(f5);
        this.rightHindLeg.render(f5);
        this.middleBody.render(f5);
        this.leftHindLeg.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
        blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(EntityAnkylosaurus.animation_attack);
        animator.startKeyframe(5);
        ModelUtils.rotate(animator, neck, 0, 20, 0);
        ModelUtils.rotate(animator, head, 0, 5, 10);
        ModelUtils.rotate(animator, nose3, 0, 0, 7);
        ModelUtils.rotate(animator, nose4, 0, 0, 10);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, neck, 0, -30, 0);
        ModelUtils.rotate(animator, head, 0, -5, -15);
        ModelUtils.rotate(animator, nose1, -40, 0, 0);
        ModelUtils.rotate(animator, nose2, -12, 0, 0);
        ModelUtils.rotate(animator, nose3, -31, 0, 0);
        ModelUtils.rotate(animator, nose4, -18, 0, 0);
        animator.move(nose2, 0, -0.2F, 0);
        animator.move(nose3, 0, -0.7F, 0.3F);
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        AdvancedModelRenderer[] tailParts = {this.Tail};
        AdvancedModelRenderer[] neckParts = {this.neck, this.head};
        AdvancedModelRenderer[] trunkParts = {this.nose2, this.nose3, this.nose4};
        ModelUtils.faceTargetMod(neck, f3, f4, 0.5F);
        ModelUtils.faceTargetMod(head, f3, f4, 0.5F);
        float speed = 0.1F;
        float speed2 = 1.1F;
        float sitProgress = ((EntityNewPrehistoric) (entity)).sitProgress;
        this.chainWave(tailParts, speed, 0.05F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed, 0.15F, -2, entity.ticksExisted, 1);
        this.chainWave(neckParts, speed, 0.15F, 3, entity.ticksExisted, 1);
        this.chainWave(trunkParts, speed, 0.15F, 3, entity.ticksExisted, 1);
        this.chainSwing(trunkParts, speed, 0.15F, -1, entity.ticksExisted, 1);
        this.bob(middleBody, speed, 0.3F, false, entity.ticksExisted, 1);
        this.walk(lowerBody, speed, 0.05F, true, 0F, 0F, entity.ticksExisted, 1);
        this.walk(upperBody, speed, 0.05F, true, 0F, 0F, entity.ticksExisted, 1);
        this.walk(leftFrontLeg, speed2, 0.8F, true, 0F, -0.4F, f, f1);
        this.walk(rightFrontLeg, speed2, 0.8F, false, 0F, -0.4F, f, f1);
        this.walk(leftHindLeg, speed2, 0.8F, false, 0F, 0.4F, f, f1);
        this.walk(rightHindLeg, speed2, 0.8F, true, 0F, 0.4F, f, f1);
        sitAnimationRotation(Tail, sitProgress, (float) Math.toRadians(20.87D), 0, 0);
        sitAnimationRotation(EarR, sitProgress, (float) Math.toRadians(5.0D), -((float) Math.toRadians(30.0D)), 0);
        sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(13.04D)), 0, 0);
        sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(15.65D), 0, 0);
        sitAnimationRotation(head, sitProgress, (float) Math.toRadians(33.91D), 0, 0);
        sitAnimationRotation(upperBodyFur, sitProgress, -((float) Math.toRadians(2.0D)), 0, 0);
        sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
        sitAnimationRotation(lowerBodyFur, sitProgress, (float) Math.toRadians(13.04D), 0, 0);
        sitAnimationRotation(EarL, sitProgress, (float) Math.toRadians(5.0D), (float) Math.toRadians(30.0D), 0);
        sitAnimationRotation(bottomjaw, sitProgress, -((float) Math.toRadians(77.3D)), 0, 0);
        sitAnimationRotation(middleBody, sitProgress, -((float) Math.toRadians(26.09D)), 0, 0);
        sitAnimationPos(middleBody, sitProgress, 0, 1.1F, 0);
        sitAnimationPos(leftHindLeg, sitProgress, 0, 0, -3);
        sitAnimationPos(rightHindLeg, sitProgress, 0, 0, -3);

    }
}
