package smokeytube.dlang.client.model;

import smokeytube.dlang.entity.CoronaVirusEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class CoronaVirusEntityModel extends EntityModel<CoronaVirusEntity> {

    private final ModelPart base;

    public CoronaVirusEntityModel() {
        this.textureHeight = 1;
        this.textureWidth = 1;

        base = new ModelPart(this, 0, 0);
        base.addCuboid(0, -6, 0, 1, 1, 1);
    }

    @Override
    public void setAngles(CoronaVirusEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {

        matrices.translate(0, 1.825, 0);

        base.render(matrices, vertices, light, overlay);
    }

}