package net.frbfstudios.frbfmod.item.custom;

import net.frbfstudios.frbfmod.item.ModToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class AxunePikuItem extends PickaxeItem {
    public AxunePikuItem(Settings settings) {
        super(ModToolMaterials.HATSUNE_MIKU, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.HATSUNE_MIKU, 1.0F, -2.8F)));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.frbfmod.axune_piku.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
