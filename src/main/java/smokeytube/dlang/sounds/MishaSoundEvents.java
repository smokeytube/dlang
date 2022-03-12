package smokeytube.dlang.sounds;

import smokeytube.dlang.Dlang;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MishaSoundEvents {
    public static final SoundEvent MISHA_AMBIENT_ONE;
    public static final SoundEvent MISHA_AMBIENT_TWO;
    public static final SoundEvent MISHA_AMBIENT_THREE;
    public static final SoundEvent MISHA_AMBIENT_FOUR;
    public static final SoundEvent MISHA_AMBIENT_FIVE;
    public static final SoundEvent MISHA_AMBIENT_SIX;
    public static final SoundEvent MISHA_AMBIENT_SEVEN;
    public static final SoundEvent MISHA_AMBIENT_EIGHT;
    public static final SoundEvent MISHA_DEATH;
    public static final SoundEvent MISHA_HURT;
  
    static {
        MISHA_AMBIENT_ONE = register(new Identifier(Dlang.MOD_ID, "entity.misha.ambient.one"));
        MISHA_AMBIENT_TWO = register(new Identifier(Dlang.MOD_ID, "entity.misha.ambient.two"));
        MISHA_AMBIENT_THREE = register(new Identifier(Dlang.MOD_ID, "entity.misha.ambient.three"));
        MISHA_AMBIENT_FOUR = register(new Identifier(Dlang.MOD_ID, "entity.misha.ambient.four"));
        MISHA_AMBIENT_FIVE = register(new Identifier(Dlang.MOD_ID, "entity.misha.ambient.five"));
        MISHA_AMBIENT_SIX = register(new Identifier(Dlang.MOD_ID, "entity.misha.ambient.six"));
        MISHA_AMBIENT_SEVEN = register(new Identifier(Dlang.MOD_ID, "entity.misha.ambient.seven"));
        MISHA_AMBIENT_EIGHT = register(new Identifier(Dlang.MOD_ID, "entity.misha.ambient.eight"));
        MISHA_DEATH = register(new Identifier(Dlang.MOD_ID, "entity.misha.death"));
        MISHA_HURT = register(new Identifier(Dlang.MOD_ID, "entity.misha.hurt"));
    }

    private static SoundEvent register(Identifier id) {
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void register() {
    }
}