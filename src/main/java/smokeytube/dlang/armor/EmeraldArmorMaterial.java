package smokeytube.dlang.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class EmeraldArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {279, 406, 380, 337};
	private static final int[] PROTECTION_VALUES = new int[] {4, 7, 8, 4};
	
	public static final EmeraldArmorMaterial INSTANCE = new EmeraldArmorMaterial();

	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 1;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 25;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.EMERALD);
	}
 
	@Override
	public String getName() {
		return "emerald";
	}
 
	@Override
	public float getToughness() {
		return 3F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 33F;
	}
}