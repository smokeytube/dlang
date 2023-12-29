package smokeytube.dlang.mixin;

import java.lang.Math;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.network.MessageType;
import net.minecraft.text.LiteralText;
import net.minecraft.world.World;
import smokeytube.dlang.Dlang;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    // @Inject(method = "tickMovement", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;isAlive()Z", ordinal = 0), cancellable = true)
    // private void modifyTickMovement(CallbackInfo info) {

    //     LivingEntity entity = (LivingEntity) (Object) this;

    //     if (entity.hasStatusEffect(Dlang.VAXXED)) {
    //         info.cancel();
    //     }
    // }

    @Inject(method = "onDeath", at = @At("HEAD"))
    private void onDeath(DamageSource damageSource_1, CallbackInfo ci) {
        if (Math.random() > 0.999) {
            MinecraftClient mc = MinecraftClient.getInstance();
            mc.inGameHud.addChatMessage(MessageType.SYSTEM, new LiteralText("You have angered the Gods..."), mc.player.getUuid());
        }

    }


    // Apply vaxxed upon eating god apple
    @Inject(method = "applyFoodEffects", at = @At("TAIL"))
    private void applyFoodEffects(ItemStack stack, World world, LivingEntity targetEntity, CallbackInfo ci) {
        System.out.println("HERE");
        if (stack.getItem().toString().equals("enchanted_golden_apple")) {
            ((LivingEntity) (Object) this).addStatusEffect(
                    new StatusEffectInstance(Dlang.VAXXED, 4 * 60 * 20)
            );
        }
    }
}
