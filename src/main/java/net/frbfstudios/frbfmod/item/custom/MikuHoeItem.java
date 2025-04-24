package net.frbfstudios.frbfmod.item.custom;

import net.frbfstudios.frbfmod.item.ModToolMaterials;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class MikuHoeItem extends HoeItem {
    public MikuHoeItem(Settings settings) {
        super(ModToolMaterials.HATSUNE_MIKU, new Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.HATSUNE_MIKU, 0, -3.0F)));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.frbfmod.miku_hoe.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
