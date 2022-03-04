package smokeytube.dlang;

import smokeytube.dlang.item.*;
import smokeytube.dlang.item.EmeraldTools.*;
import smokeytube.dlang.item.Ools.*;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterials;
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
	public static final Glue GLUE = new Glue(new Item.Settings().group(ItemGroup.MISC));

	// Weapons
	public static ToolItem EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 0, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

	//Tools
	public static ToolItem EMERALD_SHOVEL = new ShovelItem(EmeraldToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem EMERALD_AXE = new EmeraldAxe(EmeraldToolMaterial.INSTANCE, 2, -3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem EMERALD_PICKAXE = new EmeraldPickaxe(EmeraldToolMaterial.INSTANCE, -3, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem EMERALD_HOE = new EmeraldHoe(EmeraldToolMaterial.INSTANCE, -3, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));

	// Wooden ools
	public static ToolItem WOODEN_KAEX = new WoodenKaex(ToolMaterials.WOOD, 6, -3F, new Item.Settings().group(ItemGroup.TOOLS));

	// Food
	public static final CookedGlasses COOKED_GLASSES = new CookedGlasses(new Item.Settings().group(ItemGroup.FOOD).food(GlassesFoodComponents.COOKED_GLASSES));

	// Blocks
	// use .requirestool
	public static final Block SEUNG_GI_HUN = new Block(FabricBlockSettings.of(Material.BAMBOO).strength(5.0F, 5.0F).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.HOES));
	public static final Block RAW_BEEF_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(5.0F, 5.0F).sounds(BlockSoundGroup.NETHER_WART).breakByTool(FabricToolTags.HOES));
	public static final Block OCTA_PLANK = new Block(FabricBlockSettings.of(Material.WOOD).strength(15.0F, 15.0F).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES));

	@Override
	public void onInitialize() {
		// Items
		Registry.register(Registry.ITEM, new Identifier("dlang", "pringles_can"), PRINGLES_CAN);
		Registry.register(Registry.ITEM, new Identifier("dlang", "fortnite_card"), FORTNITE_CARD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "glasses"), GLASSES);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_ingot"), EMERALD_INGOT);
		Registry.register(Registry.ITEM, new Identifier("dlang", "glue"), GLUE);

		// Weapons
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_sword"), EMERALD_SWORD);

		//Tools
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_shovel"), EMERALD_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_axe"), EMERALD_AXE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_pickaxe"), EMERALD_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_hoe"), EMERALD_HOE);

		// Wooden Ools
		Registry.register(Registry.ITEM, new Identifier("dlang", "wooden_kaex"), WOODEN_KAEX);
		

		// Food
		Registry.register(Registry.ITEM, new Identifier("dlang", "cooked_glasses"), COOKED_GLASSES);

		// Blocks and their respective items

		Registry.register(Registry.BLOCK, new Identifier("dlang", "seung_gi_hun"), SEUNG_GI_HUN);
		Registry.register(Registry.ITEM, new Identifier("dlang", "seung_gi_hun"), new BlockItem(SEUNG_GI_HUN, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier("dlang", "raw_beef_block"), RAW_BEEF_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("dlang", "raw_beef_block"), new BlockItem(RAW_BEEF_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier("dlang", "octa_plank"), OCTA_PLANK);
		Registry.register(Registry.ITEM, new Identifier("dlang", "octa_plank"), new BlockItem(OCTA_PLANK, new Item.Settings().group(ItemGroup.DECORATIONS)));
	}
}
