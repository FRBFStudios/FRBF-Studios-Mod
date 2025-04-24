package net.frbfstudios.frbfmod.sound;

import net.frbfstudios.frbfmod.FRBFStudiosMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent ATAMA_NO_TAISOU = registerSoundEvent("atama_no_taisou");
    public static final RegistryKey<JukeboxSong> ATAMA_NO_TAISOU_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(FRBFStudiosMod.MOD_ID, "atama_no_taisou"));

    public static final SoundEvent MESMERIZER = registerSoundEvent("mesmerizer");
    public static final RegistryKey<JukeboxSong> MESMERIZER_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(FRBFStudiosMod.MOD_ID, "mesmerizer"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(FRBFStudiosMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        FRBFStudiosMod.LOGGER.info("Registering Mod Sounds for " + FRBFStudiosMod.MOD_ID);
    }
}
