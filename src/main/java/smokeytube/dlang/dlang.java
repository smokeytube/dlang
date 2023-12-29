package smokeytube.dlang;

import smokeytube.dlang.armor.*;
import smokeytube.dlang.effects.*;
import smokeytube.dlang.entity.*;
import smokeytube.dlang.foodcomponent.*;
import smokeytube.dlang.item.*;
import smokeytube.dlang.toolmaterial.*;
import smokeytube.dlang.item.Ools.*;
import smokeytube.dlang.item.Tools.*;
import smokeytube.dlang.item.generic.GenericItem;
import smokeytube.dlang.item.other.*;
import smokeytube.dlang.ore.DlangLuckyBlockOreFeature;
import smokeytube.dlang.sounds.*;
import smokeytube.dlang.biome.*;
import smokeytube.dlang.block.*;
import smokeytube.dlang.spawns.SpawnInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ArmorItem;
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
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.util.Rarity;

// трол
@SuppressWarnings("nullPointerException")
public class Dlang implements ModInitializer {
	public static final String MOD_ID = "dlang"; // идентификатор мода

	// Items
	public static final PringlesCan PRINGLES_CAN = new PringlesCan(new Item.Settings().group(ItemGroup.MISC));
	public static final GenericItem FORTNITE_CARD = new GenericItem(new Item.Settings().group(ItemGroup.MISC));
	public static final GenericItem GLASSES = new GenericItem(new Item.Settings().group(ItemGroup.MISC));
	public static final GenericItem EMERALD_INGOT = new GenericItem(new Item.Settings().group(ItemGroup.MISC));
	public static final Glue GLUE = new Glue(new Item.Settings().group(ItemGroup.MISC));
	public static final WhileTrue WHILE_TRUE = new WhileTrue(new Item.Settings().group(ItemGroup.REDSTONE));
	public static final FiftyFifty FIFTY_FIFTY = new FiftyFifty(new Item.Settings().group(ItemGroup.REDSTONE));
	public static final GenericItem KYLE_RITTENHOUSE = new GenericItem(new Item.Settings().group(ItemGroup.MISC));
	public static final IronEgg IRON_EGG = new IronEgg(new Item.Settings().group(ItemGroup.MISC));
	public static final WitherMeal WITHER_MEAL = new WitherMeal(new Item.Settings().group(ItemGroup.MISC));
	public static final GenericItem FOOLS_GOLD = new GenericItem(new Item.Settings().group(ItemGroup.MISC));

