package net.frbfstudios.frbfmod.item;

import net.frbfstudios.frbfmod.FRBFStudiosMod;
import net.frbfstudios.frbfmod.item.custom.*;
import net.frbfstudios.frbfmod.sound.ModSounds;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AXUNE_PIKU = registerItem("axune_piku", new AxunePikuItem(new Item.Settings()));
    public static final Item AXUNE_MIKU = registerItem("axune_miku", new AxuneMikuItem(new Item.Settings()));
    public static final Item MIKU_KNIFE = registerItem("miku_knife", new MikuKnifeItem(new Item.Settings()));
    public static final Item MIKU_SHOVEL = registerItem("miku_shovel", new MikuShovelItem(new Item.Settings()));
    public static final Item MIKU_HOE = registerItem("miku_hoe", new MikuHoeItem(new Item.Settings()));

    public static final Item MIKU_HAIR = registerItem("miku_hair",
            new ArmorItem(ModArmorMaterials.HATSUNE_MIKU_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item MIKU_BLOUSE = registerItem("miku_blouse",
            new ArmorItem(ModArmorMaterials.HATSUNE_MIKU_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item MIKU_SKIRT = registerItem("miku_skirt",
            new ArmorItem(ModArmorMaterials.HATSUNE_MIKU_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item MIKU_BOOTS = registerItem("miku_boots",
            new ArmorItem(ModArmorMaterials.HATSUNE_MIKU_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item MIKU_FRAGMENT = registerItem("miku_fragment", new MikuFragmentItem(new Item.Settings()));

    public static final Item MUSIC_DISC_ATAMA_NO_TAISOU = registerItem("music_disc_atama_no_taisou", new Item(new Item.Settings().jukeboxPlayable(ModSounds.ATAMA_NO_TAISOU_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MESMERIZER = registerItem("music_disc_mesmerizer", new Item(new Item.Settings().jukeboxPlayable(ModSounds.MESMERIZER_KEY).maxCount(1)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FRBFStudiosMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FRBFStudiosMod.LOGGER.info("Registering mod items for " + FRBFStudiosMod.MOD_ID);

        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(AXUNE_PIKU);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(MIKU_FRAGMENT);
        });*/
    }
}
