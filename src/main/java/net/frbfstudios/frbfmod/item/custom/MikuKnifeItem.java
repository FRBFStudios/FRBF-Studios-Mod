package net.frbfstudios.frbfmod.item.custom;

import net.frbfstudios.frbfmod.item.ModToolMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class MikuKnifeItem extends SwordItem {
    public MikuKnifeItem(Settings settings) {
        super(ModToolMaterials.HATSUNE_MIKU, new Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.HATSUNE_MIKU, 3, -2.4F)));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.frbfmod.miku_knife.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
