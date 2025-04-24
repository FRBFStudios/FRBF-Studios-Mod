package net.frbfstudios.frbfmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.frbfstudios.frbfmod.item.ModItems;
import net.frbfstudios.frbfmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.HATSUNE_MIKU_ITEMS)
                .add(ModItems.MIKU_FRAGMENT)

                .add(ModItems.MUSIC_DISC_ATAMA_NO_TAISOU)
                .add(ModItems.MUSIC_DISC_MESMERIZER)

                .add(ModItems.AXUNE_PIKU)
                .add(ModItems.AXUNE_MIKU)
                .add(ModItems.MIKU_KNIFE)
                .add(ModItems.MIKU_SHOVEL)
                .add(ModItems.MIKU_HOE)

                .add(ModItems.MIKU_HAIR)
                .add(ModItems.MIKU_BLOUSE)
                .add(ModItems.MIKU_SKIRT)
                .add(ModItems.MIKU_BOOTS);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AXUNE_PIKU);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AXUNE_MIKU);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.MIKU_KNIFE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.MIKU_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.MIKU_HOE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.MIKU_HAIR);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.MIKU_BLOUSE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.MIKU_SKIRT);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.MIKU_BOOTS);
    }
}
