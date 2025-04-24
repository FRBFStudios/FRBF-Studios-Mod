package net.frbfstudios.frbfmod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class MikuFragmentItem extends Item {

    public MikuFragmentItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.frbfmod.miku_fragment.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
