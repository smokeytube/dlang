package smokeytube.dlang.client.model;

import smokeytube.dlang.entity.TreeEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class TreeEntityModel extends EntityModel<TreeEntity> {
    private final ModelPart bb_main;

    public TreeEntityModel() {
        textureWidth = 32;
        textureHeight = 32;
        bb_main = new ModelPart(this);
        bb_main.setPivot(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(18, 10).addCuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(18, 8).addCuboid(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(18, 6).addCuboid(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 18).addCuboid(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(18, 4).addCuboid(-1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(18, 2).addCuboid(-1.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(18, 0).addCuboid(-1.0F, -6.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 18).addCuboid(0.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 17).addCuboid(-2.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 17).addCuboid(-1.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 17).addCuboid(-1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 16).addCuboid(0.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 16).addCuboid(-1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 16).addCuboid(-2.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 15).addCuboid(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 13).addCuboid(0.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 11).addCuboid(0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 9).addCuboid(0.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 15).addCuboid(0.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 7).addCuboid(-1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 5).addCuboid(-2.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 3).addCuboid(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 15).addCuboid(-2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(15, 1).addCuboid(-1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 14).addCuboid(-1.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 14).addCuboid(-2.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 14).addCuboid(1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 13).addCuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 13).addCuboid(1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 12).addCuboid(1.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 10).addCuboid(-1.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 8).addCuboid(-2.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 6).addCuboid(-3.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 12).addCuboid(-3.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 4).addCuboid(-3.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 2).addCuboid(-3.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(12, 0).addCuboid(-3.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 12).addCuboid(-1.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 11).addCuboid(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 11).addCuboid(-2.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 10).addCuboid(-1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 10).addCuboid(0.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 9).addCuboid(0.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 7).addCuboid(1.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 5).addCuboid(1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 3).addCuboid(1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 9).addCuboid(1.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(9, 1).addCuboid(0.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 8).addCuboid(-1.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 8).addCuboid(-2.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 7).addCuboid(-2.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 6).addCuboid(-3.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 4).addCuboid(-3.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 2).addCuboid(-3.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(6, 0).addCuboid(-2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 6).addCuboid(-3.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 5).addCuboid(-3.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 4).addCuboid(-2.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 3).addCuboid(-1.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(3, 1).addCuboid(0.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 2).addCuboid(-2.0F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setAngles(TreeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red,
        float green, float blue, float alpha) {

        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}