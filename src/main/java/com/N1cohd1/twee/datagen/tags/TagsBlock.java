package com.N1cohd1.twee.datagen.tags;

import com.N1cohd1.twee.twee;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import com.N1cohd1.twee.common.items.ModItems;

public class TagsBlock extends BlockTagsProvider {

    public TagsBlock(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, twee.MODID, helper);
    }

/*
    @Override
    protected void addTags() {
        tag(BlockTags.WOOL)
                .add(ModBlocks.Test.get());
    }
*/
    @Override
    public String getName() {
        return "TwEE tags";
    }
}
