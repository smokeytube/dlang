package smokeytube.dlang.foodcomponent;

import net.minecraft.item.FoodComponent;

public class CookedFleshFoodComponents {
    public static final FoodComponent COOKED_FLESH = (new FoodComponent.Builder()).hunger(5).saturationModifier(5).build();
}
