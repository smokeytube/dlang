package smokeytube.dlang.entity;

import java.util.Random;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.FollowTargetGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

public class CoronaVirusEntity extends HostileEntity {

    public CoronaVirusEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 1;
        this.knockbackVelocity = 5f;
    }


    public static DefaultAttributeContainer.Builder createcoronaVirusAttributes() {
        return HostileEntity.createHostileAttributes()
            .add(EntityAttributes.GENERIC_ATTACK_SPEED, 10D)
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 2D)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.55D)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 30.0D)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 0.5D);
    }

    @Override
	protected void initGoals() {
        this.goalSelector.add(0, new MeleeAttackGoal(this, 1f, false));
		this.goalSelector.add(1, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(2, new LookAroundGoal(this));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(4, new EscapeDangerGoal(this, 1.25D));
		this.targetSelector.add(1, new FollowTargetGoal<>(this, PlayerEntity.class, true));
	}

	public static boolean canSpawn(EntityType<CoronaVirusEntity> type, ServerWorldAccess serverWorldAccess, SpawnReason spawnReason, BlockPos pos, Random random) {
        return canSpawn(type, serverWorldAccess, spawnReason, pos, random) && (spawnReason == SpawnReason.SPAWNER || serverWorldAccess.isSkyVisible(pos));
	}
}
