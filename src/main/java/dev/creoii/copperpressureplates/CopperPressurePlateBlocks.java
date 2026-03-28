package dev.creoii.copperpressureplates;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public final class CopperPressurePlateBlocks {
    public static Block COPPER_PRESSURE_PLATE;
    public static Block EXPOSED_COPPER_PRESSURE_PLATE;
    public static Block WEATHERED_COPPER_PRESSURE_PLATE;
    public static Block OXIDIZED_COPPER_PRESSURE_PLATE;
    public static Block WAXED_COPPER_PRESSURE_PLATE;
    public static Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE;
    public static Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE;
    public static Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE;

    public static void register() {
        COPPER_PRESSURE_PLATE = registerBlock(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "copper_pressure_plate"), settings -> new CopperPressurePlateBlock(WeatheringCopper.WeatherState.UNAFFECTED, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.COPPER).mapColor(MapColor.COLOR_ORANGE));
        EXPOSED_COPPER_PRESSURE_PLATE = registerBlock(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "exposed_copper_pressure_plate"), settings -> new CopperPressurePlateBlock(WeatheringCopper.WeatherState.EXPOSED, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.COPPER).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY));
        WEATHERED_COPPER_PRESSURE_PLATE = registerBlock(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "weathered_copper_pressure_plate"), settings -> new CopperPressurePlateBlock(WeatheringCopper.WeatherState.WEATHERED, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.COPPER).mapColor(MapColor.WARPED_STEM));
        OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "oxidized_copper_pressure_plate"), settings -> new CopperPressurePlateBlock(WeatheringCopper.WeatherState.OXIDIZED, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.COPPER).mapColor(MapColor.WARPED_NYLIUM));
        WAXED_COPPER_PRESSURE_PLATE = registerBlock(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "waxed_copper_pressure_plate"), settings -> new CopperPressurePlateBlock(WeatheringCopper.WeatherState.UNAFFECTED, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.COPPER).mapColor(MapColor.COLOR_ORANGE));
        WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlock(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "waxed_exposed_copper_pressure_plate"), settings -> new CopperPressurePlateBlock(WeatheringCopper.WeatherState.EXPOSED, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.COPPER).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY));
        WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlock(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "waxed_weathered_copper_pressure_plate"), settings -> new CopperPressurePlateBlock(WeatheringCopper.WeatherState.WEATHERED, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.COPPER).mapColor(MapColor.WARPED_STEM));
        WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "waxed_oxidized_copper_pressure_plate"), settings -> new CopperPressurePlateBlock(WeatheringCopper.WeatherState.OXIDIZED, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).sound(SoundType.COPPER).mapColor(MapColor.WARPED_NYLIUM));

        OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_PRESSURE_PLATE, EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_PRESSURE_PLATE, WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_PRESSURE_PLATE, OXIDIZED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_PRESSURE_PLATE, WAXED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_PRESSURE_PLATE, WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_PRESSURE_PLATE, WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_PRESSURE_PLATE, WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
    }

    public static Block registerBlock(Identifier id, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return Registry.register(BuiltInRegistries.BLOCK, id, factory.apply(settings.setId(ResourceKey.create(Registries.BLOCK, id))));
    }
}
