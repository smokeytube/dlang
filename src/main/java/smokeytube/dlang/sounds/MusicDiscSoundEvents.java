package smokeytube.dlang.sounds;

import smokeytube.dlang.Dlang;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MusicDiscSoundEvents {
    public static final SoundEvent POLITRUK;
    public static final SoundEvent MEIE_MAAST_IDA_POOL;
    public static final SoundEvent ORN_HAARE;
    public static final SoundEvent VANAPOISI_REILENDER;
    public static final SoundEvent KUI_MINA;
    public static final SoundEvent MONIKORD_VEAB;

    static {
        POLITRUK = register(new Identifier(Dlang.MOD_ID, "music_disc.politruk"));
        MEIE_MAAST_IDA_POOL = register(new Identifier(Dlang.MOD_ID, "music_disc.meie_maast_ida_pool"));
        ORN_HAARE = register(new Identifier(Dlang.MOD_ID, "music_disc.orn_haare"));
        VANAPOISI_REILENDER = register(new Identifier(Dlang.MOD_ID, "music_disc.vanapoisi_reilender"));
        KUI_MINA = register(new Identifier(Dlang.MOD_ID, "music_disc.kui_mina"));
        MONIKORD_VEAB = register(new Identifier(Dlang.MOD_ID, "music_disc.monikord_veab"));
    }

    private static SoundEvent register(Identifier id) {
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void register() {
    }
}