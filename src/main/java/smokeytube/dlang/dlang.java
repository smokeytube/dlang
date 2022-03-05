package smokeytube.dlang;

import smokeytube.dlang.entity.CubeEntity;
import smokeytube.dlang.item.*;
import smokeytube.dlang.item.EmeraldTools.*;
import smokeytube.dlang.item.Ools.*;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SpawnEggItem;
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

	//Tools
	public static final ToolItem EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 0, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem EMERALD_SHOVEL = new ShovelItem(EmeraldToolMaterial.INSTANCE, -2.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_AXE = new EmeraldAxe(EmeraldToolMaterial.INSTANCE, 2, -3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_PICKAXE = new EmeraldPickaxe(EmeraldToolMaterial.INSTANCE, -2, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_HOE = new EmeraldHoe(EmeraldToolMaterial.INSTANCE, -6, 0, new Item.Settings().group(ItemGroup.TOOLS));

	// Wooden ools
	public static final ToolItem WOODEN_SVROD = new SwordItem(ToolMaterials.WOOD, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem WOODEN_SHVL = new ShovelItem(ToolMaterials.WOOD, 1F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem WOODEN_KAEX = new OolKaex(ToolMaterials.WOOD, 6, -3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem WOODEN_OHE = new OolOhe(ToolMaterials.WOOD, 0, 0, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem WOODEN_ICKPAEX = new OolIckPaex(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	// Stone ools
	public static final ToolItem STONE_SVROD = new SwordItem(ToolMaterials.STONE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem STONE_SHVL = new ShovelItem(ToolMaterials.STONE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem STONE_KAEX = new OolKaex(ToolMaterials.STONE, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem STONE_OHE = new OolOhe(ToolMaterials.STONE, -1, -2, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem STONE_ICKPAEX = new OolIckPaex(ToolMaterials.STONE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	// Iron ools
	public static final ToolItem IRON_SVROD = new SwordItem(ToolMaterials.IRON, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem IRON_SHVL = new ShovelItem(ToolMaterials.IRON, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem IRON_KAEX = new OolKaex(ToolMaterials.IRON, 6, -3.1F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem IRON_OHE = new OolOhe(ToolMaterials.IRON, -2, -1, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem IRON_ICKPAEX = new OolIckPaex(ToolMaterials.IRON, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	// Gold ools
	public static final ToolItem GOLD_SVROD = new SwordItem(ToolMaterials.GOLD, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem GOLD_SHVL = new ShovelItem(ToolMaterials.GOLD, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GOLD_KAEX = new OolKaex(ToolMaterials.GOLD, 6, -3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GOLD_OHE = new OolOhe(ToolMaterials.GOLD, 0, -3, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GOLD_ICKPAEX = new OolIckPaex(ToolMaterials.GOLD, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	// Diamond ools
	public static final ToolItem DIAMOND_SVROD = new SwordItem(ToolMaterials.DIAMOND, 2, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem DIAMOND_SHVL = new ShovelItem(ToolMaterials.DIAMOND, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DIAMOND_KAEX = new OolKaex(ToolMaterials.DIAMOND, 5, -3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DIAMOND_OHE = new OolOhe(ToolMaterials.DIAMOND, -3, 0, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DIAMOND_ICKPAEX = new OolIckPaex(ToolMaterials.DIAMOND, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	// Netherite ools
	public static final ToolItem NETHERITE_SVROD = new SwordItem(ToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem NETHERITE_SHVL = new ShovelItem(ToolMaterials.NETHERITE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem NETHERITE_KAEX = new OolKaex(ToolMaterials.NETHERITE, 5, -3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem NETHERITE_OHE = new OolOhe(ToolMaterials.NETHERITE, -4, 0, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem NETHERITE_ICKPAEX = new OolIckPaex(ToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	// Emerald ools
	public static final ToolItem EMERALD_SVROD = new SwordItem(EmeraldToolMaterial.INSTANCE, 0, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem EMERALD_SHVL = new ShovelItem(EmeraldToolMaterial.INSTANCE, -2.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_KAEX = new EmeraldAxe(EmeraldToolMaterial.INSTANCE, 2, -3F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_ICKPAEX = new EmeraldPickaxe(EmeraldToolMaterial.INSTANCE, -2, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_OHE = new EmeraldHoe(EmeraldToolMaterial.INSTANCE, -6, 0, new Item.Settings().group(ItemGroup.TOOLS));

	// Food
	public static final CookedGlasses COOKED_GLASSES = new CookedGlasses(new Item.Settings().group(ItemGroup.FOOD).food(GlassesFoodComponents.COOKED_GLASSES));

	// Blocks
	public static final Block SEUNG_GI_HUN = new Block(FabricBlockSettings.of(Material.BAMBOO).strength(5.0F, 5.0F).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.HOES));
	public static final Block RAW_BEEF_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(5.0F, 5.0F).sounds(BlockSoundGroup.NETHER_WART).breakByTool(FabricToolTags.HOES));
	public static final Block OCTA_PLANK = new Block(FabricBlockSettings.of(Material.WOOD).strength(15.0F, 15.0F).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES));

	// Entity
	public static final EntityType<CubeEntity> CUBE = Registry.register(
		Registry.ENTITY_TYPE,
		new Identifier("dlang", "cube"),
		FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);

	// Spawn Eggs
	public static final Item CAT_CUBE_SPAWN_EGG = new SpawnEggItem(CUBE, 0xcd926a, 0x241c15, new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// Items
		Registry.register(Registry.ITEM, new Identifier("dlang", "pringles_can"), PRINGLES_CAN);
		Registry.register(Registry.ITEM, new Identifier("dlang", "fortnite_card"), FORTNITE_CARD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "glasses"), GLASSES);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_ingot"), EMERALD_INGOT);
		Registry.register(Registry.ITEM, new Identifier("dlang", "glue"), GLUE);


		//Tools
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_sword"), EMERALD_SWORD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_shovel"), EMERALD_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_axe"), EMERALD_AXE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_pickaxe"), EMERALD_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_hoe"), EMERALD_HOE);

		// Wooden Ools
		Registry.register(Registry.ITEM, new Identifier("dlang", "wooden_svrod"), WOODEN_SVROD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "wooden_shvl"), WOODEN_SHVL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "wooden_kaex"), WOODEN_KAEX);
		Registry.register(Registry.ITEM, new Identifier("dlang", "wooden_ohe"), WOODEN_OHE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "wooden_ickpaex"), WOODEN_ICKPAEX);
		// Stone Ools
		Registry.register(Registry.ITEM, new Identifier("dlang", "stone_svrod"), STONE_SVROD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "stone_shvl"), STONE_SHVL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "stone_kaex"), STONE_KAEX);
		Registry.register(Registry.ITEM, new Identifier("dlang", "stone_ohe"), STONE_OHE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "stone_ickpaex"), STONE_ICKPAEX);
		// Iron Ools
		Registry.register(Registry.ITEM, new Identifier("dlang", "iron_svrod"), IRON_SVROD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "iron_shvl"), IRON_SHVL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "iron_kaex"), IRON_KAEX);
		Registry.register(Registry.ITEM, new Identifier("dlang", "iron_ohe"), IRON_OHE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "iron_ickpaex"), IRON_ICKPAEX);
		// Gold Ools
		Registry.register(Registry.ITEM, new Identifier("dlang", "gold_svrod"), GOLD_SVROD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "gold_shvl"), GOLD_SHVL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "gold_kaex"), GOLD_KAEX);
		Registry.register(Registry.ITEM, new Identifier("dlang", "gold_ohe"), GOLD_OHE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "gold_ickpaex"), GOLD_ICKPAEX);
		// Diamond Ools
		Registry.register(Registry.ITEM, new Identifier("dlang", "diamond_svrod"), DIAMOND_SVROD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "diamond_shvl"), DIAMOND_SHVL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "diamond_kaex"), DIAMOND_KAEX);
		Registry.register(Registry.ITEM, new Identifier("dlang", "diamond_ohe"), DIAMOND_OHE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "diamond_ickpaex"), DIAMOND_ICKPAEX);
		// Netherite Ools
		Registry.register(Registry.ITEM, new Identifier("dlang", "netherite_svrod"), NETHERITE_SVROD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "netherite_shvl"), NETHERITE_SHVL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "netherite_kaex"), NETHERITE_KAEX);
		Registry.register(Registry.ITEM, new Identifier("dlang", "netherite_ohe"), NETHERITE_OHE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "netherite_ickpaex"), NETHERITE_ICKPAEX);
		// Emerald Ools
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_svrod"), EMERALD_SVROD);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_shvl"), EMERALD_SHVL);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_kaex"), EMERALD_KAEX);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_ohe"), EMERALD_OHE);
		Registry.register(Registry.ITEM, new Identifier("dlang", "emerald_ickpaex"), EMERALD_ICKPAEX);

		// Food
		Registry.register(Registry.ITEM, new Identifier("dlang", "cooked_glasses"), COOKED_GLASSES);

		// Blocks and their respective items
		Registry.register(Registry.BLOCK, new Identifier("dlang", "seung_gi_hun"), SEUNG_GI_HUN);
		Registry.register(Registry.ITEM, new Identifier("dlang", "seung_gi_hun"), new BlockItem(SEUNG_GI_HUN, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier("dlang", "raw_beef_block"), RAW_BEEF_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("dlang", "raw_beef_block"), new BlockItem(RAW_BEEF_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier("dlang", "octa_plank"), OCTA_PLANK);
		Registry.register(Registry.ITEM, new Identifier("dlang", "octa_plank"), new BlockItem(OCTA_PLANK, new Item.Settings().group(ItemGroup.DECORATIONS)));

		// Entity
		FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());
		
		// Spawn Eggs
		Registry.register(Registry.ITEM, new Identifier("dlang", "cat_cube_spawn_egg"), CAT_CUBE_SPAWN_EGG);
	}
}
