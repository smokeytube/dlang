package smokeytube.dlang.sounds;

import smokeytube.dlang.Dlang;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HurtSoundEvents {
    public static final SoundEvent AMONG_US_HURT;

    static {
        AMONG_US_HURT = register(new Identifier(Dlang.MOD_ID, "entity.hurt.among_us"));
    }

    private static SoundEvent register(Identifier id) {
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void register() {
    }
}