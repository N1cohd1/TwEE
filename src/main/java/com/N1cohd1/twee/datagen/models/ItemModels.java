package com.N1cohd1.twee.datagen.models;

import com.N1cohd1.twee.Twee;
import com.N1cohd1.twee.common.items.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Twee.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        createGeneratedModel(ModItems.TRISTOS, "tristos");
    }

    private ItemModelBuilder createGeneratedModel(RegistryObject<Item> item, String path) {
        return singleTexture(item.getId().getPath(), new ResourceLocation("item/generated"),"layer0",new ResourceLocation(Twee.MODID, "item/" + path));
    }

    private ItemModelBuilder createGeneratedBlockModel(RegistryObject<Item> block, String path) {
        return singleTexture(block.getId().getPath(), new ResourceLocation("item/generated"),"layer0",new ResourceLocation(Twee.MODID, "block/" + path));
    }

    private ItemModelBuilder createHandheldModel(RegistryObject<Item> item, String path) {
        return singleTexture(item.getId().getPath(), new ResourceLocation("item/handheld"),"layer0",new ResourceLocation(Twee.MODID, "item/" + path));
    }

    private ItemModelBuilder createWithBlock(RegistryObject<Item> block, String path) {
        return withExistingParent(block.getId().getPath(), new ResourceLocation(Twee.MODID, "block/" + path));
    }

    private ItemModelBuilder createWithDirections(RegistryObject<Item> item, String path) {
        return getBuilder(item.getId().getPath())
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + path)
                .override().predicate(new ResourceLocation(Twee.MODID, "direction"), -1).model(createTestModel("generated", path, "")).end()
                .override().predicate(new ResourceLocation(Twee.MODID, "direction"), 0).model(createTestModel("generated", path, "_down")).end()
                .override().predicate(new ResourceLocation(Twee.MODID, "direction"), 1).model(createTestModel("generated", path, "_up")).end()
                .override().predicate(new ResourceLocation(Twee.MODID, "direction"), 2).model(createTestModel("generated", path, "_north")).end()
                .override().predicate(new ResourceLocation(Twee.MODID, "direction"), 3).model(createTestModel("generated", path, "_south")).end()
                .override().predicate(new ResourceLocation(Twee.MODID, "direction"), 4).model(createTestModel("generated", path, "_west")).end()
                .override().predicate(new ResourceLocation(Twee.MODID, "direction"), 5).model(createTestModel("generated", path, "_east")).end();
    }


    private ItemModelBuilder createTestModel(String type, String path, String suffix) {
        return getBuilder("item/" + path + suffix).parent(getExistingFile(mcLoc("item/" + type)))
                .texture("layer0", "item/" + path + suffix);
    }
}