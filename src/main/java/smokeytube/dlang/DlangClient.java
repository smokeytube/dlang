package smokeytube.dlang;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import smokeytube.dlang.client.renderer.CubeEntityRenderer;

@Environment(EnvType.CLIENT)
public class DlangClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(Dlang.CUBE, (dispatcher, context) -> {
            return new CubeEntityRenderer(dispatcher);
        });
    }
}
