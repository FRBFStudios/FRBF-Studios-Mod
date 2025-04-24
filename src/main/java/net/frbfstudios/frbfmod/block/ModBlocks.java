package net.frbfstudios.frbfmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frbfstudios.frbfmod.FRBFStudiosMod;
import net.frbfstudios.frbfmod.item.ModItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MIKU_ORE = registerBlock("miku_ore", new Block(AbstractBlock.Settings.create()
            .strength(3F, 3F)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .mapColor(MapColor.STONE_GRAY)));
    public static final Block DEEPSLATE_MIKU_ORE = registerBlock("deepslate_miku_ore", new Block(AbstractBlock.Settings.create()
            .strength(4.5F, 3F)
            .requiresTool()
            .sounds(BlockSoundGroup.DEEPSLATE)
            .mapColor(MapColor.DEEPSLATE_GRAY)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FRBFStudiosMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FRBFStudiosMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FRBFStudiosMod.LOGGER.info("Registering Mod Blocks for " + FRBFStudiosMod.MOD_ID);
    }
}
