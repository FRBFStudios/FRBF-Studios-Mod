package net.frbfstudios.frbfmod.item.custom;

import net.frbfstudios.frbfmod.item.ModToolMaterials;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class AxuneMikuItem extends AxeItem {
    public AxuneMikuItem(Settings settings) {
        super(ModToolMaterials.HATSUNE_MIKU, new Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.HATSUNE_MIKU, 6.0F, -3.2F)));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.frbfmod.axune_miku.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
