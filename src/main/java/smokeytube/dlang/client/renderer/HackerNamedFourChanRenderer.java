package smokeytube.dlang.client.renderer;

import smokeytube.dlang.Dlang;
import smokeytube.dlang.entity.HackerNamedFourChanEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.util.Identifier;

public class HackerNamedFourChanRenderer extends BipedEntityRenderer<HackerNamedFourChanEntity, SkeletonEntityModel<HackerNamedFourChanEntity>> {

    public HackerNamedFourChanRenderer(EntityRenderDispatcher entityRenderdispatcher) {
        super(entityRenderdispatcher, new SkeletonEntityModel<>(), 0.5f);
    }

    @Override
    public Identifier getTexture(HackerNamedFourChanEntity entity) {
        return new Identifier(Dlang.MOD_ID, "textures/entity/chan.png");
    }

}