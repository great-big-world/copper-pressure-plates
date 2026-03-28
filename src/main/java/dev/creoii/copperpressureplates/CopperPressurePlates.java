package dev.creoii.copperpressureplates;

import net.fabricmc.api.ModInitializer;

public class CopperPressurePlates implements ModInitializer {
    public static final String NAMESPACE = "great_big_world";

    @Override
    public void onInitialize() {
        CopperPressurePlateBlocks.register();
        CopperPressurePlateItems.register();
    }
}
