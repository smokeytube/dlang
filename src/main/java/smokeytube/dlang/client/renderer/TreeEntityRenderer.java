package smokeytube.dlang.client.renderer;

import smokeytube.dlang.Dlang;
import smokeytube.dlang.client.model.TreeEntityModel;
import smokeytube.dlang.entity.TreeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TreeEntityRenderer extends MobEntityRenderer<TreeEntity, TreeEntityModel> {

    public TreeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new TreeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(TreeEntity entity) {
        return new Identifier(Dlang.MOD_ID, "textures/entity/tree.png");
    }

}