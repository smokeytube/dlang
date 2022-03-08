package smokeytube.dlang.entity;

import smokeytube.dlang.Dlang;
import smokeytube.dlang.sounds.HurtSoundEvents;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class DripCreeperEntity extends CreeperEntity {

    public boolean CreeperCanSpawn = true;

    public DripCreeperEntity(EntityType<? extends CreeperEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 60;
    }

    public static DefaultAttributeContainer.Builder createcreeperAttributes() {
        return HostileEntity.createHostileAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 60D)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.15D)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, Double.MAX_VALUE)
            .add(EntityAttributes.GENERIC_ARMOR, 2D);
    }

    @Override
    public boolean canSpawn(WorldView view) {
        BlockPos blockunderentity = new BlockPos(this.getX(), this.getY() - 1, this.getZ());
        BlockPos posentity = new BlockPos(this.getX(), this.getY(), this.getZ());
        return view.intersectsEntities(this) && this.world.isNight() && !world.containsFluid(this.getBoundingBox())
        && this.world.getBlockState(posentity).getBlock().canMobSpawnInside()
        && this.world.getBlockState(blockunderentity).allowsSpawning(view, blockunderentity, Dlang.HACKER_NAMED_FOUR_CHAN)
        && CreeperCanSpawn;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return HurtSoundEvents.AMONG_US_HURT;
    }
}