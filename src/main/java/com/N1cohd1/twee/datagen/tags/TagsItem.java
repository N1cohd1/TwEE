package com.N1cohd1.twee.datagen.tags;

import com.N1cohd1.twee.common.items.ModItems;
import com.N1cohd1.twee.twee;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TagsItem extends ItemTagsProvider {

    public TagsItem(DataGenerator generator, BlockTagsProvider blockTagProvider, ExistingFileHelper helper) {
        super(generator, blockTagProvider, twee.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(ItemTags.LEAVES)
                .add(ModItems.TRISTOS.get())
                .replace(false);
    }

    @Override
    public String getName() {
        return "TwEE Tags";
    }

}