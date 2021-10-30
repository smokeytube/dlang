package smokeytube.dlang;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class dlang implements ModInitializer {

	public static final Item PRINGLES_CAN = new Item(new Item.Settings().group(ItemGroup.FOOD));


	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("dlang", "pringles_can"), PRINGLES_CAN);
	}
}
