package com.username.mysticmagic;

import com.username.mysticmagic.blocks.ModBlocks;
import com.username.mysticmagic.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.username.mysticmagic.world.ModWorldGen;

@Mod("mysticmagic")
public class MysticMagic {
    public static final String MODID = "mysticmagic";

    public MysticMagic() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.REGISTRY.register(bus);
        ModItems.REGISTRY.register(bus);

        ModWorldGen.registerOres();

        System.out.println("MysticMagic загружен успешно!");
    }
}
