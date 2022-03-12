package smokeytube.dlang.entity;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

public class MishaEntity extends ZombieEntity {
	public MishaEntity(EntityType<? extends MishaEntity> entityType, World world) {
		super(entityType, world);
	}

	public static boolean canSpawn(EntityType<MishaEntity> type, ServerWorldAccess serverWorldAccess, SpawnReason spawnReason, BlockPos pos, Random random) {
		return canSpawnInDark(type, serverWorldAccess, spawnReason, pos, random) && (spawnReason == SpawnReason.SPAWNER || serverWorldAccess.isSkyVisible(pos));
	}

	protected boolean burnsInDaylight() {
		return false;
	}

	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_HUSK_AMBIENT;
	}

	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundEvents.ENTITY_HUSK_HURT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_HUSK_DEATH;
	}

	protected SoundEvent getStepSound() {
		return SoundEvents.ENTITY_HUSK_STEP;
	}

	public boolean tryAttack(Entity target) {
		boolean bl = super.tryAttack(target);
		// if (bl && this.getMainHandStack().isEmpty() && target instanceof LivingEntity) {
		// 	float f = this.world.getLocalDifficulty(this.getBlockPos()).getLocalDifficulty();
		// 	((LivingEntity)target).addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 140 * (int)f));
		// }

		return bl;
	}

	protected boolean canConvertInWater() {
		return true;
	}
}
