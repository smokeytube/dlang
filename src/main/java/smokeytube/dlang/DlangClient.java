package smokeytube.dlang;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import smokeytube.dlang.client.renderer.TreeEntityRenderer;
import smokeytube.dlang.client.renderer.CubeEntityRenderer;
import smokeytube.dlang.client.renderer.DripCreeperRenderer;
import smokeytube.dlang.client.renderer.HackerNamedFourChanRenderer;

@Environment(EnvType.CLIENT)
public class DlangClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(Dlang.CUBE, (dispatcher, context) -> {
            return new CubeEntityRenderer(dispatcher);
        });

        EntityRendererRegistry.INSTANCE.register(Dlang.HACKER_NAMED_FOUR_CHAN, (dispatcher, context) -> {
            return new HackerNamedFourChanRenderer(dispatcher);
        });

        EntityRendererRegistry.INSTANCE.register(Dlang.TREE, (dispatcher, context) -> {
            return new TreeEntityRenderer(dispatcher);
        });

        EntityRendererRegistry.INSTANCE.register(Dlang.DRIP_CREEPER, (dispatcher, context) -> {
            return new DripCreeperRenderer(dispatcher);
        });
    }
}
