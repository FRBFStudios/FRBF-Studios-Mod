package net.frbfstudios.frbfmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.frbfstudios.frbfmod.block.ModBlocks;
import net.frbfstudios.frbfmod.item.ModItems;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(net.minecraft.data.client.BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MIKU_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MIKU_ORE);
    }

    @Override
    public void generateItemModels(net.minecraft.data.client.ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AXUNE_PIKU, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AXUNE_MIKU, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MIKU_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MIKU_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MIKU_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.MIKU_FRAGMENT, Models.GENERATED);

        itemModelGenerator.register(ModItems.MUSIC_DISC_ATAMA_NO_TAISOU, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MESMERIZER, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MIKU_HAIR));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MIKU_BLOUSE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MIKU_SKIRT));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MIKU_BOOTS));
    }
}
