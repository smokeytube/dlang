package smokeytube.dlang.toolmaterial;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GlassToolMaterial implements ToolMaterial {

    public static final GlassToolMaterial INSTANCE = new GlassToolMaterial();

    @Override
    public int getDurability() {
        return 1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4F;
    }

    @Override
    public float getAttackDamage() {
        return 10.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GLASS);
    }

}
