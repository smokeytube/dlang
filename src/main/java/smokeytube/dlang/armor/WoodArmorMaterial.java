package smokeytube.dlang.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WoodArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {10, 13, 14, 9};
	private static final int[] PROTECTION_VALUES = new int[] {1, 2, 2, 1};
	
	public static final WoodArmorMaterial INSTANCE = new WoodArmorMaterial();

	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 5;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 10;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.OAK_PLANKS);
	}
 
	@Override
	public String getName() {
		return "wood";
	}
 
	@Override
	public float getToughness() {
		return 0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 15F;
	}
}