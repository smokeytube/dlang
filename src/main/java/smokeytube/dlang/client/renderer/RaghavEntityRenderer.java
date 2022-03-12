package smokeytube.dlang.client.renderer;

import smokeytube.dlang.Dlang;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.IronGolemEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.util.Identifier;

public class RaghavEntityRenderer extends IronGolemEntityRenderer {

    public RaghavEntityRenderer(EntityRenderDispatcher entityRenderdispatcher) {
        super(entityRenderdispatcher);
    }

	protected void scale(IronGolemEntity golemEntity, MatrixStack matrixStack, float f) {
	}

    public Identifier getTexture(IronGolemEntity entity) {
        return new Identifier(Dlang.MOD_ID, "textures/entity/raghav.png");
    }

}