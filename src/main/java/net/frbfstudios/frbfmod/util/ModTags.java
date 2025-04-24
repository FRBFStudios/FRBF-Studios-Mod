package net.frbfstudios.frbfmod.util;

import net.minecraft.block.Block;
import net.frbfstudios.frbfmod.FRBFStudiosMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> HATSUNE_MIKU_BLOCKS = createTag("hatsune_miku_blocks");

        public static final TagKey<Block> NEEDS_HATSUNE_MIKU_TOOL = createTag("needs_hatsune_miku_tool");
        public static final TagKey<Block> INCORRECT_FOR_HATSUNE_MIKU_TOOL = createTag("incorrect_for_hatsune_miku_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(FRBFStudiosMod.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> HATSUNE_MIKU_ITEMS = createTag("hatsune_miku_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(FRBFStudiosMod.MOD_ID, name));
        }
    }
}
