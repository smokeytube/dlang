package smokeytube.dlang.item.other;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraft.block.Blocks;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Direction;

import org.jetbrains.annotations.Nullable;

public class WitherMeal extends Item {
	Block[] del_blocks = {
		Blocks.WHEAT,
		Blocks.CARROTS,
		Blocks.POTATOES,
		Blocks.BEETROOTS,
		Blocks.NETHER_WART,
		Blocks.SWEET_BERRY_BUSH,
		Blocks.COCOA,
		Blocks.SUGAR_CANE,
		Blocks.CACTUS,

	};

	public WitherMeal(Settings settings) {
		super(settings);
	}

	public ActionResult useOnBlock(ItemUsageContext context) {
		World world = context.getWorld();
		BlockPos blockPos = context.getBlockPos();
		BlockPos blockPos2 = blockPos.offset(context.getSide());
		System.out.println(blockPos);
		System.out.println(blockPos2);
		if (useOnFertilizable(context.getStack(), world, blockPos)) {
			if (world.getBlockState(blockPos).getBlock() == Blocks.GRASS_BLOCK) {
				world.setBlockState(blockPos, Blocks.DIRT.getDefaultState(), 3);
			} else {
				for (int i = 0; i < del_blocks.length; i++) {
					if (world.getBlockState(blockPos).getBlock() == del_blocks[i]) {
						world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 3);
					}
				}
			}
			if (!world.isClient) {
				world.syncWorldEvent(2005, blockPos, 0);
			}

			return ActionResult.success(world.isClient);
		} else {
			BlockState blockState = world.getBlockState(blockPos);
			boolean bl = blockState.isSideSolidFullSquare(world, blockPos, context.getSide());
			if (bl && useOnGround(context.getStack(), world, blockPos2, context.getSide())) {
				world.setBlockState(blockPos, Blocks.DIRT.getDefaultState(), 3);
				if (!world.isClient) {
					world.syncWorldEvent(2005, blockPos2, 0);
				}

				return ActionResult.success(world.isClient);
			} else {
				return ActionResult.PASS;
			}
		}
	}

	public static boolean useOnFertilizable(ItemStack stack, World world, BlockPos pos) {
		BlockState blockState = world.getBlockState(pos);
		if (blockState.getBlock() instanceof Fertilizable) {
			Fertilizable fertilizable = (Fertilizable)blockState.getBlock();
			if (fertilizable.isFertilizable(world, pos, blockState, world.isClient)) {
				if (world instanceof ServerWorld) {
					if (fertilizable.canGrow(world, world.random, pos, blockState)) {
						//
					}

					stack.decrement(1);
				}

				return true;
			}
		}

		return false;
	}

	public static boolean useOnGround(ItemStack stack, World world, BlockPos blockPos, @Nullable Direction facing) {
		if (world.getBlockState(blockPos).isOf(Blocks.WATER) && world.getFluidState(blockPos).getLevel() == 8) {
			if (!(world instanceof ServerWorld)) {
				return true;
			} else {
				//label80:
				System.out.println(blockPos);
				stack.decrement(1);
				return true;
			}
		} else {
			return false;
		}
	}

}
