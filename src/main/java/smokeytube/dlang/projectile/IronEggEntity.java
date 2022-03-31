package smokeytube.dlang.projectile;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class IronEggEntity extends EggEntity {
	public IronEggEntity(World world, PlayerEntity user) {
		super(world, user);
	}

    @Override
	protected void onEntityHit(EntityHitResult entityHitResult) {
		super.onEntityHit(entityHitResult);
		entityHitResult.getEntity().damage(DamageSource.thrownProjectile(this, this.getOwner()), 3.0F);
	}

    @Override
	protected void onCollision(HitResult hitResult) {
		super.onCollision(hitResult);
		if (!this.world.isClient) {
			if (this.random.nextInt(128) == 0) {
                IronGolemEntity ironGolemEntity = (IronGolemEntity)EntityType.IRON_GOLEM.create(this.world);
                this.world.spawnEntity(ironGolemEntity);
			}

			this.world.sendEntityStatus(this, (byte)3);
			this.remove();
		}

	}
}
