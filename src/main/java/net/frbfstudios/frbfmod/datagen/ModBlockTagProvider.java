package net.frbfstudios.frbfmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.frbfstudios.frbfmod.block.ModBlocks;
import net.frbfstudios.frbfmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.HATSUNE_MIKU_BLOCKS)
                .add(ModBlocks.MIKU_ORE)
                .add(ModBlocks.DEEPSLATE_MIKU_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEEPSLATE_MIKU_ORE)
                .add(ModBlocks.MIKU_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_HATSUNE_MIKU_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_MIKU_ORE)
                .add(ModBlocks.MIKU_ORE);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_HATSUNE_MIKU_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
    }
}
