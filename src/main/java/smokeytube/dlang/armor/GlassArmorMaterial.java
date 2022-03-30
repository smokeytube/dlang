package smokeytube.dlang.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class GlassArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {1, 2, 3, 1};
	private static final int[] PROTECTION_VALUES = new int[] {4, 9, 7, 4};
	
	public static final GlassArmorMaterial INSTANCE = new GlassArmorMaterial();

	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 2;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 50;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.GLASS);
	}
 
	@Override
	public String getName() {
		return "glass";
	}
 
	@Override
	public float getToughness() {
		return 0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 25F;
	}
}