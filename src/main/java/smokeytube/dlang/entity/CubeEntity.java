package smokeytube.dlang.entity;

import java.util.Random;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

public class CubeEntity extends PathAwareEntity {
    public CubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 10;
        this.knockbackVelocity = 5f;
    }
	protected void initGoals() {
		this.goalSelector.add(0, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(1, new LookAroundGoal(this));
        this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(3, new EscapeDangerGoal(this, 1.25D));
	}

	public static boolean canSpawn(EntityType<TreeEntity> type, ServerWorldAccess serverWorldAccess, SpawnReason spawnReason, BlockPos pos, Random random) {
        return canSpawn(type, serverWorldAccess, spawnReason, pos, random) && (spawnReason == SpawnReason.SPAWNER || serverWorldAccess.isSkyVisible(pos));
	}
}
