package net.frbfstudios.frbfmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.frbfstudios.frbfmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AXUNE_PIKU)
                .pattern("FFF")
                .pattern(" S ")
                .pattern(" S ")
                .input('F', ModItems.MIKU_FRAGMENT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AXUNE_MIKU)
                .pattern("FF ")
                .pattern("FS ")
                .pattern(" S ")
                .input('F', ModItems.MIKU_FRAGMENT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MIKU_KNIFE)
                .pattern(" F ")
                .pattern(" F ")
                .pattern(" S ")
                .input('F', ModItems.MIKU_FRAGMENT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MIKU_SHOVEL)
                .pattern(" F ")
                .pattern(" S ")
                .pattern(" S ")
                .input('F', ModItems.MIKU_FRAGMENT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MIKU_HOE)
                .pattern("FF ")
                .pattern(" S ")
                .pattern(" S ")
                .input('F', ModItems.MIKU_FRAGMENT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MIKU_HAIR)
                .pattern("FFF")
                .pattern("F F")
                .input('F', ModItems.MIKU_FRAGMENT)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MIKU_BLOUSE)
                .pattern("G G")
                .pattern("WFW")
                .pattern("WFW")
                .input('F', ModItems.MIKU_FRAGMENT)
                .input('W', Items.WHITE_WOOL)
                .input('G', Items.LIGHT_GRAY_WOOL)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MIKU_SKIRT)
                .pattern("FSF")
                .pattern("GBG")
                .input('F', ModItems.MIKU_FRAGMENT)
                .input('S', Items.STRING)
                .input('B', ItemTags.BUTTONS)
                .input('G', Items.LIGHT_GRAY_WOOL)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MIKU_BOOTS)
                .pattern("S S")
                .pattern("F F")
                .input('F', ModItems.MIKU_FRAGMENT)
                .input('S', Items.STRING)
                .criterion(hasItem(ModItems.MIKU_FRAGMENT), conditionsFromItem(ModItems.MIKU_FRAGMENT))
                .offerTo(recipeExporter);
    }
}
