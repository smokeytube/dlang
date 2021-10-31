package smokeytube.dlang;

import smokeytube.dlang.item.*;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// трол
@SuppressWarnings("nullPointerException")
public class Dlang implements ModInitializer {

	// Items
	public static final PringlesCan PRINGLES_CAN = new PringlesCan(new Item.Settings().group(ItemGroup.MISC));
	public static final FortniteCard FORTNITE_CARD = new FortniteCard(new Item.Settings().group(ItemGroup.MISC));
	public static final Glasses GLASSES = new Glasses(new Item.Settings().group(ItemGroup.MISC));
	public static final EmeraldIngot EMERALD_INGOT = new EmeraldIngot(new Item.Settings().group(ItemGroup.MISC));

	// Weapons

	//Tools
	public static ToolItem EMERALD_PICKAXE = new EmeraldPickaxe(EmeraldToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));

	// Food
	public static final CookedGlasses COOKED_GLASSES = new CookedGlasses(new Item.Settings().group(ItemGroup.FOOD).food(GlassesFoodComponents.COOKED_GLASSES));

	// Blocks
	// use .requirestool
	public static final Block SEUNG_GI_HUN = new Block(FabricBlockSettings.of(Material.BAMBOO).strength(5.0F, 5.0F).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.HOES));

	@Override
	public void onInitialize() {
		// Items
		Registry.register(Registry.ITEM, new Identifier("dlang", "pringles_can"), PRINGLES_CAN);
		Registry.register(Registry.ITEM, new Identifier("dlang", "fortnite_card"), FORTNITE_CARD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "glasses"), GLASSES);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_ingot"), EMERALD_INGOT);

		// Weapons
		
		//Tools
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_pickaxe"), EMERALD_PICKAXE);

		// Food
		Registry.register(Registry.ITEM, new Identifier("dlang", "cooked_glasses"), COOKED_GLASSES);

		// Blocks and their respective items

		Registry.register(Registry.BLOCK, new Identifier("dlang", "seung_gi_hun"), SEUNG_GI_HUN);
		Registry.register(Registry.ITEM, new Identifier("dlang", "seung_gi_hun"), new BlockItem(SEUNG_GI_HUN, new Item.Settings().group(ItemGroup.DECORATIONS)));
	}
}
