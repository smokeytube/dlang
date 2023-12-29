package smokeytube.dlang.ore;

import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import smokeytube.dlang.Dlang;

public class FoolsGoldOreFeature {
    public static final ConfiguredFeature<?, ?> FOOLS_GOLD_ORE_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Dlang.FOOLS_GOLD_ORE.getDefaultState(), 4))
            .method_30377(128).spreadHorizontally().repeat(7);
}
