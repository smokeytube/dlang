package smokeytube.dlang.client.model;

import smokeytube.dlang.entity.TreeEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class TreeEntityModel extends EntityModel<TreeEntity> {

    private final ModelPart base;

    public TreeEntityModel() {
        this.textureHeight = 64;
        this.textureWidth = 64;

        base = new ModelPart(this, 0, 0);

        //Trunk
        base.addCuboid(-6, -6, -6, 16, 16, 16);
        base.addCuboid(-6, -22, -6, 16, 16, 16);
        base.addCuboid(-6, -38, -6, 16, 16, 16);
        base.addCuboid(-6, -54, -6, 16, 16, 16);
        base.addCuboid(-6, -70, -6, 16, 16, 16);

        //Leaves
        //Top
        base.addCuboid(-6, -86, -6, 16, 16, 16);
        base.addCuboid(-22, -86, -6, 16, 16, 16);
        base.addCuboid(10, -86, -6, 16, 16, 16);
        base.addCuboid(-6, -86, -22, 16, 16, 16);
        base.addCuboid(-6, -86, 10, 16, 16, 16);
        //Second
        base.addCuboid(-22, -70, -6, 16, 16, 16);
        base.addCuboid(10, -70, -6, 16, 16, 16);
        base.addCuboid(-6, -70, -22, 16, 16, 16);
        base.addCuboid(-6, -70, 10, 16, 16, 16);

        base.addCuboid(10, -70, 10, 16, 16, 16);
        base.addCuboid(10, -70, -22, 16, 16, 16);

        // Third
        base.addCuboid(-22, -54, -22, 16, 16, 16);
        base.addCuboid(10, -54, 10, 16, 16, 16);
        base.addCuboid(10, -54, -22, 16, 16, 16);
        base.addCuboid(-22, -54, 10, 16, 16, 16);
        base.addCuboid(-22, -54, -6, 16, 16, 16);
        base.addCuboid(10, -54, -6, 16, 16, 16);
        base.addCuboid(-6, -54, -22, 16, 16, 16);
        base.addCuboid(-6, -54, 10, 16, 16, 16);

        base.addCuboid(-38, -54, 26, 16, 16, 16);
        base.addCuboid(-38, -54, 10, 16, 16, 16);
        base.addCuboid(-38, -54, -6, 16, 16, 16);
        base.addCuboid(-38, -54, -22, 16, 16, 16);
        base.addCuboid(-22, -54, -38, 16, 16, 16);
        base.addCuboid(-6, -54, -38, 16, 16, 16);
        base.addCuboid(10, -54, -38, 16, 16, 16);
        base.addCuboid(26, -54, -38, 16, 16, 16);
        base.addCuboid(26, -54, -22, 16, 16, 16);
        base.addCuboid(26, -54, -6, 16, 16, 16);
        base.addCuboid(26, -54, 10, 16, 16, 16);
        base.addCuboid(26, -54, 26, 16, 16, 16);
        base.addCuboid(10, -54, 26, 16, 16, 16);
        base.addCuboid(-6, -54, 26, 16, 16, 16);
        base.addCuboid(-22, -54, 26, 16, 16, 16);

        // Fourth
        base.addCuboid(-22, -38, -22, 16, 16, 16);
        base.addCuboid(10, -38, 10, 16, 16, 16);
        base.addCuboid(10, -38, -22, 16, 16, 16);
        base.addCuboid(-22, -38, 10, 16, 16, 16);
        base.addCuboid(-22, -38, -6, 16, 16, 16);
        base.addCuboid(10, -38, -6, 16, 16, 16);
        base.addCuboid(-6, -38, -22, 16, 16, 16);
        base.addCuboid(-6, -38, 10, 16, 16, 16);

        base.addCuboid(-38, -38, 10, 16, 16, 16);
        base.addCuboid(-38, -38, -6, 16, 16, 16);
        base.addCuboid(-38, -38, -22, 16, 16, 16);
        base.addCuboid(-38, -38, -38, 16, 16, 16);
        base.addCuboid(-22, -38, -38, 16, 16, 16);
        base.addCuboid(-6, -38, -38, 16, 16, 16);
        base.addCuboid(10, -38, -38, 16, 16, 16);
        base.addCuboid(26, -38, -38, 16, 16, 16);
        base.addCuboid(26, -38, -22, 16, 16, 16);
        base.addCuboid(26, -38, -6, 16, 16, 16);
        base.addCuboid(26, -38, 10, 16, 16, 16);
        base.addCuboid(26, -38, 26, 16, 16, 16);
        base.addCuboid(10, -38, 26, 16, 16, 16);
        base.addCuboid(-6, -38, 26, 16, 16, 16);
        base.addCuboid(-22, -38, 26, 16, 16, 16);
    }

    @Override
    public void setAngles(TreeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {

        matrices.translate(0, 0.875, 0);

        base.render(matrices, vertices, light, overlay);
    }

}