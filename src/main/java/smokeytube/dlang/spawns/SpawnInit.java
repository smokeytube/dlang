package smokeytube.dlang.spawns;

import java.util.function.Predicate;

import com.google.common.base.Preconditions;

import smokeytube.dlang.Dlang;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.SpawnSettings;

@SuppressWarnings("deprecation")
public class SpawnInit {

    public static int SpawnRate = 10;

    public static void addSpawn(Predicate<BiomeSelectionContext> biomeSelector, SpawnGroup spawnGroup, SpawnSettings.SpawnEntry se) {
        Preconditions.checkArgument(se.type.getSpawnGroup() != SpawnGroup.MISC, 
        "MISC spawns pigs");

        Identifier id = Registry.ENTITY_TYPE.getId(se.type);
        Preconditions.checkState(id != Registry.ENTITY_TYPE.getDefaultId(), "Unregistered entity type: %s", se.type);

        BiomeModifications.create(id).add(ModificationPhase.ADDITIONS, biomeSelector, context -> {
            context.getSpawnSettings().addSpawn(spawnGroup, se);
        });
    }

    private static void normalspawn() {
        Predicate<BiomeSelectionContext> biomeSelector = (context) -> {
            Biome.Category category = context.getBiome().getCategory();
            return category != Biome.Category.NETHER && category != Biome.Category.THEEND
            && category != Biome.Category.MESA && category != Biome.Category.DESERT
            && category != Biome.Category.MUSHROOM && category != Biome.Category.EXTREME_HILLS
            && category != Biome.Category.ICY && category != Biome.Category.OCEAN;
        };

        addSpawn(biomeSelector, Dlang.HACKER_NAMED_FOUR_CHAN.getSpawnGroup(), 
            new SpawnSettings.SpawnEntry(Dlang.HACKER_NAMED_FOUR_CHAN, SpawnRate, 2, 4));

        addSpawn(biomeSelector, Dlang.DRIP_CREEPER.getSpawnGroup(),
            new SpawnSettings.SpawnEntry(Dlang.DRIP_CREEPER, SpawnRate, 2, 2));

        addSpawn(biomeSelector, Dlang.CORONA_VIRUS.getSpawnGroup(),
            new SpawnSettings.SpawnEntry(Dlang.CORONA_VIRUS, 20, 25, 30));

        addSpawn(biomeSelector, Dlang.MISHA.getSpawnGroup(),
            new SpawnSettings.SpawnEntry(Dlang.MISHA, SpawnRate, 2, 4));

        addSpawn(biomeSelector, Dlang.TREE.getSpawnGroup(),
            new SpawnSettings.SpawnEntry(Dlang.TREE, SpawnRate, 1, 2));
    }

    public static void init() {
        normalspawn();
    }

}