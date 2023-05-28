package com.N1cohd1.twee.common.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.N1cohd1.twee.twee.MODID;

public class ModItems {
    public static final DeferredRegister<Item> MOD_ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,MODID);

    public static final RegistryObject<Item> TRISTOS = MOD_ITEMS.register("tristos_flower", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static void register(IEventBus eventBus){
        MOD_ITEMS.register(eventBus);
    }
}
