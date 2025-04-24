package net.frbfstudios.frbfmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frbfstudios.frbfmod.FRBFStudiosMod;
import net.frbfstudios.frbfmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HATSUNE_MIKU = Registry.register(Registries.ITEM_GROUP, Identifier.of(FRBFStudiosMod.MOD_ID, "hatsune_miku"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MIKU_FRAGMENT))
                    .displayName(Text.translatable("itemgroup.frbfmod.hatsune_miku"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MIKU_FRAGMENT);

                        entries.add(ModItems.MUSIC_DISC_ATAMA_NO_TAISOU);
                        entries.add(ModItems.MUSIC_DISC_MESMERIZER);

                        entries.add(ModItems.AXUNE_PIKU);
                        entries.add(ModItems.AXUNE_MIKU);
                        entries.add(ModItems.MIKU_KNIFE);
                        entries.add(ModItems.MIKU_SHOVEL);
                        entries.add(ModItems.MIKU_HOE);

                        entries.add(ModBlocks.MIKU_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MIKU_ORE);

                        entries.add(ModItems.MIKU_HAIR);
                        entries.add(ModItems.MIKU_BLOUSE);
                        entries.add(ModItems.MIKU_SKIRT);
                        entries.add(ModItems.MIKU_BOOTS);
                    }).build());

    public static final ItemGroup SERIAL_DESIGNATION_N = Registry.register(Registries.ITEM_GROUP, Identifier.of(FRBFStudiosMod.MOD_ID, "serial_designation_n"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AXUNE_PIKU))
                    .displayName(Text.translatable("itemgroup.frbfmod.serial_designation_n"))
                    .entries((displayContext, entries) -> {
                    }).build());

    public static void registerItemGroups(){
        FRBFStudiosMod.LOGGER.info("Registering item groups for " + FRBFStudiosMod.MOD_ID);
    }
}
