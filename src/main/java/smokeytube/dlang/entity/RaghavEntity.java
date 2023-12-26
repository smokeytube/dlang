package smokeytube.dlang.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class RaghavEntity extends IronGolemEntity {
	public RaghavEntity(EntityType<? extends RaghavEntity> entityType, World world) {
		super(entityType, world);
		this.setHealth(5.0F);
	}

	protected boolean burnsInDaylight() {
		return false;
	}

	protected SoundEvent getStepSound() {
		return SoundEvents.ENTITY_HUSK_STEP;
	}

	public boolean tryAttack(Entity target) {
		boolean bl = super.tryAttack(target);
		return bl;
	}
}
