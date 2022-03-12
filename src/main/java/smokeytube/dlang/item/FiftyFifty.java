package smokeytube.dlang.item;

import java.util.Random;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class FiftyFifty extends Item{
    public FiftyFifty(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        Random rd = new Random();
        Boolean rand = rd.nextBoolean();
        if (rand) {
        } else {
            playerEntity.damage(DamageSource.MAGIC, Integer.MAX_VALUE);
        }

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}