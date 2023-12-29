package smokeytube.dlang.ore;

import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import smokeytube.dlang.Dlang;

public class DlangLuckyBlockOreFeature {
    public static final ConfiguredFeature<?, ?> DLANG_LUCKY_BLOCK_ORE_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Dlang.DLANG_LUCKY_BLOCK.getDefaultState(), 4))
            .method_30377(128).spreadHorizontally().repeat(7);
}
