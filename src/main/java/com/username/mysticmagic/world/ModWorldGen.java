package com.username.mysticmagic.world;

import com.username.mysticmagic.blocks.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.FeatureUtils;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.block.Blocks;

import java.util.List;

public class ModWorldGen {

    public static void registerOres() {
        OreConfiguration.TargetBlockState target = OreConfiguration.target(
                OreConfiguration.STONE_ORE_REPLACEABLES, 
                ModBlocks.MYSTIC_ORE.get().defaultBlockState()
        );

        ConfiguredFeature<OreConfiguration, ?> mysticOreFeature = new ConfiguredFeature<>(
                Feature.ORE, new OreConfiguration(List.of(target), 4) // 4 блока за раз
        );

        Holder<ConfiguredFeature<?, ?>> mysticOreHolder = FeatureUtils.register(
                "mysticmagic:mystic_ore", mysticOreFeature
        );

        PlacedFeature placedMysticOre = new PlacedFeature(
                mysticOreHolder,
                List.of(
                        RarityFilter.onAverageOnceEvery(6),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(5), VerticalAnchor.absolute(40))
                )
        );

        Registry.register(
                Registry.PLACED_FEATURE,
                "mysticmagic:mystic_ore_placed",
                placedMysticOre
        );
    }
}
