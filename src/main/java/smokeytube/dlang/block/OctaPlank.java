package smokeytube.dlang.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Identifier;

public class OctaPlank extends Block {

    public static final IntProperty PROPERTY = IntProperty.of("model_value", 0, 1024);
    public static Identifier ID = new Identifier("dlang", "octa_plank");

    public OctaPlank() {
        super(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));
        setDefaultState(getStateManager().getDefaultState().with(PROPERTY, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(PROPERTY);
    }
}