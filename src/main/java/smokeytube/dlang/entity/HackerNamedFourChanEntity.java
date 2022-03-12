package smokeytube.dlang.entity;

import smokeytube.dlang.Dlang;
import smokeytube.dlang.sounds.HackerNamedFourChanSoundEvents;

import java.util.Random;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class HackerNamedFourChanEntity extends SkeletonEntity {

    public boolean SkeletonCanSpawn = true;

    public HackerNamedFourChanEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 60;
    }

    public static DefaultAttributeContainer.Builder createskellyAttributes() {
        return HostileEntity.createHostileAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 60D)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25D)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 30.0D)
            .add(EntityAttributes.GENERIC_ARMOR, 2D);
    }

    @Override
    public boolean canSpawn(WorldView view) {
        BlockPos blockunderentity = new BlockPos(this.getX(), this.getY() - 1, this.getZ());
        BlockPos posentity = new BlockPos(this.getX(), this.getY(), this.getZ());
        return view.intersectsEntities(this) && this.world.isNight() && !world.containsFluid(this.getBoundingBox())
        && this.world.getBlockState(posentity).getBlock().canMobSpawnInside()
        && this.world.getBlockState(blockunderentity).allowsSpawning(view, blockunderentity, Dlang.HACKER_NAMED_FOUR_CHAN)
        && SkeletonCanSpawn;
    }

    @Override
	protected SoundEvent getAmbientSound() {
        Random random = new Random();
		int value = random.nextInt(7);
        if (value == 0) {
            return HackerNamedFourChanSoundEvents.HACKER_NAMED_FOUR_CHAN_AMBIENT_TWO;
        } else if (value == 1) {
            return HackerNamedFourChanSoundEvents.HACKER_NAMED_FOUR_CHAN_AMBIENT_THREE;
        } else if (value == 2) {
            return HackerNamedFourChanSoundEvents.HACKER_NAMED_FOUR_CHAN_AMBIENT_FIVE;
        } else {
            return SoundEvents.BLOCK_STONE_STEP;
        }
	}

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return HackerNamedFourChanSoundEvents.HACKER_NAMED_FOUR_CHAN_AMBIENT_ONE;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return HackerNamedFourChanSoundEvents.HACKER_NAMED_FOUR_CHAN_AMBIENT_FOUR;
    }
}