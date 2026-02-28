package com.username.mysticmagic.items;

import com.username.mysticmagic.MysticMagic;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MysticMagic.MODID);

    public static final RegistryObject<Item> MAGIC_WAND = REGISTRY.register("magic_wand",
            () -> new MagicWandItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT)));
}
