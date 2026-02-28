package com.username.mysticmagic.blocks;

import com.username.mysticmagic.MysticMagic;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MysticMagic.MODID);

    public static final RegistryObject<Block> MYSTIC_ORE = REGISTRY.register("mystic_ore",
            () -> new Block(BlockBehaviour.Properties
                    .of()
                    .strength(3.0f, 3.0f)
                    .sound(SoundType.STONE)
                    .lightLevel(state -> 7)
            ));
}
