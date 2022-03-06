package smokeytube.dlang.sounds;

import smokeytube.dlang.Dlang;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HackerNamedFourChanSoundEvents {
    public static final SoundEvent HACKER_NAMED_FOUR_CHAN_AMBIENT_ONE;
    public static final SoundEvent HACKER_NAMED_FOUR_CHAN_AMBIENT_TWO;
    public static final SoundEvent HACKER_NAMED_FOUR_CHAN_AMBIENT_THREE;
    public static final SoundEvent HACKER_NAMED_FOUR_CHAN_AMBIENT_FOUR;
    public static final SoundEvent HACKER_NAMED_FOUR_CHAN_AMBIENT_FIVE;

    static {
        HACKER_NAMED_FOUR_CHAN_AMBIENT_ONE = register(new Identifier(Dlang.MOD_ID, "entity.chan.ambient.one"));
        HACKER_NAMED_FOUR_CHAN_AMBIENT_TWO = register(new Identifier(Dlang.MOD_ID, "entity.chan.ambient.two"));
        HACKER_NAMED_FOUR_CHAN_AMBIENT_THREE = register(new Identifier(Dlang.MOD_ID, "entity.chan.ambient.three"));
        HACKER_NAMED_FOUR_CHAN_AMBIENT_FOUR = register(new Identifier(Dlang.MOD_ID, "entity.chan.ambient.four"));
        HACKER_NAMED_FOUR_CHAN_AMBIENT_FIVE = register(new Identifier(Dlang.MOD_ID, "entity.chan.ambient.five"));
    }

    private static SoundEvent register(Identifier id) {
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void register() {
    }
}