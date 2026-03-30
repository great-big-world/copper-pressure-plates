package dev.creoii.copperpressureplates;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
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
        COPPER_PRESSURE_PLATE = registerBlockItem(ResourceLocation.tryBuild(CopperPressurePlates.NAMESPACE, "copper_pressure_plate"), CopperPressurePlateBlocks.COPPER_PRESSURE_PLATE);
        EXPOSED_COPPER_PRESSURE_PLATE = registerBlockItem(ResourceLocation.tryBuild(CopperPressurePlates.NAMESPACE, "exposed_copper_pressure_plate"), CopperPressurePlateBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        WEATHERED_COPPER_PRESSURE_PLATE = registerBlockItem(ResourceLocation.tryBuild(CopperPressurePlates.NAMESPACE, "weathered_copper_pressure_plate"), CopperPressurePlateBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        OXIDIZED_COPPER_PRESSURE_PLATE = registerBlockItem(ResourceLocation.tryBuild(CopperPressurePlates.NAMESPACE, "oxidized_copper_pressure_plate"), CopperPressurePlateBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        WAXED_COPPER_PRESSURE_PLATE = registerBlockItem(ResourceLocation.tryBuild(CopperPressurePlates.NAMESPACE, "waxed_copper_pressure_plate"), CopperPressurePlateBlocks.WAXED_COPPER_PRESSURE_PLATE);
        WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlockItem(ResourceLocation.tryBuild(CopperPressurePlates.NAMESPACE, "waxed_exposed_copper_pressure_plate"), CopperPressurePlateBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlockItem(ResourceLocation.tryBuild(CopperPressurePlates.NAMESPACE, "waxed_weathered_copper_pressure_plate"), CopperPressurePlateBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlockItem(ResourceLocation.tryBuild(CopperPressurePlates.NAMESPACE, "waxed_oxidized_copper_pressure_plate"), CopperPressurePlateBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(entries -> {
            entries.addAfter(Items.HEAVY_WEIGHTED_PRESSURE_PLATE, COPPER_PRESSURE_PLATE, EXPOSED_COPPER_PRESSURE_PLATE, WEATHERED_COPPER_PRESSURE_PLATE, OXIDIZED_COPPER_PRESSURE_PLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.CUT_COPPER_SLAB, COPPER_PRESSURE_PLATE);
            entries.addAfter(Items.EXPOSED_CUT_COPPER_SLAB, EXPOSED_COPPER_PRESSURE_PLATE);
            entries.addAfter(Items.WEATHERED_CUT_COPPER_SLAB, WEATHERED_COPPER_PRESSURE_PLATE);
            entries.addAfter(Items.OXIDIZED_CUT_COPPER_SLAB, OXIDIZED_COPPER_PRESSURE_PLATE);
            entries.addAfter(Items.WAXED_CUT_COPPER_SLAB, WAXED_COPPER_PRESSURE_PLATE);
            entries.addAfter(Items.WAXED_EXPOSED_CUT_COPPER_SLAB, WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
            entries.addAfter(Items.WAXED_WEATHERED_CUT_COPPER_SLAB, WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
            entries.addAfter(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        });
    }

    public static Item registerBlockItem(ResourceLocation id, Block block) {
        return registerItem(id, settings1 -> new BlockItem(block, settings1));
    }

    public static Item registerItem(ResourceLocation id, Function<Item.Properties, Item> factory) {
        return Registry.register(BuiltInRegistries.ITEM, id, factory.apply(new Item.Properties()));
    }
}
