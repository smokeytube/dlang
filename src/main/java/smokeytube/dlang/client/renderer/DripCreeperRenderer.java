package smokeytube.dlang.client.renderer;

import smokeytube.dlang.Dlang;
import smokeytube.dlang.entity.DripCreeperEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.util.Identifier;

public class DripCreeperRenderer extends MobEntityRenderer<DripCreeperEntity, CreeperEntityModel<DripCreeperEntity>> {

    public DripCreeperRenderer(EntityRenderDispatcher entityRenderdispatcher) {
        super(entityRenderdispatcher, new CreeperEntityModel<>(), 0.5f);
    }

    @Override
    public Identifier getTexture(DripCreeperEntity entity) {
        return new Identifier(Dlang.MOD_ID, "textures/entity/drip_creeper.png");
    }
}