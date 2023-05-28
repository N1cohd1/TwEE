package com.N1cohd1.twee.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.FireChargeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SnowballItem;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.N1cohd1.twee.twee.MODID;

public class ModItems {
    public static final DeferredRegister<Item> MOD_ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,MODID);

    public static final RegistryObject<Item> TRISTOS = MOD_ITEMS.register("tristos_flower", () -> new SnowballItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> TRISTOSV2 = MOD_ITEMS.register("tristosv2_flower", () -> new FireChargeItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(1)));

    public static void register(IEventBus eventBus){
        MOD_ITEMS.register(eventBus);
    }
}
