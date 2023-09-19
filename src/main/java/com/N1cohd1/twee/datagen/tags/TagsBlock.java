package com.N1cohd1.twee.datagen.tags;

import com.N1cohd1.twee.Twee;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TagsBlock extends BlockTagsProvider {

    public TagsBlock(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Twee.MODID, helper);
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
