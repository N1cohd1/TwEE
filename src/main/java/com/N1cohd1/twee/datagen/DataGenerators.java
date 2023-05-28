package com.N1cohd1.twee.datagen;

import com.N1cohd1.twee.datagen.models.ItemModels;
import com.N1cohd1.twee.datagen.tags.TagsBlock;
import com.N1cohd1.twee.datagen.tags.TagsItem;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        //generator.addProvider(event.includeClient(), new BlockModels(generator, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new ItemModels(generator, event.getExistingFileHelper()));

        TagsBlock blockTags = new TagsBlock(generator, event.getExistingFileHelper());
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new TagsItem(generator, blockTags, event.getExistingFileHelper()));
        /* RECIPES
        generator.addProvider(event.includeServer(), new SmeltingRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new BlastingRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new StonecuttingRecipeProvider(generator));
         */

        /* LOOT TABLES */
        //generator.addProvider(event.includeServer(), new LootTables(generator));

    }
}
