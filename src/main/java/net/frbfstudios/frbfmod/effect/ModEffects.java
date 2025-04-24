package net.frbfstudios.frbfmod.effect;

import net.frbfstudios.frbfmod.FRBFStudiosMod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> SIREN = registerStatusEffect("siren",
            new SirenEffect(StatusEffectCategory.NEUTRAL, 0x5be6fc));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(FRBFStudiosMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        FRBFStudiosMod.LOGGER.info("Registering Mod Effects for " + FRBFStudiosMod.MOD_ID);
    }
}