	// Tools
	public static final ToolItem EMERALD_SWORD = new SwordItem(EmeraldToolMaterial.INSTANCE, 0, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem EMERALD_SHOVEL = new ShovelItem(EmeraldToolMaterial.INSTANCE, -2.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_AXE = new AxeToolItem(EmeraldToolMaterial.INSTANCE, 2, -3F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_PICKAXE = new PickaxeToolItem(EmeraldToolMaterial.INSTANCE, -2, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_HOE = new HoeToolItem(EmeraldToolMaterial.INSTANCE, -6, 0,
			new Item.Settings().group(ItemGroup.TOOLS));

	public static final ToolItem GLASS_SWORD = new SwordItem(GlassToolMaterial.INSTANCE, 0, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem GLASS_SHOVEL = new ShovelItem(GlassToolMaterial.INSTANCE, -2.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GLASS_AXE = new AxeToolItem(GlassToolMaterial.INSTANCE, 2, -3F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GLASS_PICKAXE = new PickaxeToolItem(GlassToolMaterial.INSTANCE, -2, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GLASS_HOE = new HoeToolItem(GlassToolMaterial.INSTANCE, -6, 0,
			new Item.Settings().group(ItemGroup.TOOLS));

	public static final ToolItem PAN = new SwordItem(ToolMaterials.IRON, 0, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));

	// Armor
	public static final Item WOOD_HELMET = new ArmorItem(WoodArmorMaterial.INSTANCE, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item WOOD_CHESTPLATE = new ArmorItem(WoodArmorMaterial.INSTANCE, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item WOOD_LEGGINGS = new ArmorItem(WoodArmorMaterial.INSTANCE, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item WOOD_BOOTS = new ArmorItem(WoodArmorMaterial.INSTANCE, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item STONE_HELMET = new ArmorItem(StoneArmorMaterial.INSTANCE, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item STONE_CHESTPLATE = new ArmorItem(StoneArmorMaterial.INSTANCE, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item STONE_LEGGINGS = new ArmorItem(StoneArmorMaterial.INSTANCE, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item STONE_BOOTS = new ArmorItem(StoneArmorMaterial.INSTANCE, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item GLASS_HELMET = new ArmorItem(GlassArmorMaterial.INSTANCE, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item GLASS_CHESTPLATE = new ArmorItem(GlassArmorMaterial.INSTANCE, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item GLASS_LEGGINGS = new ArmorItem(GlassArmorMaterial.INSTANCE, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item GLASS_BOOTS = new ArmorItem(GlassArmorMaterial.INSTANCE, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item EMERALD_HELMET = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.HEAD,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item EMERALD_CHESTPLATE = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.CHEST,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item EMERALD_LEGGINGS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.LEGS,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final Item EMERALD_BOOTS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.FEET,
			new Item.Settings().group(ItemGroup.COMBAT));

	// Wooden ools
	public static final ToolItem WOODEN_SVROD = new SwordItem(ToolMaterials.WOOD, 3, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem WOODEN_SHVL = new ShovelItem(ToolMaterials.WOOD, 1F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem WOODEN_KAEX = new OolKaex(ToolMaterials.WOOD, 6, -3F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem WOODEN_OHE = new OolOhe(ToolMaterials.WOOD, 0, 0,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem WOODEN_ICKPAEX = new OolIckPaex(ToolMaterials.WOOD, 1, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	// Stone ools
	public static final ToolItem STONE_SVROD = new SwordItem(ToolMaterials.STONE, 3, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem STONE_SHVL = new ShovelItem(ToolMaterials.STONE, 1.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem STONE_KAEX = new OolKaex(ToolMaterials.STONE, 7, -3.2F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem STONE_OHE = new OolOhe(ToolMaterials.STONE, -1, -2,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem STONE_ICKPAEX = new OolIckPaex(ToolMaterials.STONE, 1, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	// Iron ools
	public static final ToolItem IRON_SVROD = new SwordItem(ToolMaterials.IRON, 3, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem IRON_SHVL = new ShovelItem(ToolMaterials.IRON, 1.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem IRON_KAEX = new OolKaex(ToolMaterials.IRON, 6, -3.1F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem IRON_OHE = new OolOhe(ToolMaterials.IRON, -2, -1,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem IRON_ICKPAEX = new OolIckPaex(ToolMaterials.IRON, 1, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	// Gold ools
	public static final ToolItem GOLD_SVROD = new SwordItem(ToolMaterials.GOLD, 3, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem GOLD_SHVL = new ShovelItem(ToolMaterials.GOLD, 1.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GOLD_KAEX = new OolKaex(ToolMaterials.GOLD, 6, -3F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GOLD_OHE = new OolOhe(ToolMaterials.GOLD, 0, -3,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GOLD_ICKPAEX = new OolIckPaex(ToolMaterials.GOLD, 1, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	// Diamond ools
	public static final ToolItem DIAMOND_SVROD = new SwordItem(ToolMaterials.DIAMOND, 2, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem DIAMOND_SHVL = new ShovelItem(ToolMaterials.DIAMOND, 1.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DIAMOND_KAEX = new OolKaex(ToolMaterials.DIAMOND, 5, -3F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DIAMOND_OHE = new OolOhe(ToolMaterials.DIAMOND, -3, 0,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem DIAMOND_ICKPAEX = new OolIckPaex(ToolMaterials.DIAMOND, 1, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	// Netherite ools
	public static final ToolItem NETHERITE_SVROD = new SwordItem(ToolMaterials.NETHERITE, 3, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem NETHERITE_SHVL = new ShovelItem(ToolMaterials.NETHERITE, 1.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem NETHERITE_KAEX = new OolKaex(ToolMaterials.NETHERITE, 5, -3F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem NETHERITE_OHE = new OolOhe(ToolMaterials.NETHERITE, -4, 0,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem NETHERITE_ICKPAEX = new OolIckPaex(ToolMaterials.NETHERITE, 1, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	// Emerald ools
	public static final ToolItem EMERALD_SVROD = new SwordItem(EmeraldToolMaterial.INSTANCE, 0, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem EMERALD_SHVL = new ShovelItem(EmeraldToolMaterial.INSTANCE, -2.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_KAEX = new AxeToolItem(EmeraldToolMaterial.INSTANCE, 2, -3F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_ICKPAEX = new PickaxeToolItem(EmeraldToolMaterial.INSTANCE, -2, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem EMERALD_OHE = new HoeToolItem(EmeraldToolMaterial.INSTANCE, -6, 0,
			new Item.Settings().group(ItemGroup.TOOLS));
	// Glass ools
	public static final ToolItem GLASS_SVROD = new SwordItem(GlassToolMaterial.INSTANCE, 0, -2.4F,
			new Item.Settings().group(ItemGroup.COMBAT));
	public static final ToolItem GLASS_SHVL = new ShovelItem(GlassToolMaterial.INSTANCE, -2.5F, -3.0F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GLASS_KAEX = new OolKaex(GlassToolMaterial.INSTANCE, 2, -3F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GLASS_ICKPAEX = new OolIckPaex(GlassToolMaterial.INSTANCE, -2, -2.8F,
			new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem GLASS_OHE = new OolOhe(GlassToolMaterial.INSTANCE, -6, 0,
			new Item.Settings().group(ItemGroup.TOOLS));

	// Food
	public static final GenericItem COOKED_GLASSES = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(GlassesFoodComponents.COOKED_GLASSES));
	public static final GenericItem RAW_SPAGHETTI = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(RawSpaghettiFoodComponents.RAW_SPAGHETTI));
	public static final GenericItem COOKED_SPAGHETTI = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(CookedSpaghettiFoodComponents.COOKED_SPAGHETTI));
	public static final GenericItem PELMENI = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(PelmeniFoodComponents.PELMENI));
	public static final GenericItem FLESH = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(FleshFoodComponents.FLESH));
	public static final GenericItem COOKED_FLESH = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(CookedFleshFoodComponents.COOKED_FLESH));
	public static final GenericItem SKLANDRAUSIS = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(SklandrausisFoodComponents.SKLANDRAUSIS));
	public static final GenericItem BUTTER = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(ButterFoodComponents.BUTTER));
	public static final GenericItem RYE_BREAD = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(RyeBreadFoodComponents.RYE_BREAD));
	public static final GenericItem SOURDOUGH = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(SourdoughFoodComponents.SOURDOUGH));
	public static final GenericItem CHEESE = new GenericItem(
			new Item.Settings().group(ItemGroup.FOOD).food(CheeseFoodComponents.CHEESE));

	// Blocks
	// public static final Block SEUNG_GI_HUN = new Block(FabricBlockSettings.of(Material.BAMBOO).strength(5.0F, 5.0F)
	// 		.sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.HOES));
	public static final Block SEUNG_GI_HUN = new SeungGiHun();
	public static final Block RAW_BEEF_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
			.strength(2.0F, 2.0F).sounds(BlockSoundGroup.NETHER_WART).breakByTool(FabricToolTags.HOES));
	public static final Block OCTA_PLANK = new Block(FabricBlockSettings.of(Material.WOOD).strength(15.0F, 15.0F)
			.sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES));
	public static final Block RAW_SPAGHETTI_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
			.strength(2.0F, 2.0F).sounds(BlockSoundGroup.FUNGUS).breakByTool(FabricToolTags.HOES));
	public static final Block COOKED_SPAGHETTI_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT)
			.strength(2.0F, 2.0F).sounds(BlockSoundGroup.FUNGUS).breakByTool(FabricToolTags.HOES));
	public static final Block DLANG_LUCKY_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS)
			.strength(0.5F, 0.5F).sounds(BlockSoundGroup.GLASS));
	public static final Block FOOLS_GOLD_ORE = new FoolsGoldOre();

	// Entity
	public static final EntityType<CubeEntity> CUBE = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "cube"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new)
					.dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());
	public static final EntityType<HackerNamedFourChanEntity> HACKER_NAMED_FOUR_CHAN = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "hacker_named_four_chan"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HackerNamedFourChanEntity::new)
					.dimensions(EntityDimensions.fixed(0.6f, 1.99f)).build());
	public static final EntityType<TreeEntity> TREE = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "tree"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TreeEntity::new)
					.dimensions(EntityDimensions.fixed(5f, 6f)).build());
	public static final EntityType<DripCreeperEntity> DRIP_CREEPER = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "drip_creeper"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, DripCreeperEntity::new)
					.dimensions(EntityDimensions.fixed(1, 2)).build());
	public static final EntityType<CoronaVirusEntity> CORONA_VIRUS = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "corona_virus"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, CoronaVirusEntity::new)
					.dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
	public static final EntityType<MishaEntity> MISHA = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "misha"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MishaEntity::new)
					.dimensions(EntityDimensions.fixed(0.6f, 1.99f)).build());
	public static final EntityType<RaghavEntity> RAGHAV = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "raghav"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RaghavEntity::new)
					.dimensions(EntityDimensions.fixed(0.6f, 1.99f)).build());

	// Spawn Eggs
	public static final Item CAT_CUBE_SPAWN_EGG = new SpawnEggItem(CUBE, 0xcd926a, 0x241c15,
			new Item.Settings().group(ItemGroup.MISC));
	public static final Item HACKER_NAMED_FOUR_CHAN_SPAWN_EGG = new SpawnEggItem(HACKER_NAMED_FOUR_CHAN, 0x4a4a4a,
			0x212121, new Item.Settings().group(ItemGroup.MISC));
	public static final Item TREE_SPAWN_EGG = new SpawnEggItem(TREE, 0x402a09, 0x407822,
			new Item.Settings().group(ItemGroup.MISC));
	public static final Item DRIP_CREEPER_SPAWN_EGG = new SpawnEggItem(DRIP_CREEPER, 0x05A704, 0xAF0000,
			new Item.Settings().group(ItemGroup.MISC));
	public static final Item CORONA_VIRUS_SPAWN_EGG = new SpawnEggItem(CORONA_VIRUS, 0x386763, 0xAF0000,
			new Item.Settings().group(ItemGroup.MISC));
	public static final Item MISHA_SPAWN_EGG = new SpawnEggItem(MISHA, 0xD39E76, 0xD39E76,
			new Item.Settings().group(ItemGroup.MISC));
	public static final Item RAGHAV_SPAWN_EGG = new SpawnEggItem(RAGHAV, 0x73614F, 0x73614F,
			new Item.Settings().group(ItemGroup.MISC));

	// Music discs
	private static final Item.Settings MUSIC_DISC_SETTINGS = new Item.Settings().maxCount(1).group(ItemGroup.MISC)
			.rarity(Rarity.RARE);

	public static final DlangMusicDiscItem POLITRUK = new DlangMusicDiscItem(13, MusicDiscSoundEvents.POLITRUK,
			MUSIC_DISC_SETTINGS);
	public static final DlangMusicDiscItem MEIE_MAAST_IDA_POOL = new DlangMusicDiscItem(14,
			MusicDiscSoundEvents.MEIE_MAAST_IDA_POOL, MUSIC_DISC_SETTINGS);
	public static final DlangMusicDiscItem ORN_HAARE = new DlangMusicDiscItem(15, MusicDiscSoundEvents.ORN_HAARE,
			MUSIC_DISC_SETTINGS);
	public static final DlangMusicDiscItem VANAPOISI_REILENDER = new DlangMusicDiscItem(16,
			MusicDiscSoundEvents.VANAPOISI_REILENDER, MUSIC_DISC_SETTINGS);
	public static final DlangMusicDiscItem KUI_MINA = new DlangMusicDiscItem(17, MusicDiscSoundEvents.KUI_MINA,
			MUSIC_DISC_SETTINGS);
	public static final DlangMusicDiscItem MONIKORD_VEAB = new DlangMusicDiscItem(18,
			MusicDiscSoundEvents.MONIKORD_VEAB, MUSIC_DISC_SETTINGS);

	// Status Effects
	public static final StatusEffect SPONSORED_BY_RAID_SHADOW_LEGENDS = new SponsoredByRaidShadowLegendsStatusEffect();
	public static final StatusEffect VAXXED = new VaxxedStatusEffect();

	// Ores
	public static final ConfiguredFeature<?, ?> DLANG_LUCKY_BLOCK_ORE_FEATURE = DlangLuckyBlockOreFeature.DLANG_LUCKY_BLOCK_ORE_FEATURE;
	public static final ConfiguredFeature<?, ?> FOOLS_GOLD_ORE_FEATURE = DlangLuckyBlockOreFeature.DLANG_LUCKY_BLOCK_ORE_FEATURE;


	// Biomes
	public static final SeungGiHunBiome SEUNG_GI_HUN_BIOME = new SeungGiHunBiome();
	public static final RegistryKey<Biome> SEUNG_GI_HUN_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "seung_gi_hun"));

	@Override
	public void onInitialize() {
		// Items
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pringles_can"), PRINGLES_CAN);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fortnite_card"), FORTNITE_CARD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glasses"), GLASSES);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_ingot"), EMERALD_INGOT);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glue"), GLUE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "while_true"), WHILE_TRUE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fifty_fifty"), FIFTY_FIFTY);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "kyle_rittenhouse"), KYLE_RITTENHOUSE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_egg"), IRON_EGG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wither_meal"), WITHER_MEAL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fools_gold"), FOOLS_GOLD);

		// Tools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_sword"), EMERALD_SWORD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_shovel"), EMERALD_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_axe"), EMERALD_AXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_pickaxe"), EMERALD_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_hoe"), EMERALD_HOE);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_sword"), GLASS_SWORD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_shovel"), GLASS_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_axe"), GLASS_AXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_pickaxe"), GLASS_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_hoe"), GLASS_HOE);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pan"), PAN);

		// Armor
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wood_helmet"), WOOD_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wood_chestplate"), WOOD_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wood_leggings"), WOOD_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wood_boots"), WOOD_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_helmet"), STONE_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_chestplate"), STONE_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_leggings"), STONE_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_boots"), STONE_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_helmet"), GLASS_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_chestplate"), GLASS_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_leggings"), GLASS_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_boots"), GLASS_BOOTS);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_helmet"), EMERALD_HELMET);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_chestplate"), EMERALD_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_leggings"), EMERALD_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_boots"), EMERALD_BOOTS);

		// Wooden Ools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wooden_svrod"), WOODEN_SVROD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wooden_shvl"), WOODEN_SHVL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wooden_kaex"), WOODEN_KAEX);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wooden_ohe"), WOODEN_OHE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wooden_ickpaex"), WOODEN_ICKPAEX);
		// Stone Ools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_svrod"), STONE_SVROD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_shvl"), STONE_SHVL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_kaex"), STONE_KAEX);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_ohe"), STONE_OHE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_ickpaex"), STONE_ICKPAEX);
		// Iron Ools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_svrod"), IRON_SVROD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_shvl"), IRON_SHVL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_kaex"), IRON_KAEX);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_ohe"), IRON_OHE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_ickpaex"), IRON_ICKPAEX);
		// Gold Ools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gold_svrod"), GOLD_SVROD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gold_shvl"), GOLD_SHVL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gold_kaex"), GOLD_KAEX);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gold_ohe"), GOLD_OHE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gold_ickpaex"), GOLD_ICKPAEX);
		// Diamond Ools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_svrod"), DIAMOND_SVROD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_shvl"), DIAMOND_SHVL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_kaex"), DIAMOND_KAEX);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_ohe"), DIAMOND_OHE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_ickpaex"), DIAMOND_ICKPAEX);
		// Netherite Ools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_svrod"), NETHERITE_SVROD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_shvl"), NETHERITE_SHVL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_kaex"), NETHERITE_KAEX);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_ohe"), NETHERITE_OHE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_ickpaex"), NETHERITE_ICKPAEX);
		// Emerald Ools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_svrod"), EMERALD_SVROD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_shvl"), EMERALD_SHVL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_kaex"), EMERALD_KAEX);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_ohe"), EMERALD_OHE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "emerald_ickpaex"), EMERALD_ICKPAEX);
		// Glass Ools
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_svrod"), GLASS_SVROD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_shvl"), GLASS_SHVL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_kaex"), GLASS_KAEX);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_ohe"), GLASS_OHE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_ickpaex"), GLASS_ICKPAEX);

		// Food
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_glasses"), COOKED_GLASSES);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_spaghetti"), RAW_SPAGHETTI);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_spaghetti"), COOKED_SPAGHETTI);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pelmeni"), PELMENI);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flesh"), FLESH);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_flesh"), COOKED_FLESH);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sklandrausis"), SKLANDRAUSIS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "butter"), BUTTER);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rye_bread"), RYE_BREAD);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sourdough"), SOURDOUGH);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cheese"), CHEESE);

		// Blocks and their respective items
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "seung_gi_hun"), SEUNG_GI_HUN);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "seung_gi_hun"),
				new BlockItem(SEUNG_GI_HUN, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "raw_beef_block"), RAW_BEEF_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_beef_block"),
				new BlockItem(RAW_BEEF_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "octa_plank"), OCTA_PLANK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "octa_plank"),
				new BlockItem(OCTA_PLANK, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "raw_spaghetti_block"), RAW_SPAGHETTI_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_spaghetti_block"),
				new BlockItem(RAW_SPAGHETTI_BLOCK, new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cooked_spaghetti_block"), COOKED_SPAGHETTI_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_spaghetti_block"),
				new BlockItem(COOKED_SPAGHETTI_BLOCK, new Item.Settings().group(ItemGroup.FOOD)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dlang_lucky_block"), DLANG_LUCKY_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dlang_lucky_block"),
				new BlockItem(DLANG_LUCKY_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fools_gold_ore"), FOOLS_GOLD_ORE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fools_gold_ore"),
				new BlockItem(FOOLS_GOLD_ORE, new Item.Settings().group(ItemGroup.DECORATIONS)));

		// Entity
		FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(HACKER_NAMED_FOUR_CHAN,
				HackerNamedFourChanEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(TREE, TreeEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DRIP_CREEPER, DripCreeperEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(CORONA_VIRUS, CoronaVirusEntity.createcoronaVirusAttributes());
		FabricDefaultAttributeRegistry.register(MISHA, MishaEntity.createZombieAttributes());
		FabricDefaultAttributeRegistry.register(RAGHAV, RaghavEntity.createIronGolemAttributes());

		// Spawn Eggs
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cat_cube_spawn_egg"), CAT_CUBE_SPAWN_EGG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hacker_named_four_chan_spawn_egg"),
				HACKER_NAMED_FOUR_CHAN_SPAWN_EGG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tree_spawn_egg"), TREE_SPAWN_EGG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "drip_creeper_spawn_egg"), DRIP_CREEPER_SPAWN_EGG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corona_virus_spawn_egg"), CORONA_VIRUS_SPAWN_EGG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "misha_spawn_egg"), MISHA_SPAWN_EGG);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raghav_spawn_egg"), RAGHAV_SPAWN_EGG);

		// Music Discs
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_politruk"), POLITRUK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_meie_maast_ida_pool"), MEIE_MAAST_IDA_POOL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_orn_haare"), ORN_HAARE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_vanapoisi_reilender"), VANAPOISI_REILENDER);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_kui_mina"), KUI_MINA);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_disc_monikord_veab"), MONIKORD_VEAB);

		// Sounds
		HackerNamedFourChanSoundEvents.register();
		HurtSoundEvents.register();
		MishaSoundEvents.register();
		MusicDiscSoundEvents.register();

		// Status Effects
		Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, "sponsored_by_raid_shadow_legends"),
				SPONSORED_BY_RAID_SHADOW_LEGENDS);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, "vaxxed"), VAXXED);

		// Ore
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "dlang_lucky_block"), DLANG_LUCKY_BLOCK_ORE_FEATURE);
		// Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(MOD_ID, "fools_gold_ore"), FOOLS_GOLD_ORE_FEATURE);

		// Biomes
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier(MOD_ID, "seung_gi_hun"), SeungGiHunBiome.SURFACE_BUILDER);
		Registry.register(BuiltinRegistries.BIOME, SEUNG_GI_HUN_BIOME_KEY.getValue(), SeungGiHunBiome.createBiome());
		OverworldBiomes.addContinentalBiome(SEUNG_GI_HUN_BIOME_KEY, OverworldClimate.TEMPERATE, 1);

		// Init
		SpawnInit.init();
	}
}
