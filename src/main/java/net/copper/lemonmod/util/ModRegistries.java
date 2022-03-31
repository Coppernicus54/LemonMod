package net.copper.lemonmod.util;

import net.copper.lemonmod.LemonMod;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        LemonMod.LOGGER.info("Registering Fuels for " + LemonMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

    }
}
