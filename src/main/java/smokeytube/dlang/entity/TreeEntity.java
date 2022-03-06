package smokeytube.dlang.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class TreeEntity extends PathAwareEntity {
    public TreeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
	protected void initGoals() {
		// this.goalSelector.add(0, new WanderAroundFarGoal(this, 1.0D));
        // this.goalSelector.add(1, new LookAroundGoal(this));
        // this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        // this.goalSelector.add(3, new EscapeDangerGoal(this, 1.25D));
	}
}
