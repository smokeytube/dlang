package smokeytube.dlang.item;

import smokeytube.dlang.Dlang;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Glue extends Item {
    public Glue(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.ENTITY_GENERIC_DRINK, 1.0F, 1.0F);
        playerEntity.applyStatusEffect(new StatusEffectInstance(Dlang.SPONSORED_BY_RAID_SHADOW_LEGENDS, 6 * 20));
        if (Math.random() < 0.5) {
            playerEntity.applyStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 6 * 20));
        }
        if (Math.random() < 0.3) {
            playerEntity.applyStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 6 * 20));
        }
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
