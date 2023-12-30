package smokeytube.dlang.ore;

import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import smokeytube.dlang.Dlang;

public class StaticOreFeature {
    public static final ConfiguredFeature<?, ?> STATIC_ORE_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Dlang.STATIC_BLOCK.getDefaultState(), 8))
            .method_30377(128).spreadHorizontally().repeat(10);
}
