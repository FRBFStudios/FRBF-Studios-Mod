package net.frbfstudios.frbfmod;
import net.fabricmc.api.ClientModInitializer;
import net.frbfstudios.frbfmod.block.ModBlocks;
import net.frbfstudios.frbfmod.effect.ModEffects;
import net.frbfstudios.frbfmod.item.ModItemGroups;
import net.frbfstudios.frbfmod.item.ModItems;
import net.frbfstudios.frbfmod.sound.ModSounds;

public class  FRBFStudiosModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModSounds.registerSounds();
        ModEffects.registerEffects();
    }
}
