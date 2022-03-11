package smokeytube.dlang.client.renderer;

import smokeytube.dlang.Dlang;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

public class MishaEntityRenderer extends ZombieEntityRenderer {

    public MishaEntityRenderer(EntityRenderDispatcher entityRenderdispatcher) {
        super(entityRenderdispatcher);
    }

	protected void scale(ZombieEntity zombieEntity, MatrixStack matrixStack, float f) {
		float g = 1.0625F;
		matrixStack.scale(1.0625F, 1.0625F, 1.0625F);
		super.scale(zombieEntity, matrixStack, f);
	}

    public Identifier getTexture(ZombieEntity entity) {
        return new Identifier(Dlang.MOD_ID, "textures/entity/misha.png");
    }

}