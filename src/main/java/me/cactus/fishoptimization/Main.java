package me.cactus.fishoptimization;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new FishControl(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
