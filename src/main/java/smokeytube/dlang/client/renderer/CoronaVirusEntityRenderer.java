package smokeytube.dlang.client.renderer;

import smokeytube.dlang.Dlang;
import smokeytube.dlang.client.model.CoronaVirusEntityModel;
import smokeytube.dlang.entity.CoronaVirusEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CoronaVirusEntityRenderer extends MobEntityRenderer<CoronaVirusEntity, CoronaVirusEntityModel> {

    public CoronaVirusEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CoronaVirusEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CoronaVirusEntity entity) {
        return new Identifier(Dlang.MOD_ID, "textures/entity/corona_virus.png");
    }

}