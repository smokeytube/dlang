package smokeytube.dlang.foodcomponent;

import net.minecraft.item.FoodComponent;

public class ButterFoodComponents {
    public static final FoodComponent BUTTER = (new FoodComponent.Builder()).hunger(3).saturationModifier(5).build();
}
