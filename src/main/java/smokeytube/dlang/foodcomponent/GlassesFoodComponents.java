package smokeytube.dlang.foodcomponent;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class GlassesFoodComponents {

    public static final FoodComponent COOKED_GLASSES = (new FoodComponent.Builder()).hunger(1).saturationModifier(0).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0), 1F).snack().alwaysEdible().build();

}
