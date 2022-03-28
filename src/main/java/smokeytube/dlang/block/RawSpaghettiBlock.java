package smokeytube.dlang.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RawSpaghettiBlock extends Block {

    public static final IntProperty PROPERTY = IntProperty.of("model_value", 0, 1024);
    public static Identifier ID = new Identifier("dlang", "raw_spaghetti_block");

    public RawSpaghettiBlock() {
        super(FabricBlockSettings.copyOf(Blocks.FIRE_CORAL_BLOCK));
        setDefaultState(getStateManager().getDefaultState().with(PROPERTY, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(PROPERTY);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.isCreativeLevelTwoOp() && player.getStackInHand(hand).isEmpty()) {
            int value = state.get(PROPERTY);
            if (player.isSneaking()) {
                value = value - 1;
                world.setBlockState(pos, state.with(PROPERTY, value));
                player.playSound(SoundEvents.UI_BUTTON_CLICK, 1.0F, 0.5F);
                player.sendMessage(new TranslatableText("message.dlang.state_minus", value), true);
            } else {
                value = value + 1;
                world.setBlockState(pos, state.with(PROPERTY, value));
                player.playSound(SoundEvents.UI_BUTTON_CLICK, 1.0F, 1.0F);
                player.sendMessage(new TranslatableText("message.dlang.state_plus", value), true);
            }
        }
        return ActionResult.SUCCESS;
    }

}