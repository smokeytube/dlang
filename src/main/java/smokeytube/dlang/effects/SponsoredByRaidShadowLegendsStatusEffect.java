package smokeytube.dlang.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

public class SponsoredByRaidShadowLegendsStatusEffect extends StatusEffect {
    public SponsoredByRaidShadowLegendsStatusEffect() {
      super(
        StatusEffectType.BENEFICIAL,
        0x98D982);
    }
   
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
      return true;
    }
   
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
      if (entity instanceof PlayerEntity) {
        ((PlayerEntity) entity).addExperience(1 << amplifier);
      }
    }
  }