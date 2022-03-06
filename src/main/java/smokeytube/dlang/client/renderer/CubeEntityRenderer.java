package smokeytube.dlang.client.renderer;

import smokeytube.dlang.Dlang;
import smokeytube.dlang.client.model.CubeEntityModel;
import smokeytube.dlang.entity.CubeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

    public CubeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CubeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier(Dlang.MOD_ID, "textures/entity/cube.png");
    }

}