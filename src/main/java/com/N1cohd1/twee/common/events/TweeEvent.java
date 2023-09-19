package com.N1cohd1.twee.common.events;

import com.N1cohd1.twee.Twee;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.checkerframework.checker.units.qual.C;

@Mod.EventBusSubscriber(modid = Twee.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TweeEvent {
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        MinecraftServer server = ServerLifecycleHooks.getCurrentServer();
        if (server != null) {
            server.tick
        }
    }
}
