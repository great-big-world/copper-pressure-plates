package dev.creoii.copperpressureplates;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public final class CopperPressurePlateItems {
    public static Item COPPER_PRESSURE_PLATE;
    public static Item EXPOSED_COPPER_PRESSURE_PLATE;
    public static Item WEATHERED_COPPER_PRESSURE_PLATE;
    public static Item OXIDIZED_COPPER_PRESSURE_PLATE;
    public static Item WAXED_COPPER_PRESSURE_PLATE;
    public static Item WAXED_EXPOSED_COPPER_PRESSURE_PLATE;
    public static Item WAXED_WEATHERED_COPPER_PRESSURE_PLATE;
    public static Item WAXED_OXIDIZED_COPPER_PRESSURE_PLATE;

    public static void register() {
        COPPER_PRESSURE_PLATE = registerBlockItem(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "copper_pressure_plate"), CopperPressurePlateBlocks.COPPER_PRESSURE_PLATE);
        EXPOSED_COPPER_PRESSURE_PLATE = registerBlockItem(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "exposed_copper_pressure_plate"), CopperPressurePlateBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        WEATHERED_COPPER_PRESSURE_PLATE = registerBlockItem(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "weathered_copper_pressure_plate"), CopperPressurePlateBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        OXIDIZED_COPPER_PRESSURE_PLATE = registerBlockItem(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "oxidized_copper_pressure_plate"), CopperPressurePlateBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        WAXED_COPPER_PRESSURE_PLATE = registerBlockItem(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "waxed_copper_pressure_plate"), CopperPressurePlateBlocks.WAXED_COPPER_PRESSURE_PLATE);
        WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlockItem(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "waxed_exposed_copper_pressure_plate"), CopperPressurePlateBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlockItem(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "waxed_weathered_copper_pressure_plate"), CopperPressurePlateBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlockItem(Identifier.fromNamespaceAndPath(CopperPressurePlates.NAMESPACE, "waxed_oxidized_copper_pressure_plate"), CopperPressurePlateBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(entries -> {
            entries.insertAfter(Items.HEAVY_WEIGHTED_PRESSURE_PLATE, COPPER_PRESSURE_PLATE, EXPOSED_COPPER_PRESSURE_PLATE, WEATHERED_COPPER_PRESSURE_PLATE, OXIDIZED_COPPER_PRESSURE_PLATE);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.insertAfter(Items.COPPER_CHAIN.unaffected(), COPPER_PRESSURE_PLATE);
            entries.insertAfter(Items.COPPER_CHAIN.exposed(), EXPOSED_COPPER_PRESSURE_PLATE);
            entries.insertAfter(Items.COPPER_CHAIN.weathered(), WEATHERED_COPPER_PRESSURE_PLATE);
            entries.insertAfter(Items.COPPER_CHAIN.oxidized(), OXIDIZED_COPPER_PRESSURE_PLATE);
            entries.insertAfter(Items.COPPER_CHAIN.waxed(), WAXED_COPPER_PRESSURE_PLATE);
            entries.insertAfter(Items.COPPER_CHAIN.waxedExposed(), WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
            entries.insertAfter(Items.COPPER_CHAIN.waxedWeathered(), WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
            entries.insertAfter(Items.COPPER_CHAIN.waxedOxidized(), WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        });
    }

    public static Item registerBlockItem(Identifier id, Block block) {
        return registerItem(id, settings1 -> new BlockItem(block, settings1.setId(ResourceKey.create(Registries.ITEM, id)).useBlockDescriptionPrefix()));
    }

    public static Item registerItem(Identifier id, Function<Item.Properties, Item> factory) {
        return Registry.register(BuiltInRegistries.ITEM, id, factory.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id))));
    }
}
