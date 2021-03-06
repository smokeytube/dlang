package smokeytube.dlang.toolmaterial;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import smokeytube.dlang.Dlang;

public class EmeraldToolMaterial implements ToolMaterial {

    public static final EmeraldToolMaterial INSTANCE = new EmeraldToolMaterial();

    @Override
    public int getDurability() {
        return 1200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8F;
    }

    @Override
    public float getAttackDamage() {
        return 7.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD, Dlang.EMERALD_INGOT);
    }

}
