package smokeytube.dlang.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class WhileTrue extends Item{
    public WhileTrue(Settings settings) {
        super(settings);
    }

    @Override
    @SuppressWarnings("unused")
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        while (true) {
            // Have to add this to compile
            if (false) {
                break;
            }
        }
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}